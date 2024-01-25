
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.retrieve.the.winnings.of.the.wager.v2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RetrieveTheWinningsForTheWagerModel {

    @SerializedName("winnings")
    @Expose
    private Winnings winnings ;
    @SerializedName("pilot")
    @Expose
    private Boolean pilot;


    public Winnings getWinnings () {
        return winnings;
    }

    public void setWinnings (Winnings winnings) {
        this.winnings = winnings;
    }

    public Boolean getPilot() {
        return pilot;
    }

    public void setPilot(Boolean pilot) {
        this.pilot = pilot;
    }

}
