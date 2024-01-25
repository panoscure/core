package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sportsbook.prematch.event.list;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Event {
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("sport")
    @Expose
    private Sport sport;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("tournament")
    @Expose
    private Tournament tournament;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("timestamp")
    @Expose
    private Integer timestamp;
    @SerializedName("homeTeam")
    @Expose
    private HomeTeam homeTeam;
    @SerializedName("awayTeam")
    @Expose
    private AwayTeam awayTeam;
    @SerializedName("antepost")
    @Expose
    private Boolean antepost;
    @SerializedName("upcomingLive")
    @Expose
    private Boolean upcomingLive;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("live")
    @Expose
    private Boolean live;
    @SerializedName("resulted")
    @Expose
    private Boolean resulted;
    @SerializedName("matchId")
    @Expose
    private String matchId;
    @SerializedName("version")
    @Expose
    private long version;
    @SerializedName("markets")
    @Expose
    private List<Market> markets = null;
    @SerializedName("availableMarkets")
    @Expose
    private Integer availableMarkets;
    @SerializedName("displayed")
    @Expose
    private Boolean displayed;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("periods")
    @Expose
    private List<Object> periods = null;
    @SerializedName("score")
    @Expose
    private Object score;
    @SerializedName("possession")
    @Expose
    private String possession;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("periodTime")
    @Expose
    private Object periodTime;
    @SerializedName("currentPeriod")
    @Expose
    private String currentPeriod;
    @SerializedName("currentPeriodName")
    @Expose
    private String currentPeriodName;
    @SerializedName("neutral")
    @Expose
    private Boolean neutral;
    @SerializedName("betBuilder")
    @Expose
    private Boolean betBuilder;
    @SerializedName("gameScore")
    @Expose
    private Object gameScore;
    @SerializedName("setScore")
    @Expose
    private Object setScore;
    @SerializedName("performId")
    @Expose
    private String performId;
    @SerializedName("betradarStreamId")
    @Expose
    private String betradarStreamId;
    @SerializedName("hasLiveStream")
    @Expose
    private Boolean hasLiveStream;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
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

    public Boolean getAntepost() {
        return antepost;
    }

    public void setAntepost(Boolean antepost) {
        this.antepost = antepost;
    }

    public Boolean getUpcomingLive() {
        return upcomingLive;
    }

    public void setUpcomingLive(Boolean upcomingLive) {
        this.upcomingLive = upcomingLive;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getLive() {
        return live;
    }

    public void setLive(Boolean live) {
        this.live = live;
    }

    public Boolean getResulted() {
        return resulted;
    }

    public void setResulted(Boolean resulted) {
        this.resulted = resulted;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public List<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

    public Integer getAvailableMarkets() {
        return availableMarkets;
    }

    public void setAvailableMarkets(Integer availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    public Boolean getDisplayed() {
        return displayed;
    }

    public void setDisplayed(Boolean displayed) {
        this.displayed = displayed;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public List<Object> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Object> periods) {
        this.periods = periods;
    }

    public Object getScore() {
        return score;
    }

    public void setScore(Object score) {
        this.score = score;
    }

    public String getPossession() {
        return possession;
    }

    public void setPossession(String possession) {
        this.possession = possession;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Object getPeriodTime() {
        return periodTime;
    }

    public void setPeriodTime(Object periodTime) {
        this.periodTime = periodTime;
    }

    public String getCurrentPeriod() {
        return currentPeriod;
    }

    public void setCurrentPeriod(String currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public String getCurrentPeriodName() {
        return currentPeriodName;
    }

    public void setCurrentPeriodName(String currentPeriodName) {
        this.currentPeriodName = currentPeriodName;
    }

    public Boolean getNeutral() {
        return neutral;
    }

    public void setNeutral(Boolean neutral) {
        this.neutral = neutral;
    }

    public Boolean getBetBuilder() {
        return betBuilder;
    }

    public void setBetBuilder(Boolean betBuilder) {
        this.betBuilder = betBuilder;
    }

    public Object getGameScore() {
        return gameScore;
    }

    public void setGameScore(Object gameScore) {
        this.gameScore = gameScore;
    }

    public Object getSetScore() {
        return setScore;
    }

    public void setSetScore(Object setScore) {
        this.setScore = setScore;
    }

    public String getPerformId() {
        return performId;
    }

    public void setPerformId(String performId) {
        this.performId = performId;
    }

    public String getBetradarStreamId() {
        return betradarStreamId;
    }

    public void setBetradarStreamId(String betradarStreamId) {
        this.betradarStreamId = betradarStreamId;
    }

    public Boolean getHasLiveStream() {
        return hasLiveStream;
    }

    public void setHasLiveStream(Boolean hasLiveStream) {
        this.hasLiveStream = hasLiveStream;
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
