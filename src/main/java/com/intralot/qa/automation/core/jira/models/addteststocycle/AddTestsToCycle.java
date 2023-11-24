package com.intralot.qa.automation.core.jira.models.addteststocycle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddTestsToCycle {

    @SerializedName("jobProgressToken")
    @Expose
    private String jobProgressToken;

    public String getJobProgressToken() {
        return jobProgressToken;
    }

    public void setJobProgressToken(String jobProgressToken) {
        this.jobProgressToken = jobProgressToken;
    }

}