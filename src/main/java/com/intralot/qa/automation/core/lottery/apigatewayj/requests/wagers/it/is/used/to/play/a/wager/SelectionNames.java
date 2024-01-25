
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SelectionNames {

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

    public SelectionNames withLongName(String longName) {
        this.longName = longName;
        return this;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public SelectionNames withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public String getVeryshortName() {
        return veryshortName;
    }

    public void setVeryshortName(String veryshortName) {
        this.veryshortName = veryshortName;
    }

    public SelectionNames withVeryshortName(String veryshortName) {
        this.veryshortName = veryshortName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("longName", longName).append("shortName", shortName).append("veryshortName", veryshortName).toString();
    }

}
