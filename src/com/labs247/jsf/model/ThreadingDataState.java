package com.labs247.jsf.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ThreadingDataState {

@SerializedName("name")
@Expose
private String name;
@SerializedName("modelerType")
@Expose
private String modelerType;
@SerializedName("ThreadAllocatedMemorySupported")
@Expose
private Boolean threadAllocatedMemorySupported;
@SerializedName("ThreadAllocatedMemoryEnabled")
@Expose
private Boolean threadAllocatedMemoryEnabled;
@SerializedName("ThreadContentionMonitoringSupported")
@Expose
private Boolean threadContentionMonitoringSupported;
@SerializedName("CurrentThreadCpuTimeSupported")
@Expose
private Boolean currentThreadCpuTimeSupported;
@SerializedName("ObjectMonitorUsageSupported")
@Expose
private Boolean objectMonitorUsageSupported;
@SerializedName("SynchronizerUsageSupported")
@Expose
private Boolean synchronizerUsageSupported;
@SerializedName("ThreadCpuTimeEnabled")
@Expose
private Boolean threadCpuTimeEnabled;
@SerializedName("PeakThreadCount")
@Expose
private Integer peakThreadCount;
@SerializedName("DaemonThreadCount")
@Expose
private Integer daemonThreadCount;
@SerializedName("ThreadCount")
@Expose
private Integer threadCount;
@SerializedName("TotalStartedThreadCount")
@Expose
private Integer totalStartedThreadCount;
@SerializedName("ThreadCpuTimeSupported")
@Expose
private Boolean threadCpuTimeSupported;
@SerializedName("CurrentThreadCpuTime")
@Expose
private Double currentThreadCpuTime;
@SerializedName("CurrentThreadUserTime")
@Expose
private Double currentThreadUserTime;
@SerializedName("ThreadContentionMonitoringEnabled")
@Expose
private Boolean threadContentionMonitoringEnabled;
@SerializedName("AllThreadIds")
@Expose
private List<Integer> allThreadIds = null;
@SerializedName("ObjectName")
@Expose
private String objectName;

/**
* No args constructor for use in serialization
* 
*/
public ThreadingDataState() {
}

/**
* 
* @param currentThreadCpuTimeSupported
* @param threadCpuTimeSupported
* @param objectName
* @param threadContentionMonitoringEnabled
* @param threadAllocatedMemorySupported
* @param threadCpuTimeEnabled
* @param objectMonitorUsageSupported
* @param modelerType
* @param peakThreadCount
* @param threadAllocatedMemoryEnabled
* @param allThreadIds
* @param name
* @param threadCount
* @param totalStartedThreadCount
* @param synchronizerUsageSupported
* @param currentThreadCpuTime
* @param currentThreadUserTime
* @param threadContentionMonitoringSupported
* @param daemonThreadCount
*/
public ThreadingDataState(String name, String modelerType, Boolean threadAllocatedMemorySupported, Boolean threadAllocatedMemoryEnabled, Boolean threadContentionMonitoringSupported, Boolean currentThreadCpuTimeSupported, Boolean objectMonitorUsageSupported, Boolean synchronizerUsageSupported, Boolean threadCpuTimeEnabled, Integer peakThreadCount, Integer daemonThreadCount, Integer threadCount, Integer totalStartedThreadCount, Boolean threadCpuTimeSupported, Double currentThreadCpuTime, Double currentThreadUserTime, Boolean threadContentionMonitoringEnabled, List<Integer> allThreadIds, String objectName) {
super();
this.name = name;
this.modelerType = modelerType;
this.threadAllocatedMemorySupported = threadAllocatedMemorySupported;
this.threadAllocatedMemoryEnabled = threadAllocatedMemoryEnabled;
this.threadContentionMonitoringSupported = threadContentionMonitoringSupported;
this.currentThreadCpuTimeSupported = currentThreadCpuTimeSupported;
this.objectMonitorUsageSupported = objectMonitorUsageSupported;
this.synchronizerUsageSupported = synchronizerUsageSupported;
this.threadCpuTimeEnabled = threadCpuTimeEnabled;
this.peakThreadCount = peakThreadCount;
this.daemonThreadCount = daemonThreadCount;
this.threadCount = threadCount;
this.totalStartedThreadCount = totalStartedThreadCount;
this.threadCpuTimeSupported = threadCpuTimeSupported;
this.currentThreadCpuTime = currentThreadCpuTime;
this.currentThreadUserTime = currentThreadUserTime;
this.threadContentionMonitoringEnabled = threadContentionMonitoringEnabled;
this.allThreadIds = allThreadIds;
this.objectName = objectName;
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

public Boolean getThreadAllocatedMemorySupported() {
return threadAllocatedMemorySupported;
}

public void setThreadAllocatedMemorySupported(Boolean threadAllocatedMemorySupported) {
this.threadAllocatedMemorySupported = threadAllocatedMemorySupported;
}

public Boolean getThreadAllocatedMemoryEnabled() {
return threadAllocatedMemoryEnabled;
}

public void setThreadAllocatedMemoryEnabled(Boolean threadAllocatedMemoryEnabled) {
this.threadAllocatedMemoryEnabled = threadAllocatedMemoryEnabled;
}

public Boolean getThreadContentionMonitoringSupported() {
return threadContentionMonitoringSupported;
}

public void setThreadContentionMonitoringSupported(Boolean threadContentionMonitoringSupported) {
this.threadContentionMonitoringSupported = threadContentionMonitoringSupported;
}

public Boolean getCurrentThreadCpuTimeSupported() {
return currentThreadCpuTimeSupported;
}

public void setCurrentThreadCpuTimeSupported(Boolean currentThreadCpuTimeSupported) {
this.currentThreadCpuTimeSupported = currentThreadCpuTimeSupported;
}

public Boolean getObjectMonitorUsageSupported() {
return objectMonitorUsageSupported;
}

public void setObjectMonitorUsageSupported(Boolean objectMonitorUsageSupported) {
this.objectMonitorUsageSupported = objectMonitorUsageSupported;
}

public Boolean getSynchronizerUsageSupported() {
return synchronizerUsageSupported;
}

public void setSynchronizerUsageSupported(Boolean synchronizerUsageSupported) {
this.synchronizerUsageSupported = synchronizerUsageSupported;
}

public Boolean getThreadCpuTimeEnabled() {
return threadCpuTimeEnabled;
}

public void setThreadCpuTimeEnabled(Boolean threadCpuTimeEnabled) {
this.threadCpuTimeEnabled = threadCpuTimeEnabled;
}

public Integer getPeakThreadCount() {
return peakThreadCount;
}

public void setPeakThreadCount(Integer peakThreadCount) {
this.peakThreadCount = peakThreadCount;
}

public Integer getDaemonThreadCount() {
return daemonThreadCount;
}

public void setDaemonThreadCount(Integer daemonThreadCount) {
this.daemonThreadCount = daemonThreadCount;
}

public Integer getThreadCount() {
return threadCount;
}

public void setThreadCount(Integer threadCount) {
this.threadCount = threadCount;
}

public Integer getTotalStartedThreadCount() {
return totalStartedThreadCount;
}

public void setTotalStartedThreadCount(Integer totalStartedThreadCount) {
this.totalStartedThreadCount = totalStartedThreadCount;
}

public Boolean getThreadCpuTimeSupported() {
return threadCpuTimeSupported;
}

public void setThreadCpuTimeSupported(Boolean threadCpuTimeSupported) {
this.threadCpuTimeSupported = threadCpuTimeSupported;
}

public Double getCurrentThreadCpuTime() {
return currentThreadCpuTime;
}

public void setCurrentThreadCpuTime(Double currentThreadCpuTime) {
this.currentThreadCpuTime = currentThreadCpuTime;
}

public Double getCurrentThreadUserTime() {
return currentThreadUserTime;
}

public void setCurrentThreadUserTime(Double currentThreadUserTime) {
this.currentThreadUserTime = currentThreadUserTime;
}

public Boolean getThreadContentionMonitoringEnabled() {
return threadContentionMonitoringEnabled;
}

public void setThreadContentionMonitoringEnabled(Boolean threadContentionMonitoringEnabled) {
this.threadContentionMonitoringEnabled = threadContentionMonitoringEnabled;
}

public List<Integer> getAllThreadIds() {
return allThreadIds;
}

public void setAllThreadIds(List<Integer> allThreadIds) {
this.allThreadIds = allThreadIds;
}

public String getObjectName() {
return objectName;
}

public void setObjectName(String objectName) {
this.objectName = objectName;
}

}