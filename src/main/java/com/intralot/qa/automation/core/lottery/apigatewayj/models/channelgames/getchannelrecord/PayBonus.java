
package com.intralot.qa.automation.core.lottery.apigatewayj.models.channelgames.getchannelrecord;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PayBonus {

    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("limits")
    @Expose
    private List<Object> limits = null;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Object> getLimits() {
        return limits;
    }

    public void setLimits(List<Object> limits) {
        this.limits = limits;
    }

}
