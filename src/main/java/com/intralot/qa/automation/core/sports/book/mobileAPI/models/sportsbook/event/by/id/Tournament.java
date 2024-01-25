package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sportsbook.event.by.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tournament {
    @SerializedName("sport")
    @Expose
    private Object sport;
    @SerializedName("category")
    @Expose
    private Object category;
    @SerializedName("numberOfEvents")
    @Expose
    private Integer numberOfEvents;
    @SerializedName("numberOfLiveEvents")
    @Expose
    private Integer numberOfLiveEvents;
    @SerializedName("categoryId")
    @Expose
    private String categoryId;
    @SerializedName("numberOfAntepostEvents")
    @Expose
    private Integer numberOfAntepostEvents;
    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("eventsCount")
    @Expose
    private Object eventsCount;
    @SerializedName("antepostEventsCount")
    @Expose
    private Object antepostEventsCount;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;

    public Object getSport() {
        return sport;
    }

    public void setSport(Object sport) {
        this.sport = sport;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public Integer getNumberOfEvents() {
        return numberOfEvents;
    }

    public void setNumberOfEvents(Integer numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }

    public Integer getNumberOfLiveEvents() {
        return numberOfLiveEvents;
    }

    public void setNumberOfLiveEvents(Integer numberOfLiveEvents) {
        this.numberOfLiveEvents = numberOfLiveEvents;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getNumberOfAntepostEvents() {
        return numberOfAntepostEvents;
    }

    public void setNumberOfAntepostEvents(Integer numberOfAntepostEvents) {
        this.numberOfAntepostEvents = numberOfAntepostEvents;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Object getEventsCount() {
        return eventsCount;
    }

    public void setEventsCount(Object eventsCount) {
        this.eventsCount = eventsCount;
    }

    public Object getAntepostEventsCount() {
        return antepostEventsCount;
    }

    public void setAntepostEventsCount(Object antepostEventsCount) {
        this.antepostEventsCount = antepostEventsCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
