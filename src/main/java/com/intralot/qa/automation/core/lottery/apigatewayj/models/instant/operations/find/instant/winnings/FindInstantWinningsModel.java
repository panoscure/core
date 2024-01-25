
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.operations.find.instant.winnings;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FindInstantWinningsModel {

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
