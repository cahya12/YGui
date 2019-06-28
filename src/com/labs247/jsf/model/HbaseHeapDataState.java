package com.labs247.jsf.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HbaseHeapDataState {
	

@SerializedName("name")
@Expose
private String name;
@SerializedName("modelerType")
@Expose
private String modelerType;
@SerializedName("tag.Context")
@Expose
private String tagContext;
@SerializedName("tag.ProcessName")
@Expose
private String tagProcessName;
@SerializedName("tag.SessionId")
@Expose
private String tagSessionId;
@SerializedName("tag.Hostname")
@Expose
private String tagHostname;
@SerializedName("MemNonHeapUsedM")
@Expose
private Double memNonHeapUsedM;
@SerializedName("MemNonHeapCommittedM")
@Expose
private Double memNonHeapCommittedM;
@SerializedName("MemNonHeapMaxM")
@Expose
private Double memNonHeapMaxM;
@SerializedName("MemHeapUsedM")
@Expose
private Double memHeapUsedM;
@SerializedName("MemHeapCommittedM")
@Expose
private Double memHeapCommittedM;
@SerializedName("MemHeapMaxM")
@Expose
private Double memHeapMaxM;
@SerializedName("MemMaxM")
@Expose
private Double memMaxM;
@SerializedName("GcCount")
@Expose
private Integer gcCount;
@SerializedName("GcTimeMillis")
@Expose
private Integer gcTimeMillis;
@SerializedName("ThreadsNew")
@Expose
private Integer threadsNew;
@SerializedName("ThreadsRunnable")
@Expose
private Integer threadsRunnable;
@SerializedName("ThreadsBlocked")
@Expose
private Integer threadsBlocked;
@SerializedName("ThreadsWaiting")
@Expose
private Integer threadsWaiting;
@SerializedName("ThreadsTimedWaiting")
@Expose
private Integer threadsTimedWaiting;
@SerializedName("ThreadsTerminated")
@Expose
private Integer threadsTerminated;
@SerializedName("LogFatal")
@Expose
private Integer logFatal;
@SerializedName("LogError")
@Expose
private Integer logError;
@SerializedName("LogWarn")
@Expose
private Integer logWarn;
@SerializedName("LogInfo")
@Expose
private Integer logInfo;

public HbaseHeapDataState() {
	
}

public HbaseHeapDataState(String name, String modelerType, String tagContext, String tagProcessName, String tagSessionId,
		String tagHostname, Double memNonHeapUsedM, Double memNonHeapCommittedM, Double memNonHeapMaxM,
		Double memHeapUsedM, Double memHeapCommittedM, Double memHeapMaxM, Double memMaxM, Integer gcCount,
		Integer gcTimeMillis, Integer threadsNew, Integer threadsRunnable, Integer threadsBlocked,
		Integer threadsWaiting, Integer threadsTimedWaiting, Integer threadsTerminated, Integer logFatal,
		Integer logError, Integer logWarn, Integer logInfo) {
	super();
	this.name = name;
	this.modelerType = modelerType;
	this.tagContext = tagContext;
	this.tagProcessName = tagProcessName;
	this.tagSessionId = tagSessionId;
	this.tagHostname = tagHostname;
	this.memNonHeapUsedM = memNonHeapUsedM;
	this.memNonHeapCommittedM = memNonHeapCommittedM;
	this.memNonHeapMaxM = memNonHeapMaxM;
	this.memHeapUsedM = memHeapUsedM;
	this.memHeapCommittedM = memHeapCommittedM;
	this.memHeapMaxM = memHeapMaxM;
	this.memMaxM = memMaxM;
	this.gcCount = gcCount;
	this.gcTimeMillis = gcTimeMillis;
	this.threadsNew = threadsNew;
	this.threadsRunnable = threadsRunnable;
	this.threadsBlocked = threadsBlocked;
	this.threadsWaiting = threadsWaiting;
	this.threadsTimedWaiting = threadsTimedWaiting;
	this.threadsTerminated = threadsTerminated;
	this.logFatal = logFatal;
	this.logError = logError;
	this.logWarn = logWarn;
	this.logInfo = logInfo;
}



public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getModelerType() {
return modelerType;
}

public void setModelerType(String modelerType) {
this.modelerType = modelerType;
}

public String getTagContext() {
return tagContext;
}

public void setTagContext(String tagContext) {
this.tagContext = tagContext;
}

public String getTagProcessName() {
return tagProcessName;
}

public void setTagProcessName(String tagProcessName) {
this.tagProcessName = tagProcessName;
}

public String getTagSessionId() {
return tagSessionId;
}

public void setTagSessionId(String tagSessionId) {
this.tagSessionId = tagSessionId;
}

public String getTagHostname() {
return tagHostname;
}

public void setTagHostname(String tagHostname) {
this.tagHostname = tagHostname;
}

public Double getMemNonHeapUsedM() {
return memNonHeapUsedM;
}

public void setMemNonHeapUsedM(Double memNonHeapUsedM) {
this.memNonHeapUsedM = memNonHeapUsedM;
}

public Double getMemNonHeapCommittedM() {
return memNonHeapCommittedM;
}

public void setMemNonHeapCommittedM(Double memNonHeapCommittedM) {
this.memNonHeapCommittedM = memNonHeapCommittedM;
}

public Double getMemNonHeapMaxM() {
return memNonHeapMaxM;
}

public void setMemNonHeapMaxM(Double memNonHeapMaxM) {
this.memNonHeapMaxM = memNonHeapMaxM;
}

public Double getMemHeapUsedM() {
return memHeapUsedM;
}

public void setMemHeapUsedM(Double memHeapUsedM) {
this.memHeapUsedM = memHeapUsedM;
}

public Double getMemHeapCommittedM() {
return memHeapCommittedM;
}

public void setMemHeapCommittedM(Double memHeapCommittedM) {
this.memHeapCommittedM = memHeapCommittedM;
}

public Double getMemHeapMaxM() {
return memHeapMaxM;
}

public void setMemHeapMaxM(Double memHeapMaxM) {
this.memHeapMaxM = memHeapMaxM;
}

public Double getMemMaxM() {
return memMaxM;
}

public void setMemMaxM(Double memMaxM) {
this.memMaxM = memMaxM;
}

public Integer getGcCount() {
return gcCount;
}

public void setGcCount(Integer gcCount) {
this.gcCount = gcCount;
}

public Integer getGcTimeMillis() {
return gcTimeMillis;
}

public void setGcTimeMillis(Integer gcTimeMillis) {
this.gcTimeMillis = gcTimeMillis;
}

public Integer getThreadsNew() {
return threadsNew;
}

public void setThreadsNew(Integer threadsNew) {
this.threadsNew = threadsNew;
}

public Integer getThreadsRunnable() {
return threadsRunnable;
}

public void setThreadsRunnable(Integer threadsRunnable) {
this.threadsRunnable = threadsRunnable;
}

public Integer getThreadsBlocked() {
return threadsBlocked;
}

public void setThreadsBlocked(Integer threadsBlocked) {
this.threadsBlocked = threadsBlocked;
}

public Integer getThreadsWaiting() {
return threadsWaiting;
}

public void setThreadsWaiting(Integer threadsWaiting) {
this.threadsWaiting = threadsWaiting;
}

public Integer getThreadsTimedWaiting() {
return threadsTimedWaiting;
}

public void setThreadsTimedWaiting(Integer threadsTimedWaiting) {
this.threadsTimedWaiting = threadsTimedWaiting;
}

public Integer getThreadsTerminated() {
return threadsTerminated;
}

public void setThreadsTerminated(Integer threadsTerminated) {
this.threadsTerminated = threadsTerminated;
}

public Integer getLogFatal() {
return logFatal;
}

public void setLogFatal(Integer logFatal) {
this.logFatal = logFatal;
}

public Integer getLogError() {
return logError;
}

public void setLogError(Integer logError) {
this.logError = logError;
}

public Integer getLogWarn() {
return logWarn;
}

public void setLogWarn(Integer logWarn) {
this.logWarn = logWarn;
}

public Integer getLogInfo() {
return logInfo;
}

public void setLogInfo(Integer logInfo) {
this.logInfo = logInfo;
}

}