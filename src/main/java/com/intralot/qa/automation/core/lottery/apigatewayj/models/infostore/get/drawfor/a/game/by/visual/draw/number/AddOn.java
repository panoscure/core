package com.intralot.qa.automation.core.lottery.apigatewayj.models.infostore.get.drawfor.a.game.by.visual.draw.number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddOn {

    @SerializedName("amount")
    @Expose
    private float amount;
    @SerializedName("gameType")
    @Expose
    private String gameType;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

}