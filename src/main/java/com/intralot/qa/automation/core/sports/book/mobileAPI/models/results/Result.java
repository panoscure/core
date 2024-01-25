package com.intralot.qa.automation.core.sports.book.mobileAPI.models.results;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Result {

    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("compactCode")
    @Expose
    private String compactCode;
    @SerializedName("sport")
    @Expose
    private Sport sport;
    @SerializedName("category")
    @Expose
    private Category category;
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
    private Object upcomingLive;
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
    private Object matchId;
    @SerializedName("version")
    @Expose
    private Integer version;
    @SerializedName("markets")
    @Expose
    private List<Object> markets = null;
    @SerializedName("eventUrl")
    @Expose
    private Object eventUrl;
    @SerializedName("todayEventUrl")
    @Expose
    private Object todayEventUrl;
    @SerializedName("antepostEventUrl")
    @Expose
    private Object antepostEventUrl;
    @SerializedName("popularEventUrl")
    @Expose
    private Object popularEventUrl;
    @SerializedName("availableMarkets")
    @Expose
    private Object availableMarkets;
    @SerializedName("lexicon")
    @Expose
    private List<Object> lexicon = null;
    @SerializedName("displayed")
    @Expose
    private Object displayed;
    @SerializedName("neutral")
    @Expose
    private Boolean neutral;
    @SerializedName("priority")
    @Expose
    private Integer priority;
    @SerializedName("periods")
    @Expose
    private List<Period> periods = null;
    @SerializedName("scoreProgress")
    @Expose
    private String scoreProgress;
    @SerializedName("score")
    @Expose
    private List<Integer> score = null;
    @SerializedName("possession")
    @Expose
    private Object possession;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("periodTime")
    @Expose
    private Object periodTime;
    @SerializedName("currentPeriod")
    @Expose
    private Object currentPeriod;
    @SerializedName("currentPeriodName")
    @Expose
    private String currentPeriodName;
    @SerializedName("resultParser")
    @Expose
    private Object resultParser;
    @SerializedName("path")
    @Expose
    private Object path;
    @SerializedName("gameScore")
    @Expose
    private List<Integer> gameScore = null;
    @SerializedName("setScore")
    @Expose
    private Object setScore;
    @SerializedName("performId")
    @Expose
    private Object performId;
    @SerializedName("betradarStreamId")
    @Expose
    private Object betradarStreamId;
    @SerializedName("hasLiveStream")
    @Expose
    private Boolean hasLiveStream;
    @SerializedName("betBuilder")
    @Expose
    private Boolean betBuilder;
    @SerializedName("setBased")
    @Expose
    private Boolean setBased;
    @SerializedName("redCards")
    @Expose
    private List<Integer> redCards = null;
    @SerializedName("winningLegsBonus")
    @Expose
    private Boolean winningLegsBonus;
    @SerializedName("americanGround")
    @Expose
    private Boolean americanGround;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("scorePrint")
    @Expose
    private String scorePrint;
    @SerializedName("scorePrintDetailed")
    @Expose
    private String scorePrintDetailed;
    @SerializedName("scoreDetailed")
    @Expose
    private List<ScoreDetailed> scoreDetailed = null;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompactCode() {
        return compactCode;
    }

    public void setCompactCode(String compactCode) {
        this.compactCode = compactCode;
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

    public Object getUpcomingLive() {
        return upcomingLive;
    }

    public void setUpcomingLive(Object upcomingLive) {
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

    public Object getMatchId() {
        return matchId;
    }

    public void setMatchId(Object matchId) {
        this.matchId = matchId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public List<Object> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Object> markets) {
        this.markets = markets;
    }

    public Object getEventUrl() {
        return eventUrl;
    }

    public void setEventUrl(Object eventUrl) {
        this.eventUrl = eventUrl;
    }

    public Object getTodayEventUrl() {
        return todayEventUrl;
    }

    public void setTodayEventUrl(Object todayEventUrl) {
        this.todayEventUrl = todayEventUrl;
    }

    public Object getAntepostEventUrl() {
        return antepostEventUrl;
    }

    public void setAntepostEventUrl(Object antepostEventUrl) {
        this.antepostEventUrl = antepostEventUrl;
    }

    public Object getPopularEventUrl() {
        return popularEventUrl;
    }

    public void setPopularEventUrl(Object popularEventUrl) {
        this.popularEventUrl = popularEventUrl;
    }

    public Object getAvailableMarkets() {
        return availableMarkets;
    }

    public void setAvailableMarkets(Object availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    public List<Object> getLexicon() {
        return lexicon;
    }

    public void setLexicon(List<Object> lexicon) {
        this.lexicon = lexicon;
    }

    public Object getDisplayed() {
        return displayed;
    }

    public void setDisplayed(Object displayed) {
        this.displayed = displayed;
    }

    public Boolean getNeutral() {
        return neutral;
    }

    public void setNeutral(Boolean neutral) {
        this.neutral = neutral;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

    public String getScoreProgress() {
        return scoreProgress;
    }

    public void setScoreProgress(String scoreProgress) {
        this.scoreProgress = scoreProgress;
    }

    public List<Integer> getScore() {
        return score;
    }

    public void setScore(List<Integer> score) {
        this.score = score;
    }

    public Object getPossession() {
        return possession;
    }

    public void setPossession(Object possession) {
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

    public Object getCurrentPeriod() {
        return currentPeriod;
    }

    public void setCurrentPeriod(Object currentPeriod) {
        this.currentPeriod = currentPeriod;
    }

    public String getCurrentPeriodName() {
        return currentPeriodName;
    }

    public void setCurrentPeriodName(String currentPeriodName) {
        this.currentPeriodName = currentPeriodName;
    }

    public Object getResultParser() {
        return resultParser;
    }

    public void setResultParser(Object resultParser) {
        this.resultParser = resultParser;
    }

    public Object getPath() {
        return path;
    }

    public void setPath(Object path) {
        this.path = path;
    }

    public List<Integer> getGameScore() {
        return gameScore;
    }

    public void setGameScore(List<Integer> gameScore) {
        this.gameScore = gameScore;
    }

    public Object getSetScore() {
        return setScore;
    }

    public void setSetScore(Object setScore) {
        this.setScore = setScore;
    }

    public Object getPerformId() {
        return performId;
    }

    public void setPerformId(Object performId) {
        this.performId = performId;
    }

    public Object getBetradarStreamId() {
        return betradarStreamId;
    }

    public void setBetradarStreamId(Object betradarStreamId) {
        this.betradarStreamId = betradarStreamId;
    }

    public Boolean getHasLiveStream() {
        return hasLiveStream;
    }

    public void setHasLiveStream(Boolean hasLiveStream) {
        this.hasLiveStream = hasLiveStream;
    }

    public Boolean getBetBuilder() {
        return betBuilder;
    }

    public void setBetBuilder(Boolean betBuilder) {
        this.betBuilder = betBuilder;
    }

    public Boolean getSetBased() {
        return setBased;
    }

    public void setSetBased(Boolean setBased) {
        this.setBased = setBased;
    }

    public List<Integer> getRedCards() {
        return redCards;
    }

    public void setRedCards(List<Integer> redCards) {
        this.redCards = redCards;
    }

    public Boolean getWinningLegsBonus() {
        return winningLegsBonus;
    }

    public void setWinningLegsBonus(Boolean winningLegsBonus) {
        this.winningLegsBonus = winningLegsBonus;
    }

    public Boolean getAmericanGround() {
        return americanGround;
    }

    public void setAmericanGround(Boolean americanGround) {
        this.americanGround = americanGround;
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

    public String getScorePrint() {
        return scorePrint;
    }

    public void setScorePrint(String scorePrint) {
        this.scorePrint = scorePrint;
    }

    public String getScorePrintDetailed() {
        return scorePrintDetailed;
    }

    public void setScorePrintDetailed(String scorePrintDetailed) {
        this.scorePrintDetailed = scorePrintDetailed;
    }

    public List<ScoreDetailed> getScoreDetailed() {
        return scoreDetailed;
    }

    public void setScoreDetailed(List<ScoreDetailed> scoreDetailed) {
        this.scoreDetailed = scoreDetailed;
    }
}