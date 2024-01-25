
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class ExtendedBetting {

    @SerializedName("betTypes")
    @Expose
    private List<Integer> betTypes = null;
    @SerializedName("systems")
    @Expose
    private List<java.lang.System> systems = null;
    @SerializedName("additionalRequested")
    @Expose
    private List<Integer> additionalRequested = null;
    @SerializedName("addon")
    @Expose
    private Addon addon;

    public List<Integer> getBetTypes() {
        return betTypes;
    }

    public void setBetTypes(List<Integer> betTypes) {
        this.betTypes = betTypes;
    }

    public ExtendedBetting withBetTypes(List<Integer> betTypes) {
        this.betTypes = betTypes;
        return this;
    }

    public List<java.lang.System> getSystems() {
        return systems;
    }

    public void setSystems(List<java.lang.System> systems) {
        this.systems = systems;
    }

    public ExtendedBetting withSystems(List<java.lang.System> systems) {
        this.systems = systems;
        return this;
    }

    public List<Integer> getAdditionalRequested() {
        return additionalRequested;
    }

    public void setAdditionalRequested(List<Integer> additionalRequested) {
        this.additionalRequested = additionalRequested;
    }

    public ExtendedBetting withAdditionalRequested(List<Integer> additionalRequested) {
        this.additionalRequested = additionalRequested;
        return this;
    }

    public Addon getAddon() {
        return addon;
    }

    public void setAddon(Addon addon) {
        this.addon = addon;
    }

    public ExtendedBetting withAddon(Addon addon) {
        this.addon = addon;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("betTypes", betTypes).append("systems", systems).append("additionalRequested", additionalRequested).append("addon", addon).toString();
    }

}
