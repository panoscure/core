package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.all.available.events;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("sets")
    @Expose
    private Integer sets;

    public Integer getSets() {
        return sets;
    }

    public void setSets(Integer sets) {
        this.sets = sets;
    }
}