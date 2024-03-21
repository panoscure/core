
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Raffle {

    @SerializedName("betType")
    @Expose
    private Integer betType;
    @SerializedName("leftLimit")
    @Expose
    private Integer leftLimit;
    @SerializedName("rightLimit")
    @Expose
    private Integer rightLimit;
    @SerializedName("participatingDraws")
    @Expose
    private ParticipatingDraws participatingDraws;

    public Integer getBetType() {
        return betType;
    }

    public void setBetType(Integer betType) {
        this.betType = betType;
    }

    public Integer getLeftLimit() {
        return leftLimit;
    }

    public void setLeftLimit(Integer leftLimit) {
        this.leftLimit = leftLimit;
    }

    public Integer getRightLimit() {
        return rightLimit;
    }

    public void setRightLimit(Integer rightLimit) {
        this.rightLimit = rightLimit;
    }

    public ParticipatingDraws getParticipatingDraws() {
        return participatingDraws;
    }

    public void setParticipatingDraws(ParticipatingDraws participatingDraws) {
        this.participatingDraws = participatingDraws;
    }

}
