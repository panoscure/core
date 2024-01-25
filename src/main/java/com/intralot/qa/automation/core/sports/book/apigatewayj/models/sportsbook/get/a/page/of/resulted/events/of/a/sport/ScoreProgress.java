package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.a.page.of.resulted.events.of.a.sport;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScoreProgress {

    @SerializedName("totalTime")
    @Expose
    private String totalTime;
    @SerializedName("periodId")
    @Expose
    private String periodId;
    @SerializedName("score")
    @Expose
    private Score score;
    @SerializedName("periods")
    @Expose
    private List<Period> periods = null;
    @SerializedName("yellowCards")
    @Expose
    private YellowCards yellowCards;
    @SerializedName("redCards")
    @Expose
    private RedCards redCards;
    @SerializedName("extraInfo")
    @Expose
    private ExtraInfo extraInfo;

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }

    public String getPeriodId() {
        return periodId;
    }

    public void setPeriodId(String periodId) {
        this.periodId = periodId;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

    public YellowCards getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(YellowCards yellowCards) {
        this.yellowCards = yellowCards;
    }

    public RedCards getRedCards() {
        return redCards;
    }

    public void setRedCards(RedCards redCards) {
        this.redCards = redCards;
    }

    public ExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

}