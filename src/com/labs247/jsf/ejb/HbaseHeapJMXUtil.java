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
//import com.roasted.model.HeapData;
import com.labs247.jsf.model.HbaseHeapDataState;

@ManagedBean
@RequestScoped

public class HbaseHeapJMXUtil implements Serializable {
private static final long serialVersionUID = 1L;
	
	public static List<HbaseHeapDataState> json2FSDatasetState(String json) throws Exception {

		List<HbaseHeapDataState> _beans_ = new ArrayList<HbaseHeapDataState>();
		
		JsonParser parser = new JsonParser();

		JsonElement jsonTree = parser.parse(json);

		if (jsonTree.isJsonObject()) {

			JsonObject jsonObject = jsonTree.getAsJsonObject();

			JsonArray beans = (JsonArray) parser.parse(jsonObject.get("beans").toString());

			for (JsonElement bean : beans) {

				HbaseHeapDataState _u = new HbaseHeapDataState();

				JsonObject _bean = (JsonObject) bean;
				
//				Long _timeServer = System.currentTimeMillis();
				
//				Date _serverTime = new Date(_timeServer);
				
//				Double _operation = 1073741824.0;
				
//
//				_u.setName(_bean.get("name").getAsString());
//
//				_u.setModelerType(_bean.get("modelerType").getAsString());
//
//				_u.setTagContext(_bean.get("tagContext").getAsString());
//				
//				_u.setTagProcessName(_bean.get("tagProcessName").getAsString());
//
//				_u.setTagSessionId(_bean.get("tagSessionId").getAsString());
//
//				_u.setTagHostname((_bean.get("tagHostname").getAsString()));
//				
//
//				_u.setMemNonHeapUsedM((_bean.get("memNonHeapUsedM").getAsDouble()));
//				
//
//				_u.setMemNonHeapCommittedM((_bean.get("memNonHeapCommittedM").getAsDouble()));
//				
//
//				_u.setMemNonHeapMaxM(_bean.get("memNonHeapMaxM").getAsDouble());

				_u.setMemHeapUsedM(_bean.get("MemHeapUsedM").getAsDouble());
				
//				_u.setMemHeapCommittedM(_bean.get("memHeapCommittedM").getAsDouble());
				
				_u.setMemHeapMaxM(_bean.get("MemHeapMaxM").getAsDouble());
				
//				_u.setMemMaxM(_bean.get("memMaxM").getAsDouble());
//				
//				_u.setGcCount(_bean.get("gcCount").getAsInt());
//				
//				_u.setGcTimeMillis(_bean.get("gcTimeMillis").getAsInt());
//				
//				_u.setThreadsNew(_bean.get("threadsNew").getAsInt());
//				
//				_u.setThreadsRunnable(_bean.get("threadsRunnable").getAsInt());
//				
//				_u.setThreadsBlocked(_bean.get("threadsBlocked").getAsInt());
//				
//				_u.setThreadsWaiting(_bean.get("threadsWaiting").getAsInt());
//				
//				_u.setThreadsTimedWaiting(_bean.get("threadsTimedWaiting").getAsInt());
//				
//				_u.setThreadsTerminated(_bean.get("threadsTerminated").getAsInt());
//				
//				_u.setLogFatal(_bean.get("logFatal").getAsInt());
//				
//				_u.setLogError(_bean.get("logError").getAsInt());
//				
//				_u.setLogWarn(_bean.get("logWarn").getAsInt());
//				
//				_u.setLogInfo(_bean.get("logInfo").getAsInt());
				
				_beans_.add(_u);
	
			}
			
		}

		return _beans_;
	}
	
}