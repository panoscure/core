
package com.intralot.qa.automation.core.lottery.game.scheduler.models.lottery.draw.operations.retrieve.active.draw.requested.game.code;

import java.math.BigInteger;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetrieveActiveDrawForRequestedGameCodeModel {

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
    private Integer status;
    @SerializedName("drawBreak")
    @Expose
    private BigInteger drawBreak;
    @SerializedName("visualDraw")
    @Expose
    private Integer visualDraw;
    @SerializedName("gameRuleVersion")
    @Expose
    private Integer gameRuleVersion;
    @SerializedName("winningNumbers")
    @Expose
    private List<Object> winningNumbers = null;
    @SerializedName("prizeCategories")
    @Expose
    private List <PrizeCategory> prizeCategories = null;
    @SerializedName("winningRevision")
    @Expose
    private Integer winningRevision;
    @SerializedName("activationTime")
    @Expose
    private BigInteger activationTime;
    @SerializedName("typeId")
    @Expose
    private Integer typeId;
    @SerializedName("reservedFund")
    @Expose
    private Double reservedFund;
    @SerializedName("winAmountType")
    @Expose
    private Double winAmountType;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigInteger getDrawBreak() {
        return drawBreak;
    }

    public void setDrawBreak(BigInteger drawBreak) {
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

    public List<Object> getWinningNumbers() {
        return winningNumbers;
    }

    public void setWinningNumbers(List<Object> winningNumbers) {
        this.winningNumbers = winningNumbers;
    }

    public List<PrizeCategory> getPrizeCategories() {
        return prizeCategories;
    }

    public void setPrizeCategories(List<PrizeCategory> prizeCategories) {
        this.prizeCategories = prizeCategories;
    }

    public Integer getWinningRevision() {
        return winningRevision;
    }

    public void setWinningRevision(Integer winningRevision) {
        this.winningRevision = winningRevision;
    }

    public BigInteger getActivationTime() {
        return activationTime;
    }

    public void setActivationTime(BigInteger activationTime) {
        this.activationTime = activationTime;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Double getReservedFund() {
        return reservedFund;
    }

    public void setReservedFund(Double reservedFund) {
        this.reservedFund = reservedFund;
    }

    public Double getWinAmountType() {
        return winAmountType;
    }

    public void setWinAmountType(Double winAmountType) {
        this.winAmountType = winAmountType;
    }
}
