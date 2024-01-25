
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.all.available.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class GetAllAvailableEventsModel implements Serializable {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("sportId")
    @Expose
    private String sportId;
    @SerializedName("sportName")
    @Expose
    private String sportName;
    @SerializedName("categId")
    @Expose
    private String categId;
    @SerializedName("categName")
    @Expose
    private String categName;
    @SerializedName("tourId")
    @Expose
    private String tourId;
    @SerializedName("tourName")
    @Expose
    private String tourName;
    @SerializedName("time")
    @Expose
    private Long time;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("names")
    @Expose
    private Names names;
    @SerializedName("compNames")
    @Expose
    private CompNames compNames;
    @SerializedName("categoryNames")
    @Expose
    private CategoryNames categoryNames;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("displayed")
    @Expose
    private Boolean displayed;
    @SerializedName("offeredInplay")
    @Expose
    private Boolean offeredInplay;
    @SerializedName("isInplay")
    @Expose
    private Boolean isInplay;
    @SerializedName("betBuilder")
    @Expose
    private Boolean betBuilder;
    @SerializedName("numMarkets")
    @Expose
    private Integer numMarkets;
    @SerializedName("version")
    @Expose
    private Long version;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants = null;
    @SerializedName("info")
    @Expose
    private Info info;
    @SerializedName("markets")
    @Expose
    private List<Market> markets = null;
    @SerializedName("cashout")
    @Expose
    private Boolean cashout;
    @SerializedName("winningLegsBonus")
    @Expose
    private Boolean winningLegsBonus;
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("neutralVenue")
    @Expose
    private Boolean neutralVenue;
    @SerializedName("inplay")
    @Expose
    private Boolean inplay;
    @SerializedName("scoreProgress")
    @Expose
    private ScoreProgress scoreProgress;

    @SerializedName("anytimeWincast")
    @Expose
    private String anytimeWincast;

    @SerializedName("wincast")
    @Expose
    private String wincast;

    @SerializedName("anytimeScorecast")
    @Expose
    private String anytimeScorecast;

    @SerializedName("timecast")
    @Expose
    private String timecast;

    @SerializedName("scorecast")
    @Expose
    private String scorecast;
    @SerializedName("outright")
    @Expose
    private Boolean outright=false;


    /**
     * No args constructor for use in serialization
     *
     */
    public GetAllAvailableEventsModel() {
    }

    /**
     *
     * @param categoryNames
     * @param compNames
     * @param cashout
     * @param categId
     * @param isInplay
     * @param offeredInplay
     * @param participants
     * @param categName
     * @param version
     * @param info
     * @param id
     * @param time
     * @param sportId
     * @param tourName
     * @param name
     * @param path
     * @param numMarkets
     * @param status
     * @param markets
     * @param code
     * @param inplay
     * @param neutralVenue
     * @param winningLegsBonus
     * @param displayed
     * @param betBuilder
     * @param names
     * @param tourId
     */
    public GetAllAvailableEventsModel(Integer id, String code, String sportId, String categId, String categName, String tourId, String tourName, Long time, String name, Names names, CompNames compNames, CategoryNames categoryNames, String status, Boolean displayed, Boolean offeredInplay, Boolean isInplay, Boolean betBuilder, Integer numMarkets, Long version, List<Participant> participants, Info info, List<Market> markets, Boolean cashout, Boolean winningLegsBonus, String path, Boolean neutralVenue, Boolean inplay) {
        super();
        this.id = id;
        this.code = code;
        this.sportId = sportId;
        this.categId = categId;
        this.categName = categName;
        this.tourId = tourId;
        this.tourName = tourName;
        this.time = time;
        this.name = name;
        this.names = names;
        this.compNames = compNames;
        this.categoryNames = categoryNames;
        this.status = status;
        this.displayed = displayed;
        this.offeredInplay = offeredInplay;
        this.isInplay = isInplay;
        this.betBuilder = betBuilder;
        this.numMarkets = numMarkets;
        this.version = version;
        this.participants = participants;
        this.info = info;
        this.markets = markets;
        this.cashout = cashout;
        this.winningLegsBonus = winningLegsBonus;
        this.path = path;
        this.neutralVenue = neutralVenue;
        this.inplay = inplay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSportId() {
        return sportId;
    }

    public void setSportId(String sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public String getCategId() {
        return categId;
    }

    public void setCategId(String categId) {
        this.categId = categId;
    }

    public String getCategName() {
        return categName;
    }

    public void setCategName(String categName) {
        this.categName = categName;
    }

    public String getTourId() {
        return tourId;
    }

    public void setTourId(String tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Names getNames() {
        return names;
    }

    public void setNames(Names names) {
        this.names = names;
    }

    public CompNames getCompNames() {
        return compNames;
    }

    public void setCompNames(CompNames compNames) {
        this.compNames = compNames;
    }

    public CategoryNames getCategoryNames() {
        return categoryNames;
    }

    public void setCategoryNames(CategoryNames categoryNames) {
        this.categoryNames = categoryNames;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getDisplayed() {
        return displayed;
    }

    public void setDisplayed(Boolean displayed) {
        this.displayed = displayed;
    }

    public Boolean getOfferedInplay() {
        return offeredInplay;
    }

    public void setOfferedInplay(Boolean offeredInplay) {
        this.offeredInplay = offeredInplay;
    }

    public Boolean getIsInplay() {
        return isInplay;
    }

    public void setIsInplay(Boolean isInplay) {
        this.isInplay = isInplay;
    }

    public Boolean getBetBuilder() {
        return betBuilder;
    }

    public void setBetBuilder(Boolean betBuilder) {
        this.betBuilder = betBuilder;
    }

    public Integer getNumMarkets() {
        return numMarkets;
    }

    public void setNumMarkets(Integer numMarkets) {
        this.numMarkets = numMarkets;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Market> getMarkets() {
        return markets;
    }

    public void setMarkets(List<Market> markets) {
        this.markets = markets;
    }

    public Boolean getCashout() {
        return cashout;
    }

    public void setCashout(Boolean cashout) {
        this.cashout = cashout;
    }

    public Boolean getWinningLegsBonus() {
        return winningLegsBonus;
    }

    public void setWinningLegsBonus(Boolean winningLegsBonus) {
        this.winningLegsBonus = winningLegsBonus;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getNeutralVenue() {
        return neutralVenue;
    }

    public void setNeutralVenue(Boolean neutralVenue) {
        this.neutralVenue = neutralVenue;
    }

    public Boolean getInplay() {
        return inplay;
    }

    public void setInplay(Boolean inplay) {
        this.inplay = inplay;
    }

    public List<Selection> getSelectionsOfFirstMarketOfEvent(){
        return getMarkets().get(0).getSelections();
    }

    public Selection getFirstSelectionOfEvent(){
        return getSelectionsOfFirstMarketOfEvent().get(0);
    }

    public ScoreProgress getScoreProgress() {
        return scoreProgress;
    }

    public void setScoreProgress(ScoreProgress scoreProgress) {
        this.scoreProgress = scoreProgress;
    }

    public String getAnytimeWincast() {
        return anytimeWincast;
    }

    public void setAnytimeWincast(String anytimeWincast) {
        this.anytimeWincast = anytimeWincast;
    }

    public String getWincast() {
        return wincast;
    }

    public void setWincast(String wincast) {
        this.wincast = wincast;
    }

    public String getAnytimeScorecast() {
        return anytimeScorecast;
    }

    public void setAnytimeScorecast(String anytimeScorecast) {
        this.anytimeScorecast = anytimeScorecast;
    }

    public String getTimecast() {
        return timecast;
    }

    public void setTimecast(String timecast) {
        this.timecast = timecast;
    }

    public String getScorecast() {
        return scorecast;
    }

    public void setScorecast(String scorecast) {
        this.scorecast = scorecast;
    }

    public Boolean getOutright() {
        return outright;
    }

}
