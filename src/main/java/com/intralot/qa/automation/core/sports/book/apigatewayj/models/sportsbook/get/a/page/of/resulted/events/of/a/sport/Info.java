package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.a.page.of.resulted.events.of.a.sport;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("abandoned")
    @Expose
    private Boolean abandoned;
    @SerializedName("sport")
    @Expose
    private String sport;

    public Boolean getAbandoned() {
        return abandoned;
    }

    public void setAbandoned(Boolean abandoned) {
        this.abandoned = abandoned;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

}
