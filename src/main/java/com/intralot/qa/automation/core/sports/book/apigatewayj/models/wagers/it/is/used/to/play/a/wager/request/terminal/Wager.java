
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.terminal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Wager implements Serializable
{

    @SerializedName("spbt")
    @Expose
    private Spbt spbt;
    @SerializedName("sportsbook")
    @Expose
    private Sportsbook sportsbook;

    public Wager() {
        spbt=new Spbt();
    }

    public Wager(Spbt spbt) {
        super();
        this.spbt = spbt;
    }

    public Spbt getSpbt() {
        return spbt;
    }

    public void setSpbt(Spbt spbt) {
        this.spbt = spbt;
    }

    public Sportsbook getSportsbook() {
        return sportsbook;
    }

    public void setSportsbook(Sportsbook sportsbook) {
        this.sportsbook = sportsbook;
    }

    public Wager withSportsbook(Sportsbook sportsbook) {
        this.sportsbook = sportsbook;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("spbt", spbt).append("sportsbook", sportsbook).toString();
    }
}
