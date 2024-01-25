
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Systems {

    @SerializedName("combinations")
    @Expose
    private Combinations combinations;
    @SerializedName("reduced")
    @Expose
    private Reduced reduced;

    public Combinations getCombinations() {
        return combinations;
    }

    public void setCombinations(Combinations combinations) {
        this.combinations = combinations;
    }

    public Reduced getReduced() {
        return reduced;
    }

    public void setReduced(Reduced reduced) {
        this.reduced = reduced;
    }

}
