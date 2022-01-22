package dad.geofx.api.ipifi;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Generated("jsonschema2pojo")
public class IpifiData {

	   @SerializedName("ip")
	    @Expose
	    private String ip;

	    public String getIp() {
	        return ip;
	    }

	    public void setIp(String ip) {
	        this.ip = ip;
	    }
	
}
