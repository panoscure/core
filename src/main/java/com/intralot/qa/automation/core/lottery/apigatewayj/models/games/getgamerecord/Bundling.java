
package com.intralot.qa.automation.core.lottery.apigatewayj.models.games.getgamerecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bundling {

    @SerializedName("enforceValidationDeadlines")
    @Expose
    private Boolean enforceValidationDeadlines;

    public Boolean getEnforceValidationDeadlines() {
        return enforceValidationDeadlines;
    }

    public void setEnforceValidationDeadlines(Boolean enforceValidationDeadlines) {
        this.enforceValidationDeadlines = enforceValidationDeadlines;
    }

}
