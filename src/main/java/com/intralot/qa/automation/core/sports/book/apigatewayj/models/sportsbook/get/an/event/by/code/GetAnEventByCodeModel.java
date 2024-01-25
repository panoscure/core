
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.get.an.event.by.code;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetAnEventByCodeModel {

    @SerializedName("trnsType")
    @Expose
    private String trnsType;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("body")
    @Expose
    private Body body;

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

}
