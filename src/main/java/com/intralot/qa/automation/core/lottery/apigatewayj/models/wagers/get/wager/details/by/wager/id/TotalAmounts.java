
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
        "gross",
        "net",
        "other",
        "refund",
        "tax",
        "freeBet"
})
public class TotalAmounts {

    @JsonProperty("gross")
    private Integer gross;
    @JsonProperty("net")
    private Integer net;
    @JsonProperty("other")
    private Integer other;
    @JsonProperty("refund")
    private Integer refund;
    @JsonProperty("tax")
    private Integer tax;
    @JsonProperty("freeBet")
    private Integer freeBet;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("gross")
    public Integer getGross() {
        return gross;
    }

    @JsonProperty("gross")
    public void setGross(Integer gross) {
        this.gross = gross;
    }

    @JsonProperty("net")
    public Integer getNet() {
        return net;
    }

    @JsonProperty("net")
    public void setNet(Integer net) {
        this.net = net;
    }

    @JsonProperty("other")
    public Integer getOther() {
        return other;
    }

    @JsonProperty("other")
    public void setOther(Integer other) {
        this.other = other;
    }

    @JsonProperty("refund")
    public Integer getRefund() {
        return refund;
    }

    @JsonProperty("refund")
    public void setRefund(Integer refund) {
        this.refund = refund;
    }

    @JsonProperty("tax")
    public Integer getTax() {
        return tax;
    }

    @JsonProperty("tax")
    public void setTax(Integer tax) {
        this.tax = tax;
    }

    @JsonProperty("freeBet")
    public Integer getFreeBet() {
        return freeBet;
    }

    @JsonProperty("freeBet")
    public void setFreeBet(Integer freeBet) {
        this.freeBet = freeBet;
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
