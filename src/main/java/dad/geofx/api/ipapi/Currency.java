
package dad.geofx.api.ipapi;

import java.util.HashMap;
import java.util.Map;



public class Currency {

    private String code;
    private String name;
    private String plural;
    private String symbol;
    private String symbolNative;
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

    public String getPlural() {
        return plural;
    }

    public void setPlural(String plural) {
        this.plural = plural;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbolNative() {
        return symbolNative;
    }

    public void setSymbolNative(String symbolNative) {
        this.symbolNative = symbolNative;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
