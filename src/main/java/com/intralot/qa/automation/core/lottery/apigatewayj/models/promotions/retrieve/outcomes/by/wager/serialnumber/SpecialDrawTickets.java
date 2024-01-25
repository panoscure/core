package com.intralot.qa.automation.core.lottery.apigatewayj.models.promotions.retrieve.outcomes.by.wager.serialnumber;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SpecialDrawTickets {

    @SerializedName("participations")
    @Expose
    private Integer participations;
    @SerializedName("validFrom")
    @Expose
    private Integer validFrom;
    @SerializedName("drawRanges")
    @Expose
    private List<Integer> drawRanges = null;
    @SerializedName("released")
    @Expose
    private Boolean released;

    public Integer getParticipations() {
        return participations;
    }

    public void setParticipations(Integer participations) {
        this.participations = participations;
    }

    public Integer getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Integer validFrom) {
        this.validFrom = validFrom;
    }

    public List<Integer> getDrawRanges() {
        return drawRanges;
    }

    public void setDrawRanges(List<Integer> drawRanges) {
        this.drawRanges = drawRanges;
    }

    public Boolean getReleased() {
        return released;
    }

    public void setReleased(Boolean released) {
        this.released = released;
    }

}
