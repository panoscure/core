package com.intralot.qa.automation.core.lottery.apigatewayj.models.pam.back.office;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetCities {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("parentId")
    @Expose
    private Integer parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

}