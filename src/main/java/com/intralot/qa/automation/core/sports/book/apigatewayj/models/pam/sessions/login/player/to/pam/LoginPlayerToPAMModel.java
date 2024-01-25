package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.sessions.login.player.to.pam;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginPlayerToPAMModel {
    @SerializedName("accountId")
    @Expose
    private int accountId;
    @SerializedName("lastLoginDate")
    @Expose
    private Long lastLoginDate;
    @SerializedName("playerRegistrationSts")
    @Expose
    private String playerRegistrationSts;
    @SerializedName("sessionToken")
    @Expose
    private String sessionToken;

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Long getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Long lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getPlayerRegistrationSts() {
        return playerRegistrationSts;
    }

    public void setPlayerRegistrationSts(String playerRegistrationSts) {
        this.playerRegistrationSts = playerRegistrationSts;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }
}
