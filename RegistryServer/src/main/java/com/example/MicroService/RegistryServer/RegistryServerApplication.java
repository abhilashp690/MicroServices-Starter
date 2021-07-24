package com.example.MicroService.RegistryServer;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Map;

@SpringBootApplication
//@EnableEurekaServer
public class RegistryServerApplication {

	public static void main(String[] args) throws Exception {
		System.out.println("Registry Server");
		SpringApplication.run(RegistryServerApplication.class, args);

		String oldPreference = "{\n" +
				"  \"user\": \"admin\",\n" +
				"  \"connectorMode\": \"CCElite\",\n" +
				"  \"isAdvanceListMgmt\": \"false\",\n" +
				"  \"12hTimeFormat\": \"true\",\n" +
				"  \"global\": {\n" +
				"    \"skin\": {\n" +
				"      \"option\": \"1\"\n" +
				"    },\n" +
				"    \"screen\": {\n" +
				"      \"option\": \"2\"\n" +
				"    },\n" +
				"    \"campaigns\": {\n" +
				"      \"option\": \"1\"\n" +
				"    },\n" +
				"    \"dataimports\": {\n" +
				"      \"option\": \"2\"\n" +
				"    },\n" +
				"    \"dncimports\": {\n" +
				"      \"option\": \"2\"\n" +
				"    },\n" +
				"    \"agentssummary\": {\n" +
				"      \"option\": \"2\"\n" +
				"    },\n" +
				"    \"licensesummary\": {\n" +
				"      \"option\": \"2\"\n" +
				"    },\n" +
				"    \"blendqueueinfo\": {\n" +
				"      \"option\": \"2\"\n" +
				"    }\n" +
				"  },\n" +
				"  \"campaignSummary\": {\n" +
				"    \"activeCampaign_LAYOUT\": {\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false,\n" +
				"        \"chartOpen\": false,\n" +
				"        \"enableFilters\": true\n" +
				"      },\n" +
				"      \"commonData\": {\n" +
				"        \"selectedRowIds\": {},\n" +
				"        \"pageSize\": 10,\n" +
				"        \"pageIndex\": 0,\n" +
				"        \"sortBy\": [],\n" +
				"        \"filters\": [\n" +
				"          {\n" +
				"            \"id\": \"campaignName\",\n" +
				"            \"value\": [\n" +
				"              \"dashboardAbdcamp01\"\n" +
				"            ]\n" +
				"          },\n" +
				"          {\n" +
				"            \"id\": \"currentJobStatus\",\n" +
				"            \"value\": [\n" +
				"              \"Running\"\n" +
				"            ]\n" +
				"          },\n" +
				"          {\n" +
				"            \"id\": \"percentageComplete\",\n" +
				"            \"value\": [\n" +
				"              \"notequal\"\n" +
				"            ]\n" +
				"          }\n" +
				"        ],\n" +
				"        \"columnResizing\": {\n" +
				"          \"columnWidths\": {},\n" +
				"          \"startX\": null,\n" +
				"          \"headerIdWidths\": [\n" +
				"            [\n" +
				"              \"campaignName\",\n" +
				"              150\n" +
				"            ]\n" +
				"          ],\n" +
				"          \"columnWidth\": 150,\n" +
				"          \"isResizingColumn\": null\n" +
				"        },\n" +
				"        \"columnOrder\": [],\n" +
				"        \"hiddenColumns\": [],\n" +
				"        \"view\": \"activeCampaignSummary\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"activeCampaign\": {\n" +
				"      \"campaignName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"jobId\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"currentJobStatus\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"orgName\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"campaignType\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"percentageComplete\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"filteredContactCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"processedContactCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"unAttemptedContactCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"currentCallbackCount\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percentageUniqueAttemptedRecord\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percentageAttemptedRecord\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"jobStartTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DATE\"\n" +
				"      },\n" +
				"      \"estimatedJobEndTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"agentCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"nuisanceCount\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"nuisanceRate\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"nuisanceRateToday\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"contactListNames\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"jobNotes\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"STRING\"\n" +
				"      },\n" +
				"      \"restrictContacts\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"pendingRetryCount\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    }\n" +
				"  },\n" +
				"  \"campaignsview\": {\n" +
				"    \"campaignView_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"campaignView\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"campaignView\": {\n" +
				"      \"campaignName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"campaignType\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"jobId\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"orgName\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"currentJobStatus\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"processedContactCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percentageComplete\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"unAttemptedContactCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"restrictTotalAttemptCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"restrictContacts\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"restrictContactsByHoliday\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"pendingRetryCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"filteredContactCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"contactListNames\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"campaignStrategyName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"epms\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"dncGroupList\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"jobStartTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DATE\"\n" +
				"      },\n" +
				"      \"estimatedJobEndTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"elapsedTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"jobNotes\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"STRING\"\n" +
				"      },\n" +
				"      \"emailServer\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"smsServer\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"contactListSummaryView_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"contactListSummaryView\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"contactListSummaryView\": {\n" +
				"      \"filteredContactCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"processedContactCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"connectCount\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"contactsNotDoneCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"pendingRetryCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"restrictContacts\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"restrictContactsByHoliday\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"tmpRestAtmpCnt\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"totalAttemptCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"unAttemptedContactCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"currentCallbackCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"cmplCbkCnt\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"rpc\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"success\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"closure\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"nuisanceCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"nuisanceRateToday\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"nuisanceRate\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percentageAttemptedRecord\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percentageUniqueAttemptedRecord\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percentageRpc\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percentageSuccess\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"answerMachineByAgentCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"contactListView_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"contactListView\",\n" +
				"        \"uniqueId\": \"contactListId\"\n" +
				"      },\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false\n" +
				"      }\n" +
				"    },\n" +
				"    \"contactListView\": {\n" +
				"      \"contactListName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"contactListId\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"ftName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"dialAlloc\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"fltrCnt\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"procCnt\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"connCnt\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"retryCnt\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"tmpRestCnt\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"tmpRestByHldCnt\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"tmpRestAtmpCnt\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"unAtmpCnt\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"curtCbkCnt\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"cmplCbkCnt\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"rpc\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"success\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"closure\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"nseCnt\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percentageAttemptedRecord\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percentageUniqueAttemptedRecord\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"answerMachineByAgentCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentVoiceTask_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"agentVoiceTask\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      },\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentVoiceTask\": {\n" +
				"      \"attemptChannelCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"nuisanceCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"skill\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"pacingType\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"minAgent\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"maxAgent\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"currentCallbackCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"completedCallbackCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"zoneName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"achievedServiceLevel\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"agentUtilization\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"totalAgentCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"agentReadyCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"agentOnBreakCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"callCount\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"avgTalkTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"avgPreviewTime\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"avgHoldTime\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"avgAcwTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"avgIdleTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percIdleTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percBreakTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"agentOnCallCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"minHitRate\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"initialHitRate\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"desiredServiceLevel\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"currentServiceLevel\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"automatedVoiceTask_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"automatedVoiceTask\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"automatedVoiceTask\": {\n" +
				"      \"numberOfAttempts\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"nuisanceCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"maxports\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"minPorts\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"inUsePortCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"currentCallbackCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"completedCallbackCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"paceType\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"rate\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"asa\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"paceVariationStep\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"maxPace\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"inboundSkillView\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"EwtHigh\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"queueLength\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"serviceLevel\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"cntOnCall\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"cntAcw\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"cntIdle\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"completionCodeView_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"completionCodeView\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      },\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false\n" +
				"      }\n" +
				"    },\n" +
				"    \"completionCodeView\": {\n" +
				"      \"codeName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"rpc\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"success\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"closure\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"node\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"count\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"smsView_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"smsView\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"smsView\": {\n" +
				"      \"numberOfAttempts\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"currentCallbackCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"completedCallbackCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"paceType\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"rate\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"asa\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"paceVariationStep\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"maxPace\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"inboundSkill\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"EwtHigh\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"queueLength\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"serviceLevel\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"emailView_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"emailView\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"emailView\": {\n" +
				"      \"numberOfAttempts\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"paceType\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"callbackScheduled\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"callbackCompleted\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"asa\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"ewtHigh\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"inboundSkillView\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"paceVariationStep\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"queueLength\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"serviceLevel\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"rate\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"maxPace\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"customView_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"customView\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"customView\": {\n" +
				"      \"numberOfAttempts\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"callbackScheduled\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"callbackCompleted\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentDetail_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"agentDetail\",\n" +
				"        \"uniqueId\": \"agentId\"\n" +
				"      },\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentDetail\": {\n" +
				"      \"agentId\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentState\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"callCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"agentCallState\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"avgTalkTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percIdleTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"percBreakTime\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"avgACWTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"avgHoldTime\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"jobAttachTimeStamp\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DATE\"\n" +
				"      },\n" +
				"      \"conferenceCount\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"transferCount\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"avgPreviewTime\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"abandonedHoldCount\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"outboundDuration\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"sessionCount\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"currentAgentStateTimeStamp\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"avgIdleTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"sbInboundSkillInfo_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"sbInboundSkillInfo\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"sbInboundSkillInfo\": {\n" +
				"      \"sbInboundSkill\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"sbDesiredASA\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"sbDesiredSL\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"sbDesiredQLength\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"sbDesiredEWT\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"sbDesiredEWTMedium\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"sbDesiredEWTLow\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"selector_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"selector\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"selector\": {\n" +
				"      \"attempts\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"callBackSchedule\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"callBackCompleted\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"breakdown_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"breakdown\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"breakdown\": {\n" +
				"      \"option\": \"0\",\n" +
				"      \"FilterType\": \"COMPARISON\"\n" +
				"    }\n" +
				"  },\n" +
				"  \"dataimportsview\": {\n" +
				"    \"dataimports_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"dataimports\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"dataimports\": {\n" +
				"      \"listName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"dataSourceName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"jobId\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"importStatus\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"orgName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"processedCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"dataimportdetail_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"dncimportdetail\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"dataimportdetail\": {\n" +
				"      \"listName\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"dataSourceName\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"importType\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"jobId\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"orgName\": {\n" +
				"        \"option\": \"0\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"jobprogress_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"jobprogress\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"jobprogress\": {\n" +
				"      \"importStatus\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"processedCount\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"startTime\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"elapsedTime\": {\n" +
				"        \"option\": \"0\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"breakdown_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"breakdown\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"breakdown\": {\n" +
				"      \"option\": \"0\",\n" +
				"      \"FilterType\": \"DROPDOWN\"\n" +
				"    }\n" +
				"  },\n" +
				"  \"dncimportsview\": {\n" +
				"    \"dncimports_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"dncimports\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"dncimports\": {\n" +
				"      \"dataSourceName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"listName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"jobId\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"importStatus\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"orgName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"processedCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"dncimportdetail_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"dncimportdetail\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"dncimportdetail\": {\n" +
				"      \"dataSourceName\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"importType\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"jobId\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"orgName\": {\n" +
				"        \"option\": \"0\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"jobprogress_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"jobprogress\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"jobprogress\": {\n" +
				"      \"importStatus\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"processedCount\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"startTime\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"elapsedTime\": {\n" +
				"        \"option\": \"0\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"breakdown_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"uniqueId\": \"id\",\n" +
				"        \"view\": \"breakdown\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"breakdown\": {\n" +
				"      \"option\": \"0\",\n" +
				"      \"FilterType\": \"DROPDOWN\"\n" +
				"    }\n" +
				"  },\n" +
				"  \"multicampaignview\": {\n" +
				"    \"multicampaign_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"multicampaignview\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      },\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false\n" +
				"      },\n" +
				"      \"parentColumns\": {\n" +
				"        \"agentPerformance\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"contactPerformance\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"completionSummary\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"callbacks\": {\n" +
				"          \"option\": \"1\"\n" +
				"        }\n" +
				"      }\n" +
				"    },\n" +
				"    \"multicampaign\": {\n" +
				"      \"attempts\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"contactPerformance\"\n" +
				"      },\n" +
				"      \"connects\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"hitRate\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"nuisanceCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"contactPerformance\"\n" +
				"      },\n" +
				"      \"talkTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"agentPerformance\"\n" +
				"      },\n" +
				"      \"ACWTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"agentPerformance\"\n" +
				"      },\n" +
				"      \"idleTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"agentPerformance\"\n" +
				"      },\n" +
				"      \"interval\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"contactPerformance\"\n" +
				"      },\n" +
				"      \"callBackSchedule\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"callbacks\"\n" +
				"      },\n" +
				"      \"callBackCompleted\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"callbacks\"\n" +
				"      },\n" +
				"      \"RPC\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"completionSummary\"\n" +
				"      },\n" +
				"      \"success\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"completionSummary\"\n" +
				"      },\n" +
				"      \"closure\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"completionSummary\"\n" +
				"      },\n" +
				"      \"campaignName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"actionName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"percIdleTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"agentPerformance\"\n" +
				"      },\n" +
				"      \"percBreakTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\",\n" +
				"        \"parentKey\": \"agentPerformance\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"interval\": {\n" +
				"      \"last5min\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"last15min\": {\n" +
				"        \"option\": \"1\"\n" +
				"      },\n" +
				"      \"last30min\": {\n" +
				"        \"option\": \"1\"\n" +
				"      },\n" +
				"      \"last60min\": {\n" +
				"        \"option\": \"0\"\n" +
				"      }\n" +
				"    }\n" +
				"  },\n" +
				"  \"agentsview\": {\n" +
				"    \"agentsummary_LAYOUT\": {\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false\n" +
				"      },\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"agentsummary\",\n" +
				"        \"uniqueId\": \"agentId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentsummary\": {\n" +
				"      \"agent\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentExtension\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"skill\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentState\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"callState\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"campaignName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"jobId\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"actionName\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"zoneName\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentJobState\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentLocale\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentTimeZone\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"inboundCount\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"inboundDuration\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"inboundDuarationPercentage\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"jobWaitingIdleDuration\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"offJobIdlePercentage\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"loginTime\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DATE\"\n" +
				"      },\n" +
				"      \"offJobBreakDuration\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"offJobBreakPercentage\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"outBoundDuration\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"outBoundDurationPercentage\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"stateTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"agentNailedState\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"attributeSkill\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"orgName\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"callStateTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"avgTalkTime\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"callCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentDetailSummary_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"agentDetailSummary\",\n" +
				"        \"uniqueId\": \"agentId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentDetailSummary\": {\n" +
				"      \"agent\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentExtension\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"skill\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentState\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"callState\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"campaignName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"jobId\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"actionName\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"zoneName\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentJobState\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentLocale\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"agentTimeZone\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"inboundCount\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"inboundDuration\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"inboundDuarationPercentage\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"jobWaitingIdleDuration\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"offJobIdlePercentage\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"loginTime\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DATE\"\n" +
				"      },\n" +
				"      \"offJobBreakDuration\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"offJobBreakPercentage\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"outBoundDuration\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"outBoundDurationPercentage\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"stateTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"agentNailedState\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"attributeSkill\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"orgName\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"callStateTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DURATION\"\n" +
				"      },\n" +
				"      \"avgTalkTime\": {\n" +
				"        \"option\": \"1\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"callCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentdetail_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"agentdetail\",\n" +
				"        \"uniqueId\": \"agentId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentdetail\": {\n" +
				"      \"averageAcwTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"averageTalkTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"callCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"inJobBreakPercentage\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"inJobIdlePercentage\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"success\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"successperhour\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"rpc\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"rpcperhour\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"closure\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"closureperhour\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"avgIdleTime\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    }\n" +
				"  },\n" +
				"  \"hasUnsavedUIState\": true\n" +
				"}";

		String newPreference = "{\n" +
				"  \"user\": \"admin\",\n" +
				"  \"connectorMode\": \"CCElite\",\n" +
				"  \"isAdvanceListMgmt\": \"false\",\n" +
				"  \"12hTimeFormat\": \"true\",\n" +
				"  \"global\": {\n" +
				"    \"skin\": {\n" +
				"      \"option\": \"1\"\n" +
				"    },\n" +
				"    \"screen\": {\n" +
				"      \"option\": \"2\"\n" +
				"    },\n" +
				"    \"campaigns\": {\n" +
				"      \"option\": \"1\"\n" +
				"    },\n" +
				"    \"dataimports\": {\n" +
				"      \"option\": \"2\"\n" +
				"    },\n" +
				"    \"dncimports\": {\n" +
				"      \"option\": \"2\"\n" +
				"    },\n" +
				"    \"agentssummary\": {\n" +
				"      \"option\": \"2\"\n" +
				"    },\n" +
				"    \"licensesummary\": {\n" +
				"      \"option\": \"2\"\n" +
				"    },\n" +
				"    \"blendqueueinfo\": {\n" +
				"      \"option\": \"2\"\n" +
				"    }\n" +
				"  },\n" +
				"  \"campaignSummary\": {\n" +
				"    \"activeCampaign_LAYOUT\": {\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false\n" +
				"      },\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"activeCampaignSummary\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"activeCampaign\": {      \n" +
				"        \"campaignName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"jobId\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"currentJobStatus\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"orgName\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"campaignType\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"percentageComplete\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"filteredContactCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"processedContactCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"unAttemptedContactCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"currentCallbackCount\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percentageUniqueAttemptedRecord\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percentageAttemptedRecord\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"jobStartTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DATE\"\n" +
				"        },\n" +
				"        \"estimatedJobEndTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DATE\"\n" +
				"        },\n" +
				"        \"agentCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"nuisanceCount\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"nuisanceRate\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"nuisanceRateToday\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"contactListNames\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"jobNotes\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"STRING\"\n" +
				"        },\n" +
				"        \"restrictContacts\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"pendingRetryCount\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }      \n" +
				"    }\n" +
				"  },\n" +
				"  \"campaignsview\": {\n" +
				"    \"campaignView_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"campaignView\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"campaignView\": {      \n" +
				"        \"campaignName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"campaignType\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"jobId\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"orgName\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"currentJobStatus\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"processedContactCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percentageComplete\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"unAttemptedContactCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"restrictTotalAttemptCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"restrictContacts\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"restrictContactsByHoliday\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"pendingRetryCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"filteredContactCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"contactListNames\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"campaignStrategyName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"epms\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"dncGroupList\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"jobStartTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DATE\"\n" +
				"        },\n" +
				"        \"estimatedJobEndTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DATE\"\n" +
				"        },\n" +
				"        \"elapsedTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"jobNotes\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"STRING\"\n" +
				"        },\n" +
				"        \"emailServer\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"smsServer\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        }\n" +
				"     },\n" +
				"    \"contactListSummaryView_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"contactListSummaryView\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"contactListSummaryView\": {     \n" +
				"        \"filteredContactCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"processedContactCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"connectCount\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"contactsNotDoneCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"pendingRetryCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"restrictContacts\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"restrictContactsByHoliday\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"tmpRestAtmpCnt\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"totalAttemptCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"unAttemptedContactCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"currentCallbackCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"cmplCbkCnt\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"rpc\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"success\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"closure\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"nuisanceCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"nuisanceRateToday\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"nuisanceRate\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percentageAttemptedRecord\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percentageUniqueAttemptedRecord\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percentageRpc\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percentageSuccess\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"answerMachineByAgentCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"      },\n" +
				"    \"contactListView_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"contactListView\",\n" +
				"        \"uniqueId\": \"contactListId\"\n" +
				"      },\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false\n" +
				"      }\n" +
				"     },\n" +
				"    \"contactListView\": {      \n" +
				"        \"contactListName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"contactListId\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"ftName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"dialAlloc\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"fltrCnt\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"procCnt\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"connCnt\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"retryCnt\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"tmpRestCnt\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"tmpRestByHldCnt\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"tmpRestAtmpCnt\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"unAtmpCnt\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"curtCbkCnt\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"cmplCbkCnt\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"rpc\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"success\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"closure\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"nseCnt\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percentageAttemptedRecord\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percentageUniqueAttemptedRecord\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"answerMachineByAgentCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"agentVoiceTask_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"agentVoiceTask\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      },\n" +
				"      \"pageData\":{\n" +
				"        \"enableFilter\":false\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentVoiceTask\": {      \n" +
				"        \"attemptChannelCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"nuisanceCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"skill\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"pacingType\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"minAgent\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"maxAgent\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"currentCallbackCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"completedCallbackCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"zoneName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"achievedServiceLevel\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"agentUtilization\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"totalAgentCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"agentReadyCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"agentOnBreakCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"callCount\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"avgTalkTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"avgPreviewTime\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"avgHoldTime\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"avgAcwTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"avgIdleTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percIdleTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percBreakTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"agentOnCallCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"minHitRate\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"initialHitRate\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"desiredServiceLevel\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"currentServiceLevel\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"automatedVoiceTask_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"automatedVoiceTask\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"automatedVoiceTask\": {     \n" +
				"        \"numberOfAttempts\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"nuisanceCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"maxports\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"minPorts\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"inUsePortCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"currentCallbackCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"completedCallbackCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"paceType\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"rate\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"asa\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"paceVariationStep\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"maxPace\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"inboundSkillView\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"EwtHigh\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"queueLength\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"serviceLevel\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"cntOnCall\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"cntAcw\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"cntIdle\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"completionCodeView_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"completionCodeView\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      },\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false\n" +
				"      }\n" +
				"    },\n" +
				"    \"completionCodeView\": {    \n" +
				"        \"codeName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },  \n" +
				"        \"rpc\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"success\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"closure\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"node\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },     \n" +
				"        \"count\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"smsView_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"smsView\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"     },\n" +
				"    \"smsView\": {      \n" +
				"        \"numberOfAttempts\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"currentCallbackCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"completedCallbackCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"paceType\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"rate\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"asa\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"paceVariationStep\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"maxPace\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"inboundSkill\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"EwtHigh\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"queueLength\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"serviceLevel\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"     },\n" +
				"    \"emailView_LAYOUT\" :{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"emailView\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"     },\n" +
				"    \"emailView\": {     \n" +
				"        \"numberOfAttempts\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"paceType\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"callbackScheduled\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"callbackCompleted\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"asa\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"ewtHigh\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"inboundSkillView\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"paceVariationStep\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"queueLength\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"serviceLevel\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"rate\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"maxPace\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"customView_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"customView\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"customView\": {      \n" +
				"        \"numberOfAttempts\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"callbackScheduled\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"callbackCompleted\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"agentDetail_LAYOUT\" :{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"agentDetail\",\n" +
				"        \"uniqueId\": \"agentId\"\n" +
				"      },\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentDetail\": {     \n" +
				"        \"agentId\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentState\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"callCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"agentCallState\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"avgTalkTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percIdleTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"percBreakTime\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"avgACWTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"avgHoldTime\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"jobAttachTimeStamp\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DATE\"\n" +
				"        },\n" +
				"        \"conferenceCount\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"transferCount\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"avgPreviewTime\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"abandonedHoldCount\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"outboundDuration\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"sessionCount\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"currentAgentStateTimeStamp\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"avgIdleTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"sbInboundSkillInfo_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"sbInboundSkillInfo\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"sbInboundSkillInfo\": {     \n" +
				"        \"sbInboundSkill\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"sbDesiredASA\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"sbDesiredSL\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"sbDesiredQLength\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"sbDesiredEWT\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"sbDesiredEWTMedium\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"sbDesiredEWTLow\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"selector_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"selector\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"selector\": {      \n" +
				"        \"attempts\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"callBackSchedule\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"callBackCompleted\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"breakdown_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"breakdown\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"breakdown\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"    }\n" +
				"  },\n" +
				"  \"dataimportsview\": {\n" +
				"    \"dataimports_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"dataimports\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"dataimports\": {\n" +
				"        \"listName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"dataSourceName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"jobId\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"importStatus\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"orgName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"processedCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"dataimportdetail_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"dncimportdetail\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"dataimportdetail\": {\n" +
				"        \"listName\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"dataSourceName\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"importType\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"jobId\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"orgName\": {\n" +
				"          \"option\": \"0\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"jobprogress_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"jobprogress\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"jobprogress\": {\n" +
				"        \"importStatus\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"processedCount\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"startTime\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"elapsedTime\": {\n" +
				"          \"option\": \"0\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"breakdown_LAYOUT\":{\n" +
				"      \"commonData\":{\n" +
				"        \"view\":\"breakdown\",\n" +
				"         \"uniqueId\":\"id\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"breakdown\": {\n" +
				"      \"option\": \"0\",\n" +
				"      \"FilterType\": \"DROPDOWN\"\n" +
				"    }\n" +
				"  },\n" +
				"  \"dncimportsview\": {\n" +
				"    \"dncimports_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"dncimports\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"dncimports\": {      \n" +
				"      \"dataSourceName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"listName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"jobId\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      },\n" +
				"      \"importStatus\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"orgName\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"DROPDOWN\"\n" +
				"      },\n" +
				"      \"processedCount\": {\n" +
				"        \"option\": \"0\",\n" +
				"        \"FilterType\": \"COMPARISON\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"dncimportdetail_LAYOUT\": {\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"dncimportdetail\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"dncimportdetail\":{\n" +
				"        \"dataSourceName\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"importType\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"jobId\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"orgName\": {\n" +
				"          \"option\": \"0\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"jobprogress_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"jobprogress\",\n" +
				"        \"uniqueId\": \"jobId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"jobprogress\": {\n" +
				"      \"importStatus\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"processedCount\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"startTime\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"elapsedTime\": {\n" +
				"        \"option\": \"0\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"breakdown_LAYOUT\":{\n" +
				"      \"commonData\":{\n" +
				"        \"uniqueId\":\"id\",\n" +
				"        \"view\":\"breakdown\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"breakdown\": {\n" +
				"      \"option\": \"0\",\n" +
				"      \"FilterType\": \"DROPDOWN\"\n" +
				"    }\n" +
				"  },\n" +
				"  \"multicampaignview\": {\n" +
				"    \"multicampaign_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"multicampaignview\",\n" +
				"        \"uniqueId\": \"id\"\n" +
				"      },\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false\n" +
				"      },     \n" +
				"      \"parentColumns\":{\n" +
				"        \"agentPerformance\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"contactPerformance\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"completionSummary\": {\n" +
				"          \"option\": \"0\"\n" +
				"        },\n" +
				"        \"callbacks\": {\n" +
				"          \"option\": \"1\"\n" +
				"        }\n" +
				"      } \n" +
				"    },\n" +
				"    \"multicampaign\": {\n" +
				"        \"attempts\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\",\n" +
				"          \"parentKey\": \"contactPerformance\"\n" +
				"        },\n" +
				"        \"connects\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"hitRate\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"nuisanceCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\",\n" +
				"          \"parentKey\": \"contactPerformance\"\n" +
				"        },\n" +
				"        \"talkTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\",\n" +
				"          \"parentKey\": \"agentPerformance\"\n" +
				"        },\n" +
				"        \"ACWTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\",\n" +
				"          \"parentKey\": \"agentPerformance\"\n" +
				"        },\n" +
				"        \"idleTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\",\n" +
				"          \"parentKey\": \"agentPerformance\"\n" +
				"        },\n" +
				"\t\t\"interval\": {\n" +
				"\t\t\t\"option\": \"0\",\n" +
				"\t\t\t\"FilterType\": \"COMPARISON\",\n" +
				"\t\t\t\"parentKey\": \"contactPerformance\"\n" +
				"\t\t},\n" +
				"        \"callBackSchedule\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\",\n" +
				"          \"parentKey\": \"callbacks\"\n" +
				"        },\n" +
				"        \"callBackCompleted\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\",\n" +
				"          \"parentKey\": \"callbacks\"\n" +
				"        },\n" +
				"        \"RPC\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\",\n" +
				"          \"parentKey\": \"completionSummary\"\n" +
				"        },\n" +
				"        \"success\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\",\n" +
				"          \"parentKey\": \"completionSummary\"\n" +
				"        },\n" +
				"        \"closure\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\",\n" +
				"          \"parentKey\": \"completionSummary\"\n" +
				"        },\n" +
				"        \"campaignName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"actionName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"percIdleTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\",\n" +
				"          \"parentKey\": \"agentPerformance\"\n" +
				"        },\n" +
				"        \"percBreakTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\",\n" +
				"          \"parentKey\": \"agentPerformance\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"interval\": {\n" +
				"      \"last5min\": {\n" +
				"        \"option\": \"0\"\n" +
				"      },\n" +
				"      \"last15min\": {\n" +
				"        \"option\": \"1\"\n" +
				"      },\n" +
				"      \"last30min\": {\n" +
				"        \"option\": \"1\"\n" +
				"      },\n" +
				"      \"last60min\": {\n" +
				"        \"option\": \"0\"\n" +
				"      }\n" +
				"    }\n" +
				"  },\n" +
				"  \"agentsview\": {\n" +
				"    \"agentsummary_LAYOUT\":{\n" +
				"      \"pageData\": {\n" +
				"        \"enableFilter\": false\n" +
				"      },\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"agentsummary\",\n" +
				"        \"uniqueId\": \"agentId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentsummary\": {      \n" +
				"        \"agent\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentExtension\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"skill\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentState\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"callState\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"campaignName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"jobId\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"actionName\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"zoneName\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentJobState\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentLocale\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentTimeZone\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"inboundCount\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"inboundDuration\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"inboundDuarationPercentage\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"jobWaitingIdleDuration\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"offJobIdlePercentage\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"loginTime\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DATE\"\n" +
				"        },\n" +
				"        \"offJobBreakDuration\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"offJobBreakPercentage\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"outBoundDuration\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"outBoundDurationPercentage\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"stateTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"agentNailedState\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"attributeSkill\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"orgName\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"callStateTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"avgTalkTime\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"callCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"agentDetailSummary_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"agentDetailSummary\",\n" +
				"        \"uniqueId\": \"agentId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentDetailSummary\": {      \n" +
				"        \"agent\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentExtension\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"skill\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentState\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"callState\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"campaignName\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"jobId\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"actionName\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"zoneName\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentJobState\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentLocale\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"agentTimeZone\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"inboundCount\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"inboundDuration\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"inboundDuarationPercentage\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"jobWaitingIdleDuration\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"offJobIdlePercentage\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"loginTime\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DATE\"\n" +
				"        },\n" +
				"        \"offJobBreakDuration\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"offJobBreakPercentage\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"outBoundDuration\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"outBoundDurationPercentage\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"stateTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"agentNailedState\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"attributeSkill\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"orgName\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"DROPDOWN\"\n" +
				"        },\n" +
				"        \"callStateTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"DURATION\"\n" +
				"        },\n" +
				"        \"avgTalkTime\": {\n" +
				"          \"option\": \"1\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"callCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"    },\n" +
				"    \"agentdetail_LAYOUT\":{\n" +
				"      \"commonData\": {\n" +
				"        \"view\": \"agentdetail\",\n" +
				"        \"uniqueId\": \"agentId\"\n" +
				"      }\n" +
				"    },\n" +
				"    \"agentdetail\": {\n" +
				"        \"averageAcwTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"averageTalkTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"callCount\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"inJobBreakPercentage\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"inJobIdlePercentage\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"success\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"successperhour\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"rpc\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"rpcperhour\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"closure\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"closureperhour\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        },\n" +
				"        \"avgIdleTime\": {\n" +
				"          \"option\": \"0\",\n" +
				"          \"FilterType\": \"COMPARISON\"\n" +
				"        }\n" +
				"      \n" +
				"    }\n" +
				"  }\n" +
				"}";

		System.out.println(merge(new JsonParser().parse(oldPreference).getAsJsonObject() ,
				new JsonParser().parse(newPreference).getAsJsonObject()));


	}


	public static JsonObject merge(JsonObject existingPreferences, JsonObject newPreferences) throws Exception
	{
		for (Map.Entry<String, JsonElement> entry : existingPreferences.entrySet())
		{
			String key = entry.getKey();
			JsonElement value = entry.getValue();
			if(!newPreferences.has(key)){
				newPreferences.add(key , value);
			}
			else {
				if (value.isJsonObject()) {
					merge(value.getAsJsonObject(), newPreferences.get(key).getAsJsonObject());
				} else if (value.isJsonArray()) {
					newPreferences.get(key).getAsJsonArray().addAll((JsonArray) value);
				} else {
					newPreferences.add(key, value);
				}
			}
		}
		return newPreferences;
	}
}
