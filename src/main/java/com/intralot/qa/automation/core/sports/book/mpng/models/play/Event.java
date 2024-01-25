package com.intralot.qa.automation.core.sports.book.mpng.models.play;

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
    @SerializedName("minimumRestriction")
    @Expose
    private Integer minimumRestriction;
    @SerializedName("maximumRestriction")
    @Expose
    private Integer maximumRestriction;
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
    private HomeTeam homeTeam;
    @SerializedName("awayTeam")
    @Expose
    private AwayTeam awayTeam;
    @SerializedName("compactCode")
    @Expose
    private String compactCode;
    @SerializedName("isAntepost")
    @Expose
    private Boolean isAntepost;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("winnings")
    @Expose
    private Double winnings;

    public String getOddID() {
        return oddID;
    }

    public void setOddID(String oddID) {
        this.oddID = oddID;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getMarketID() {
        return marketID;
    }

    public void setMarketID(String marketID) {
        this.marketID = marketID;
    }

    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public Double getOdd() {
        return odd;
    }

    public void setOdd(Double odd) {
        this.odd = odd;
    }

    public String getOddName() {
        return oddName;
    }

    public void setOddName(String oddName) {
        this.oddName = oddName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public Object getColor() {
        return color;
    }

    public void setColor(Object color) {
        this.color = color;
    }

    public String getTournament() {
        return tournament;
    }

    public void setTournament(String tournament) {
        this.tournament = tournament;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Boolean getIsLive() {
        return isLive;
    }

    public void setIsLive(Boolean isLive) {
        this.isLive = isLive;
    }

    public Boolean getBanker() {
        return banker;
    }

    public void setBanker(Boolean banker) {
        this.banker = banker;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMarketStatus() {
        return marketStatus;
    }

    public void setMarketStatus(String marketStatus) {
        this.marketStatus = marketStatus;
    }

    public String getOddStatus() {
        return oddStatus;
    }

    public void setOddStatus(String oddStatus) {
        this.oddStatus = oddStatus;
    }

    public String getOddSelection() {
        return oddSelection;
    }

    public void setOddSelection(String oddSelection) {
        this.oddSelection = oddSelection;
    }

    public Integer getExpire() {
        return expire;
    }

    public void setExpire(Integer expire) {
        this.expire = expire;
    }

    public Integer getMinimumRestriction() {
        return minimumRestriction;
    }

    public void setMinimumRestriction(Integer minimumRestriction) {
        this.minimumRestriction = minimumRestriction;
    }

    public Integer getMaximumRestriction() {
        return maximumRestriction;
    }

    public void setMaximumRestriction(Integer maximumRestriction) {
        this.maximumRestriction = maximumRestriction;
    }

    public Object getBrandId() {
        return brandId;
    }

    public void setBrandId(Object brandId) {
        this.brandId = brandId;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Object getSportImg() {
        return sportImg;
    }

    public void setSportImg(Object sportImg) {
        this.sportImg = sportImg;
    }

    public String getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(String eventUrl) {
        this.eventUrl = eventUrl;
    }

    public Boolean getAmericanGround() {
        return americanGround;
    }

    public void setAmericanGround(Boolean americanGround) {
        this.americanGround = americanGround;
    }

    public HomeTeam getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(HomeTeam homeTeam) {
        this.homeTeam = homeTeam;
    }

    public AwayTeam getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(AwayTeam awayTeam) {
        this.awayTeam = awayTeam;
    }

    public String getCompactCode() {
        return compactCode;
    }

    public void setCompactCode(String compactCode) {
        this.compactCode = compactCode;
    }

    public Boolean getIsAntepost() {
        return isAntepost;
    }

    public void setIsAntepost(Boolean isAntepost) {
        this.isAntepost = isAntepost;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getWinnings() {
        return winnings;
    }

    public void setWinnings(Double winnings) {
        this.winnings = winnings;
    }

}