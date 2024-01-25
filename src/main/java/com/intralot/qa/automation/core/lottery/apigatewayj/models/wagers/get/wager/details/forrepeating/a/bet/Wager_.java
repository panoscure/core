
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Wager_ {

    @SerializedName("poolId")
    @Expose
    private Integer poolId;
    @SerializedName("prizeType")
    @Expose
    private String prizeType;
    @SerializedName("recorcdId")
    @Expose
    private Integer recorcdId;
    @SerializedName("selection")
    @Expose
    private List<Selection> selection = null;
    @SerializedName("tier")
    @Expose
    private Integer tier;
    @SerializedName("winningAmount")
    @Expose
    private Integer winningAmount;

    public Integer getPoolId() {
        return poolId;
    }

    public void setPoolId(Integer poolId) {
        this.poolId = poolId;
    }

    public String getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(String prizeType) {
        this.prizeType = prizeType;
    }

    public Integer getRecorcdId() {
        return recorcdId;
    }

    public void setRecorcdId(Integer recorcdId) {
        this.recorcdId = recorcdId;
    }

    public List<Selection> getSelection() {
        return selection;
    }

    public void setSelection(List<Selection> selection) {
        this.selection = selection;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public Integer getWinningAmount() {
        return winningAmount;
    }

    public void setWinningAmount(Integer winningAmount) {
        this.winningAmount = winningAmount;
    }

}
