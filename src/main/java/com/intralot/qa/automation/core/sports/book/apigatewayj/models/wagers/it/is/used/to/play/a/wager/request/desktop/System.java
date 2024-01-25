package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.desktop;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.SystemTypes;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.List;


public class System implements Serializable {


    private transient SystemTypes systemTypes = SystemTypes.SINGLE;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("systems")
    @Expose
    private List<Integer> systems = null;


    public System() {
        updateSystem();
    }

    public System(SystemTypes systemTypes) {
        setSystemTypes(systemTypes);
        updateSystem();
    }

    public System(String type, List<Integer> systems) {
        super();
        this.type = type;
        this.systems = systems;
    }

    public void setSystemTypes(SystemTypes systemTypes) {
        this.systemTypes = systemTypes;
        updateSystem();
    }

    public void updateSystem() {
        setType(systemTypes.getType());
        setSystems(systemTypes.getCombinations());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Integer> getSystems() {
        return systems;
    }

    public void setSystems(List<Integer> systems) {
        this.systems = systems;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("systems", systems).toString();
    }

}
