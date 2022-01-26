package dad.geofx.api.ipifi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import dad.geofx.api.ipifi.IpifiData;

public interface IpifiInterface {

	@GET("https://api.ipify.org")
	public Call<IpifiData> ipifiData(@Query("format") String format);
		
		
	
	

}
