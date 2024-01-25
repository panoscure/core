package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.players.get.player.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerRestriction {
    @SerializedName("indefinitely")
    @Expose
    private Boolean indefinitely;
    @SerializedName("playerRestrictionType")
    @Expose
    private String playerRestrictionType;
    @SerializedName("reason")
    @Expose
    private String reason;
    @SerializedName("requestDate")
    @Expose
    private String requestDate;
    @SerializedName("restrictFromDate")
    @Expose
    private String restrictFromDate;
    @SerializedName("restrictNumMinutes")
    @Expose
    private Integer restrictNumMinutes;
    @SerializedName("restrictUntilDate")
    @Expose
    private String restrictUntilDate;

    public Boolean getIndefinitely() {
        return indefinitely;
    }

    public void setIndefinitely(Boolean indefinitely) {
        this.indefinitely = indefinitely;
    }

    public String getPlayerRestrictionType() {
        return playerRestrictionType;
    }

    public void setPlayerRestrictionType(String playerRestrictionType) {
        this.playerRestrictionType = playerRestrictionType;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getRestrictFromDate() {
        return restrictFromDate;
    }

    public void setRestrictFromDate(String restrictFromDate) {
        this.restrictFromDate = restrictFromDate;
    }

    public Integer getRestrictNumMinutes() {
        return restrictNumMinutes;
    }

    public void setRestrictNumMinutes(Integer restrictNumMinutes) {
        this.restrictNumMinutes = restrictNumMinutes;
    }

    public String getRestrictUntilDate() {
        return restrictUntilDate;
    }

    public void setRestrictUntilDate(String restrictUntilDate) {
        this.restrictUntilDate = restrictUntilDate;
    }
}
