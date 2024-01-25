
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WagerOptions {

    @SerializedName("raffle")
    @Expose
    private Raffle raffle;

    public Raffle getRaffle() {
        return raffle;
    }

    public void setRaffle(Raffle raffle) {
        this.raffle = raffle;
    }

}
