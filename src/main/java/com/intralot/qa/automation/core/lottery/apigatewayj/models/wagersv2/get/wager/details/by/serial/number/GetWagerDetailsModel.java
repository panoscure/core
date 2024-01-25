package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagersv2.get.wager.details.by.serial.number;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetWagerDetailsModel {

    @SerializedName("wager")
    @Expose
    private Wager wager;
    @SerializedName("winnings")
    @Expose
    private Winnings winnings;
    @SerializedName("serialNumbers")
    @Expose
    private List<String> serialNumbers;
    @SerializedName("pilot")
    @Expose
    private Boolean pilot;

    public Wager getWager() {
        return wager;
    }

    public void setWager(Wager wager) {
        this.wager = wager;
    }

    public Winnings getWinnings() {
        return winnings;
    }

    public void setWinnings(Winnings winnings) {
        this.winnings = winnings;
    }

    public List<String> getSerialNumbers() {
        return serialNumbers;
    }

    public void setSerialNumbers(List<String> serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public Boolean getPilot() {
        return pilot;
    }

    public void setPilot(Boolean pilot) {
        this.pilot = pilot;
    }

}
