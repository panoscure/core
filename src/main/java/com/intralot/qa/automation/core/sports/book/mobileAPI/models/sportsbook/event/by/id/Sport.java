package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sportsbook.event.by.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sport {
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("marketGroups")
    @Expose
    private MarketGroups marketGroups;
    @SerializedName("categories")
    @Expose
    private Object categories;
    @SerializedName("tournaments")
    @Expose
    private Object tournaments;
    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("liveUrl")
    @Expose
    private Object liveUrl;
    @SerializedName("antepostUrl")
    @Expose
    private Object antepostUrl;
    @SerializedName("todayUrl")
    @Expose
    private Object todayUrl;
    @SerializedName("popularUrl")
    @Expose
    private Object popularUrl;
    @SerializedName("teamsUrl")
    @Expose
    private Object teamsUrl;
    @SerializedName("priority")
    @Expose
    private Object priority;
    @SerializedName("numberOfEvents")
    @Expose
    private Integer numberOfEvents;
    @SerializedName("numberOfAnteposts")
    @Expose
    private Integer numberOfAnteposts;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public MarketGroups getMarketGroups() {
        return marketGroups;
    }

    public void setMarketGroups(MarketGroups marketGroups) {
        this.marketGroups = marketGroups;
    }

    public Object getCategories() {
        return categories;
    }

    public void setCategories(Object categories) {
        this.categories = categories;
    }

    public Object getTournaments() {
        return tournaments;
    }

    public void setTournaments(Object tournaments) {
        this.tournaments = tournaments;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public Object getLiveUrl() {
        return liveUrl;
    }

    public void setLiveUrl(Object liveUrl) {
        this.liveUrl = liveUrl;
    }

    public Object getAntepostUrl() {
        return antepostUrl;
    }

    public void setAntepostUrl(Object antepostUrl) {
        this.antepostUrl = antepostUrl;
    }

    public Object getTodayUrl() {
        return todayUrl;
    }

    public void setTodayUrl(Object todayUrl) {
        this.todayUrl = todayUrl;
    }

    public Object getPopularUrl() {
        return popularUrl;
    }

    public void setPopularUrl(Object popularUrl) {
        this.popularUrl = popularUrl;
    }

    public Object getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(Object teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public Object getPriority() {
        return priority;
    }

    public void setPriority(Object priority) {
        this.priority = priority;
    }

    public Integer getNumberOfEvents() {
        return numberOfEvents;
    }

    public void setNumberOfEvents(Integer numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }

    public Integer getNumberOfAnteposts() {
        return numberOfAnteposts;
    }

    public void setNumberOfAnteposts(Integer numberOfAnteposts) {
        this.numberOfAnteposts = numberOfAnteposts;
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
