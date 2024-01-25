
package com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.terminal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.intralot.qa.automation.core.sports.book.apigatewayj.models.wagers.it.is.used.to.play.a.wager.request.SystemTypes;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;


public class Bets implements Serializable {

    @SerializedName("selections")
    @Expose
    private List<Selection> selections = new LinkedList<>();
    @SerializedName("systems")
    @Expose
    private List<System> systems = new LinkedList<>();

    public Bets() {
    }

    public Bets(List<Selection> selections, List<System> systems) {
        super();
        this.selections = selections;
        this.systems = systems;
    }

    public List<Selection> getSelections() {
        return selections;
    }

    public void setSelections(List<Selection> selections) {
        this.selections = selections;
    }

    public void setSelection(Selection selection) {
        selections.add(selection);
    }

    public List<System> getSystems() {
        return systems;
    }

    public void setSystems(List<System> systems) {
        this.systems = systems;
    }

    public void setSystem(System system) {
        systems.add(system);
    }

    public void setSystem(SystemTypes systemTypes) {
        List<Integer> combinations = systemTypes.getCombinations();
        for (int i = 0; i < combinations.size(); i++) {
            if (combinations.get(i) == 1) {
                System sys = new System();
                sys.setRequest(i + 1);
                systems.add(sys);
            }
        }
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("selections", selections).append("systems", systems).toString();
    }

}
