package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DrawConfig {

    @SerializedName("drawBreak")
    @Expose
    private Integer drawBreak;
    @SerializedName("drawOffset")
    @Expose
    private Integer drawOffset;
    @SerializedName("drawSchedules")
    @Expose
    private List<DrawSchedule> drawSchedules = null;
    @SerializedName("drawTimezone")
    @Expose
    private String drawTimezone;
    @SerializedName("futureDraws")
    @Expose
    private Integer futureDraws;
    @SerializedName("visualDrawAlgorithm")
    @Expose
    private String visualDrawAlgorithm;
    @SerializedName("winnerSelectionDelay")
    @Expose
    private Integer winnerSelectionDelay;

    public Integer getDrawBreak() {
        return drawBreak;
    }

    public void setDrawBreak(Integer drawBreak) {
        this.drawBreak = drawBreak;
    }

    public Integer getDrawOffset() {
        return drawOffset;
    }

    public void setDrawOffset(Integer drawOffset) {
        this.drawOffset = drawOffset;
    }

    public List<DrawSchedule> getDrawSchedules() {
        return drawSchedules;
    }

    public void setDrawSchedules(List<DrawSchedule> drawSchedules) {
        this.drawSchedules = drawSchedules;
    }

    public String getDrawTimezone() {
        return drawTimezone;
    }

    public void setDrawTimezone(String drawTimezone) {
        this.drawTimezone = drawTimezone;
    }

    public Integer getFutureDraws() {
        return futureDraws;
    }

    public void setFutureDraws(Integer futureDraws) {
        this.futureDraws = futureDraws;
    }

    public String getVisualDrawAlgorithm() {
        return visualDrawAlgorithm;
    }

    public void setVisualDrawAlgorithm(String visualDrawAlgorithm) {
        this.visualDrawAlgorithm = visualDrawAlgorithm;
    }

    public Integer getWinnerSelectionDelay() {
        return winnerSelectionDelay;
    }

    public void setWinnerSelectionDelay(Integer winnerSelectionDelay) {
        this.winnerSelectionDelay = winnerSelectionDelay;
    }

}
