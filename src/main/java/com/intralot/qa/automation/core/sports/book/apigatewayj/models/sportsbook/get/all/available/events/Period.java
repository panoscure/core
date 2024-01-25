package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.all.available.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Period {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("home")
    @Expose
    private Integer home;
    @SerializedName("away")
    @Expose
    private Integer away;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("overtime")
    @Expose
    private Boolean overtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Period withId(String id) {
        this.id = id;
        return this;
    }

    public Integer getHome() {
        return home;
    }

    public void setHome(Integer home) {
        this.home = home;
    }

    public Period withHome(Integer home) {
        this.home = home;
        return this;
    }

    public Integer getAway() {
        return away;
    }

    public void setAway(Integer away) {
        this.away = away;
    }

    public Period withAway(Integer away) {
        this.away = away;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getOvertime() {
        return overtime;
    }

    public void setOvertime(Boolean overtime) {
        this.overtime = overtime;
    }

}
