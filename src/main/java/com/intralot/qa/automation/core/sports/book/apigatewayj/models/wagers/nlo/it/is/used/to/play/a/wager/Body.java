
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.nlo.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Body {

    @SerializedName("wagerId")
    @Expose
    private Long wagerId;
    @SerializedName("serialNumbers")
    @Expose
    private List<String> serialNumbers = null;
    @SerializedName("wager")
    @Expose
    private Wager wager;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;

    public Long getWagerId() {
        return wagerId;
    }

    public void setWagerId(Long wagerId) {
        this.wagerId = wagerId;
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
