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
import com.labs247.jsf.model.ThreadingDataState;

@ManagedBean
@RequestScoped
public class ThreadingAmbariJMXUtil implements Serializable {

	private static final long serialVersionUID = 1L;

	ThreadingDataState _fs = new ThreadingDataState();

	public static List<ThreadingDataState> json2Threading(String json) throws Exception {

		List<ThreadingDataState> _beans_ = new ArrayList<ThreadingDataState>();

		JsonParser parser = new JsonParser();

		JsonElement jsonTree = parser.parse(json);

		if (jsonTree.isJsonObject()) {
			/*
			 * { "beans" : [ { "name" : "java.lang:type=Threading", "modelerType" :
			 * "sun.management.ThreadImpl", "ThreadAllocatedMemorySupported" : true,
			 * "ThreadAllocatedMemoryEnabled" : true, "ThreadContentionMonitoringSupported"
			 * : true, "CurrentThreadCpuTimeSupported" : true, "ObjectMonitorUsageSupported"
			 * : true, "SynchronizerUsageSupported" : true, "ThreadCpuTimeEnabled" : true,
			 * "PeakThreadCount" : 50, "DaemonThreadCount" : 37, "ThreadCount" : 46,
			 * "TotalStartedThreadCount" : 26353, "ThreadCpuTimeSupported" : true,
			 * "CurrentThreadCpuTime" : 64699617099, "CurrentThreadUserTime" : 49430000000,
			 * "ThreadContentionMonitoringEnabled" : false, "AllThreadIds" : [ 244, 66, 34,
			 * 33, 64, 60, 58, 56, 55, 54, 53, 52, 51, 50, 49, 48, 47, 46, 45, 44, 36, 39,
			 * 21, 20, 43, 42, 38, 37, 35, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 18, 17,
			 * 13, 5, 3, 2, 1 ], "ObjectName" : "java.lang:type=Threading" } ] }
			 */

			JsonObject jsonObject = jsonTree.getAsJsonObject();

			JsonArray beans = (JsonArray) parser.parse(jsonObject.get("beans").toString());

			for (JsonElement bean : beans) {

				ThreadingDataState _u = new ThreadingDataState();

				JsonObject _bean = (JsonObject) bean;

				_u.setName(_bean.get("name").getAsString());

				_u.setModelerType(_bean.get("modelerType").getAsString());

				_u.setThreadAllocatedMemorySupported(_bean.get("ThreadAllocatedMemorySupported").getAsBoolean());

				_u.setThreadAllocatedMemoryEnabled(_bean.get("ThreadAllocatedMemoryEnabled").getAsBoolean());

				_u.setThreadContentionMonitoringSupported(
						_bean.get("ThreadContentionMonitoringSupported").getAsBoolean());

				_u.setCurrentThreadCpuTimeSupported(_bean.get("CurrentThreadCpuTimeSupported").getAsBoolean());

				_u.setObjectMonitorUsageSupported(_bean.get("ObjectMonitorUsageSupported").getAsBoolean());

				_u.setSynchronizerUsageSupported(_bean.get("SynchronizerUsageSupported").getAsBoolean());

				_u.setThreadCpuTimeEnabled(_bean.get("ThreadCpuTimeEnabled").getAsBoolean());

				_u.setPeakThreadCount(_bean.get("PeakThreadCount").getAsInt());

				_u.setDaemonThreadCount(_bean.get("DaemonThreadCount").getAsInt());

				_u.setThreadCount(_bean.get("ThreadCount").getAsInt());

				_u.setTotalStartedThreadCount(_bean.get("TotalStartedThreadCount").getAsInt());

				_u.setThreadCpuTimeSupported(_bean.get("ThreadCpuTimeSupported").getAsBoolean());

				_u.setCurrentThreadCpuTime(_bean.get("CurrentThreadCpuTime").getAsDouble());

				_u.setCurrentThreadUserTime(_bean.get("CurrentThreadUserTime").getAsDouble());

				_u.setThreadContentionMonitoringEnabled(_bean.get("ThreadContentionMonitoringEnabled").getAsBoolean());

				_u.setObjectName(_bean.get("ObjectName").getAsString());

				_beans_.add(_u);

			}

		}

		return _beans_;
	}

}