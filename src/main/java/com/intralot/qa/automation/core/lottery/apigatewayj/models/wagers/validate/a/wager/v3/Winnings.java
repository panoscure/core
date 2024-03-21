
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.validate.a.wager.v3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Winnings {

    @SerializedName("dbg")
    @Expose
    private Dbg dbg;

    public Dbg getDbg() {
        return dbg;
    }

    public void setDbg(Dbg dbg) {
        this.dbg = dbg;
    }

}
