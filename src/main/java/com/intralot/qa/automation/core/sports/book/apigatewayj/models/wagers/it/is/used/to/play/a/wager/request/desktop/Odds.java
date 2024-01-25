
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;

public class Odds implements Serializable
{

    @SerializedName("decimal")
    @Expose
    private BigDecimal decimal;

    public Odds() {
    }

    public Odds(BigDecimal decimal) {
        super();
        this.decimal = decimal;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("decimal", decimal).toString();
    }

}
