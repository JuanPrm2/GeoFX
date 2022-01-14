
package dad.geofx.api.ipapi;

import java.util.HashMap;
import java.util.Map;



public class Security {

    private Boolean isProxy;
    private Object proxyType;
    private Boolean isCrawler;
    private Object crawlerName;
    private Object crawlerType;
    private Boolean isTor;
    private String threatLevel;
    private Object threatTypes;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Boolean getIsProxy() {
        return isProxy;
    }

    public void setIsProxy(Boolean isProxy) {
        this.isProxy = isProxy;
    }

    public Object getProxyType() {
        return proxyType;
    }

    public void setProxyType(Object proxyType) {
        this.proxyType = proxyType;
    }

    public Boolean getIsCrawler() {
        return isCrawler;
    }

    public void setIsCrawler(Boolean isCrawler) {
        this.isCrawler = isCrawler;
    }

    public Object getCrawlerName() {
        return crawlerName;
    }

    public void setCrawlerName(Object crawlerName) {
        this.crawlerName = crawlerName;
    }

    public Object getCrawlerType() {
        return crawlerType;
    }

    public void setCrawlerType(Object crawlerType) {
        this.crawlerType = crawlerType;
    }

    public Boolean getIsTor() {
        return isTor;
    }

    public void setIsTor(Boolean isTor) {
        this.isTor = isTor;
    }

    public String getThreatLevel() {
        return threatLevel;
    }

    public void setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
    }

    public Object getThreatTypes() {
        return threatTypes;
    }

    public void setThreatTypes(Object threatTypes) {
        this.threatTypes = threatTypes;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
