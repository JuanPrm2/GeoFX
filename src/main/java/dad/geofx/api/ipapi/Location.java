
package dad.geofx.api.ipapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Location {

    private Integer geonameId;
    private String capital;
    private List<Language> languages = null;
    private String countryFlag;
    private String countryFlagEmoji;
    private String countryFlagEmojiUnicode;
    private String callingCode;
    private Boolean isEu;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getGeonameId() {
        return geonameId;
    }

    public void setGeonameId(Integer geonameId) {
        this.geonameId = geonameId;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public String getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }

    public String getCountryFlagEmoji() {
        return countryFlagEmoji;
    }

    public void setCountryFlagEmoji(String countryFlagEmoji) {
        this.countryFlagEmoji = countryFlagEmoji;
    }

    public String getCountryFlagEmojiUnicode() {
        return countryFlagEmojiUnicode;
    }

    public void setCountryFlagEmojiUnicode(String countryFlagEmojiUnicode) {
        this.countryFlagEmojiUnicode = countryFlagEmojiUnicode;
    }

    public String getCallingCode() {
        return callingCode;
    }

    public void setCallingCode(String callingCode) {
        this.callingCode = callingCode;
    }

    public Boolean getIsEu() {
        return isEu;
    }

    public void setIsEu(Boolean isEu) {
        this.isEu = isEu;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
