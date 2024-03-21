
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "retailerId",
        "terminalId",
        "userName"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class PosInfo {

    @JsonProperty("retailerId")
    private Integer retailerId;
    @JsonProperty("terminalId")
    private Integer terminalId;
    @JsonProperty("userName")
    private String userName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("retailerId")
    public Integer getRetailerId() {
        return retailerId;
    }

    @JsonProperty("retailerId")
    public void setRetailerId(Integer retailerId) {
        this.retailerId = retailerId;
    }

    @JsonProperty("terminalId")
    public Integer getTerminalId() {
        return terminalId;
    }

    @JsonProperty("terminalId")
    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
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
