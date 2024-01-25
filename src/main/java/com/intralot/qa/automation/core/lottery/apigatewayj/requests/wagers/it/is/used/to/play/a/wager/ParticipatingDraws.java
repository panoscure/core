
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ParticipatingDraws {

    @SerializedName("draws")
    @Expose
    private List<Integer> draws = null;
    @SerializedName("firstDraw")
    @Expose
    private Integer firstDraw;
    @SerializedName("lastDraw")
    @Expose
    private Integer lastDraw;
    @SerializedName("multipleDraws")
    @Expose
    private Integer multipleDraws;
    @SerializedName("dayPattern")
    @Expose
    public List<DayPattern> dayPattern = null;
    @SerializedName("drawOffsets")
    @Expose
    private List<Integer> drawOffsets = null;

    public ParticipatingDraws withDayPattern(List<DayPattern> dayPattern) {
        this.dayPattern = dayPattern;
        return this;
    }

    public List<Integer> getDraws() {
        return draws;
    }

    public void setDraws(List<Integer> draws) {
        this.draws = draws;
    }

    public ParticipatingDraws withDraws(List<Integer> draws) {
        this.draws = draws;
        return this;
    }

    public Integer getFirstDraw() {
        return firstDraw;
    }

    public void setFirstDraw(Integer firstDraw) {
        this.firstDraw = firstDraw;
    }

    public ParticipatingDraws withFirstDraw(Integer firstDraw) {
        this.firstDraw = firstDraw;
        return this;
    }

    public Integer getLastDraw() {
        return lastDraw;
    }

    public void setLastDraw(Integer lastDraw) {
        this.lastDraw = lastDraw;
    }

    public ParticipatingDraws withLastDraw(Integer lastDraw) {
        this.lastDraw = lastDraw;
        return this;
    }

    public Integer getMultipleDraws() {
        return multipleDraws;
    }

    public void setMultipleDraws(Integer multipleDraws) {
        this.multipleDraws = multipleDraws;
    }

    public ParticipatingDraws withMultipleDraws(Integer multipleDraws) {
        this.multipleDraws = multipleDraws;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("draws", draws).append("firstDraw", firstDraw).append("lastDraw", lastDraw).append("multipleDraws", multipleDraws).toString();
    }

    public List<Integer> getDrawOffsets() {
        return drawOffsets;
    }

    public ParticipatingDraws withDrawOffsets(List<Integer> drawOffsets) {
        this.drawOffsets = drawOffsets;
        return this;
    }

}
