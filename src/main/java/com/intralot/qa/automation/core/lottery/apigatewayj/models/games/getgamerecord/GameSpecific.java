
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GameSpecific {

    @SerializedName("autoPayments")
    @Expose
    private List<Object> autoPayments = null;
    @SerializedName("payTaxation")
    @Expose
    private List<PayTaxation> payTaxation = null;
    @SerializedName("winnersParams")
    @Expose
    private WinnersParams winnersParams;
    @SerializedName("playTaxation")
    @Expose
    private PlayTaxation playTaxation;
    @SerializedName("bundling")
    @Expose
    private Bundling bundling;
    @SerializedName("winningColumn")
    @Expose
    private WinningColumn winningColumn;
    @SerializedName("lotto")
    @Expose
    private Lotto lotto;
    @SerializedName("keno")
    @Expose
    private Keno keno;
    @SerializedName("oig")
    @Expose
    private Object oig;
    @SerializedName("pickx")
    @Expose
    private Object pickx;
    @SerializedName("matchx")
    @Expose
    private Matchx matchx;

    public List<Object> getAutoPayments() {
        return autoPayments;
    }

    public void setAutoPayments(List<Object> autoPayments) {
        this.autoPayments = autoPayments;
    }

    public List<PayTaxation> getPayTaxation() {
        return payTaxation;
    }

    public void setPayTaxation(List<PayTaxation> payTaxation) {
        this.payTaxation = payTaxation;
    }

    public WinnersParams getWinnersParams() {
        return winnersParams;
    }

    public void setWinnersParams(WinnersParams winnersParams) {
        this.winnersParams = winnersParams;
    }

    public PlayTaxation getPlayTaxation() {
        return playTaxation;
    }

    public void setPlayTaxation(PlayTaxation playTaxation) {
        this.playTaxation = playTaxation;
    }

    public WinningColumn getWinningColumn() {
        return winningColumn;
    }

    public void setWinningColumn(WinningColumn winningColumn) {
        this.winningColumn = winningColumn;
    }

    public Lotto getLotto() {
        return lotto;
    }

    public void setLotto(Lotto lotto) {
        this.lotto = lotto;
    }

    public Keno getKeno() {
        return keno;
    }

    public void setKeno(Keno keno) {
        this.keno = keno;
    }

    public Object getOig() {
        return oig;
    }

    public void setOig(Object oig) {
        this.oig = oig;
    }

    public Object getPickx() {
        return pickx;
    }

    public void setPickx(Object pickx) {
        this.pickx = pickx;
    }

    public Matchx getMatchx() {
        return matchx;
    }

    public void setMatchx(Matchx matchx) {
        this.matchx = matchx;
    }
}
