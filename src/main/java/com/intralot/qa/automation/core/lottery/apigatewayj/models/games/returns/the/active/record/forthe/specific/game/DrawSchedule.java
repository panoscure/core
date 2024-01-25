package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.returns.the.active.record.forthe.specific.game;

import java.math.BigInteger;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DrawSchedule {

    @SerializedName("expressions")
    @Expose
    private List<Expression> expressions = null;
    @SerializedName("lastDate")
    @Expose
    private Integer lastDate;
    @SerializedName("startingDate")
    @Expose
    private BigInteger startingDate;

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public Integer getLastDate() {
        return lastDate;
    }

    public void setLastDate(Integer lastDate) {
        this.lastDate = lastDate;
    }

    public BigInteger getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(BigInteger startingDate) {
        this.startingDate = startingDate;
    }
}
