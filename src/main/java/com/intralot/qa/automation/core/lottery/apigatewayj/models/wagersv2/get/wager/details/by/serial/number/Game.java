package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagersv2.get.wager.details.by.serial.number;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Game {

    @SerializedName("gameId")
    @Expose
    private Integer gameId;
    @SerializedName("totalAmounts")
    @Expose
    private TotalAmounts__1 totalAmounts;
    @SerializedName("details")
    @Expose
    private List<Detail> details;
    @SerializedName("summary")
    @Expose
    private Summary summary;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("blockingStatus")
    @Expose
    private String blockingStatus;
    @SerializedName("paymentStatus")
    @Expose
    private String paymentStatus;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public TotalAmounts__1 getTotalAmounts() {
        return totalAmounts;
    }

    public void setTotalAmounts(TotalAmounts__1 totalAmounts) {
        this.totalAmounts = totalAmounts;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBlockingStatus() {
        return blockingStatus;
    }

    public void setBlockingStatus(String blockingStatus) {
        this.blockingStatus = blockingStatus;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

}
