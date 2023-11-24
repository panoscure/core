package com.intralot.qa.automation.core.jira.models.key;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fields {

    @SerializedName("customfield_13100")
    @Expose
    private Object customfield13100;
    @SerializedName("resolution")
    @Expose
    private Object resolution;
    @SerializedName("customfield_11709")
    @Expose
    private Object customfield11709;
    @SerializedName("issuetype")
    @Expose
    private Issuetype issuetype;

    public Object getCustomfield13100() {
        return customfield13100;
    }

    public void setCustomfield13100(Object customfield13100) {
        this.customfield13100 = customfield13100;
    }

    public Object getResolution() {
        return resolution;
    }

    public void setResolution(Object resolution) {
        this.resolution = resolution;
    }

    public Object getCustomfield11709() {
        return customfield11709;
    }

    public void setCustomfield11709(Object customfield11709) {
        this.customfield11709 = customfield11709;
    }

    public Issuetype getIssuetype() {
        return issuetype;
    }

    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

}
