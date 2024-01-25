
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.an.event.by.code;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Names___ {

    @SerializedName("longName")
    @Expose
    private String longName;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("veryshortName")
    @Expose
    private String veryshortName;

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getVeryshortName() {
        return veryshortName;
    }

    public void setVeryshortName(String veryshortName) {
        this.veryshortName = veryshortName;
    }

}
