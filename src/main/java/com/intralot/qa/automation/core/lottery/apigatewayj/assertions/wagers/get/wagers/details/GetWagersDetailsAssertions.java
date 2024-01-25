package com.intralot.qa.automation.core.lottery.apigatewayj.assertions.wagers.get.wagers.details;

import com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.serial.number.GetWagerDetailsBySerialNumberModel;
import io.restassured.response.Response;
import static com.google.common.truth.Truth.assertThat;
import static java.net.HttpURLConnection.HTTP_INTERNAL_ERROR;


public class GetWagersDetailsAssertions {

    public static void assertWagerBasicInfo(GetWagerDetailsBySerialNumberModel wager,
                                            String serialNumber, Integer channel, double cost, Integer gameId, Integer multiplier, Integer columns) {
        assertThat(wager.getSerialNumbers().get(0)).isEqualTo(serialNumber);
        assertThat(wager.getMetadata().getChannel()).isEqualTo(channel);
        assertThat(wager.getWager().getDbg().get(0).getCost()).isEqualTo(cost);
        assertThat(wager.getWager().getDbg().get(0).getGameId()).isEqualTo(gameId);
        assertThat(wager.getWager().getDbg().get(0).getMultipliers().get(0)).isEqualTo(multiplier);
        assertThat(wager.getWager().getDbg().get(0).getColumns()).isEqualTo(columns);
    }


    public static void assertWagerBoards(GetWagerDetailsBySerialNumberModel wager, int boardsSize, String firstBoardFirstPanelSelection,
                                         String firstBoardSecondPanelSelection, boolean firstBoardQuickPick) {
        assertThat(wager.getWager().getDbg().get(0).getBoards().size()).isEqualTo(boardsSize);
        assertThat(wager.getWager().getDbg().get(0).getBoards().get(0).getPanels().get(0).getSelection().toString())
                .isEqualTo(firstBoardFirstPanelSelection);
        assertThat(wager.getWager().getDbg().get(0).getBoards().get(0).getPanels().get(1).getSelection().toString())
                .isEqualTo(firstBoardSecondPanelSelection);
        assertThat(wager.getWager().getDbg().get(0).getBoards().get(0).getQuickPick()).isEqualTo(firstBoardQuickPick);
    }

    public static void assertWagerBoard(GetWagerDetailsBySerialNumberModel wager, int boardsSize, int panelSize,
                                         String firstBoardFirstPanelSelection, boolean firstBoardQuickPick) {
        assertThat(wager.getWager().getDbg().get(0).getBoards().size()).isEqualTo(boardsSize);
        assertThat(wager.getWager().getDbg().get(0).getBoards().get(0).getPanels().size()).isEqualTo(panelSize);
        assertThat(wager.getWager().getDbg().get(0).getBoards().get(0).getPanels().get(0).getSelection().toString())
                .isEqualTo(firstBoardFirstPanelSelection);
        assertThat(wager.getWager().getDbg().get(0).getBoards().get(0).getQuickPick()).isEqualTo(firstBoardQuickPick);
    }

    public static void assertWagerStatuses(GetWagerDetailsBySerialNumberModel wager, String status, String blockStatus) {
        assertThat(wager.getWager().getDbg().get(0).getStatus()).isEqualTo(status);
        assertThat(wager.getWager().getDbg().get(0).getBlockStatus()).isEqualTo(blockStatus);
    }


    public static void assertWagerParticipatingDraws(GetWagerDetailsBySerialNumberModel wager, Integer multipleDraws, Integer drawId, Integer firstDraw, Integer lastDraw) {
        assertThat(wager.getWager().getDbg().get(0).getParticipatingDraws().getMultipleDraws()).isEqualTo(multipleDraws);
        assertThat(wager.getWager().getDbg().get(0).getParticipatingDraws().getDraws().get(0)).isEqualTo(drawId);
        assertThat(wager.getWager().getDbg().get(0).getParticipatingDraws().getFirstDraw()).isEqualTo(firstDraw);
        assertThat(wager.getWager().getDbg().get(0).getParticipatingDraws().getLastDraw()).isEqualTo(lastDraw);
    }


    public static void assertWagerNegative(Object wagerNegativeResponse, int statusCode, String message) {
        assertThat(((Response) wagerNegativeResponse).getStatusCode()).isEqualTo(HTTP_INTERNAL_ERROR);
        assertThat(((Response) wagerNegativeResponse).jsonPath().getString("message")).isEqualTo(message);
    }
}
