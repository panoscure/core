
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.operations.pay.instants;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PayInstantsModel {

    @SerializedName("totalAmount")
    @Expose
    private Double totalAmount;
    @SerializedName("tickets")
    @Expose
    private List<Ticket> tickets = null;

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

}
