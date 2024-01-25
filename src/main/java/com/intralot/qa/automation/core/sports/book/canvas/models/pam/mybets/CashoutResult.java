package com.intralot.qa.automation.core.sports.book.canvas.models.pam.mybets;

import java.math.BigDecimal;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CashoutResult {

    @SerializedName("cashoutValue")
    @Expose
    private BigDecimal cashoutValue;
    @SerializedName("startingCashoutValue")
    @Expose
    private Integer startingCashoutValue;
    @SerializedName("betpartResults")
    @Expose
    private List<Object> betpartResults = null;
    @SerializedName("betNo")
    @Expose
    private Integer betNo;
    @SerializedName("betId")
    @Expose
    private String betId;
    @SerializedName("status")
    @Expose
    private String status;

    public BigDecimal getCashoutValue() {
        return cashoutValue;
    }

    public void setCashoutValue(BigDecimal cashoutValue) {
        this.cashoutValue = cashoutValue;
    }

    public Integer getStartingCashoutValue() {
        return startingCashoutValue;
    }

    public void setStartingCashoutValue(Integer startingCashoutValue) {
        this.startingCashoutValue = startingCashoutValue;
    }

    public List<Object> getBetpartResults() {
        return betpartResults;
    }

    public void setBetpartResults(List<Object> betpartResults) {
        this.betpartResults = betpartResults;
    }

    public Integer getBetNo() {
        return betNo;
    }

    public void setBetNo(Integer betNo) {
        this.betNo = betNo;
    }

    public String getBetId() {
        return betId;
    }

    public void setBetId(String betId) {
        this.betId = betId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
