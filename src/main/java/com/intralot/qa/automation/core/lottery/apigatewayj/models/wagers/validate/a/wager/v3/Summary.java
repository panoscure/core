
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.validate.a.wager.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Summary {

    @SerializedName("winning")
    @Expose
    private Integer winning;
    @SerializedName("expired")
    @Expose
    private Integer expired;
    @SerializedName("paid")
    @Expose
    private Integer paid;
    @SerializedName("nonWinning")
    @Expose
    private Integer nonWinning;
    @SerializedName("pending")
    @Expose
    private Integer pending;
    @SerializedName("claimed")
    @Expose
    private Integer claimed;

    public Integer getWinning() {
        return winning;
    }

    public void setWinning(Integer winning) {
        this.winning = winning;
    }

    public Integer getExpired() {
        return expired;
    }

    public void setExpired(Integer expired) {
        this.expired = expired;
    }

    public Integer getPaid() {
        return paid;
    }

    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    public Integer getNonWinning() {
        return nonWinning;
    }

    public void setNonWinning(Integer nonWinning) {
        this.nonWinning = nonWinning;
    }

    public Integer getPending() {
        return pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    public Integer getClaimed() {
        return claimed;
    }

    public void setClaimed(Integer claimed) {
        this.claimed = claimed;
    }

}
