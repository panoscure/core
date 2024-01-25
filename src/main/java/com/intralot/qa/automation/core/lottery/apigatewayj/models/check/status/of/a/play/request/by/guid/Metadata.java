
package com.intralot.qa.automation.core.lottery.apigatewayj.models.check.status.of.a.play.request.by.guid;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.math.BigInteger;

public class Metadata {

    @SerializedName("posInfo")
    @Expose
    private PosInfo posInfo;
    @SerializedName("channel")
    @Expose
    private Integer channel;
    @SerializedName("wagerId")
    @Expose
    private BigInteger wagerId;
    @SerializedName("operator")
    @Expose
    private Integer operator;
    @SerializedName("preprinted")
    @Expose
    private Boolean preprinted;

    public PosInfo getPosInfo() {
        return posInfo;
    }

    public void setPosInfo(PosInfo posInfo) {
        this.posInfo = posInfo;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public BigInteger getWagerId() {
        return wagerId;
    }

    public void setWagerId(BigInteger wagerId) {
        this.wagerId = wagerId;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public Boolean getPreprinted() {
        return preprinted;
    }

    public void setPreprinted(Boolean preprinted) {
        this.preprinted = preprinted;
    }

}
