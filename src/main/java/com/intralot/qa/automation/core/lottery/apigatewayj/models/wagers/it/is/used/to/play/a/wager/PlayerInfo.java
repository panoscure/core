package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerInfo {

    @SerializedName("syndicateId")
    @Expose
    private String syndicateId;
    @SerializedName("playerId")
    @Expose
    private Integer playerId;
    @SerializedName("subscriptionId")
    @Expose
    private String subscriptionId;
    @SerializedName("balance")
    @Expose
    private BigDecimal balance;

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getSyndicateId() {
        return syndicateId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSyndicateId(String syndicateId) {
        this.syndicateId = syndicateId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
}
