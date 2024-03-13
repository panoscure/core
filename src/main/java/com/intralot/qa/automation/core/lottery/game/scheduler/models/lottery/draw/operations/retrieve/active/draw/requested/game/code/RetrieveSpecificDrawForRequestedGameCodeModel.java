package com.intralot.qa.automation.core.lottery.game.scheduler.models.lottery.draw.operations.retrieve.active.draw.requested.game.code;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


import java.math.BigInteger;
import java.util.List;

public class RetrieveSpecificDrawForRequestedGameCodeModel {

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
    private List<PrizeCategory> prizeCategories = null;
    @SerializedName("winningRevision")
    @Expose
    private BigInteger winningRevision;
    @SerializedName("activationTime")
    @Expose
    private BigInteger activationTime;
    @SerializedName("typeId")
    @Expose
    private Integer typeId;
    @SerializedName("reservedFund")
    @Expose
    private Double reservedFund;
    @SerializedName("extraCategories")
    @Expose
    private List<Object> extraCategories = null;
    @SerializedName("winAmountType")
    @Expose
    private Integer winAmountType;

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

    public PrizeCategory getCategory(int index) {
        if (index > 0 && index <= prizeCategories.size()) {
            return prizeCategories.get(index - 1);
        } else {
            throw new AssertionError();
        }
    }

    public List<PrizeCategory> getPrizeCategories() {
        return prizeCategories;
    }

    public void setPrizeCategories(List<PrizeCategory> prizeCategories) {
        this.prizeCategories = prizeCategories;
    }

    public BigInteger getWinningRevision() {
        return winningRevision;
    }

    public void setWinningRevision(BigInteger winningRevision) {
        this.winningRevision = winningRevision;
    }

    public BigInteger getActivationTime() {
        return activationTime;
    }

    public void setActivationTime(BigInteger activationTime) {
        this.activationTime = activationTime;
    }

    public int getTotalWinners() {
        int totalWinners = 0;
        for (PrizeCategory prizeCategory : prizeCategories) {
            totalWinners += prizeCategory.getWinners();
        }
        return totalWinners;
    }

    public Double getReservedFund() {
        return reservedFund;
    }

    public void setReservedFund(Double reservedFund) {
        this.reservedFund = reservedFund;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public List<Object> getExtraCategories() {
        return extraCategories;
    }

    public void setExtraCategories(List<Object> extraCategories) {
        this.extraCategories = extraCategories;
    }

    public Integer getWinAmountType() {
        return winAmountType;
    }

    public void setWinAmountType(Integer winAmountType) {
        this.winAmountType = winAmountType;
    }
}