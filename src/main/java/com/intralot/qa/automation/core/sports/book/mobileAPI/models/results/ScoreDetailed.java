package com.intralot.qa.automation.core.sports.book.mobileAPI.models.results;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScoreDetailed {

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
    @SerializedName("shootout")
    @Expose
    private Boolean shootout;

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

    public Boolean getShootout() {
        return shootout;
    }

    public void setShootout(Boolean shootout) {
        this.shootout = shootout;
    }
}