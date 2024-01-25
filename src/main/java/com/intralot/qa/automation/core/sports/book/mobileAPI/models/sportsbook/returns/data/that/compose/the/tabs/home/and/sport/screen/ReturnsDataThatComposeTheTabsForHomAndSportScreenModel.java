package com.intralot.qa.automation.core.sports.book.mobileAPI.models.sportsbook.returns.data.that.compose.the.tabs.home.and.sport.screen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReturnsDataThatComposeTheTabsForHomAndSportScreenModel {

    @SerializedName("response")
    @Expose
    private Response response;

    public Response getResponse() {
        return response;
    }
}
