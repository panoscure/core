
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExtendedBetting {

    @SerializedName("betTypes")
    @Expose
    private List<Integer> betTypes = null;
    @SerializedName("systems")
    @Expose
    private List<System> systems = null;

    public List<Integer> getBetTypes() {
        return betTypes;
    }

    public void setBetTypes(List<Integer> betTypes) {
        this.betTypes = betTypes;
    }

    public List<System> getSystems() {
        return systems;
    }

    public void setSystems(List<System> systems) {
        this.systems = systems;
    }

}
