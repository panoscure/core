
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.by.wager.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OutcomeMetaData {

    @SerializedName("FreeBets")
    @Expose
    private FreeBets freeBets;

    public FreeBets getFreeBets() {
        return freeBets;
    }

    public void setFreeBets(FreeBets freeBets) {
        this.freeBets = freeBets;
    }

}