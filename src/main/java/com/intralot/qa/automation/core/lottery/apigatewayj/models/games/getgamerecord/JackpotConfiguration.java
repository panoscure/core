
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JackpotConfiguration {

    @SerializedName("cascadeDownCategory")
    @Expose
    private Object cascadeDownCategory;
    @SerializedName("fundPercentage")
    @Expose
    private Object fundPercentage;
    @SerializedName("maxDistributed")
    @Expose
    private Object maxDistributed;
    @SerializedName("maxDistributionPercentage")
    @Expose
    private Object maxDistributionPercentage;
    @SerializedName("minDifferenceLower")
    @Expose
    private Object minDifferenceLower;
    @SerializedName("minDistributed")
    @Expose
    private Object minDistributed;
    @SerializedName("minDividents")
    @Expose
    private Object minDividents;
    @SerializedName("rdAmountLimit")
    @Expose
    private Object rdAmountLimit;
    @SerializedName("rdDrawLimit")
    @Expose
    private Object rdDrawLimit;
    @SerializedName("rollOverDraw")
    @Expose
    private Object rollOverDraw;
    @SerializedName("jackpotStepUp")
    @Expose
    private Object jackpotStepUp;
    @SerializedName("initialJackpot")
    @Expose
    private Object initialJackpot;

    public Object getCascadeDownCategory() {
        return cascadeDownCategory;
    }

    public void setCascadeDownCategory(Object cascadeDownCategory) {
        this.cascadeDownCategory = cascadeDownCategory;
    }

    public Object getFundPercentage() {
        return fundPercentage;
    }

    public void setFundPercentage(Object fundPercentage) {
        this.fundPercentage = fundPercentage;
    }

    public Object getMaxDistributed() {
        return maxDistributed;
    }

    public void setMaxDistributed(Object maxDistributed) {
        this.maxDistributed = maxDistributed;
    }

    public Object getMaxDistributionPercentage() {
        return maxDistributionPercentage;
    }

    public void setMaxDistributionPercentage(Object maxDistributionPercentage) {
        this.maxDistributionPercentage = maxDistributionPercentage;
    }

    public Object getMinDifferenceLower() {
        return minDifferenceLower;
    }

    public void setMinDifferenceLower(Object minDifferenceLower) {
        this.minDifferenceLower = minDifferenceLower;
    }

    public Object getMinDistributed() {
        return minDistributed;
    }

    public void setMinDistributed(Object minDistributed) {
        this.minDistributed = minDistributed;
    }

    public Object getMinDividents() {
        return minDividents;
    }

    public void setMinDividents(Object minDividents) {
        this.minDividents = minDividents;
    }

    public Object getRdAmountLimit() {
        return rdAmountLimit;
    }

    public void setRdAmountLimit(Object rdAmountLimit) {
        this.rdAmountLimit = rdAmountLimit;
    }

    public Object getRdDrawLimit() {
        return rdDrawLimit;
    }

    public void setRdDrawLimit(Object rdDrawLimit) {
        this.rdDrawLimit = rdDrawLimit;
    }

    public Object getRollOverDraw() {
        return rollOverDraw;
    }

    public void setRollOverDraw(Object rollOverDraw) {
        this.rollOverDraw = rollOverDraw;
    }

    public Object getJackpotStepUp() {
        return jackpotStepUp;
    }

    public void setJackpotStepUp(Object jackpotStepUp) {
        this.jackpotStepUp = jackpotStepUp;
    }

    public Object getInitialJackpot() {
        return initialJackpot;
    }

    public void setInitialJackpot(Object initialJackpot) {
        this.initialJackpot = initialJackpot;
    }

}
