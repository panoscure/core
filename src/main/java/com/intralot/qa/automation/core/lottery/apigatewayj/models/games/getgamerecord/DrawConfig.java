
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DrawConfig {

    @SerializedName("drawBreak")
    @Expose
    private Long drawBreak;
    @SerializedName("drawOffset")
    @Expose
    private Long drawOffset;
    @SerializedName("drawSchedules")
    @Expose
    private List<DrawSchedule> drawSchedules = null;
    @SerializedName("drawTimezone")
    @Expose
    private String drawTimezone;
    @SerializedName("futureDraws")
    @Expose
    private Long futureDraws;
    @SerializedName("visualDrawAlgorithm")
    @Expose
    private Object visualDrawAlgorithm;

    public Long getDrawBreak() {
        return drawBreak;
    }

    public void setDrawBreak(Long drawBreak) {
        this.drawBreak = drawBreak;
    }

    public Long getDrawOffset() {
        return drawOffset;
    }

    public void setDrawOffset(Long drawOffset) {
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

    public Long getFutureDraws() {
        return futureDraws;
    }

    public void setFutureDraws(Long futureDraws) {
        this.futureDraws = futureDraws;
    }

    public Object getVisualDrawAlgorithm() {
        return visualDrawAlgorithm;
    }

    public void setVisualDrawAlgorithm(Object visualDrawAlgorithm) {
        this.visualDrawAlgorithm = visualDrawAlgorithm;
    }

}
