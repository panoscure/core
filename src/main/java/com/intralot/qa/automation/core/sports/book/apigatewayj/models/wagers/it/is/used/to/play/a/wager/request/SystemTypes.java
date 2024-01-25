package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum SystemTypes {

    SINGLE("SINGLE", new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 1),
    MULTIPLE("MULTIPLE",SINGLE.getCombinations(),SINGLE.getMinSelections()),
    MULTIPLE_2("MULTIPLE",new int[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},2),
    MULTIPLE_3("MULTIPLE",new int[]{0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},3),
    MULTIPLE_4("MULTIPLE",new int[]{0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},4),
    MULTIPLE_5("MULTIPLE",new int[]{0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},5),
    MULTIPLE_6("MULTIPLE",new int[]{0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},6),
    MULTIPLE_7("MULTIPLE",new int[]{0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},7),
    MULTIPLE_8("MULTIPLE",new int[]{0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},8),
    MULTIPLE_9("MULTIPLE",new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},9),
    MULTIPLE_10("MULTIPLE",new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},10),
    MULTIPLE_11("MULTIPLE",new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},11),
    MULTIPLE_12("MULTIPLE",new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},12),
    MULTIPLE_13("MULTIPLE",new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},13),
    MULTIPLE_14("MULTIPLE",new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},14),
    MULTIPLE_15("MULTIPLE",new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},15),
    MULTIPLE_16("MULTIPLE",new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},16),

    TRIXIE("TRIXIE",new int[]{0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},3),
    PATENT("PATENT",new int[]{1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},3),
    YANKEE("YANKEE",new int[]{0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},4),
    CANADIAN("CANADIAN",new int[]{0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},5),
    LUCKY_15("LUCKY_15",new int[]{1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},4),
    LUCKY_31("LUCKY_31",new int[]{1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},5),
    LUCKY_63("LUCKY_63",new int[]{1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},6),
    HEINZ("HEINZ",new int[]{0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},6),
    SUPER_HEINZ("SUPER_HEINZ",new int[]{0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},7),
    GOLIATH("GOLIATH",new int[]{0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},8),
    SUPER_GOLIATH("SUPER_GOLIATH",new int[]{0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},9),
    MULTIPLE_BEAT("MULTIPLE_BEAT",new int[]{0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},2),
    MULTIWAY_MULTIPLE("MULTIWAY_MULTIPLE",new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},1),

    SYSTEM_2("SYSTEM_2",  MULTIPLE_2.getCombinations(),3),
    SYSTEM_3("SYSTEM_3",  MULTIPLE_3.getCombinations(),4),
    SYSTEM_4("SYSTEM_4",  MULTIPLE_4.getCombinations(),5),
    SYSTEM_5("SYSTEM_5",  MULTIPLE_5.getCombinations(),6),
    SYSTEM_6("SYSTEM_6",  MULTIPLE_6.getCombinations(),7),
    SYSTEM_7("SYSTEM_7",  MULTIPLE_7.getCombinations(),8),
    SYSTEM_8("SYSTEM_8",  MULTIPLE_8.getCombinations(),9),
    SYSTEM_9("SYSTEM_9",  MULTIPLE_9.getCombinations(),10),
    SYSTEM_10("SYSTEM_10",MULTIPLE_10.getCombinations(),11),
    SYSTEM_11("SYSTEM_11",MULTIPLE_11.getCombinations(),12),
    SYSTEM_12("SYSTEM_12",MULTIPLE_12.getCombinations(),13),
    SYSTEM_13("SYSTEM_13",MULTIPLE_13.getCombinations(),14),
    SYSTEM_14("SYSTEM_14",MULTIPLE_14.getCombinations(),15),
    SYSTEM_15("SYSTEM_15",MULTIPLE_15.getCombinations(),16),

    BANKER_2("BANKER_2",  MULTIPLE_2.getCombinations(),3),
    BANKER_3("BANKER_3",  MULTIPLE_3.getCombinations(),4),
    BANKER_4("BANKER_4",  MULTIPLE_4.getCombinations(),5),
    BANKER_5("BANKER_5",  MULTIPLE_5.getCombinations(),6),
    BANKER_6("BANKER_6",  MULTIPLE_6.getCombinations(),7),
    BANKER_7("BANKER_7",  MULTIPLE_7.getCombinations(),8),
    BANKER_8("BANKER_8",  MULTIPLE_8.getCombinations(),9),
    BANKER_9("BANKER_9",  MULTIPLE_9.getCombinations(),10),
    BANKER_10("BANKER_10",MULTIPLE_10.getCombinations(),11),
    BANKER_11("BANKER_11",MULTIPLE_11.getCombinations(),12),
    BANKER_12("BANKER_12",MULTIPLE_12.getCombinations(),13),
    BANKER_13("BANKER_13",MULTIPLE_13.getCombinations(),14),
    BANKER_14("BANKER_14",MULTIPLE_14.getCombinations(),15),
    BANKER_15("BANKER_15",MULTIPLE_15.getCombinations(),16),

    MULTIWAY_1("MULTIWAY_1",  SINGLE.getCombinations(),1),
    MULTIWAY_2("MULTIWAY_2",  MULTIPLE_2.getCombinations(),2),
    MULTIWAY_3("MULTIWAY_3",  MULTIPLE_3.getCombinations(),3),
    MULTIWAY_4("MULTIWAY_4",  MULTIPLE_4.getCombinations(),4),
    MULTIWAY_5("MULTIWAY_5",  MULTIPLE_5.getCombinations(),5),
    MULTIWAY_6("MULTIWAY_6",  MULTIPLE_6.getCombinations(),6),
    MULTIWAY_7("MULTIWAY_7",  MULTIPLE_7.getCombinations(),7),
    MULTIWAY_8("MULTIWAY_8",  MULTIPLE_8.getCombinations(),8),
    MULTIWAY_9("MULTIWAY_9",  MULTIPLE_9.getCombinations(),9),
    MULTIWAY_10("MULTIWAY_10",MULTIPLE_10.getCombinations(),10),
    MULTIWAY_11("MULTIWAY_11",MULTIPLE_11.getCombinations(),11),
    MULTIWAY_12("MULTIWAY_12",MULTIPLE_12.getCombinations(),12),
    MULTIWAY_13("MULTIWAY_13",MULTIPLE_13.getCombinations(),13),
    MULTIWAY_14("MULTIWAY_14",MULTIPLE_14.getCombinations(),14),
    MULTIWAY_15("MULTIWAY_15",MULTIPLE_15.getCombinations(),15),

    MULTIWAY_BANKER_2("MULTIWAY_BANKER_2",  MULTIPLE_2.getCombinations(),3),
    MULTIWAY_BANKER_3("MULTIWAY_BANKER_3",  MULTIPLE_3.getCombinations(),4),
    MULTIWAY_BANKER_4("MULTIWAY_BANKER_4",  MULTIPLE_4.getCombinations(),5),
    MULTIWAY_BANKER_5("MULTIWAY_BANKER_5",  MULTIPLE_5.getCombinations(),6),
    MULTIWAY_BANKER_6("MULTIWAY_BANKER_6",  MULTIPLE_6.getCombinations(),7),
    MULTIWAY_BANKER_7("MULTIWAY_BANKER_7",  MULTIPLE_7.getCombinations(),8),
    MULTIWAY_BANKER_8("MULTIWAY_BANKER_8",  MULTIPLE_8.getCombinations(),9),
    MULTIWAY_BANKER_9("MULTIWAY_BANKER_9",  MULTIPLE_9.getCombinations(),10),
    MULTIWAY_BANKER_10("MULTIWAY_BANKER_10",MULTIPLE_10.getCombinations(),11),
    MULTIWAY_BANKER_11("MULTIWAY_BANKER_11",MULTIPLE_11.getCombinations(),12),
    MULTIWAY_BANKER_12("MULTIWAY_BANKER_12",MULTIPLE_12.getCombinations(),13),
    MULTIWAY_BANKER_13("MULTIWAY_BANKER_13",MULTIPLE_13.getCombinations(),14),
    MULTIWAY_BANKER_14("MULTIWAY_BANKER_14",MULTIPLE_14.getCombinations(),15),
    MULTIWAY_BANKER_15("MULTIWAY_BANKER_15",MULTIPLE_15.getCombinations(),16),
    ;

    private final String type;
    private final List<Integer> combinations;
    private final int minSelections;

    SystemTypes(String type, int[] combinations, int minSelections) {
        this.type = type;
        this.combinations = Arrays.stream(combinations).boxed().collect(Collectors.toList());
        this.minSelections = minSelections;
    }
    SystemTypes(String type, List<Integer> combinations, int minSelections) {
        this.type = type;
        this.combinations =combinations;
        this.minSelections = minSelections;
    }

    public String getType() {
        return type;
    }

    public List<Integer> getCombinations() {
        return combinations;
    }

    public boolean isSingle() {
        return this.getType().equals("SINGLE");
    }

    public boolean isBankerType() {
        return type.contains("BANKER");
    }

    public boolean isMultiwayType() {
        return type.startsWith("MULTIWAY") && !type.contains("BANKER");
    }

    public boolean isMultiwayBankerType() {
        return type.startsWith("MULTIWAY") && type.contains("BANKER");
    }

    public boolean isMultiple(){
        return type.startsWith("MULTIPLE");
    }

    public int getMinSelections() {
        return minSelections;
    }
}
