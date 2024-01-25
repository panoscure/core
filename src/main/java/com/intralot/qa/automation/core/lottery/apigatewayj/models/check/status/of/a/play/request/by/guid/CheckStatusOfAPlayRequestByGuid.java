
package com.intralot.qa.automation.core.lottery.apigatewayj.models.check.status.of.a.play.request.by.guid;

import java.math.BigInteger;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CheckStatusOfAPlayRequestByGuid {

    @SerializedName("wagerId")
    @Expose
    private BigInteger wagerId;
    @SerializedName("pilot")
    @Expose
    private Boolean pilot;
    @SerializedName("serialNumbers")
    @Expose
    private List<String> serialNumbers = null;
    @SerializedName("wager")
    @Expose
    private Wager wager;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;

    public BigInteger getWagerId() {
        return wagerId;
    }

    public void setWagerId(BigInteger wagerId) {
        this.wagerId = wagerId;
    }

    public Boolean getPilot() {
        return pilot;
    }

    public void setPilot(Boolean pilot) {
        this.pilot = pilot;
    }

    public List<String> getSerialNumbers() {
        return serialNumbers;
    }

    public void setSerialNumbers(List<String> serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public Wager getWager() {
        return wager;
    }

    public void setWager(Wager wager) {
        this.wager = wager;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

}
