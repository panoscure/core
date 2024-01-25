package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.player.updates.the.player.preferences;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.BaseModel;

import java.util.List;

public class UpdatesThePlayerPreferencesModel extends BaseModel {
    @SerializedName("accountId")
    @Expose
    private Integer accountId;
    @SerializedName("additionalBetStakes")
    @Expose
    private List<Double> additionalBetStakes = null;
    @SerializedName("autoAcceptHigherOdds")
    @Expose
    private Boolean autoAcceptHigherOdds;
    @SerializedName("autoAcceptAllOdds")
    @Expose
    private Boolean autoAcceptAllOdds;
    @SerializedName("defaultBetStake")
    @Expose
    private Double defaultBetStake;
    @SerializedName("favouriteCompetitions")
    @Expose
    private List<Object> favouriteCompetitions = null;
    @SerializedName("favouriteTeams")
    @Expose
    private List<Object> favouriteTeams = null;
    @SerializedName("favouritePlayers")
    @Expose
    private List<Object> favouritePlayers = null;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public List<Double> getAdditionalBetStakes() {
        return additionalBetStakes;
    }

    public void setAdditionalBetStakes(List<Double> additionalBetStakes) {
        this.additionalBetStakes = additionalBetStakes;
    }

    public Boolean getAutoAcceptHigherOdds() {
        return autoAcceptHigherOdds;
    }

    public void setAutoAcceptHigherOdds(Boolean autoAcceptHigherOdds) {
        this.autoAcceptHigherOdds = autoAcceptHigherOdds;
    }

    public Boolean getAutoAcceptAllOdds() {
        return autoAcceptAllOdds;
    }

    public void setAutoAcceptAllOdds(Boolean autoAcceptAllOdds) {
        this.autoAcceptAllOdds = autoAcceptAllOdds;
    }

    public Double getDefaultBetStake() {
        return defaultBetStake;
    }

    public void setDefaultBetStake(Double defaultBetStake) {
        this.defaultBetStake = defaultBetStake;
    }

    public List<Object> getFavouriteCompetitions() {
        return favouriteCompetitions;
    }

    public void setFavouriteCompetitions(List<Object> favouriteCompetitions) {
        this.favouriteCompetitions = favouriteCompetitions;
    }

    public List<Object> getFavouriteTeams() {
        return favouriteTeams;
    }

    public void setFavouriteTeams(List<Object> favouriteTeams) {
        this.favouriteTeams = favouriteTeams;
    }

    public List<Object> getFavouritePlayers() {
        return favouritePlayers;
    }

    public void setFavouritePlayers(List<Object> favouritePlayers) {
        this.favouritePlayers = favouritePlayers;
    }
}