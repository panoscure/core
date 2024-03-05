
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
        "winning",
        "expired",
        "paid",
        "nonWinning",
        "pending",
        "claimed"
})
public class Summary {

    @JsonProperty("winning")
    private Integer winning;
    @JsonProperty("expired")
    private Integer expired;
    @JsonProperty("paid")
    private Integer paid;
    @JsonProperty("nonWinning")
    private Integer nonWinning;
    @JsonProperty("pending")
    private Integer pending;
    @JsonProperty("claimed")
    private Integer claimed;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("winning")
    public Integer getWinning() {
        return winning;
    }

    @JsonProperty("winning")
    public void setWinning(Integer winning) {
        this.winning = winning;
    }

    @JsonProperty("expired")
    public Integer getExpired() {
        return expired;
    }

    @JsonProperty("expired")
    public void setExpired(Integer expired) {
        this.expired = expired;
    }

    @JsonProperty("paid")
    public Integer getPaid() {
        return paid;
    }

    @JsonProperty("paid")
    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    @JsonProperty("nonWinning")
    public Integer getNonWinning() {
        return nonWinning;
    }

    @JsonProperty("nonWinning")
    public void setNonWinning(Integer nonWinning) {
        this.nonWinning = nonWinning;
    }

    @JsonProperty("pending")
    public Integer getPending() {
        return pending;
    }

    @JsonProperty("pending")
    public void setPending(Integer pending) {
        this.pending = pending;
    }

    @JsonProperty("claimed")
    public Integer getClaimed() {
        return claimed;
    }

    @JsonProperty("claimed")
    public void setClaimed(Integer claimed) {
        this.claimed = claimed;
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
