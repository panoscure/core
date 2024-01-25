
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

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

    public Raffle withBetType(Integer betType) {
        this.betType = betType;
        return this;
    }

    public Integer getLeftLimit() {
        return leftLimit;
    }

    public void setLeftLimit(Integer leftLimit) {
        this.leftLimit = leftLimit;
    }

    public Raffle withLeftLimit(Integer leftLimit) {
        this.leftLimit = leftLimit;
        return this;
    }

    public Integer getRightLimit() {
        return rightLimit;
    }

    public void setRightLimit(Integer rightLimit) {
        this.rightLimit = rightLimit;
    }

    public Raffle withRightLimit(Integer rightLimit) {
        this.rightLimit = rightLimit;
        return this;
    }

    public ParticipatingDraws getParticipatingDraws() {
        return participatingDraws;
    }

    public void setParticipatingDraws(ParticipatingDraws participatingDraws) {
        this.participatingDraws = participatingDraws;
    }

    public Raffle withParticipatingDraws(ParticipatingDraws participatingDraws) {
        this.participatingDraws = participatingDraws;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("betType", betType).append("leftLimit", leftLimit).append("rightLimit", rightLimit).append("participatingDraws", participatingDraws).toString();
    }

}
