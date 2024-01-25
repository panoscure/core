package com.intralot.qa.automation.core.sports.book.mobileAPI.models.results;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Sport {

    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("marketGroups")
    @Expose
    private List<Object> marketGroups = null;
    @SerializedName("categories")
    @Expose
    private List<Object> categories = null;
    @SerializedName("tournaments")
    @Expose
    private List<Object> tournaments = null;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("liveUrl")
    @Expose
    private String liveUrl;
    @SerializedName("antepostUrl")
    @Expose
    private String antepostUrl;
    @SerializedName("todayUrl")
    @Expose
    private Object todayUrl;
    @SerializedName("popularUrl")
    @Expose
    private Object popularUrl;
    @SerializedName("teamsUrl")
    @Expose
    private String teamsUrl;
    @SerializedName("priority")
    @Expose
    private Object priority;
    @SerializedName("numberOfEvents")
    @Expose
    private Integer numberOfEvents;
    @SerializedName("numberOfAnteposts")
    @Expose
    private Integer numberOfAnteposts;
    @SerializedName("horizontalView")
    @Expose
    private Boolean horizontalView;
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

    public List<Object> getMarketGroups() {
        return marketGroups;
    }

    public void setMarketGroups(List<Object> marketGroups) {
        this.marketGroups = marketGroups;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    public List<Object> getTournaments() {
        return tournaments;
    }

    public void setTournaments(List<Object> tournaments) {
        this.tournaments = tournaments;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLiveUrl() {
        return liveUrl;
    }

    public void setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
    }

    public String getAntepostUrl() {
        return antepostUrl;
    }

    public void setAntepostUrl(String antepostUrl) {
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

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
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

    public Boolean getHorizontalView() {
        return horizontalView;
    }

    public void setHorizontalView(Boolean horizontalView) {
        this.horizontalView = horizontalView;
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