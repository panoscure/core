package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagersv2.get.wager.details.by.serial.number;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Winnings {

    @SerializedName("dbg")
    @Expose
    private Dbg__1 dbg;

    public Dbg__1 getDbg() {
        return dbg;
    }

    public void setDbg(Dbg__1 dbg) {
        this.dbg = dbg;
    }

}