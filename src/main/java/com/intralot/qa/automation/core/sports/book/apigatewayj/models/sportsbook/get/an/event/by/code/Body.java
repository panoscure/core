
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.an.event.by.code;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Body {

    @SerializedName("id")
    @Expose
    private Long id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("sportId")
    @Expose
    private String sportId;
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
    @SerializedName("extIds")
    @Expose
    private ExtIds extIds;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants = null;
    @SerializedName("markets")
    @Expose
    private List<Market> markets = null;
    @SerializedName("cashout")
    @Expose
    private Boolean cashout;
    @SerializedName("anytimeWincast")
    @Expose
    private Boolean anytimeWincast;
    @SerializedName("wincast")
    @Expose
    private Boolean wincast;
    @SerializedName("anytimeScorecast")
    @Expose
    private Boolean anytimeScorecast;
    @SerializedName("timecast")
    @Expose
    private Boolean timecast;
    @SerializedName("scorecast")
    @Expose
    private Boolean scorecast;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public ExtIds getExtIds() {
        return extIds;
    }

    public void setExtIds(ExtIds extIds) {
        this.extIds = extIds;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
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

    public Boolean getAnytimeWincast() {
        return anytimeWincast;
    }

    public void setAnytimeWincast(Boolean anytimeWincast) {
        this.anytimeWincast = anytimeWincast;
    }

    public Boolean getWincast() {
        return wincast;
    }

    public void setWincast(Boolean wincast) {
        this.wincast = wincast;
    }

    public Boolean getAnytimeScorecast() {
        return anytimeScorecast;
    }

    public void setAnytimeScorecast(Boolean anytimeScorecast) {
        this.anytimeScorecast = anytimeScorecast;
    }

    public Boolean getTimecast() {
        return timecast;
    }

    public void setTimecast(Boolean timecast) {
        this.timecast = timecast;
    }

    public Boolean getScorecast() {
        return scorecast;
    }

    public void setScorecast(Boolean scorecast) {
        this.scorecast = scorecast;
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

}
