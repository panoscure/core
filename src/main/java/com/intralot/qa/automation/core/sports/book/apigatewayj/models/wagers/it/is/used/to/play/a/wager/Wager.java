
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wager {

    @SerializedName("spbt")
    @Expose
    private Spbt spbt;
    @SerializedName("sportsbook")
    @Expose
    private Sportsbook sportsbook;

    /**
     * No args constructor for use in serialization
     *
     */
    public Wager() {
    }

    /**
     *
     * @param sportsbook
     */
    public Wager(Sportsbook sportsbook) {
        super();
        this.sportsbook = sportsbook;
    }

    public Spbt getSpbt() {
        return spbt;
    }

    public void setSpbt(Spbt spbt) {
        this.spbt = spbt;
    }

    public Wager withSpbt(Spbt spbt) {
        this.spbt = spbt;
        return this;
    }

    public Sportsbook getSportsbook() {
        return sportsbook;
    }

    public void setSportsbook(Sportsbook sportsbook) {
        this.sportsbook = sportsbook;
    }

}
