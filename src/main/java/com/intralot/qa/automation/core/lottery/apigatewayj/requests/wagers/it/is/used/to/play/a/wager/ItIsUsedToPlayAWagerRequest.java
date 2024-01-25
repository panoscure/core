
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.wagers.it.is.used.to.play.a.wager;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItIsUsedToPlayAWagerRequest {

    @SerializedName("metadata")
    @Expose
    public Metadata metadata;
    @SerializedName("isecure")
    @Expose
    public List<List<Long>> isecure = null;
    @SerializedName("wager")
    @Expose
    public Wager wager;

    public ItIsUsedToPlayAWagerRequest withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ItIsUsedToPlayAWagerRequest withIsecure(List<List<Long>> isecure) {
        this.isecure = isecure;
        return this;
    }

    public ItIsUsedToPlayAWagerRequest withWager(Wager wager) {
        this.wager = wager;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metadata", metadata).append("isecure", isecure).append("wager", wager).toString();
    }

    public static ItIsUsedToPlayAWagerRequest createWagerWithSelection(List<Integer> firstSelection, int gameId) {
        List<List<Long>> isecure = new ArrayList<>();
        List<Long> isecureNumbers = new ArrayList<>(Arrays.asList(3675271321L,
                361547094L,
                1462972907L,
                1471217584L,
                2413338442L,
                1809001689L,
                2599622070L,
                3564289906L));
        isecure.add(isecureNumbers);

        List<Integer> multipliers = new ArrayList<>(Arrays.asList(1));

        List<Panel> panels = new ArrayList<>();
        Panel firstPanel = new Panel().withRequested(6).withSelection(firstSelection).withQuickPick(true).withQPSelections(6);
        List<Integer> secondSelection = new ArrayList<>(Arrays.asList(5));
        Panel secondPanel = new Panel().withRequested(1).withSelection(secondSelection).withQuickPick(true).withQPSelections(1);
        panels.add(firstPanel);
        panels.add(secondPanel);

        List<Board> boards = new ArrayList<>();
        Board board = new Board().withBoardId(1).withMultipliers(multipliers).withPanels(panels);
        boards.add(board);

        ParticipatingDraws participatingDraws = new ParticipatingDraws().withMultipleDraws(1);

        List<Dbg> dbgs = new ArrayList<>();
        Dbg dbg = new Dbg()
                .withBoards(boards)
                .withGameId(gameId)
                .withTeamShares(0)
                .withMultipliers(new ArrayList<>())
                .withParticipatingDraws(participatingDraws)
                .withOptions(new ArrayList<>(Arrays.asList("LH_QP_5019645")));
        dbgs.add(dbg);

        Wager wager = new Wager().withDbg(dbgs).withProductId(23);

        Metadata metadata = new Metadata().withTrnsTime("2019-11-05T07:46:43.668Z");
        return new ItIsUsedToPlayAWagerRequest().withIsecure(isecure).withMetadata(metadata).withWager(wager);
    }

    public static ItIsUsedToPlayAWagerRequest createWagerWithSelection(List<List<Integer>> selections, int gameId, String day) {
        List<List<Long>> isecure = new ArrayList<>();
        List<Long> isecureNumbers = new ArrayList<>(Arrays.asList(3675271321L,
                361547094L,
                1462972907L,
                1471217584L,
                2413338442L,
                1809001689L,
                2599622070L,
                3564289906L));
        isecure.add(isecureNumbers);

        List<Integer> multipliers = new ArrayList<>(Arrays.asList(1));

        List<Panel> panels = new ArrayList<>();
        for (List<Integer> selection:selections) {
            Panel panel = new Panel().withRequested(selection.size()).withSelection(selection).withQuickPick(true).withQPSelections(selection.size());
            panels.add(panel);
        }

        List<Board> boards = new ArrayList<>();
        Board board = new Board().withBoardId(1).withMultipliers(multipliers).withPanels(panels);
        boards.add(board);

        List<DayPattern> dayPatternList = new ArrayList<>();
        DayPattern dayPattern = new DayPattern().withDay(day).withIndex(1);
        dayPatternList.add(dayPattern);

        ParticipatingDraws participatingDraws = new ParticipatingDraws().withMultipleDraws(1).withDayPattern(dayPatternList);

        List<Dbg> dbgs = new ArrayList<>();
        Dbg dbg = new Dbg()
                .withBoards(boards)
                .withGameId(gameId)
                .withTeamShares(0)
                .withMultipliers(new ArrayList<>())
                .withParticipatingDraws(participatingDraws)
                .withOptions(new ArrayList<>(Arrays.asList("LH_QP_5019645")));
        dbgs.add(dbg);

        Wager wager = new Wager().withDbg(dbgs).withProductId(23);

        Metadata metadata = new Metadata().withTrnsTime("2019-11-05T07:46:43.668Z");
        return new ItIsUsedToPlayAWagerRequest().withIsecure(isecure).withMetadata(metadata).withWager(wager);
    }


}
