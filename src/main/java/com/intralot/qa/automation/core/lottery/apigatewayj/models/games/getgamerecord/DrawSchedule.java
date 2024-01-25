
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DrawSchedule {

    @SerializedName("expressions")
    @Expose
    private List<Expression> expressions = null;
    @SerializedName("lastDate")
    @Expose
    private Long lastDate;
    @SerializedName("startingDate")
    @Expose
    private Long startingDate;

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public Long getLastDate() {
        return lastDate;
    }

    public void setLastDate(Long lastDate) {
        this.lastDate = lastDate;
    }

    public Long getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Long startingDate) {
        this.startingDate = startingDate;
    }

}
