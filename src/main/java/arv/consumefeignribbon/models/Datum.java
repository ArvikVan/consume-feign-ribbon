
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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "messageID",
    "creationDate",
    "Type",
    "text",
    "senderMsid",
    "senderName",
    "targetMsid",
    "targetName"
})
@Generated("jsonschema2pojo")
public class Datum {

    @JsonProperty("messageID")
    private Long messageID;
    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("text")
    private String text;
    @JsonProperty("senderMsid")
    private String senderMsid;
    @JsonProperty("senderName")
    private String senderName;
    @JsonProperty("targetMsid")
    private String targetMsid;
    @JsonProperty("targetName")
    private String targetName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("messageID")
    public Long getMessageID() {
        return messageID;
    }

    @JsonProperty("messageID")
    public void setMessageID(Long messageID) {
        this.messageID = messageID;
    }

    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
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

    @JsonProperty("targetName")
    public String getTargetName() {
        return targetName;
    }

    @JsonProperty("targetName")
    public void setTargetName(String targetName) {
        this.targetName = targetName;
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
