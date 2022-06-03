package arv.consumefeignribbon.models;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * @author ArvikV
 * @version 1.0
 * @since 03.06.2022
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "creationDate",
        "text",
        "senderMsid",
        "senderName",
        "targetMsid"
})
@Generated("jsonschema2pojo")
public class Message {

    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("text")
    private String text;
    @JsonProperty("senderMsid")
    private String senderMsid;
    @JsonProperty("senderName")
    private String senderName;
    @JsonProperty("targetMsid")
    private String targetMsid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("senderMsid")
    public String getSenderMsid() {
        return senderMsid;
    }

    @JsonProperty("senderMsid")
    public void setSenderMsid(String senderMsid) {
        this.senderMsid = senderMsid;
    }

    @JsonProperty("senderName")
    public String getSenderName() {
        return senderName;
    }

    @JsonProperty("senderName")
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @JsonProperty("targetMsid")
    public String getTargetMsid() {
        return targetMsid;
    }

    @JsonProperty("targetMsid")
    public void setTargetMsid(String targetMsid) {
        this.targetMsid = targetMsid;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
