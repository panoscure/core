package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request;

import java.math.BigDecimal;

public interface WagerBet {

    void setTrnsTime(String time);

    void setTrnsTime();

    void setSystem(SystemTypes system);

    void setStake(BigDecimal stake);

    void setCurrency(String currency);

    String toJsonString();
}
