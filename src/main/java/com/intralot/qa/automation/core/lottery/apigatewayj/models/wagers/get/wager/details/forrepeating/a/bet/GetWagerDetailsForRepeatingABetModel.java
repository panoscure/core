
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetWagerDetailsForRepeatingABetModel {

    @SerializedName("wager")
    @Expose
    private Wager wager;

    public Wager getWager() {
        return wager;
    }

    public void setWager(Wager wager) {
        this.wager = wager;
    }

}