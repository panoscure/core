
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class PosInfo {

    @SerializedName("retailerId")
    @Expose
    private Integer retailerId;
    @SerializedName("terminalId")
    @Expose
    private Integer terminalId;
    @SerializedName("userName")
    @Expose
    private String userName;

    public Integer getRetailerId() {
        return retailerId;
    }

    public void setRetailerId(Integer retailerId) {
        this.retailerId = retailerId;
    }

    public PosInfo withRetailerId(Integer retailerId) {
        this.retailerId = retailerId;
        return this;
    }

    public Integer getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
    }

    public PosInfo withTerminalId(Integer terminalId) {
        this.terminalId = terminalId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PosInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("retailerId", retailerId).append("terminalId", terminalId).append("userName", userName).toString();
    }

}
