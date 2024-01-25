
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class PlaceTerms {

    @SerializedName("numPlaces")
    @Expose
    private Integer numPlaces;
    @SerializedName("placedFraction")
    @Expose
    private String placedFraction;

    public Integer getNumPlaces() {
        return numPlaces;
    }

    public void setNumPlaces(Integer numPlaces) {
        this.numPlaces = numPlaces;
    }

    public PlaceTerms withNumPlaces(Integer numPlaces) {
        this.numPlaces = numPlaces;
        return this;
    }

    public String getPlacedFraction() {
        return placedFraction;
    }

    public void setPlacedFraction(String placedFraction) {
        this.placedFraction = placedFraction;
    }

    public PlaceTerms withPlacedFraction(String placedFraction) {
        this.placedFraction = placedFraction;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numPlaces", numPlaces).append("placedFraction", placedFraction).toString();
    }

}
