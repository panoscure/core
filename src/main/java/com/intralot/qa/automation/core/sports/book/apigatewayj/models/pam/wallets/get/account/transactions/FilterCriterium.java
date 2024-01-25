package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.get.account.transactions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FilterCriterium {
    @SerializedName("filterCriteriaName")
    @Expose
    private String filterCriteriaName;
    @SerializedName("filterCriteriaValues")
    @Expose
    private List<FilterCriteriaValue> filterCriteriaValues = null;

    public String getFilterCriteriaName() {
        return filterCriteriaName;
    }

    public void setFilterCriteriaName(String filterCriteriaName) {
        this.filterCriteriaName = filterCriteriaName;
    }

    public List<FilterCriteriaValue> getFilterCriteriaValues() {
        return filterCriteriaValues;
    }

    public void setFilterCriteriaValues(List<FilterCriteriaValue> filterCriteriaValues) {
        this.filterCriteriaValues = filterCriteriaValues;
    }
}
