
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.terminal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.SystemTypes;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.WagerBet;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.testng.annotations.Ignore;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;


public class TerminalPlaceBetRequest implements Serializable, WagerBet {
    @SerializedName("isecure")
    @Expose
    private List<List<Integer>> isecure = null;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("wager")
    @Expose
    private Wager wager;

    private transient Queue<Integer> groupValues = new LinkedList<>(Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18));

    public TerminalPlaceBetRequest() {
        metadata = new Metadata();
        wager = new Wager();
    }

    @Override
    public void setTrnsTime(String time) {
        metadata.setTrnsTime(time);
    }

    @Override
    public void setTrnsTime() {
        metadata.setTrnsTime(String.valueOf(LocalDateTime.now().minusHours(2)));
    }

    public void setAcceptPriceChange(boolean flag) {
        wager.getSpbt().setAcceptPriceChange(flag);
    }

    public void setGameId(int gameId) {
        wager.getSpbt().setGameId(gameId);
    }

    public void addSelection(Selection selection) {
        Bets bet = wager.getSpbt().getBet();
        bet.setSelection(selection);
    }

    public List<Selection> getSelections() {
        return wager.getSpbt().getBet().getSelections();
    }

    public void setSystem(System system) {
        wager.getSpbt().getBet().setSystem(system);
    }


    public void setSystems(List<System> systems) {
        wager.getSpbt().getBet().setSystems(systems);
    }

    public void setIsecure() {
        isecure = new LinkedList<>();
        LinkedList<Integer> isecureNums = new LinkedList<>(
                Arrays.asList(
                        getRandom(1000000000, 2147483647),
                        getRandom(1000000000, 2147483647),
                        getRandom(1000000000, 2147483647),
                        getRandom(1000000000, 2147483647),
                        getRandom(1000000000, 2147483647),
                        getRandom(1000000000, 2147483647),
                        getRandom(1000000000, 2147483647),
                        getRandom(1000000000, 2147483647)
                )
        );
        isecure.add(isecureNums);
    }

    public List<List<Integer>> getIsecure() {
        return isecure;
    }

    public List<System> getSystems() {
        return wager.getSpbt().getBet().getSystems();
    }

    public List<Integer> getSystemsArray() {
        return wager.getSpbt().getBet().getSystems().stream().map(System::getRequest).collect(Collectors.toList());
    }

    @Override
    public void setSystem(SystemTypes system) {
        wager.getSpbt().getBet().setSystem(system);
    }

    @Override
    public void setStake(BigDecimal stake) {
        List<System> systems = wager.getSpbt().getBet().getSystems();
        systems.forEach(system -> system.getStake().setAmount(stake));
    }

    @Override
    public void setCurrency(String currency) {
        List<System> systems = wager.getSpbt().getBet().getSystems();
        systems.forEach(system -> system.getStake().setCurrency(currency));
    }

    @Override
    public String toJsonString() {
        Gson gson = new GsonBuilder()
                .excludeFieldsWithModifiers(Modifier.STATIC, Modifier.TRANSIENT, Modifier.VOLATILE)
                .create();
        return gson.toJson(this);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metadata", metadata).append("wager", wager).toString();
    }

    public static int getRandom(int min, int max) {
        if (max == 0) return 0;
        return new SecureRandom().nextInt(max - min) + min;
    }
}
