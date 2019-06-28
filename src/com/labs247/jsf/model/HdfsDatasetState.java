package com.labs247.jsf.model;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HdfsDatasetState {

@SerializedName("name")
@Expose
private String name;
@SerializedName("modelerType")
@Expose
private String modelerType;
@SerializedName("tag.Context")
@Expose
private String tagContext;
@SerializedName("tag.StorageInfo")
@Expose
private String tagStorageInfo;
@SerializedName("tag.Hostname")
@Expose
private String tagHostname;
@SerializedName("Capacity")
@Expose
private Double capacity;
@SerializedName("DfsUsed")
@Expose
private Double dfsUsed;
@SerializedName("Remaining")
@Expose
private Double remaining;
@SerializedName("ServerTime")
@Expose
private Date serverTime;
@SerializedName("NumFailedVolumes")
@Expose
private Integer numFailedVolumes;
@SerializedName("LastVolumeFailureDate")
@Expose
private Integer lastVolumeFailureDate;
@SerializedName("EstimatedCapacityLostTotal")
@Expose
private Integer estimatedCapacityLostTotal;
@SerializedName("CacheUsed")
@Expose
private Integer cacheUsed;
@SerializedName("CacheCapacity")
@Expose
private Integer cacheCapacity;
@SerializedName("NumBlocksCached")
@Expose
private Integer numBlocksCached;
@SerializedName("NumBlocksFailedToCache")
@Expose
private Integer numBlocksFailedToCache;
@SerializedName("NumBlocksFailedToUnCache")
@Expose
private Integer numBlocksFailedToUnCache;


/**
* No args constructor for use in serialization
* 
*/
public HdfsDatasetState() {
}

/**
* 
* @param numBlocksCached
* @param numBlocksFailedToCache
* @param cacheUsed
* @param cacheCapacity
* @param numBlocksFailedToUnCache
* @param tagContext
* @param lastVolumeFailureDate
* @param modelerType
* @param numFailedVolumes
* @param tagStorageInfo
* @param dfsUsed
* @param tagHostname
* @param remaining
* @param serverTime
* @param name
* @param capacity
* @param estimatedCapacityLostTotal
*/
public HdfsDatasetState(String name, String modelerType, String tagContext, String tagStorageInfo, String tagHostname, Double capacity, Double dfsUsed, Double remaining, Date serverTime,Integer numFailedVolumes, Integer lastVolumeFailureDate, Integer estimatedCapacityLostTotal, Integer cacheUsed, Integer cacheCapacity, Integer numBlocksCached, Integer numBlocksFailedToCache, Integer numBlocksFailedToUnCache) {
super();
this.name = name;
this.modelerType = modelerType;
this.tagContext = tagContext;
this.tagStorageInfo = tagStorageInfo;
this.tagHostname = tagHostname;
this.capacity = capacity;
this.dfsUsed = dfsUsed;
this.remaining = remaining;
this.serverTime = serverTime;
this.numFailedVolumes = numFailedVolumes;
this.lastVolumeFailureDate = lastVolumeFailureDate;
this.estimatedCapacityLostTotal = estimatedCapacityLostTotal;
this.cacheUsed = cacheUsed;
this.cacheCapacity = cacheCapacity;
this.numBlocksCached = numBlocksCached;
this.numBlocksFailedToCache = numBlocksFailedToCache;
this.numBlocksFailedToUnCache = numBlocksFailedToUnCache;
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

public String getTagStorageInfo() {
return tagStorageInfo;
}

public void setTagStorageInfo(String tagStorageInfo) {
this.tagStorageInfo = tagStorageInfo;
}

public String getTagHostname() {
return tagHostname;
}

public void setTagHostname(String tagHostname) {
this.tagHostname = tagHostname;
}

public Double getCapacity() {
return capacity;
}

public void setCapacity(Double capacity) {
this.capacity = capacity;
}

public Double getDfsUsed() {
return dfsUsed;
}

public void setDfsUsed(Double dfsUsed) {
this.dfsUsed = dfsUsed;
}

public Double getRemaining() {
return remaining;
}

public void setRemaining(Double remaining) {
this.remaining = remaining;
}

public Date getServerTime() {
return serverTime;
}

public void setServerTime(Date _serverTime) {
this.serverTime = _serverTime;
}

public Integer getNumFailedVolumes() {
return numFailedVolumes;
}

public void setNumFailedVolumes(Integer numFailedVolumes) {
this.numFailedVolumes = numFailedVolumes;
}

public Integer getLastVolumeFailureDate() {
return lastVolumeFailureDate;
}

public void setLastVolumeFailureDate(Integer lastVolumeFailureDate) {
this.lastVolumeFailureDate = lastVolumeFailureDate;
}

public Integer getEstimatedCapacityLostTotal() {
return estimatedCapacityLostTotal;
}

public void setEstimatedCapacityLostTotal(Integer estimatedCapacityLostTotal) {
this.estimatedCapacityLostTotal = estimatedCapacityLostTotal;
}

public Integer getCacheUsed() {
return cacheUsed;
}

public void setCacheUsed(Integer cacheUsed) {
this.cacheUsed = cacheUsed;
}

public Integer getCacheCapacity() {
return cacheCapacity;
}

public void setCacheCapacity(Integer cacheCapacity) {
this.cacheCapacity = cacheCapacity;
}

public Integer getNumBlocksCached() {
return numBlocksCached;
}

public void setNumBlocksCached(Integer numBlocksCached) {
this.numBlocksCached = numBlocksCached;
}

public Integer getNumBlocksFailedToCache() {
return numBlocksFailedToCache;
}

public void setNumBlocksFailedToCache(Integer numBlocksFailedToCache) {
this.numBlocksFailedToCache = numBlocksFailedToCache;
}

public Integer getNumBlocksFailedToUnCache() {
return numBlocksFailedToUnCache;
}

public void setNumBlocksFailedToUnCache(Integer numBlocksFailedToUnCache) {
this.numBlocksFailedToUnCache = numBlocksFailedToUnCache;
}

}