package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.the.version.of.each.available.event;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetTheVersionOfEachAvailableEventModel {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("sportId")
    @Expose
    private String sportId;
    @SerializedName("tourId")
    @Expose
    private String tourId;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("outright")
    @Expose
    private Boolean outright;
    @SerializedName("isInplay")
    @Expose
    private Boolean isInplay;
    @SerializedName("offeredInplay")
    @Expose
    private Boolean offeredInplay;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("categoryId")
    @Expose
    private Integer categoryId;
    @SerializedName("eventName")
    @Expose
    private String eventName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public String getTourId() {
        return tourId;
    }

    public void setTourId(String tourId) {
        this.tourId = tourId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Boolean getOutright() {
        return outright;
    }

    public void setOutright(Boolean outright) {
        this.outright = outright;
    }

    public Boolean getIsInplay() {
        return isInplay;
    }

    public void setIsInplay(Boolean isInplay) {
        this.isInplay = isInplay;
    }

    public Boolean getOfferedInplay() {
        return offeredInplay;
    }

    public void setOfferedInplay(Boolean offeredInplay) {
        this.offeredInplay = offeredInplay;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
