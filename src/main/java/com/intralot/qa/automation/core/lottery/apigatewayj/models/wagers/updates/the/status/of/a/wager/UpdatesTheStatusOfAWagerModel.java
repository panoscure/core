
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.updates.the.status.of.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;
import java.util.List;

public class UpdatesTheStatusOfAWagerModel {

    @SerializedName("wagerId")
    @Expose
    private BigInteger wagerId;
    @SerializedName("wager")
    @Expose
    private Wager wager;
    @SerializedName("serialNumbers")
    @Expose
    private List<String> serialNumbers = null;
    @SerializedName("pilot")
    @Expose
    private Boolean pilot;
    @SerializedName("inputMethod")
    @Expose
    private String inputMethod;
    @SerializedName("freeTicketsCancelled")
    @Expose
    private Boolean freeTicketsCancelled=null;

    public BigInteger getWagerId() {
        return wagerId;
    }

    public void setWagerId(BigInteger wagerId) {
        this.wagerId = wagerId;
    }

    public Wager getWager() {
        return wager;
    }

    public void setWager(Wager wager) {
        this.wager = wager;
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

    public String getInputMethod() {
        return inputMethod;
    }

    public void setInputMethod(String inputMethod) {
        this.inputMethod = inputMethod;
    }


    public Boolean getFreeTicketsCancelled() {
        return freeTicketsCancelled;
    }

    public void setFreeTicketsCancelled(Boolean freeTicketsCancelled) {
        this.freeTicketsCancelled = freeTicketsCancelled;
    }
}
