
package dad.geofx.api.ipapi;

import java.util.HashMap;
import java.util.Map;



public class Language {

    private String code;
    private String name;
    private String _native;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNative() {
        return _native;
    }

    public void setNative(String _native) {
        this._native = _native;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
