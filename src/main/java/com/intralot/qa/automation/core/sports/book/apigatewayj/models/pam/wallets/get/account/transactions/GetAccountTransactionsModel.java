package com.intralot.qa.automation.core.sports.book.apigatewayj.models.pam.wallets.get.account.transactions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class GetAccountTransactionsModel {
    @SerializedName("startDate")
    @Expose
    private String startDate;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("pagination")
    @Expose
    private Pagination pagination;
    @SerializedName("filterCriteria")
    @Expose
    private List<FilterCriterium> filterCriteria = null;
    @SerializedName("orderCriteria")
    @Expose
    private List<OrderCriterium> orderCriteria = null;
    @SerializedName("accountTransactions")
    @Expose
    private List<AccountTransaction> accountTransactions = null;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<FilterCriterium> getFilterCriteria() {
        return filterCriteria;
    }

    public void setFilterCriteria(List<FilterCriterium> filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    public List<OrderCriterium> getOrderCriteria() {
        return orderCriteria;
    }

    public void setOrderCriteria(List<OrderCriterium> orderCriteria) {
        this.orderCriteria = orderCriteria;
    }

    public List<AccountTransaction> getAccountTransactions() {
        return accountTransactions;
    }

    public void setAccountTransactions(List<AccountTransaction> accountTransactions) {
        this.accountTransactions = accountTransactions;
    }
}
