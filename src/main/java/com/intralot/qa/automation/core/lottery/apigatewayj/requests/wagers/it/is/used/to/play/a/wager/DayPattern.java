
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class DayPattern {

    @SerializedName("day")
    @Expose
    private String day;
    @SerializedName("index")
    @Expose
    private Integer index;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public DayPattern withDay(String day) {
        this.day = day;
        return this;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public DayPattern withIndex(Integer index) {
        this.index = index;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("day", day).append("index", index).toString();
    }

}
