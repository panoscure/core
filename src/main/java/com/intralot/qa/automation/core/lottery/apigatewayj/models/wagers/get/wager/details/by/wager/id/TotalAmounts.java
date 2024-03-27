
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import java.math.BigDecimal;
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
    private BigDecimal gross;
    @JsonProperty("net")
    private BigDecimal net;
    @JsonProperty("other")
    private BigDecimal other;
    @JsonProperty("refund")
    private BigDecimal refund;
    @JsonProperty("tax")
    private BigDecimal tax;
    @JsonProperty("freeBet")
    private BigDecimal freeBet;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("gross")
    public BigDecimal getGross() {
        return gross;
    }

    @JsonProperty("gross")
    public void setGross(BigDecimal gross) {
        this.gross = gross;
    }

    @JsonProperty("net")
    public BigDecimal getNet() {
        return net;
    }

    @JsonProperty("net")
    public void setNet(BigDecimal net) {
        this.net = net;
    }

    @JsonProperty("other")
    public BigDecimal getOther() {
        return other;
    }

    @JsonProperty("other")
    public void setOther(BigDecimal other) {
        this.other = other;
    }

    @JsonProperty("refund")
    public BigDecimal getRefund() {
        return refund;
    }

    @JsonProperty("refund")
    public void setRefund(BigDecimal refund) {
        this.refund = refund;
    }

    @JsonProperty("tax")
    public BigDecimal getTax() {
        return tax;
    }

    @JsonProperty("tax")
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    @JsonProperty("freeBet")
    public BigDecimal getFreeBet() {
        return freeBet;
    }

    @JsonProperty("freeBet")
    public void setFreeBet(BigDecimal freeBet) {
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
