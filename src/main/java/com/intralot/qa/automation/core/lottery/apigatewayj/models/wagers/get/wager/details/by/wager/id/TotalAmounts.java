
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "gross",
        "net",
        "other",
        "refund",
        "tax",
        "freeBet"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class TotalAmounts {

    @JsonProperty("gross")
    private double gross;
    @JsonProperty("net")
    private double net;
    @JsonProperty("other")
    private double other;
    @JsonProperty("refund")
    private double refund;
    @JsonProperty("tax")
    private double tax;
    @JsonProperty("freeBet")
    private double freeBet;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("gross")
    public double getGross() {
        return gross;
    }

    @JsonProperty("gross")
    public void setGross(double gross) {
        this.gross = gross;
    }

    @JsonProperty("net")
    public double getNet() {
        return net;
    }

    @JsonProperty("net")
    public void setNet(Integer net) {
        this.net = net;
    }

    @JsonProperty("other")
    public double getOther() {
        return other;
    }

    @JsonProperty("other")
    public void setOther(double other) {
        this.other = other;
    }

    @JsonProperty("refund")
    public double getRefund() {
        return refund;
    }

    @JsonProperty("refund")
    public void setRefund(double refund) {
        this.refund = refund;
    }

    @JsonProperty("tax")
    public double getTax() {
        return tax;
    }

    @JsonProperty("tax")
    public void setTax(double tax) {
        this.tax = tax;
    }

    @JsonProperty("freeBet")
    public double getFreeBet() {
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
