
package dad.geofx.api.ipapi;

import java.util.HashMap;
import java.util.Map;



public class Connection {

    private Integer asn;
    private String isp;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getAsn() {
        return asn;
    }

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
