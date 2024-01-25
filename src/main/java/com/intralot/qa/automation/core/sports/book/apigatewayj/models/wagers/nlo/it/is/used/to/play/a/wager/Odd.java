
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.nlo.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Odd {

    @SerializedName("decimal")
    @Expose
    private Float decimal;

    public Float getDecimal() {
        return decimal;
    }

    public void setDecimal(Float decimal) {
        this.decimal = decimal;
    }

}
