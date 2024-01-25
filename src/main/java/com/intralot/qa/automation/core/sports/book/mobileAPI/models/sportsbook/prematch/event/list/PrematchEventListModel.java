package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sportsbook.prematch.event.list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PrematchEventListModel {
    @SerializedName("events")
    @Expose
    private List<Event> events = null;
    @SerializedName("dates")
    @Expose
    private List<String> dates = null;
    @SerializedName("containsMorePages")
    @Expose
    private Boolean containsMorePages;
    @SerializedName("availableMarketsMenu")
    @Expose
    private List<AvailableMarketsMenu> availableMarketsMenu = null;
    @SerializedName("selectedMarket")
    @Expose
    private Object selectedMarket;

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public List<String> getDates() {
        return dates;
    }

    public void setDates(List<String> dates) {
        this.dates = dates;
    }

    public Boolean getContainsMorePages() {
        return containsMorePages;
    }

    public void setContainsMorePages(Boolean containsMorePages) {
        this.containsMorePages = containsMorePages;
    }

    public List<AvailableMarketsMenu> getAvailableMarketsMenu() {
        return availableMarketsMenu;
    }

    public void setAvailableMarketsMenu(List<AvailableMarketsMenu> availableMarketsMenu) {
        this.availableMarketsMenu = availableMarketsMenu;
    }

    public Object getSelectedMarket() {
        return selectedMarket;
    }

    public void setSelectedMarket(Object selectedMarket) {
        this.selectedMarket = selectedMarket;
    }
}
