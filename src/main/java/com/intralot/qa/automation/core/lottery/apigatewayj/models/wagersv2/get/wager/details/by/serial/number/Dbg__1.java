package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagersv2.get.wager.details.by.serial.number;

import java.math.BigDecimal;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dbg__1 {

    @SerializedName("totalAmounts")
    @Expose
    private TotalAmounts totalAmounts;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("highWinner")
    @Expose
    private Boolean highWinner;
    @SerializedName("cost")
    @Expose
    private BigDecimal cost;
    @SerializedName("games")
    @Expose
    private List<Game> games;

    public TotalAmounts getTotalAmounts() {
        return totalAmounts;
    }

    public void setTotalAmounts(TotalAmounts totalAmounts) {
        this.totalAmounts = totalAmounts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getHighWinner() {
        return highWinner;
    }

    public void setHighWinner(Boolean highWinner) {
        this.highWinner = highWinner;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

}