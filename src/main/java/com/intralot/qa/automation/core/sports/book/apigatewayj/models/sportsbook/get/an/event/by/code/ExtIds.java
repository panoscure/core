
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.an.event.by.code;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtIds {

    @SerializedName("betradar")
    @Expose
    private String betradar;

    public String getBetradar() {
        return betradar;
    }

    public void setBetradar(String betradar) {
        this.betradar = betradar;
    }

}
