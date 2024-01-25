
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.nlo.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NLOItIsUsedToPlayAWagerModel {

    @SerializedName("trnsType")
    @Expose
    private String trnsType;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("body")
    @Expose
    private Body body;
    @SerializedName("trnsId")
    @Expose
    private Integer trnsId;

    public String getTrnsType() {
        return trnsType;
    }

    public void setTrnsType(String trnsType) {
        this.trnsType = trnsType;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Integer getTrnsId() {
        return trnsId;
    }

    public void setTrnsId(Integer trnsId) {
        this.trnsId = trnsId;
    }

}
