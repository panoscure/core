package com.intralot.qa.automation.core.lottery.apigatewayj.models.pam.sessions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginPlayerByUsernameModel {

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
    @SerializedName("termsStatus")
    @Expose
    private String termsStatus;

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

    public String getTermsStatus() {
        return termsStatus;
    }

    public void setTermsStatus(String termsStatus) {
        this.termsStatus = termsStatus;
    }

}
