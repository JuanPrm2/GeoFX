package dad.geofx.api.ipapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IpapiInterface {
	
	
	
	@GET("ip_api.php")
	public Call<IpapiData> ipapidata(@Query("ip")String ip);
	
	
	
}
