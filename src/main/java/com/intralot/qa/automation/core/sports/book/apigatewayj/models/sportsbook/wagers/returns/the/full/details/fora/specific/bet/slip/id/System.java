
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.sportsbook.wagers.returns.the.full.details.fora.specific.bet.slip.id;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class System {

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
     * @param type
     */
    public System(String type) {
        super();
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}