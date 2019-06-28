package com.labs247.jsf.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OSDatasetState {

@SerializedName("name")
@Expose
private String name;
@SerializedName("modelerType")
@Expose
private String modelerType;
@SerializedName("OpenFileDescriptorCount")
@Expose
private Integer openFileDescriptorCount;
@SerializedName("MaxFileDescriptorCount")
@Expose
private Integer maxFileDescriptorCount;
@SerializedName("CommittedVirtualMemorySize")
@Expose
private Double committedVirtualMemorySize;
@SerializedName("TotalSwapSpaceSize")
@Expose
private Double totalSwapSpaceSize;
@SerializedName("FreeSwapSpaceSize")
@Expose
private Double freeSwapSpaceSize;
@SerializedName("ProcessCpuTime")
@Expose
private Double processCpuTime;
@SerializedName("FreePhysicalMemorySize")
@Expose
private Double freePhysicalMemorySize;
@SerializedName("TotalPhysicalMemorySize")
@Expose
private Double totalPhysicalMemorySize;
@SerializedName("SystemCpuLoad")
@Expose
private Double systemCpuLoad;
@SerializedName("ProcessCpuLoad")
@Expose
private Double processCpuLoad;
@SerializedName("AvailableProcessors")
@Expose
private Integer availableProcessors;
@SerializedName("Arch")
@Expose
private String arch;
@SerializedName("Version")
@Expose
private String version;
@SerializedName("SystemLoadAverage")
@Expose
private Double systemLoadAverage;
@SerializedName("Name")
@Expose
private String osName;
@SerializedName("ObjectName")
@Expose
private String objectName;

/**
* No args constructor for use in serialization
*
*/
public OSDatasetState() {
}

/**
*
* @param freeSwapSpaceSize
* @param arch
* @param objectName
* @param systemLoadAverage
* @param systemCpuLoad
* @param modelerType
* @param committedVirtualMemorySize
* @param version
* @param freePhysicalMemorySize
* @param availableProcessors
* @param name
* @param openFileDescriptorCount
* @param maxFileDescriptorCount
* @param totalSwapSpaceSize
* @param processCpuTime
* @param processCpuLoad
* @param totalPhysicalMemorySize
*/
public OSDatasetState(String name, String modelerType, Integer openFileDescriptorCount, Integer maxFileDescriptorCount, Double committedVirtualMemorySize, Double totalSwapSpaceSize, Double freeSwapSpaceSize, Double processCpuTime, Double freePhysicalMemorySize, Double totalPhysicalMemorySize, Double systemCpuLoad, Double processCpuLoad, Integer availableProcessors, String arch, String version, Double systemLoadAverage, String osName, String objectName) {
super();
this.name = name;
this.modelerType = modelerType;
this.openFileDescriptorCount = openFileDescriptorCount;
this.maxFileDescriptorCount = maxFileDescriptorCount;
this.committedVirtualMemorySize = committedVirtualMemorySize;
this.totalSwapSpaceSize = totalSwapSpaceSize;
this.freeSwapSpaceSize = freeSwapSpaceSize;
this.processCpuTime = processCpuTime;
this.freePhysicalMemorySize = freePhysicalMemorySize;
this.totalPhysicalMemorySize = totalPhysicalMemorySize;
this.systemCpuLoad = systemCpuLoad;
this.processCpuLoad = processCpuLoad;
this.availableProcessors = availableProcessors;
this.arch = arch;
this.version = version;
this.systemLoadAverage = systemLoadAverage;
this.osName = osName;
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

public Integer getOpenFileDescriptorCount() {
return openFileDescriptorCount;
}

public void setOpenFileDescriptorCount(Integer openFileDescriptorCount) {
this.openFileDescriptorCount = openFileDescriptorCount;
}

public Integer getMaxFileDescriptorCount() {
return maxFileDescriptorCount;
}

public void setMaxFileDescriptorCount(Integer maxFileDescriptorCount) {
this.maxFileDescriptorCount = maxFileDescriptorCount;
}

public Double getCommittedVirtualMemorySize() {
return committedVirtualMemorySize;
}

public void setCommittedVirtualMemorySize(Double committedVirtualMemorySize) {
this.committedVirtualMemorySize = committedVirtualMemorySize;
}

public Double getTotalSwapSpaceSize() {
return totalSwapSpaceSize;
}

public void setTotalSwapSpaceSize(Double totalSwapSpaceSize) {
this.totalSwapSpaceSize = totalSwapSpaceSize;
}

public Double getFreeSwapSpaceSize() {
return freeSwapSpaceSize;
}

public void setFreeSwapSpaceSize(Double freeSwapSpaceSize) {
this.freeSwapSpaceSize = freeSwapSpaceSize;
}

public Double getProcessCpuTime() {
return processCpuTime;
}

public void setProcessCpuTime(Double processCpuTime) {
this.processCpuTime = processCpuTime;
}

public Double getFreePhysicalMemorySize() {
return freePhysicalMemorySize;
}

public void setFreePhysicalMemorySize(Double freePhysicalMemorySize) {
this.freePhysicalMemorySize = freePhysicalMemorySize;
}

public Double getTotalPhysicalMemorySize() {
return totalPhysicalMemorySize;
}

public void setTotalPhysicalMemorySize(Double totalPhysicalMemorySize) {
this.totalPhysicalMemorySize = totalPhysicalMemorySize;
}

public Double getSystemCpuLoad() {
return systemCpuLoad;
}

public void setSystemCpuLoad(Double systemCpuLoad) {
this.systemCpuLoad = systemCpuLoad;
}

public Double getProcessCpuLoad() {
return processCpuLoad;
}

public void setProcessCpuLoad(Double processCpuLoad) {
this.processCpuLoad = processCpuLoad;
}

public Integer getAvailableProcessors() {
return availableProcessors;
}

public void setAvailableProcessors(Integer availableProcessors) {
this.availableProcessors = availableProcessors;
}

public String getArch() {
return arch;
}

public void setArch(String arch) {
this.arch = arch;
}

public String getVersion() {
return version;
}

public void setVersion(String version) {
this.version = version;
}

public Double getSystemLoadAverage() {
return systemLoadAverage;
}

public void setSystemLoadAverage(Double systemLoadAverage) {
this.systemLoadAverage = systemLoadAverage;
}

public String getOsName() {
	return osName;
}

public void setOsName(String osName) {
	this.osName = osName;
}

public String getObjectName() {
return objectName;
}

public void setObjectName(String objectName) {
this.objectName = objectName;
}

}

