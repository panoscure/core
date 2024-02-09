
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetGameRecordModel {

    @SerializedName("generic")
    @Expose
    private Generic generic;
    @SerializedName("gameSpecific")
    @Expose
    private GameSpecific gameSpecific;

    public Generic getGeneric() {
        return generic;
    }

    public void setGeneric(Generic generic) {
        this.generic = generic;
    }

    public GameSpecific getGameSpecific() {
        return gameSpecific;
    }

    public void setGameSpecific(GameSpecific gameSpecific) {
        this.gameSpecific = gameSpecific;
    }

}