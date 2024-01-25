
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.all.available.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;


public class CategoryNames implements Serializable {

    @SerializedName("longName")
    @Expose
    private String longName;
    @SerializedName("shortName")
    @Expose
    private String shortName;
    @SerializedName("veryshortName")
    @Expose
    private String veryshortName;
    private final static long serialVersionUID = -4263954615098511172L;

    /**
     * No args constructor for use in serialization
     */
    public CategoryNames() {
    }

    /**
     * @param longName
     * @param shortName
     * @param veryshortName
     */
    public CategoryNames(String longName, String shortName, String veryshortName) {
        super();
        this.longName = longName;
        this.shortName = shortName;
        this.veryshortName = veryshortName;
    }

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
