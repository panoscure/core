package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CardId {
    @SerializedName("series")
    @Expose
    private String series;
    @SerializedName("number")
    @Expose
    private String number;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CardId withSeries(String series) {
        this.series = series;
        return this;
    }

    public CardId withNumber(String number) {
        this.number = number;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("series", series).append("number", number).toString();
    }

}
