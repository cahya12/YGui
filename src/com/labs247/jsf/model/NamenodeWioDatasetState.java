package com.labs247.jsf.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NamenodeWioDatasetState {

@SerializedName("name")
@Expose
private String name;
@SerializedName("modelerType")
@Expose
private String modelerType;
@SerializedName("tag.Context")
@Expose
private String tagContext;
@SerializedName("tag.Hostname")
@Expose
private String tagHostname;
@SerializedName("TotalMetadataOperations")
@Expose
private Integer totalMetadataOperations;
@SerializedName("MetadataOperationRateNumOps")
@Expose
private Integer metadataOperationRateNumOps;
@SerializedName("MetadataOperationRateAvgTime")
@Expose
private Double metadataOperationRateAvgTime;
@SerializedName("TotalDataFileIos")
@Expose
private Integer totalDataFileIos;
@SerializedName("DataFileIoRateNumOps")
@Expose
private Integer dataFileIoRateNumOps;
@SerializedName("DataFileIoRateAvgTime")
@Expose
private Double dataFileIoRateAvgTime;
@SerializedName("FlushIoRateNumOps")
@Expose
private Integer flushIoRateNumOps;
@SerializedName("FlushIoRateAvgTime")
@Expose
private Double flushIoRateAvgTime;
@SerializedName("SyncIoRateNumOps")
@Expose
private Integer syncIoRateNumOps;
@SerializedName("SyncIoRateAvgTime")
@Expose
private Double syncIoRateAvgTime;
@SerializedName("ReadIoRateNumOps")
@Expose
private Integer readIoRateNumOps;
@SerializedName("ReadIoRateAvgTime")
@Expose
private Double readIoRateAvgTime;
@SerializedName("WriteIoRateNumOps")
@Expose
private Integer writeIoRateNumOps;
@SerializedName("WriteIoRateAvgTime")
@Expose
private Double writeIoRateAvgTime;
@SerializedName("TotalFileIoErrors")
@Expose
private Integer totalFileIoErrors;
@SerializedName("FileIoErrorRateNumOps")
@Expose
private Integer fileIoErrorRateNumOps;
@SerializedName("FileIoErrorRateAvgTime")
@Expose
private Double fileIoErrorRateAvgTime;

/**
* No args constructor for use in serialization
* 
*/
public NamenodeWioDatasetState() {
}

/**
* 
* @param writeIoRateAvgTime
* @param metadataOperationRateAvgTime
* @param writeIoRateNumOps
* @param tagContext
* @param totalMetadataOperations
* @param totalDataFileIos
* @param modelerType
* @param totalFileIoErrors
* @param dataFileIoRateNumOps
* @param readIoRateNumOps
* @param dataFileIoRateAvgTime
* @param tagHostname
* @param fileIoErrorRateNumOps
* @param metadataOperationRateNumOps
* @param readIoRateAvgTime
* @param name
* @param flushIoRateNumOps
* @param flushIoRateAvgTime
* @param fileIoErrorRateAvgTime
* @param syncIoRateNumOps
* @param syncIoRateAvgTime
*/
public NamenodeWioDatasetState(String name, String modelerType, String tagContext, String tagHostname, Integer totalMetadataOperations, Integer metadataOperationRateNumOps, Double metadataOperationRateAvgTime, Integer totalDataFileIos, Integer dataFileIoRateNumOps, Double dataFileIoRateAvgTime, Integer flushIoRateNumOps, Double flushIoRateAvgTime, Integer syncIoRateNumOps, Double syncIoRateAvgTime, Integer readIoRateNumOps, Double readIoRateAvgTime, Integer writeIoRateNumOps, Double writeIoRateAvgTime, Integer totalFileIoErrors, Integer fileIoErrorRateNumOps, Double fileIoErrorRateAvgTime) {
super();
this.name = name;
this.modelerType = modelerType;
this.tagContext = tagContext;
this.tagHostname = tagHostname;
this.totalMetadataOperations = totalMetadataOperations;
this.metadataOperationRateNumOps = metadataOperationRateNumOps;
this.metadataOperationRateAvgTime = metadataOperationRateAvgTime;
this.totalDataFileIos = totalDataFileIos;
this.dataFileIoRateNumOps = dataFileIoRateNumOps;
this.dataFileIoRateAvgTime = dataFileIoRateAvgTime;
this.flushIoRateNumOps = flushIoRateNumOps;
this.flushIoRateAvgTime = flushIoRateAvgTime;
this.syncIoRateNumOps = syncIoRateNumOps;
this.syncIoRateAvgTime = syncIoRateAvgTime;
this.readIoRateNumOps = readIoRateNumOps;
this.readIoRateAvgTime = readIoRateAvgTime;
this.writeIoRateNumOps = writeIoRateNumOps;
this.writeIoRateAvgTime = writeIoRateAvgTime;
this.totalFileIoErrors = totalFileIoErrors;
this.fileIoErrorRateNumOps = fileIoErrorRateNumOps;
this.fileIoErrorRateAvgTime = fileIoErrorRateAvgTime;
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

public String getTagHostname() {
return tagHostname;
}

public void setTagHostname(String tagHostname) {
this.tagHostname = tagHostname;
}

public Integer getTotalMetadataOperations() {
return totalMetadataOperations;
}

public void setTotalMetadataOperations(Integer totalMetadataOperations) {
this.totalMetadataOperations = totalMetadataOperations;
}

public Integer getMetadataOperationRateNumOps() {
return metadataOperationRateNumOps;
}

public void setMetadataOperationRateNumOps(Integer metadataOperationRateNumOps) {
this.metadataOperationRateNumOps = metadataOperationRateNumOps;
}

public Double getMetadataOperationRateAvgTime() {
return metadataOperationRateAvgTime;
}

public void setMetadataOperationRateAvgTime(Double metadataOperationRateAvgTime) {
this.metadataOperationRateAvgTime = metadataOperationRateAvgTime;
}

public Integer getTotalDataFileIos() {
return totalDataFileIos;
}

public void setTotalDataFileIos(Integer totalDataFileIos) {
this.totalDataFileIos = totalDataFileIos;
}

public Integer getDataFileIoRateNumOps() {
return dataFileIoRateNumOps;
}

public void setDataFileIoRateNumOps(Integer dataFileIoRateNumOps) {
this.dataFileIoRateNumOps = dataFileIoRateNumOps;
}

public Double getDataFileIoRateAvgTime() {
return dataFileIoRateAvgTime;
}

public void setDataFileIoRateAvgTime(Double dataFileIoRateAvgTime) {
this.dataFileIoRateAvgTime = dataFileIoRateAvgTime;
}

public Integer getFlushIoRateNumOps() {
return flushIoRateNumOps;
}

public void setFlushIoRateNumOps(Integer flushIoRateNumOps) {
this.flushIoRateNumOps = flushIoRateNumOps;
}

public Double getFlushIoRateAvgTime() {
return flushIoRateAvgTime;
}

public void setFlushIoRateAvgTime(Double flushIoRateAvgTime) {
this.flushIoRateAvgTime = flushIoRateAvgTime;
}

public Integer getSyncIoRateNumOps() {
return syncIoRateNumOps;
}

public void setSyncIoRateNumOps(Integer syncIoRateNumOps) {
this.syncIoRateNumOps = syncIoRateNumOps;
}

public Double getSyncIoRateAvgTime() {
return syncIoRateAvgTime;
}

public void setSyncIoRateAvgTime(Double syncIoRateAvgTime) {
this.syncIoRateAvgTime = syncIoRateAvgTime;
}

public Integer getReadIoRateNumOps() {
return readIoRateNumOps;
}

public void setReadIoRateNumOps(Integer readIoRateNumOps) {
this.readIoRateNumOps = readIoRateNumOps;
}

public Double getReadIoRateAvgTime() {
return readIoRateAvgTime;
}

public void setReadIoRateAvgTime(Double readIoRateAvgTime) {
this.readIoRateAvgTime = readIoRateAvgTime;
}

public Integer getWriteIoRateNumOps() {
return writeIoRateNumOps;
}

public void setWriteIoRateNumOps(Integer writeIoRateNumOps) {
this.writeIoRateNumOps = writeIoRateNumOps;
}

public Double getWriteIoRateAvgTime() {
return writeIoRateAvgTime;
}

public void setWriteIoRateAvgTime(Double writeIoRateAvgTime) {
this.writeIoRateAvgTime = writeIoRateAvgTime;
}

public Integer getTotalFileIoErrors() {
return totalFileIoErrors;
}

public void setTotalFileIoErrors(Integer totalFileIoErrors) {
this.totalFileIoErrors = totalFileIoErrors;
}

public Integer getFileIoErrorRateNumOps() {
return fileIoErrorRateNumOps;
}

public void setFileIoErrorRateNumOps(Integer fileIoErrorRateNumOps) {
this.fileIoErrorRateNumOps = fileIoErrorRateNumOps;
}

public Double getFileIoErrorRateAvgTime() {
return fileIoErrorRateAvgTime;
}

public void setFileIoErrorRateAvgTime(Double fileIoErrorRateAvgTime) {
this.fileIoErrorRateAvgTime = fileIoErrorRateAvgTime;
}

}