package dad.geofx.api.ipifi;

import java.util.concurrent.TimeUnit;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IpifiService {
private static final String BASE_URL ="https://api.ipify.org/";
	
	private IpifiInterface service;
	
	public IpifiService() {

		ConnectionPool pool = new ConnectionPool(1, 5, TimeUnit.SECONDS);

		OkHttpClient client = new OkHttpClient.Builder()
				.connectionPool(pool)
				.build();

		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(BASE_URL)
				.client(client)
				.addConverterFactory(GsonConverterFactory.create())
				.build();

		service = retrofit.create(IpifiInterface.class);
		
	}
	
	public String myIp() throws Exception {
		Response<IpifiData> response = service.ipifiData("json").execute();
		IpifiData message= response.body();
		return message.getIp();
	}
}
