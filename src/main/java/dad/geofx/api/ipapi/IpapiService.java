package dad.geofx.api.ipapi;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IpapiService {

	private static final String BASE_URL= "https://ipapi.com/";
	
	private IpapiInterface service;
	
	
	public IpapiService() {
		
ConnectionPool pool = new ConnectionPool(1, 5, TimeUnit.SECONDS);
		
		OkHttpClient client = new OkHttpClient.Builder()
                .connectionPool(pool)
                .build();
		
		Retrofit retrofit = new Retrofit.Builder()
				.baseUrl(BASE_URL)
				.addConverterFactory(GsonConverterFactory.create())
				.client(client)
				.build();
		
		service = retrofit.create(IpapiInterface.class);	
		
	}
	
	public IpapiData getDatosIP (String ip) throws IOException {
		
		
		
		
		Response <IpapiData> respuesta= service.ipapidata(ip).execute();
 		
		return respuesta.body();
		
		
		
	}
	
	
}
