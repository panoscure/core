package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sport;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tournament {
    @SerializedName("tournamentName")
    @Expose
    private String tournamentName;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
