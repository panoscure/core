package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.all.available.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

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
    @SerializedName("server")
    @Expose
    private String server;
    @SerializedName("game")
    @Expose
    private Game game;
    @SerializedName("periods")
    @Expose
    private List<Period> periods = null;
    @SerializedName("extraInfo")
    @Expose
    private ExtraInfo extraInfo;

    /**
     * No args constructor for use in serialization
     *
     */
    public ScoreProgress() {
    }

    /**
     *
     * @param periods
     * @param periodId
     * @param score
     * @param extraInfo
     * @param server
     * @param game
     */
    public ScoreProgress(String periodId, Score score, String server, Game game, List<Period> periods, ExtraInfo extraInfo) {
        super();
        this.periodId = periodId;
        this.score = score;
        this.server = server;
        this.game = game;
        this.periods = periods;
        this.extraInfo = extraInfo;
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

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<Period> getPeriods() {
        return periods;
    }

    public void setPeriods(List<Period> periods) {
        this.periods = periods;
    }

    public ExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(String totalTime) {
        this.totalTime = totalTime;
    }
}