
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "posInfo",
        "channel",
        "wagerId",
        "operator",
        "participationMethod",
        "preprinted",
        "replay"
})
public class Metadata {

    @JsonProperty("posInfo")
    private PosInfo posInfo;
    @JsonProperty("channel")
    private Integer channel;
    @JsonProperty("wagerId")
    private Long wagerId;
    @JsonProperty("operator")
    private Integer operator;
    @JsonProperty("participationMethod")
    private String participationMethod;
    @JsonProperty("preprinted")
    private Boolean preprinted;
    @JsonProperty("replay")
    private Boolean replay;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("posInfo")
    public PosInfo getPosInfo() {
        return posInfo;
    }

    @JsonProperty("posInfo")
    public void setPosInfo(PosInfo posInfo) {
        this.posInfo = posInfo;
    }

    @JsonProperty("channel")
    public Integer getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    @JsonProperty("wagerId")
    public Long getWagerId() {
        return wagerId;
    }

    @JsonProperty("wagerId")
    public void setWagerId(Long wagerId) {
        this.wagerId = wagerId;
    }

    @JsonProperty("operator")
    public Integer getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    @JsonProperty("participationMethod")
    public String getParticipationMethod() {
        return participationMethod;
    }

    @JsonProperty("participationMethod")
    public void setParticipationMethod(String participationMethod) {
        this.participationMethod = participationMethod;
    }

    @JsonProperty("preprinted")
    public Boolean getPreprinted() {
        return preprinted;
    }

    @JsonProperty("preprinted")
    public void setPreprinted(Boolean preprinted) {
        this.preprinted = preprinted;
    }

    @JsonProperty("replay")
    public Boolean getReplay() {
        return replay;
    }

    @JsonProperty("replay")
    public void setReplay(Boolean replay) {
        this.replay = replay;
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
