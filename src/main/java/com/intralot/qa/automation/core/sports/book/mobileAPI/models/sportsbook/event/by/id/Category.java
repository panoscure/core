package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sportsbook.event.by.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {
    @SerializedName("img")
    @Expose
    private String img;
    @SerializedName("sport")
    @Expose
    private Object sport;
    @SerializedName("tournaments")
    @Expose
    private Object tournaments;
    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("priority")
    @Expose
    private Integer priority;
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

    public Object getSport() {
        return sport;
    }

    public void setSport(Object sport) {
        this.sport = sport;
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

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
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
