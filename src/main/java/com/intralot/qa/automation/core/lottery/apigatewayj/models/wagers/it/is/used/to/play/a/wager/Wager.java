
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
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
