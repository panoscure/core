package com.intralot.qa.automation.core.lottery.apigatewayj.models.infostore.get.last.drawsfor.a.game;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AddOn {

    @SerializedName("amount")
    @Expose
    private Double amount;
    @SerializedName("gameType")
    @Expose
    private String gameType;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

}
