package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Panel {

    @SerializedName("drawNumbers")
    @Expose
    private Integer drawNumbers;
    @SerializedName("minSelection")
    @Expose
    private Integer minSelection;
    @SerializedName("maxSelection")
    @Expose
    private Integer maxSelection;
    @SerializedName("rangeFrom")
    @Expose
    private Integer rangeFrom;
    @SerializedName("rangeTo")
    @Expose
    private Integer rangeTo;

    public Integer getDrawNumbers() {
        return drawNumbers;
    }

    public void setDrawNumbers(Integer drawNumbers) {
        this.drawNumbers = drawNumbers;
    }

    public Integer getMinSelection() {
        return minSelection;
    }

    public void setMinSelection(Integer minSelection) {
        this.minSelection = minSelection;
    }

    public Integer getMaxSelection() {
        return maxSelection;
    }

    public void setMaxSelection(Integer maxSelection) {
        this.maxSelection = maxSelection;
    }

    public Integer getRangeFrom() {
        return rangeFrom;
    }

    public void setRangeFrom(Integer rangeFrom) {
        this.rangeFrom = rangeFrom;
    }

    public Integer getRangeTo() {
        return rangeTo;
    }

    public void setRangeTo(Integer rangeTo) {
        this.rangeTo = rangeTo;
    }

}
