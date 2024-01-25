package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.players.get.player.details;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetPlayerDetailsModel {
    @SerializedName("activateAccount")
    @Expose
    private Boolean activateAccount;
    @SerializedName("clientID")
    @Expose
    private Integer clientID;
    @SerializedName("clientStatID")
    @Expose
    private Integer clientStatID;
    @SerializedName("currencyISO")
    @Expose
    private String currencyISO;
    @SerializedName("emailAddress")
    @Expose
    private String emailAddress;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("selfExclusion")
    @Expose
    private Boolean selfExclusion;
    @SerializedName("playerRestrictions")
    @Expose
    private List<PlayerRestriction> playerRestrictions = null;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("userName")
    @Expose
    private String userName;
    @SerializedName("languageISO")
    @Expose
    private String languageISO;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("dateOfBirth")
    @Expose
    private String dateOfBirth;

    public Boolean getActivateAccount() {
        return activateAccount;
    }

    public void setActivateAccount(Boolean activateAccount) {
        this.activateAccount = activateAccount;
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public Integer getClientStatID() {
        return clientStatID;
    }

    public void setClientStatID(Integer clientStatID) {
        this.clientStatID = clientStatID;
    }

    public String getCurrencyISO() {
        return currencyISO;
    }

    public void setCurrencyISO(String currencyISO) {
        this.currencyISO = currencyISO;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Boolean getSelfExclusion() {
        return selfExclusion;
    }

    public void setSelfExclusion(Boolean selfExclusion) {
        this.selfExclusion = selfExclusion;
    }

    public List<PlayerRestriction> getPlayerRestrictions() {
        return playerRestrictions;
    }

    public void setPlayerRestrictions(List<PlayerRestriction> playerRestrictions) {
        this.playerRestrictions = playerRestrictions;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLanguageISO() {
        return languageISO;
    }

    public void setLanguageISO(String languageISO) {
        this.languageISO = languageISO;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
