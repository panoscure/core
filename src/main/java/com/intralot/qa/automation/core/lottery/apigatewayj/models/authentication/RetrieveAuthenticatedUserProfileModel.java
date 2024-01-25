package com.intralot.qa.automation.core.lottery.apigatewayj.models.authentication;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

public class RetrieveAuthenticatedUserProfileModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("accountLocked")
    @Expose
    private Boolean accountLocked;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("failures")
    @Expose
    private Integer failures;
    @SerializedName("createdDate")
    @Expose
    private BigInteger createdDate;
    @SerializedName("passwordExpDate")
    @Expose
    private BigInteger passwordExpDate;
    @SerializedName("lastLoginDate")
    @Expose
    private BigInteger lastLoginDate;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("accessTokenValiditySeconds")
    @Expose
    private Integer accessTokenValiditySeconds;
    @SerializedName("authorities")
    @Expose
    private List<Object> authorities = null;
    @SerializedName("operators")
    @Expose
    private List<Integer> operators = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(Boolean accountLocked) {
        this.accountLocked = accountLocked;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFailures() {
        return failures;
    }

    public void setFailures(Integer failures) {
        this.failures = failures;
    }

    public BigInteger getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(BigInteger createdDate) {
        this.createdDate = createdDate;
    }

    public BigInteger getPasswordExpDate() {
        return passwordExpDate;
    }

    public void setPasswordExpDate(BigInteger passwordExpDate) {
        this.passwordExpDate = passwordExpDate;
    }

    public BigInteger getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(BigInteger lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAccessTokenValiditySeconds() {
        return accessTokenValiditySeconds;
    }

    public void setAccessTokenValiditySeconds(Integer accessTokenValiditySeconds) {
        this.accessTokenValiditySeconds = accessTokenValiditySeconds;
    }

    public List<Object> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Object> authorities) {
        this.authorities = authorities;
    }

    public List<Integer> getOperators() {
        return operators;
    }

    public void setOperators(List<Integer> operators) {
        this.operators = operators;
    }

}