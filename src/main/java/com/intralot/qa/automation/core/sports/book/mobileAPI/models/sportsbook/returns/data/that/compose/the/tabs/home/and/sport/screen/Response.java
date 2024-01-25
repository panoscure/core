package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sportsbook.returns.data.that.compose.the.tabs.home.and.sport.screen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Response {
    @SerializedName("tabs")
    @Expose
    private List<Tab> tabs = null;
    @SerializedName("selectedSportId")
    @Expose
    private String selectedSportId;

    public List<Tab> getTabs() {
        return tabs;
    }

    public void setTabs(List<Tab> tabs) {
        this.tabs = tabs;
    }

    public String getSelectedSportId() {
        return selectedSportId;
    }

    public void setSelectedSportId(String selectedSportId) {
        this.selectedSportId = selectedSportId;
    }

}
