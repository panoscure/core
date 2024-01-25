package com.intralot.qa.automation.core.lottery.apigatewayj.requests.iwg.procedures.iwg.rgs;

public class IwgRgsBuilder {

    public static IwgRgsRequest build(String method, String sessionToken,
                                      int playerId, int gameId,
                                      String ticketId, double amount) {

        Params params = new Params();
        params.withSessionToken(sessionToken).withPlayerId(playerId)
                .withGameId(gameId).withTicketId(ticketId)
                .withAmount(amount);

        IwgRgsRequest iwgRgsRequest = new IwgRgsRequest();
        iwgRgsRequest.withMethod(method).withParams(params);

        return iwgRgsRequest;

    }
}
