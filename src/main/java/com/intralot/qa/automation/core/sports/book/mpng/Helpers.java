package com.intralot.qa.automation.core.sports.book.mpng;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.internal.LinkedTreeMap;
import com.intralot.qa.automation.core.sports.book.mpng.models.play.PlaceBetModel;
import com.intralot.qa.automation.core.sports.book.mpng.models.play.SelectionInfo;

import java.util.Map;

public class Helpers {

    public static SelectionInfo deserializeResultsFromMPNGPlay(PlaceBetModel playResp, String selection) {
        Map<String, Object> resultsAI = (Map<String, Object>) playResp.getResults();
        LinkedTreeMap<String, Object> res = (LinkedTreeMap<String, Object>) resultsAI.get(selection);
        Gson gson = new Gson();
        JsonObject jsonObject = gson.toJsonTree(res).getAsJsonObject();
        SelectionInfo selectionInfo = gson.fromJson(jsonObject, SelectionInfo.class);
        return selectionInfo;
    }

}
