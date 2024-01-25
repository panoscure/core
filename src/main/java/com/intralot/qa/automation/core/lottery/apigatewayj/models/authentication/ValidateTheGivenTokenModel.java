package com.intralot.qa.automation.core.lottery.apigatewayj.models.authentication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ValidateTheGivenTokenModel {

    @SerializedName("user_type")
    @Expose
    private Object userType;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("operators")
    @Expose
    private List<Integer> operators = null;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("scope")
    @Expose
    private List<String> scope = null;
    @SerializedName("exp")
    @Expose
    private Integer exp;
    @SerializedName("jti")
    @Expose
    private String jti;
    @SerializedName("client_id")
    @Expose
    private String clientId;

    public Object getUserType() {
        return userType;
    }

    public void setUserType(Object userType) {
        this.userType = userType;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public List<Integer> getOperators() {
        return operators;
    }

    public void setOperators(List<Integer> operators) {
        this.operators = operators;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public String getJti() {
        return jti;
    }

    public void setJti(String jti) {
        this.jti = jti;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

}