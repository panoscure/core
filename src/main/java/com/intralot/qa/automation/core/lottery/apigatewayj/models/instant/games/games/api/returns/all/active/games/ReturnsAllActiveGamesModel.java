
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.games.games.api.returns.all.active.games;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReturnsAllActiveGamesModel {

    @SerializedName("activeGames")
    @Expose
    private List<ActiveGame> activeGames = null;

    public List<ActiveGame> getActiveGames() {
        return activeGames;
    }

    public void setActiveGames(List<ActiveGame> activeGames) {
        this.activeGames = activeGames;
    }

}
