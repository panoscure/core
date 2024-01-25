package com.intralot.qa.automation.core.sports.book.createWagerBody;


import com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.sessions.login.player.to.pam.LoginPlayerToPAMModel;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.all.available.events.GetAllAvailableEventsModel;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.SystemTypes;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop.Bet;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop.DesktopPlaceBetRequest;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop.Odds;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop.Selection;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class DesktopBetBody {

    public static DesktopPlaceBetRequest createDesktopBetBody(List<GetAllAvailableEventsModel> events, String system, LoginPlayerToPAMModel loginResponse, BigDecimal stake, String currency) {
        SystemTypes systemType = SystemTypes.valueOf(system);
        int selections = systemType.getMinSelections();
        int bankers = system.toLowerCase().contains("banker") ? 1 : 0;
        return createDesktopBetBody(events, system, selections, bankers, loginResponse, stake, currency);
    }

    public static DesktopPlaceBetRequest createDesktopBetBodyMultiway(List<GetAllAvailableEventsModel> events, String system, LoginPlayerToPAMModel loginResponse, BigDecimal stake, String currency) {
        SystemTypes systemType = SystemTypes.valueOf(system);
        int selections = systemType.getMinSelections();
        int bankers = system.toLowerCase().contains("banker") ? 1 : 0;
        return createDesktopBetBodyMultiway(events, system, selections, bankers, loginResponse, stake, currency);
    }

    public static DesktopPlaceBetRequest createDesktopBetBodySingles(List<GetAllAvailableEventsModel> events, int selections, LoginPlayerToPAMModel loginResponse, BigDecimal stake, String currency) {
        DesktopPlaceBetRequest betBody = new DesktopPlaceBetRequest();
        betBody.setPlayerId(String.valueOf(loginResponse.getAccountId()));
        betBody.setSessionToken(loginResponse.getSessionToken());

        for (int i = 0; i < selections; i++) {
            GetAllAvailableEventsModel tmpObject = events.get(i);
            betBody.addSelection(new Selection(tmpObject.getId(), tmpObject.getFirstSelectionOfEvent().getId(), new Odds(tmpObject.getFirstSelectionOfEvent().getOdd().getDec().setScale(2, RoundingMode.HALF_DOWN)), false));
            if (i != selections - 1) betBody.addBet(new Bet());
        }

        betBody.setCurrency(currency);
        betBody.setStake(stake);
        betBody.setSystem(SystemTypes.SINGLE);
        betBody.setTrnsTime();

        return betBody;
    }

    public static DesktopPlaceBetRequest createDesktopBetBody(List<GetAllAvailableEventsModel> events, String system, int selections, int bankerToBePicked, LoginPlayerToPAMModel loginResponse, BigDecimal stake, String currency) {
        int picked = 0;
        DesktopPlaceBetRequest betBody = new DesktopPlaceBetRequest();
        betBody.setPlayerId(String.valueOf(loginResponse.getAccountId()));
        betBody.setSessionToken(loginResponse.getSessionToken());
        betBody.setCurrency(currency);
        betBody.setStake(stake);
        betBody.setSystem(SystemTypes.valueOf(system));
        betBody.setTrnsTime();
        for (int i = 0; i < selections; i++) {
            GetAllAvailableEventsModel tmpObject = events.get(i);
            betBody.addSelection(new Selection(tmpObject.getId(), tmpObject.getFirstSelectionOfEvent().getId(), new Odds(tmpObject.getFirstSelectionOfEvent().getOdd().getDec().setScale(2, RoundingMode.HALF_DOWN)), (picked++ < bankerToBePicked)));
        }
        return betBody;
    }

    public static DesktopPlaceBetRequest createDesktopBetBodyMultiway(List<GetAllAvailableEventsModel> events, String system, int selections, int bankerToBePicked, LoginPlayerToPAMModel loginResponse, BigDecimal stake, String currency) {
        int picked = 0;
        DesktopPlaceBetRequest betBody = new DesktopPlaceBetRequest();
        betBody.setPlayerId(String.valueOf(loginResponse.getAccountId()));
        betBody.setSessionToken(loginResponse.getSessionToken());
        betBody.setCurrency(currency);
        betBody.setStake(stake);
        betBody.setSystem(SystemTypes.valueOf(system));
        betBody.setTrnsTime();
        for (int i = 0; i < selections; i++) {
            GetAllAvailableEventsModel tmpObject = events.get(i);
            betBody.addSelection(new Selection(tmpObject.getId(), tmpObject.getFirstSelectionOfEvent().getId(), new Odds(tmpObject.getFirstSelectionOfEvent().getOdd().getDec().setScale(2, RoundingMode.HALF_DOWN)), (picked++ < bankerToBePicked)));
        }
        GetAllAvailableEventsModel tmpObject = events.get(selections - 1);
        betBody.addSelection(new Selection(tmpObject.getId(), tmpObject.getSelectionsOfFirstMarketOfEvent().get(1).getId(), new Odds(tmpObject.getSelectionsOfFirstMarketOfEvent().get(1).getOdd().getDec().setScale(2, RoundingMode.HALF_DOWN)), false));

        return betBody;
    }
}
