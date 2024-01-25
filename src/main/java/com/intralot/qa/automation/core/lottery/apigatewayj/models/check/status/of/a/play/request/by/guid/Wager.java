
package com.intralot.qa.automation.core.lottery.apigatewayj.models.check.status.of.a.play.request.by.guid;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
