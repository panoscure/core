
package com.intralot.qa.automation.core.lottery.apigatewayj.models.instant.operations.sell.instant.by.range;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SellInstantByRangeModel {

    @SerializedName("ticketFrom")
    @Expose
    private TicketFrom ticketFrom;
    @SerializedName("ticketTo")
    @Expose
    private TicketTo ticketTo;
    @SerializedName("numberOfTickets")
    @Expose
    private Integer numberOfTickets;
    @SerializedName("totalAmounts")
    @Expose
    private Amounts totalAmounts;

    public TicketFrom getTicketFrom() {
        return ticketFrom;
    }

    public void setTicketFrom(TicketFrom ticketFrom) {
        this.ticketFrom = ticketFrom;
    }

    public TicketTo getTicketTo() {
        return ticketTo;
    }

    public void setTicketTo(TicketTo ticketTo) {
        this.ticketTo = ticketTo;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Amounts getTotalAmounts() {
        return totalAmounts;
    }

    public void setTotalAmounts(Amounts totalAmount) {
        this.totalAmounts = totalAmounts;
    }

}
