package com.intralot.qa.automation.core.sports.book.apigatewayj.models.l5.sportbook.wagers.overask;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

public class Bet {
    @SerializedName("barcode")
    @Expose
    private String barcode;
    @SerializedName("potentialPayout")
    @Expose
    private BigDecimal potentialPayout;
    @SerializedName("potentialBonusWinnings")
    @Expose
    private BigDecimal potentialBonusWinnings;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("selectionsPos")
    @Expose
    private List<SelectionsPo> selectionsPos = null;
    @SerializedName("system")
    @Expose
    private Integer system;
    @SerializedName("totalPrice")
    @Expose
    private BigDecimal totalPrice;
    @SerializedName("totalStake")
    @Expose
    private BigDecimal totalStake;
    @SerializedName("totalDiscountStake")
    @Expose
    private BigDecimal totalDiscountStake;

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public BigDecimal getPotentialPayout() {
        return potentialPayout;
    }

    public void setPotentialPayout(BigDecimal potentialPayout) {
        this.potentialPayout = potentialPayout;
    }

    public BigDecimal getPotentialBonusWinnings() {
        return potentialBonusWinnings;
    }

    public void setPotentialBonusWinnings(BigDecimal potentialBonusWinnings) {
        this.potentialBonusWinnings = potentialBonusWinnings;
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

    public Integer getSystem() {
        return system;
    }

    public void setSystem(Integer system) {
        this.system = system;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getTotalStake() {
        return totalStake;
    }

    public void setTotalStake(BigDecimal totalStake) {
        this.totalStake = totalStake;
    }

    public BigDecimal getTotalDiscountStake() {
        return totalDiscountStake;
    }

    public void setTotalDiscountStake(BigDecimal totalDiscountStake) {
        this.totalDiscountStake = totalDiscountStake;
    }
}