package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.retrieve.the.players.bets;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class System {
    @SerializedName("type")
    @Expose
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public System withType(String type) {
        this.type = type;
        return this;
    }
}