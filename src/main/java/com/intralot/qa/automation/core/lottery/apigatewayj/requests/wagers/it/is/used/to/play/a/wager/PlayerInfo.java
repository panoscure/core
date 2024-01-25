
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlayerInfo {

    @SerializedName("syndicateId")
    @Expose
    private String syndicateId;
    @SerializedName("payMethod")
    @Expose
    private String payMethod;
    @SerializedName("pin")
    @Expose
    private String pin;
    @SerializedName("playerId")
    @Expose
    private Integer playerId;
    @SerializedName("sessionToken")
    @Expose
    private String sessionToken;
    @SerializedName("subscriptionId")
    @Expose
    private String subscriptionId;
    @SerializedName("playerSegments")
    @Expose
    private List<Integer> playerSegments = null;
    @SerializedName("verificationToken")
    @Expose
    private String verificationToken = null;

    public String getSyndicateId() {
        return syndicateId;
    }

    public PlayerInfo withSyndicateId(String syndicateId) {
        this.syndicateId = syndicateId;
        return this;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public PlayerInfo withPayMethod(String payMethod) {
        this.payMethod = payMethod;
        return this;
    }

    public String getPin() {
        return pin;
    }

    public PlayerInfo withPin(String pin) {
        this.pin = pin;
        return this;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public PlayerInfo withPlayerId(Integer playerId) {
        this.playerId = playerId;
        return this;
    }

    public String getSessionToken() {
        return sessionToken;
    }


    public PlayerInfo withSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public PlayerInfo withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public List<Integer> getPlayerSegments() {
        return playerSegments;
    }

    public PlayerInfo withPlayerSegments(List<Integer> playerSegments) {
        this.playerSegments = playerSegments;
        return this;
    }

    public PlayerInfo withVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
        return this;
    }

    public void setSyndicateId(String syndicateId) {
        this.syndicateId = syndicateId;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public void setPlayerSegments(List<Integer> playerSegments) {
        this.playerSegments = playerSegments;
    }

    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }
}
