package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GameOperations {

    @SerializedName("noAutoPay")
    @Expose
    private Boolean noAutoPay;
    @SerializedName("pilot")
    @Expose
    private Boolean pilot;
    @SerializedName("riskMgt")
    @Expose
    private Boolean riskMgt;
    @SerializedName("importWinners")
    @Expose
    private Boolean importWinners;
    @SerializedName("noDefaultJackpotRollOver")
    @Expose
    private Boolean noDefaultJackpotRollOver;
    @SerializedName("maxWinningsCalculation")
    @Expose
    private Boolean maxWinningsCalculation;
    @SerializedName("ascendingPrizeOrder")
    @Expose
    private Boolean ascendingPrizeOrder;

    public Boolean getNoAutoPay() {
        return noAutoPay;
    }

    public void setNoAutoPay(Boolean noAutoPay) {
        this.noAutoPay = noAutoPay;
    }

    public Boolean getPilot() {
        return pilot;
    }

    public void setPilot(Boolean pilot) {
        this.pilot = pilot;
    }

    public Boolean getRiskMgt() {
        return riskMgt;
    }

    public void setRiskMgt(Boolean riskMgt) {
        this.riskMgt = riskMgt;
    }

    public Boolean getImportWinners() {
        return importWinners;
    }

    public void setImportWinners(Boolean importWinners) {
        this.importWinners = importWinners;
    }

    public Boolean getNoDefaultJackpotRollOver() {
        return noDefaultJackpotRollOver;
    }

    public void setNoDefaultJackpotRollOver(Boolean noDefaultJackpotRollOver) {
        this.noDefaultJackpotRollOver = noDefaultJackpotRollOver;
    }

    public Boolean getMaxWinningsCalculation() {
        return maxWinningsCalculation;
    }

    public void setMaxWinningsCalculation(Boolean maxWinningsCalculation) {
        this.maxWinningsCalculation = maxWinningsCalculation;
    }

    public Boolean getAscendingPrizeOrder() {
        return ascendingPrizeOrder;
    }

    public void setAscendingPrizeOrder(Boolean ascendingPrizeOrder) {
        this.ascendingPrizeOrder = ascendingPrizeOrder;
    }

}
