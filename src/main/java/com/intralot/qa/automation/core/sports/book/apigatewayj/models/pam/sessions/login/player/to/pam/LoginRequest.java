package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.sessions.login.player.to.pam;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.BaseModel;


import java.lang.reflect.Modifier;

public class LoginRequest extends BaseModel {
    @SerializedName("ip")
    @Expose
    private String ip = "127.0.0.1";
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("username")
    @Expose
    private String username;

    public LoginRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String toJsonString() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.TRANSIENT, Modifier.VOLATILE)
                .create();
        return gson.toJson(this);
    }
}
