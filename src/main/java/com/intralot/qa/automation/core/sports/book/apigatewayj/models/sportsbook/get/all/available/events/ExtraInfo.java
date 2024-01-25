package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.all.available.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtraInfo {

    @SerializedName("games")
    @Expose
    private String games;

    public String getGames() {
        return games;
    }

    public void setGames(String games) {
        this.games = games;
    }
}
