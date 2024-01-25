
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.SystemTypes;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.WagerBet;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class DesktopPlaceBetRequest implements Serializable, WagerBet {
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("wager")
    @Expose
    private Wager wager;

    public DesktopPlaceBetRequest() {
        this.metadata = new Metadata();
        this.wager = new Wager();
    }

    public DesktopPlaceBetRequest setSessionToken(String sessionToken) {
        metadata.getPlayerInfo().setSessionToken(sessionToken);
        return this;
    }

    public DesktopPlaceBetRequest setPlayerId(String playerId) {
        metadata.getPlayerInfo().setPlayerId(playerId);
        return this;
    }

    public void addSelection(Selection selection) {
        List<Bet> bets = wager.getSportsbook().getBets();
        List<Selection> selections=bets.get(bets.size()-1).getSelections();
        selections.add(selection.setPartNo(selections.size()+1));
    }

    @Override
    public void setSystem(SystemTypes systemType) {
        wager.getSportsbook().getBets().forEach(bet->bet.getSystem().setSystemTypes(systemType));
    }

    public void addBet(Bet bet){
        wager.getSportsbook().getBets().add(bet);
    }

    public void clearBets(){
        wager.getSportsbook().getBets().clear();
    }

    @Override
    public void setTrnsTime(String time){
        metadata.setTrnsTime(time);
    }

    @Override
    public void setTrnsTime(){
        metadata.setTrnsTime(String.valueOf(LocalDateTime.now()));
    }

    @Override
    public void setStake(BigDecimal stake) {
        wager.getSportsbook().getBets().forEach(bet -> bet.getStake().setAmount(stake));
    }

    @Override
    public void setCurrency(String currency) {wager.getSportsbook().getBets().forEach(bet -> bet.getStake().setCurrency(currency));}

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metadata", metadata).append("wager", wager).toString();
    }

    @Override
    public String toJsonString() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.TRANSIENT, Modifier.VOLATILE)
                .create();
        return gson.toJson(this);
    }

    public Wager getWager() {
        return wager;
    }

    public List<Bet> getBets(){
        return getWager().getSportsbook().getBets();
    }

}
