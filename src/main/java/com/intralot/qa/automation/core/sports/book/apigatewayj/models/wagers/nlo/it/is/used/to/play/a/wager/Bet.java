
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.nlo.it.is.used.to.play.a.wager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bet {

    @SerializedName("barcode")
    @Expose
    private String barcode;
    @SerializedName("potentialPayout")
    @Expose
    private Float potentialPayout;
    @SerializedName("potentialBonusWinnings")
    @Expose
    private Float potentialBonusWinnings;
    @SerializedName("stake")
    @Expose
    private Stake stake;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("selectionsPos")
    @Expose
    private List<SelectionsPo> selectionsPos = null;
    @SerializedName("system")
    @Expose
    private Long system;
    @SerializedName("totalPrice")
    @Expose
    private Float totalPrice;
    @SerializedName("totalStake")
    @Expose
    private Float totalStake;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public Float getPotentialPayout() {
        return potentialPayout;
    }

    public void setPotentialPayout(Float potentialPayout) {
        this.potentialPayout = potentialPayout;
    }

    public Float getPotentialBonusWinnings() {
        return potentialBonusWinnings;
    }

    public void setPotentialBonusWinnings(Float potentialBonusWinnings) {
        this.potentialBonusWinnings = potentialBonusWinnings;
    }

    public Stake getStake() {
        return stake;
    }

    public void setStake(Stake stake) {
        this.stake = stake;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SelectionsPo> getSelectionsPos() {
        return selectionsPos;
    }

    public void setSelectionsPos(List<SelectionsPo> selectionsPos) {
        this.selectionsPos = selectionsPos;
    }

    public Long getSystem() {
        return system;
    }

    public void setSystem(Long system) {
        this.system = system;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Float getTotalStake() {
        return totalStake;
    }

    public void setTotalStake(Float totalStake) {
        this.totalStake = totalStake;
    }

}
