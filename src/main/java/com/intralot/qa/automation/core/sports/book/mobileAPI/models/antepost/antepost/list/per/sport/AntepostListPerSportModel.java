package com.intralot.qa.automation.core.sports.book.mobileAPI.models.antepost.antepost.list.per.sport;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AntepostListPerSportModel {

    @SerializedName("sports")
    @Expose
    private List<Sport> sports = null;
    @SerializedName("selectedSport")
    @Expose
    private String selectedSport;

    public List<Sport> getSports() {
        return sports;
    }

    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

    public String getSelectedSport() {
        return selectedSport;
    }

    public void setSelectedSport(String selectedSport) {
        this.selectedSport = selectedSport;
    }
}
