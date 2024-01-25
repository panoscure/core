
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.iwg.procedures.iwg.rgs;

public class Params {

    private String sessionToken;
    private Integer playerId;
    private Integer gameId;
    private String ticketId;
    private double amount;

    public String getSessionToken() {
        return sessionToken;
    }

    public Params withSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
        return this;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public Params withPlayerId(Integer playerId) {
        this.playerId = playerId;
        return this;
    }

    public Integer getGameId() {
        return gameId;
    }

    public Params withGameId(Integer gameId) {
        this.gameId = gameId;
        return this;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Params withTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    public Double getAmount() {
        return amount;
    }

    public Params withAmount(double amount) {
        this.amount = amount;
        return this;
    }

}
