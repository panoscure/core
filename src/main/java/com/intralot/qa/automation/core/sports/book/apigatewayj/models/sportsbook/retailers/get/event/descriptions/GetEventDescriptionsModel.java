package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.retailers.get.event.descriptions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetEventDescriptionsModel {
    @SerializedName("forecastDescriptionList")
    @Expose
    private List<ForecastDescriptionList> forecastDescriptionList = null;
    @SerializedName("locale")
    @Expose
    private String locale;

    public List<ForecastDescriptionList> getForecastDescriptionList() {
        return forecastDescriptionList;
    }

    public void setForecastDescriptionList(List<ForecastDescriptionList> forecastDescriptionList) {
        this.forecastDescriptionList = forecastDescriptionList;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}