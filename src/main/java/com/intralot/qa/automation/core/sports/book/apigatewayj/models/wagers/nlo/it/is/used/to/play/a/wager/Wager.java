
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.nlo.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wager {

    @SerializedName("spbt")
    @Expose
    private Spbt spbt;

    public Spbt getSpbt() {
        return spbt;
    }

    public void setSpbt(Spbt spbt) {
        this.spbt = spbt;
    }

}
