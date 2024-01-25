package com.intralot.qa.automation.core.sports.book.mobileAPI.models.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetPlayerSportsbookBetsModel {
    @SerializedName("bets")
    @Expose
    private List<Bet> bets = null;

    public List<Bet> getBets() {
        return bets;
    }

}
