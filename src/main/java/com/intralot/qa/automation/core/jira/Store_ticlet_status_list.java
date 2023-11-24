package com.intralot.qa.automation.core.jira;

import com.intralot.qa.automation.core.utilities.CustomProperties;
import org.testng.ITestResult;

import java.util.HashMap;
import java.util.Map;

import static com.intralot.qa.automation.core.jira.JiraServices.makeApiCallsAndUpdateZephyrExecutionsCycles;


public class Store_ticlet_status_list {
    private static Map<String, String> keyValueMap = new HashMap<>();

    // Method to store a key-value pair in the HashMap
    public static void storeKeyValue(String key, Boolean value) {
        String final_value = "";
        key = key.replace('_','-');
        if(value)
            final_value = "successful";
        else
            final_value = "failed";
        keyValueMap.put(key, final_value);
        System.out.println("Key: " + key + "Value: " + final_value);
    }

    // Method to retrieve the HashMap
    public static  Map<String, String> getKeyValueMap() {
        return keyValueMap;
    }


    public static void testStatus(ITestResult result){
        boolean testStatus; // Variable to store the test status
        // Check the status of the test and store it in the variable
        if (result.getStatus() == ITestResult.SUCCESS) {
            testStatus = true; // Test passed
        } else {
            testStatus = false; // Test failed
        }
        System.out.println("TEST STATUS= " + testStatus + "Test ID: " + result.getName());
        storeKeyValue(result.getName(), testStatus);
    }

    public static void update_tc_status_full_flow(ITestResult result, String cycleId, String cycleFolderName) {
        Store_ticlet_status_list.testStatus(result);
        HashMap<String, String> storedMap = (HashMap<String, String>) Store_ticlet_status_list.getKeyValueMap();
        System.out.println("Key-Value Store:");
        for (Map.Entry<String, String> entry : storedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println(storedMap);
        makeApiCallsAndUpdateZephyrExecutionsCycles(cycleId, cycleFolderName, storedMap);
    }

}