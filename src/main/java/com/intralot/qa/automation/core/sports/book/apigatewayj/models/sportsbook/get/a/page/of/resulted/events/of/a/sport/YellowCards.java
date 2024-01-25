package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.a.page.of.resulted.events.of.a.sport;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YellowCards {

    @SerializedName("home")
    @Expose
    private Integer home;
    @SerializedName("away")
    @Expose
    private Integer away;

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public Integer getAway() {
        return away;
    }

    public void setAway(Integer away) {
        this.away = away;
    }

}
