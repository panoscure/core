
package com.intralot.qa.automation.core.lottery.apigatewayj.models.wagers.get.wager.details.forrepeating.a.bet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class System__ {

    @SerializedName("systems")
    @Expose
    private List<Integer> systems = null;
    @SerializedName("type")
    @Expose
    private String type;

    public List<Integer> getSystems() {
        return systems;
    }

    public void setSystems(List<Integer> systems) {
        this.systems = systems;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
