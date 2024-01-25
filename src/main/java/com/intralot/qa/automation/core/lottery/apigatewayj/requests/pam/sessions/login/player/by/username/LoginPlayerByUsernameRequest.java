
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.pam.sessions.login.player.by.username;

public class LoginPlayerByUsernameRequest {

    private String username;
    private String password;
    private String pin;
    private String ip;

    public String getUsername() {
        return username;
    }

    public LoginPlayerByUsernameRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginPlayerByUsernameRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPin() {
        return pin;
    }

    public LoginPlayerByUsernameRequest withPin(String pin) {
        this.pin = pin;
        return this;
    }

    public String getIp() {
        return ip;
    }

    public LoginPlayerByUsernameRequest withIp(String ip) {
        this.ip = ip;
        return this;
    }

}
