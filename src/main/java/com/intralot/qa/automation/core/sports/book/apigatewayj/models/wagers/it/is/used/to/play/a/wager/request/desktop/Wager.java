
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Wager implements Serializable
{
    @SerializedName("sportsbook")
    @Expose
    private Sportsbook sportsbook;

    public Wager() {
        sportsbook = new Sportsbook();
    }

    public Wager(Sportsbook sportsbook) {
        super();
        this.sportsbook = sportsbook;
    }

    public Sportsbook getSportsbook() {
        return sportsbook;
    }

    public void setSportsbook(Sportsbook sportsbook) {
        this.sportsbook = sportsbook;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sportsbook", sportsbook).toString();
    }

}
