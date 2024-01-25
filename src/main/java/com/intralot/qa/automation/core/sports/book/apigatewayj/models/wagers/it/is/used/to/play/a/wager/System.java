
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class System {

    @SerializedName("systems")
    @Expose
    private List<Integer> systems = null;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public System() {
    }

    /**
     * 
     * @param systems
     * @param type
     */
    public System(List<Integer> systems, String type) {
        super();
        this.systems = systems;
        this.type = type;
    }

    public List<Integer> getSystems() {
        return systems;
    }

    public void setSystems(List<Integer> systems) {
        this.systems = systems;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
