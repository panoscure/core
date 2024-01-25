package com.intralot.qa.automation.core.sports.book.mobileAPI.models.betslip.add.bankers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("oddID")
    @Expose
    private String oddID;
    @SerializedName("eventID")
    @Expose
    private String eventID;
    @SerializedName("marketID")
    @Expose
    private String marketID;
    @SerializedName("marketType")
    @Expose
    private String marketType;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("marketName")
    @Expose
    private String marketName;
    @SerializedName("odd")
    @Expose
    private Double odd;
    @SerializedName("oddName")
    @Expose
    private String oddName;
    @SerializedName("sport")
    @Expose
    private String sport;
    @SerializedName("sportId")
    @Expose
    private String sportId;
    @SerializedName("color")
    @Expose
    private Object color;
    @SerializedName("tournament")
    @Expose
    private String tournament;
    @SerializedName("tournamentId")
    @Expose
    private String tournamentId;
    @SerializedName("categoryId")
    @Expose
    private String categoryId;
    @SerializedName("categoryName")
    @Expose
    private String categoryName;
    @SerializedName("event")
    @Expose
    private String event;
    @SerializedName("isLive")
    @Expose
    private Boolean isLive;
    @SerializedName("banker")
    @Expose
    private Boolean banker;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("marketStatus")
    @Expose
    private String marketStatus;
    @SerializedName("oddStatus")
    @Expose
    private String oddStatus;
    @SerializedName("oddSelection")
    @Expose
    private String oddSelection;
    @SerializedName("expire")
    @Expose
    private Integer expire;
    @SerializedName("brandId")
    @Expose
    private Object brandId;
    @SerializedName("channelId")
    @Expose
    private Integer channelId;
    @SerializedName("sportImg")
    @Expose
    private Object sportImg;
    @SerializedName("eventUrl")
    @Expose
    private String eventUrl;
    @SerializedName("americanGround")
    @Expose
    private Boolean americanGround;
    @SerializedName("homeTeam")
    @Expose
    private Object homeTeam;
    @SerializedName("awayTeam")
    @Expose
    private Object awayTeam;
    @SerializedName("compactCode")
    @Expose
    private String compactCode;
    @SerializedName("isAntepost")
    @Expose
    private Boolean isAntepost;
    @SerializedName("date")
    @Expose
    private String date;

    public String getOddID() {
        return oddID;
    }

    public String getEventID() {
        return eventID;
    }

    public String getMarketID() {
        return marketID;
    }

    public String getMarketType() {
        return marketType;
    }

    public String getCode() {
        return code;
    }

    public String getMarketName() {
        return marketName;
    }

    public Double getOdd() {
        return odd;
    }

    public String getOddName() {
        return oddName;
    }

    public String getSport() {
        return sport;
    }

    public String getSportId() {
        return sportId;
    }

    public Object getColor() {
        return color;
    }

    public String getTournament() {
        return tournament;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getEvent() {
        return event;
    }

    public Boolean getIsLive() {
        return isLive;
    }

    public Boolean getBanker() {
        return banker;
    }

    public String getStatus() {
        return status;
    }

    public String getPath() {
        return path;
    }

    public String getMarketStatus() {
        return marketStatus;
    }

    public String getOddStatus() {
        return oddStatus;
    }

    public String getOddSelection() {
        return oddSelection;
    }

    public Integer getExpire() {
        return expire;
    }

    public Object getBrandId() {
        return brandId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public Object getSportImg() {
        return sportImg;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public Boolean getAmericanGround() {
        return americanGround;
    }

    public Object getHomeTeam() {
        return homeTeam;
    }

    public Object getAwayTeam() {
        return awayTeam;
    }

    public String getCompactCode() {
        return compactCode;
    }

    public Boolean getIsAntepost() {
        return isAntepost;
    }

    public String getDate() {
        return date;
    }
}
