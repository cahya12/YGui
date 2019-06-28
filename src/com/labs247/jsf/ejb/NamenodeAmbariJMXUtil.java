package com.labs247.jsf.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.labs247.jsf.model.NamenodeDatasetState;

@ManagedBean
@RequestScoped
public class NamenodeAmbariJMXUtil implements Serializable{

	private static final long serialVersionUID = 1L;
	
	NamenodeDatasetState _fs = new NamenodeDatasetState();

	public static List<NamenodeDatasetState> json2JvmMetrics(String json) throws Exception {

		List<NamenodeDatasetState> _beans_ = new ArrayList<NamenodeDatasetState>();
		
		JsonParser parser = new JsonParser();

		JsonElement jsonTree = parser.parse(json);

		if (jsonTree.isJsonObject()) {
			/*
			 * { "beans" : [ { "name" : "Hadoop:service=DataNode,name=JvmMetrics",
			 * "modelerType" : "JvmMetrics", "tag.Context" : "jvm", "tag.ProcessName" :
			 * "DataNode", "tag.SessionId" : null, "tag.Hostname" : "yava3-132.labs247.com",
			 * "MemNonHeapUsedM" : 69.454094, "MemNonHeapCommittedM" : 71.140625,
			 * "MemNonHeapMaxM" : -1.0, "MemHeapUsedM" : 170.58505, "MemHeapCommittedM" :
			 * 1004.0, "MemHeapMaxM" : 1004.0, "MemMaxM" : 1004.0, "GcCountParNew" : 178,
			 * "GcTimeMillisParNew" : 29960, "GcCountConcurrentMarkSweep" : 1,
			 * "GcTimeMillisConcurrentMarkSweep" : 112, "GcCount" : 179, "GcTimeMillis" :
			 * 30072, "GcNumWarnThresholdExceeded" : 0, "GcNumInfoThresholdExceeded" : 13,
			 * "GcTotalExtraSleepTime" : 4491423, "ThreadsNew" : 0, "ThreadsRunnable" : 13,
			 * "ThreadsBlocked" : 0, "ThreadsWaiting" : 7, "ThreadsTimedWaiting" : 26,
			 * "ThreadsTerminated" : 0, "LogFatal" : 0, "LogError" : 0, "LogWarn" : 12,
			 * "LogInfo" : 549 } ] }
			 */

			JsonObject jsonObject = jsonTree.getAsJsonObject();

			JsonArray beans = (JsonArray) parser.parse(jsonObject.get("beans").toString());

			for (JsonElement bean : beans) {

				NamenodeDatasetState _u = new NamenodeDatasetState();

				JsonObject _bean = (JsonObject) bean;
				

				_u.setName(_bean.get("name").getAsString());

				_u.setModelerType(_bean.get("modelerType").getAsString());

				_u.setTagContext(_bean.get("tag.Context").getAsString());
				
				_u.setTagProcessName(_bean.get("tag.ProcessName").getAsString());

				_u.setTagHostname(_bean.get("tag.Hostname").getAsString());

				_u.setMemNonHeapUsedM(_bean.get("MemNonHeapUsedM").getAsDouble());

				_u.setMemNonHeapCommittedM(_bean.get("MemNonHeapCommittedM").getAsDouble());
				
				_u.setMemNonHeapMaxM(_bean.get("MemNonHeapMaxM").getAsDouble());
				
				_u.setMemHeapUsedM(_bean.get("MemHeapUsedM").getAsDouble());
				
				_u.setMemHeapCommittedM(_bean.get("MemHeapCommittedM").getAsDouble());
				
				_u.setMemHeapMaxM(_bean.get("MemHeapMaxM").getAsDouble());
				
				_u.setMemMaxM(_bean.get("MemMaxM").getAsDouble());
				
				_u.setGcCountParNew(_bean.get("GcCountParNew").getAsInt());
				
				_u.setGcTimeMillisParNew(_bean.get("GcTimeMillisParNew").getAsInt());
				
				_u.setGcCountConcurrentMarkSweep(_bean.get("GcCountConcurrentMarkSweep").getAsInt());
				
				_u.setGcTimeMillisConcurrentMarkSweep(_bean.get("GcTimeMillisConcurrentMarkSweep").getAsInt());
				
				_u.setGcCount(_bean.get("GcCount").getAsInt());
				
				_u.setGcTimeMillis(_bean.get("GcTimeMillis").getAsInt());
				
				_u.setGcNumWarnThresholdExceeded(_bean.get("GcNumWarnThresholdExceeded").getAsInt());
				
				_u.setGcNumInfoThresholdExceeded(_bean.get("GcNumInfoThresholdExceeded").getAsInt());
				
				_u.setGcTotalExtraSleepTime(_bean.get("GcTotalExtraSleepTime").getAsInt());
				
				_u.setThreadsNew(_bean.get("ThreadsNew").getAsInt());
				
				_u.setThreadsRunnable(_bean.get("ThreadsRunnable").getAsInt());
				
				_u.setThreadsBlocked(_bean.get("ThreadsBlocked").getAsInt());
				
				_u.setThreadsWaiting(_bean.get("ThreadsWaiting").getAsInt());
				
				_u.setThreadsTimedWaiting(_bean.get("ThreadsTimedWaiting").getAsInt());
				
				_u.setThreadsTerminated(_bean.get("ThreadsTerminated").getAsInt());
				
				_u.setLogFatal(_bean.get("LogFatal").getAsInt());
				
				_u.setLogError(_bean.get("LogError").getAsInt());
				
				_u.setLogWarn(_bean.get("LogWarn").getAsInt());
				
				_u.setLogInfo(_bean.get("LogInfo").getAsInt());
				
				_beans_.add(_u);
				
			}
			
		}

		return _beans_;
	}
	
}