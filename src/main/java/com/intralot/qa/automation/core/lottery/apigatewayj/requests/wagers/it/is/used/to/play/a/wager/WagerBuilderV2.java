
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WagerBuilderV2 {

    @SerializedName("isecure")
    @Expose
    private List<List<Long>> isecure = null;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("wager")
    @Expose
    private Wager wager;
    @SerializedName("ticket")
    @Expose
    private Ticket ticket;

    public List<List<Long>> getIsecure() {
        return isecure;
    }

    public void setIsecure(List<List<Long>> isecure) {
        this.isecure = isecure;
    }

    public WagerBuilderV2 withIsecure(List<List<Long>> isecure) {
        this.isecure = isecure;
        return this;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public WagerBuilderV2 withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Wager getWager() {
        return wager;
    }

    public void setWager(Wager wager) {
        this.wager = wager;
    }

    public WagerBuilderV2 withWager(Wager wager) {
        this.wager = wager;
        return this;
    }

    public static WagerBuilderV2 withIsecureAndMetadata() {
        List<List<Long>> isecure = new ArrayList<>();
        List<Long> isecureNumbers = new ArrayList<>(Arrays.asList(1058381769L,
                1800930032L,
                3241945195L,
                3321248634L,
                2028232855L,
                826288748L,
                3098176407L,
                269876092L));
        isecure.add(isecureNumbers);

        Metadata metadata = new Metadata().withTrnsTime("2019-11-05T07:46:43.668Z");
        return new WagerBuilderV2().withIsecure(isecure).withMetadata(metadata);
    }

    public static WagerBuilderV2 withMetadataNoIsecure(Metadata metadata) {
        LocalDateTime currentLocalDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        String formattedDateTime = currentLocalDateTime.format(formatter);
        metadata.setTrnsTime(formattedDateTime);
        return new WagerBuilderV2().withMetadata(metadata);
    }

    public static WagerBuilderV2 withIsecureNoMetadata() {
        List<List<Long>> isecure = new ArrayList<>();
        List<Long> isecureNumbers = new ArrayList<>(Arrays.asList(1058381769L,
                1800930032L,
                3241945195L,
                3321248634L,
                2028232855L,
                826288748L,
                3098176407L,
                269876092L));
        isecure.add(isecureNumbers);

        return new WagerBuilderV2().withIsecure(isecure);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("isecure", isecure).append("metadata", metadata).append("wager", wager).toString();
    }

}
