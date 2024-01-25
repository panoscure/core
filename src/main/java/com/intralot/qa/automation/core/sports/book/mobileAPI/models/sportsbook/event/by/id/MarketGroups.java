package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sportsbook.event.by.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MarketGroups {
    @SerializedName("136")
    @Expose
    private FirstHalfBetting firstHalfBetting;
    @SerializedName("137")
    @Expose
    private SecondHalfBetting secondHalfBetting;
    @SerializedName("138")
    @Expose
    private NumberOfGoals numberOfGoals;
    @SerializedName("142")
    @Expose
    private CoorectScore coorectScore;
    @SerializedName("144")
    @Expose
    private UnderOver underOver;
    @SerializedName("145")
    @Expose
    private GoalMarkets goalMarkets;
    @SerializedName("146")
    @Expose
    private SpecialMarkets specialMarkets;
    @SerializedName("163")
    @Expose
    private Extra extra;
    @SerializedName("164")
    @Expose
    private ExtraTime extraTime;
    @SerializedName("169")
    @Expose
    private OddEven oddEven;
    @SerializedName("172")
    @Expose
    private GoalMarkets2 goalMarkets2;
    @SerializedName("176")
    @Expose
    private Handicap handicap;
    @SerializedName("182")
    @Expose
    private Popular popular;
    @SerializedName("188")
    @Expose
    private SpecialMarkets2 specialMarkets2;
    @SerializedName("189")
    @Expose
    private WinMarkets winMarkets;
    @SerializedName("2033357607")
    @Expose
    private Other other;

    public FirstHalfBetting getFirstHalfBetting() {
        return firstHalfBetting;
    }

    public void setFirstHalfBetting(FirstHalfBetting firstHalfBetting) {
        this.firstHalfBetting = firstHalfBetting;
    }

    public SecondHalfBetting getSecondHalfBetting() {
        return secondHalfBetting;
    }

    public void setSecondHalfBetting(SecondHalfBetting secondHalfBetting) {
        this.secondHalfBetting = secondHalfBetting;
    }

    public NumberOfGoals getNumberOfGoals() {
        return numberOfGoals;
    }

    public void setNumberOfGoals(NumberOfGoals numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }

    public CoorectScore getCoorectScore() {
        return coorectScore;
    }

    public void setCoorectScore(CoorectScore coorectScore) {
        this.coorectScore = coorectScore;
    }

    public UnderOver getUnderOver() {
        return underOver;
    }

    public void setUnderOver(UnderOver underOver) {
        this.underOver = underOver;
    }

    public GoalMarkets getGoalMarkets() {
        return goalMarkets;
    }

    public void setGoalMarkets(GoalMarkets goalMarkets) {
        this.goalMarkets = goalMarkets;
    }

    public SpecialMarkets getSpecialMarkets() {
        return specialMarkets;
    }

    public void setSpecialMarkets(SpecialMarkets specialMarkets) {
        this.specialMarkets = specialMarkets;
    }

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public ExtraTime getExtraTime() {
        return extraTime;
    }

    public void setExtraTime(ExtraTime extraTime) {
        this.extraTime = extraTime;
    }

    public OddEven getOddEven() {
        return oddEven;
    }

    public void setOddEven(OddEven oddEven) {
        this.oddEven = oddEven;
    }

    public GoalMarkets2 getGoalMarkets2() {
        return goalMarkets2;
    }

    public void setGoalMarkets2(GoalMarkets2 goalMarkets2) {
        this.goalMarkets2 = goalMarkets2;
    }

    public Handicap getHandicap() {
        return handicap;
    }

    public void setHandicap(Handicap handicap) {
        this.handicap = handicap;
    }

    public Popular getPopular() {
        return popular;
    }

    public void setPopular(Popular popular) {
        this.popular = popular;
    }

    public SpecialMarkets2 getSpecialMarkets2() {
        return specialMarkets2;
    }

    public void setSpecialMarkets2(SpecialMarkets2 specialMarkets2) {
        this.specialMarkets2 = specialMarkets2;
    }

    public WinMarkets getWinMarkets() {
        return winMarkets;
    }

    public void setWinMarkets(WinMarkets winMarkets) {
        this.winMarkets = winMarkets;
    }

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }
}
