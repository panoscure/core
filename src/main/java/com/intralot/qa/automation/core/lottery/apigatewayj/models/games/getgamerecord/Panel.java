
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Panel {

    @SerializedName("drawNumbers")
    @Expose
    private Long drawNumbers;
    @SerializedName("minSelection")
    @Expose
    private Long minSelection;
    @SerializedName("maxSelection")
    @Expose
    private Long maxSelection;
    @SerializedName("rangeFrom")
    @Expose
    private Long rangeFrom;
    @SerializedName("rangeTo")
    @Expose
    private Long rangeTo;

    public Long getDrawNumbers() {
        return drawNumbers;
    }

    public void setDrawNumbers(Long drawNumbers) {
        this.drawNumbers = drawNumbers;
    }

    public Long getMinSelection() {
        return minSelection;
    }

    public void setMinSelection(Long minSelection) {
        this.minSelection = minSelection;
    }

    public Long getMaxSelection() {
        return maxSelection;
    }

    public void setMaxSelection(Long maxSelection) {
        this.maxSelection = maxSelection;
    }

    public Long getRangeFrom() {
        return rangeFrom;
    }

    public void setRangeFrom(Long rangeFrom) {
        this.rangeFrom = rangeFrom;
    }

    public Long getRangeTo() {
        return rangeTo;
    }

    public void setRangeTo(Long rangeTo) {
        this.rangeTo = rangeTo;
    }

}
