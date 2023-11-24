package com.intralot.qa.automation.core.jira;

import com.intralot.qa.automation.core.jira.models.addteststocycle.AddTestsToCycle;
import com.intralot.qa.automation.core.jira.models.auth.AuthModel;
import com.intralot.qa.automation.core.jira.models.jobprogress.JobProgressModel;
import com.intralot.qa.automation.core.jira.models.zephyr.cycle.CycleModel;
import com.intralot.qa.automation.core.jira.models.zephyr.executions.Execution;
import com.intralot.qa.automation.core.jira.models.zephyr.executions.ExecutionsModel;
import com.intralot.qa.automation.core.jira.models.zephyr.folder.FolderModel;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.Validatable;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;
import static org.awaitility.Awaitility.await;
import static org.hamcrest.CoreMatchers.describedAs;
import static org.hamcrest.CoreMatchers.is;

public class JiraServices {

    public static void makeApiCallsAndUpdateZephyrExecutionsCycles(String cycleId, String folderName, HashMap<String, String> tcsToUpdate) {

        String basicUser = "UUFhdXRvbWF0aW9uOjEyMzQ1NnEh";

        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "Basic " + basicUser);

        AuthModel authModel = given().
                when().
                header("Content-Type", "application/json").
                body("{ \"username\": \"QAautomation\", \"password\": \"123456q!\" }").
                post("https://jira.intralot.com/rest/auth/1/session").then().extract().as(AuthModel.class);
        String sessionId = authModel.getSession().getValue();

        System.out.println(sessionId);

        CycleModel cycleModel = given().
                when().
                header("Content-Type", "application/json").
                header("cookie", "JESSIONID=" + sessionId).
                header("Authorization", "Basic " + basicUser).
                get("https://jira.intralot.com/rest/zapi/latest/cycle/{cycleId}", cycleId).then().extract().as(CycleModel.class);

        Integer projectId = cycleModel.getProjectId();
        Integer versionId = cycleModel.getVersionId();

        FolderModel[] folderModel = given().
                when().
                header("Content-Type", "application/json").
                header("cookie", "JESSIONID=" + sessionId).
                header("Authorization", "Basic " + basicUser).
                filters(new RequestLoggingFilter(), new ResponseLoggingFilter()).
                queryParam("projectId", projectId).
                queryParam("versionId", versionId).
                get("https://jira.intralot.com/rest/zapi/latest/cycle/{cycleId}/folders", cycleId).then().extract().as(FolderModel[].class);

        Integer folderId = 0;

        for (int i = 0; i < folderModel.length; i++) {
            FolderModel currentFolder = folderModel[i];
            String currentFolderName = currentFolder.getFolderName();
            if (folderName.equals(currentFolderName)) {
                folderId = currentFolder.getFolderId();
            }
        }

        //Add test to cycle

        String tcsToAdd = "[";
        for (Map.Entry<String, String> entry : tcsToUpdate.entrySet()) {
            String tcKey = entry.getKey();
            Object value = entry.getValue();
            tcsToAdd = tcsToAdd + "\"" + tcKey + "\",";
        }
        tcsToAdd = tcsToAdd.substring(0, tcsToAdd.length() - 1);
        tcsToAdd = tcsToAdd + "]";

        String jsonAddToCycle = "{\n" +
                "\t\"issues\": " + tcsToAdd + ",\n" +
                "\t\"versionId\": " + versionId + ",\n" +
                "\t\"cycleId\": " + cycleId + ",\n" +
                "\t\"projectId\": " + projectId + ",\n" +
                "\t\"method\": \"1\",\n" +
                "\t\"folderId\": " + folderId + "\n" +
                "}";

        ResponseBodyExtractionOptions addTestsTOCycle =
                given()
                        .headers(headers)
                        .when()
                        .body(jsonAddToCycle)
                        .filter(new RequestLoggingFilter())
                        .filter(new ResponseLoggingFilter())
                        .post("https://jira.intralot.com/rest/zapi/latest/execution/addTestsToCycle/");

        ((Validatable) addTestsTOCycle).then()
                .statusCode(describedAs("---------- Jira Api Call should return 200!", is(200)));

        AddTestsToCycle addTestsTOCycleApi = addTestsTOCycle.as(AddTestsToCycle.class);
        String jobProgressToken = addTestsTOCycleApi.getJobProgressToken();

        await().pollInterval(1, TimeUnit.SECONDS).atMost(5, TimeUnit.MINUTES).until(() ->
                given()
                        .headers(headers)
                        .when()
                        .filter(new RequestLoggingFilter())
                        .filter(new ResponseLoggingFilter())
                        .get("https://jira.intralot.com/rest/zapi/latest/execution/jobProgress/" + jobProgressToken + "?type=add_tests_to_cycle_job_progress")
                        .as(JobProgressModel.class).getProgress().equals(1.0));


        //Add test to cycle

        ExecutionsModel executionsModel = given().
                when().
                header("Content-Type", "application/json").
                header("cookie", "JESSIONID=" + sessionId).
                header("Authorization", "Basic " + basicUser).
                filters(new RequestLoggingFilter(), new ResponseLoggingFilter()).
                queryParam("projectId", projectId).
                queryParam("versionId", versionId).
                queryParam("cycleId", cycleId).
                queryParam("folderId", folderId).
                get("https://jira.intralot.com/rest/zapi/latest/execution").then().extract().as(ExecutionsModel.class);


        List<Execution> executions = executionsModel.getExecutions();
        HashMap<Integer, String> executionIdsToUpdate = new HashMap<>();
        List<Integer> executionsPassed = new ArrayList<>();
        List<Integer> executionsFailed = new ArrayList<>();
        List<Integer> executionsSkipped = new ArrayList<>();

        for (int i = 0; i < executions.size(); i++) {
            Integer currentExecutionId = executions.get(i).getId();
            Integer executionIssueId = executions.get(i).getIssueId();
            String executionIssueKey = executions.get(i).getIssueKey();

            Iterator hmIterator = tcsToUpdate.entrySet().iterator();

            while (hmIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry) hmIterator.next();
                String tcStatus = mapElement.getValue().toString();
                String tcKey = mapElement.getKey().toString();
                if (executionIssueKey.equals(tcKey)) {

                    if (tcStatus.equals("successful")) {
                        executionsPassed.add(currentExecutionId);
                        executionIdsToUpdate.put(currentExecutionId, "1");
                    } else if (tcStatus.equals("failed")) {
                        executionsFailed.add(currentExecutionId);
                        executionIdsToUpdate.put(currentExecutionId, "2");
                    } else {
                        executionsSkipped.add(currentExecutionId);
                        executionIdsToUpdate.put(currentExecutionId, "-1");
                    }
                }
            }
        }

        if (executionsPassed.size() > 0) {
            /*BULK UPDATE PASSED TESTS*/
            String executionsPassedBody = "{\"executions\": [";
            for (int i = 0; i < executionsPassed.size(); i++) {
                executionsPassedBody = executionsPassedBody + executionsPassed.get(i) + ",";
            }

            executionsPassedBody = executionsPassedBody.substring(0, executionsPassedBody.length() - 1);
            executionsPassedBody = executionsPassedBody + "],\n" +
                    "  \"status\": \"1\"\n" +
                    "}";


            AddTestsToCycle bulkUpdateToPassed = given().
                    when().
                    header("Content-Type", "application/json").
                    header("cookie", "JESSIONID=" + sessionId).
                    header("Authorization", "Basic " + basicUser).
                    filters(new RequestLoggingFilter(), new ResponseLoggingFilter()).
                    body(executionsPassedBody).
                    put("https://jira.intralot.com/rest/zapi/latest/execution/updateBulkStatus").then().extract().as(AddTestsToCycle.class);

            String jobProgressTokenUpdateBulkPassed = bulkUpdateToPassed.getJobProgressToken();

            await().pollInterval(1, TimeUnit.SECONDS).atMost(5, TimeUnit.MINUTES).until(() ->
                    given()
                            .headers(headers)
                            .when()
                            .filter(new RequestLoggingFilter())
                            .filter(new ResponseLoggingFilter())
                            .get("https://jira.intralot.com/rest/zapi/latest/execution/jobProgress/" + jobProgressTokenUpdateBulkPassed + "?type=update_bulk_execution_status_job_progress")
                            .as(JobProgressModel.class).getProgress().equals(1.0));
            /*BULK UPDATE PASSED TESTS*/
        }


        if (executionsFailed.size() > 0) {
            /*BULK UPDATE FAILED TESTS*/
            String executionsFailedBody = "{\"executions\": [";
            for (int i = 0; i < executionsFailed.size(); i++) {
                executionsFailedBody = executionsFailedBody + executionsFailed.get(i) + ",";
            }

            executionsFailedBody = executionsFailedBody.substring(0, executionsFailedBody.length() - 1);
            executionsFailedBody = executionsFailedBody + "],\n" +
                    "  \"status\": \"2\"\n" +
                    "}";


            AddTestsToCycle bulkUpdateToFailed = given().
                    when().
                    header("Content-Type", "application/json").
                    header("cookie", "JESSIONID=" + sessionId).
                    header("Authorization", "Basic " + basicUser).
                    filters(new RequestLoggingFilter(), new ResponseLoggingFilter()).
                    body(executionsFailedBody).
                    put("https://jira.intralot.com/rest/zapi/latest/execution/updateBulkStatus").then().extract().as(AddTestsToCycle.class);

            String jobProgressTokenUpdateBulkFailed = bulkUpdateToFailed.getJobProgressToken();

            await().pollInterval(1, TimeUnit.SECONDS).atMost(5, TimeUnit.MINUTES).until(() ->
                    given()
                            .headers(headers)
                            .when()
                            .filter(new RequestLoggingFilter())
                            .filter(new ResponseLoggingFilter())
                            .get("https://jira.intralot.com/rest/zapi/latest/execution/jobProgress/" + jobProgressTokenUpdateBulkFailed + "?type=update_bulk_execution_status_job_progress")
                            .as(JobProgressModel.class).getProgress().equals(1.0));
            /*BULK UPDATE FAILED TESTS*/
        }


        if (executionsSkipped.size() > 0) {
            /*BULK UPDATE UNEXECUTED TESTS*/
            String executionsSkippedBody = "{\"executions\": [";
            for (int i = 0; i < executionsSkipped.size(); i++) {
                executionsSkippedBody = executionsSkippedBody + executionsSkipped.get(i) + ",";
            }

            executionsSkippedBody = executionsSkippedBody.substring(0, executionsSkippedBody.length() - 1);
            executionsSkippedBody = executionsSkippedBody + "],\n" +
                    "  \"status\": \"-1\"\n" +
                    "}";


            AddTestsToCycle bulkUpdateToSkipped = given().
                    when().
                    header("Content-Type", "application/json").
                    header("cookie", "JESSIONID=" + sessionId).
                    header("Authorization", "Basic " + basicUser).
                    filters(new RequestLoggingFilter(), new ResponseLoggingFilter()).
                    body(executionsSkippedBody).
                    put("https://jira.intralot.com/rest/zapi/latest/execution/updateBulkStatus").then().extract().as(AddTestsToCycle.class);

            String jobProgressTokenUpdateBulkSkipped = bulkUpdateToSkipped.getJobProgressToken();

            await().pollInterval(1, TimeUnit.SECONDS).atMost(5, TimeUnit.MINUTES).until(() ->
                    given()
                            .headers(headers)
                            .when()
                            .filter(new RequestLoggingFilter())
                            .filter(new ResponseLoggingFilter())
                            .get("https://jira.intralot.com/rest/zapi/latest/execution/jobProgress/" + jobProgressTokenUpdateBulkSkipped + "?type=update_bulk_execution_status_job_progress")
                            .as(JobProgressModel.class).getProgress().equals(1.0));
            /*BULK UPDATE PASSED TESTS*/
        }

        //FIND ALREADY EXISTING TCS IN FOLDER AND COMPARE THEM WITH BAMBOO EXECUTIONS
        //THE DIFFERENCE WILL BE EXECUTED AS FAILED
 /*       String zqlQuery = "project = \"QAAUT\" AND folderName in (\"" + folderName + "\")";

        ExecuteSearchModel executeSearchModel = given().
                when().
                header("Content-Type", "application/json").
                header("cookie", "JESSIONID=" + sessionId).
                header("Authorization", "Basic " + basicUser).
                queryParam("offset", "0").
                queryParam("maxRecords", "1000").
                queryParam("zqlQuery", zqlQuery).
                filters(new RequestLoggingFilter(), new ResponseLoggingFilter()).
                get("https://jira.intralot.com/rest/zapi/latest/zql/executeSearch/").then().extract().as(ExecuteSearchModel.class);

        List<Execution> executionSeachResult = executeSearchModel.getExecutions();

        List<String> alreadyExistingTCsOnFolder = new ArrayList<>();
        for (int i = 0; i < executionSeachResult.size(); i++) {
            alreadyExistingTCsOnFolder.add(executionSeachResult.get(i).getIssueKey());
        }

        List<String> tcsToUpdateList = new ArrayList<>();
        for (Map.Entry<String, String> entry : tcsToUpdate.entrySet()) {
            tcsToUpdateList.add(entry.getKey());
        }

        List<String> tcDiffenrences = new ArrayList<>(alreadyExistingTCsOnFolder);
        tcDiffenrences.removeAll(tcsToUpdateList);


        System.out.println(tcDiffenrences);
        if (tcDiffenrences.size() > 0) {
            List<Integer> executionsTOUpdateTOUnexecuted = new ArrayList<>();
            for (int i = 0; i < tcDiffenrences.size(); i++) {
                for (int j = 0; j < executions.size(); j++) {
                    String tcDifferences = tcDiffenrences.get(i);
                    String tcExecutions = executions.get(j).getIssueKey();
                    if (tcDifferences.equals(tcExecutions)) {
                        executionsTOUpdateTOUnexecuted.add(executions.get(j).getId());
                    }
                }
            }

            String executionsBody = "{\"executions\": [";
            for (int i = 0; i < executionsTOUpdateTOUnexecuted.size(); i++) {
                executionsBody = executionsBody + executionsTOUpdateTOUnexecuted.get(i) + ",";
            }

            executionsBody = executionsBody.substring(0, executionsBody.length() - 1);
            executionsBody = executionsBody + "],\n" +
                    "  \"status\": \"-1\"\n" +
                    "}";


            AddTestsToCycle bulkUpdateToUnexecuted = given().
                    when().
                    header("Content-Type", "application/json").
                    header("cookie", "JESSIONID=" + sessionId).
                    header("Authorization", "Basic " + basicUser).
                    filters(new RequestLoggingFilter(), new ResponseLoggingFilter()).
                    body(executionsBody).
                    put("https://jira.intralot.com/rest/zapi/latest/execution/updateBulkStatus").then().extract().as(AddTestsToCycle.class);

            String jobProgressTokenUpdateBulk = bulkUpdateToUnexecuted.getJobProgressToken();

            await().pollInterval(1, TimeUnit.SECONDS).atMost(5, TimeUnit.MINUTES).until(() ->
                    given()
                            .headers(headers)
                            .when()
                            .filter(new RequestLoggingFilter())
                            .filter(new ResponseLoggingFilter())
                            .get("https://jira.intralot.com/rest/zapi/latest/execution/jobProgress/" + jobProgressTokenUpdateBulk + "?type=update_bulk_execution_status_job_progress")
                            .as(JobProgressModel.class).getProgress().equals(1.0));

        }
        //FIND ALREADY EXISTING TCS IN FOLDER AND COMPARE THEM WITH BAMBOO EXECUTIONS
        //THE DIFFERENCE WILL BE EXECUTED AS FAILED
*/
    }
}