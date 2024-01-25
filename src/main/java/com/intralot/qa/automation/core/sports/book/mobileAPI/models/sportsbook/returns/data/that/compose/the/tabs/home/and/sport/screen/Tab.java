package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sportsbook.returns.data.that.compose.the.tabs.home.and.sport.screen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Tab {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("isFocused")
    @Expose
    private Boolean isFocused;
    @SerializedName("attributes")
    @Expose
    private List<Object> attributes = null;
    @SerializedName("availableMarketsMenu")
    @Expose
    private List<Object> availableMarketsMenu = null;
    @SerializedName("selectedMarket")
    @Expose
    private Object selectedMarket;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Boolean getIsFocused() {
        return isFocused;
    }

    public void setIsFocused(Boolean isFocused) {
        this.isFocused = isFocused;
    }

    public List<Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Object> attributes) {
        this.attributes = attributes;
    }

    public List<Object> getAvailableMarketsMenu() {
        return availableMarketsMenu;
    }

    public void setAvailableMarketsMenu(List<Object> availableMarketsMenu) {
        this.availableMarketsMenu = availableMarketsMenu;
    }

    public Object getSelectedMarket() {
        return selectedMarket;
    }

    public void setSelectedMarket(Object selectedMarket) {
        this.selectedMarket = selectedMarket;
    }
}
