package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop;

import com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.SystemTypes;

import java.util.List;

public class SystemData {
    private SystemTypes systemType = SystemTypes.SINGLE;
    private int numOfSelections;
    private int bankers = 0;

    public SystemData() {
        this.numOfSelections = systemType.getMinSelections();
    }

    public SystemTypes getSystemType() {
        return systemType;
    }

    public void setSystemType(SystemTypes systemType) {
        this.systemType = systemType;
        numOfSelections = systemType.getMinSelections();
    }

    public List<Integer> getCombinations() {
        return getSystemType().getCombinations();
    }

    public int getNumOfSelections() {
        return numOfSelections;
    }

    public void setNumOfSelections(int numOfSelections) {
        this.numOfSelections = numOfSelections;
    }

    public boolean isSingle() {
        return getSystemType().isSingle();
    }

    public boolean isBankerType() {
        return getSystemType().isBankerType();
    }

    public int getBankers() {
        return bankers;
    }
}
