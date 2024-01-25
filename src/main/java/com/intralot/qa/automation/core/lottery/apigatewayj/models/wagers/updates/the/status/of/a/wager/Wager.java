
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.updates.the.status.of.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Wager {

    @SerializedName("dbg")
    @Expose
    private List<Dbg> dbg = null;

    public List<Dbg> getDbg() {
        return dbg;
    }

    public void setDbg(List<Dbg> dbg) {
        this.dbg = dbg;
    }


}
