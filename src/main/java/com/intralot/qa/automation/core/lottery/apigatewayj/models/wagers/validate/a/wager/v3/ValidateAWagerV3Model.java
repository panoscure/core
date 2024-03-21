
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.validate.a.wager.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidateAWagerV3Model {

    @SerializedName("winnings")
    @Expose
    private Winnings winnings;
    @SerializedName("serialNumbers")
    @Expose
    private List<String> serialNumbers = null;
    @SerializedName("pilot")
    @Expose
    private Boolean pilot;
    @SerializedName("wagerId")
    @Expose
    private BigInteger wagerId;


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

    public BigInteger getWagerId() {
        return wagerId;
    }

    public void setWagerId(BigInteger wagerId) {
        this.wagerId = wagerId;
    }
}
