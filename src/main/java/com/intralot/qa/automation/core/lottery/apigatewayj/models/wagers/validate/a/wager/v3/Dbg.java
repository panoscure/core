
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.validate.a.wager.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dbg {

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
    @SerializedName("dbg")
    @Expose
    private List<Dbg_> dbg = null;
    @SerializedName("games")
    @Expose
    private List<Game> games = null;
    @SerializedName("hasGift")
    @Expose
    private Boolean hasGift;

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

    public List<Dbg_> getDbg() {
        return dbg;
    }

    public void setDbg(List<Dbg_> dbg) {
        this.dbg = dbg;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public Boolean getHasGift() {
        return hasGift;
    }

    public void setHasGift(Boolean hasGift) {
        this.hasGift = hasGift;
    }
}
