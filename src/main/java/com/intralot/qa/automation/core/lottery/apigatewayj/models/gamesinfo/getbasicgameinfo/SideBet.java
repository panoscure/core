
package com.intralot.qa.automation.core.lottery.apigatewayj.models.gamesinfo.getbasicgameinfo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SideBet {

    @SerializedName("typeId")
    @Expose
    private Long typeId;
    @SerializedName("descr")
    @Expose
    private String descr;

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

}
