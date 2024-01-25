
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Addon {

    @SerializedName("raffle")
    @Expose
    private Raffle raffle;

    public Raffle getRaffle() {
        return raffle;
    }

    public void setRaffle(Raffle raffle) {
        this.raffle = raffle;
    }

    public Addon withRaffle(Raffle raffle) {
        this.raffle = raffle;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("raffle", raffle).toString();
    }

}
