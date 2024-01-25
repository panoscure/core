package com.intralot.qa.automation.core.sports.book.mpng.models.play;

import java.util.LinkedHashMap;
import java.util.Map;

public class Results {

    Map<String, SelectionInfo> results = new LinkedHashMap<>();


    public Map<String, SelectionInfo> getResults() {
        return results;
    }

    public void setResults(Map<String, SelectionInfo> results) {
        this.results = results;
    }

}
