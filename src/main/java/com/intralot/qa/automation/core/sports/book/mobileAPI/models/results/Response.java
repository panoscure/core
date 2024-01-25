package com.intralot.qa.automation.core.sports.book.mobileAPI.models.results;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {

    @SerializedName("dateRange")
    @Expose
    private String dateRange;
    @SerializedName("startOfWeek")
    @Expose
    private Integer startOfWeek;
    @SerializedName("endOfWeek")
    @Expose
    private Integer endOfWeek;
    @SerializedName("weekDays")
    @Expose
    private List<WeekDay> weekDays = null;

    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }

    public Integer getStartOfWeek() {
        return startOfWeek;
    }

    public void setStartOfWeek(Integer startOfWeek) {
        this.startOfWeek = startOfWeek;
    }

    public Integer getEndOfWeek() {
        return endOfWeek;
    }

    public void setEndOfWeek(Integer endOfWeek) {
        this.endOfWeek = endOfWeek;
    }

    public List<WeekDay> getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(List<WeekDay> weekDays) {
        this.weekDays = weekDays;
    }
}