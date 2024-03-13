
package com.intralot.qa.automation.core.lottery.apigatewayj.models.draw.operations.v3_1.get.drawv3_1;

import java.math.BigInteger;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetDrawV3_1Model {

    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("drawId")
    @Expose
    private Integer drawId;
    @SerializedName("drawTime")
    @Expose
    private BigInteger drawTime;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("statusNr")
    @Expose
    private Integer statusNr;
    @SerializedName("drawBreak")
    @Expose
    private Integer drawBreak;
    @SerializedName("visualDraw")
    @Expose
    private Integer visualDraw;
    @SerializedName("gameRuleVersion")
    @Expose
    private Integer gameRuleVersion;
    @SerializedName("pricePoints")
    @Expose
    private PricePoints pricePoints;
    @SerializedName("winningNumbers")
    @Expose
    private List<WinningNumber> winningNumbers = null;
    @SerializedName("prizeCategories")
    @Expose
    private List<PrizeCategory> prizeCategories = null;
    @SerializedName("wagerStatistics")
    @Expose
    private WagerStatistics wagerStatistics;
    @SerializedName("drawType")
    @Expose
    private String drawType;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Integer getDrawId() {
        return drawId;
    }

    public void setDrawId(Integer drawId) {
        this.drawId = drawId;
    }

    public BigInteger getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(BigInteger drawTime) {
        this.drawTime = drawTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStatusNr() {
        return statusNr;
    }

    public void setStatusNr(Integer statusNr) {
        this.statusNr = statusNr;
    }

    public Integer getDrawBreak() {
        return drawBreak;
    }

    public void setDrawBreak(Integer drawBreak) {
        this.drawBreak = drawBreak;
    }

    public Integer getVisualDraw() {
        return visualDraw;
    }

    public void setVisualDraw(Integer visualDraw) {
        this.visualDraw = visualDraw;
    }

    public Integer getGameRuleVersion() {
        return gameRuleVersion;
    }

    public void setGameRuleVersion(Integer gameRuleVersion) {
        this.gameRuleVersion = gameRuleVersion;
    }

    public PricePoints getPricePoints() {
        return pricePoints;
    }

    public void setPricePoints(PricePoints pricePoints) {
        this.pricePoints = pricePoints;
    }

    public List<WinningNumber> getWinningNumbers() {
        return winningNumbers;
    }

    public void setWinningNumbers(List<WinningNumber> winningNumbers) {
        this.winningNumbers = winningNumbers;
    }

    public List<PrizeCategory> getPrizeCategories() {
        return prizeCategories;
    }

    public void setPrizeCategories(List<PrizeCategory> prizeCategories) {
        this.prizeCategories = prizeCategories;
    }

    public WagerStatistics getWagerStatistics() {
        return wagerStatistics;
    }

    public void setWagerStatistics(WagerStatistics wagerStatistics) {
        this.wagerStatistics = wagerStatistics;
    }

    public String getDrawType() {
        return drawType;
    }

    public void setDrawType(String drawType) {
        this.drawType = drawType;
    }
}
