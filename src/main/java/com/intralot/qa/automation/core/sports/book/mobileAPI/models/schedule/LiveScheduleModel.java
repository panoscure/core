package com.intralot.qa.automation.core.sports.book.mobileAPI.models.schedule;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LiveScheduleModel {

    @SerializedName("liveSchedule")
    @Expose
    private List<LiveSchedule> liveSchedule = null;
    @SerializedName("selectedDate")
    @Expose
    private String selectedDate;
    @SerializedName("selectedSport")
    @Expose
    private Object selectedSport;
    @SerializedName("availableDates")
    @Expose
    private List<String> availableDates = null;
    @SerializedName("sportsMenu")
    @Expose
    private List<SportsMenu> sportsMenu = null;

    public List<LiveSchedule> getLiveSchedule() {
        return liveSchedule;
    }

    public void setLiveSchedule(List<LiveSchedule> liveSchedule) {
        this.liveSchedule = liveSchedule;
    }

    public String getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(String selectedDate) {
        this.selectedDate = selectedDate;
    }

    public Object getSelectedSport() {
        return selectedSport;
    }

    public void setSelectedSport(Object selectedSport) {
        this.selectedSport = selectedSport;
    }

    public List<String> getAvailableDates() {
        return availableDates;
    }

    public void setAvailableDates(List<String> availableDates) {
        this.availableDates = availableDates;
    }

    public List<SportsMenu> getSportsMenu() {
        return sportsMenu;
    }

    public void setSportsMenu(List<SportsMenu> sportsMenu) {
        this.sportsMenu = sportsMenu;
    }

}
