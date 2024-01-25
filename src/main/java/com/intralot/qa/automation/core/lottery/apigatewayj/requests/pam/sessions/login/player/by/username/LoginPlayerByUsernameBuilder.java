package com.intralot.qa.automation.core.lottery.apigatewayj.requests.pam.sessions.login.player.by.username;

public class LoginPlayerByUsernameBuilder {

    public static LoginPlayerByUsernameRequest build(String username, String password, String ip) {

        LoginPlayerByUsernameRequest loginPlayerByUsernameRequest = new LoginPlayerByUsernameRequest();
        loginPlayerByUsernameRequest
                .withUsername(username)
                .withPassword(password)
                .withIp(ip);
        return loginPlayerByUsernameRequest;

    }
}
