
package com.labs247.telyu.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Disk {

    @SerializedName("disk_free")
    @Expose
    private Double diskFree;
    @SerializedName("disk_free._avg")
    @Expose
    private Double diskFreeAvg;
    @SerializedName("disk_free._max")
    @Expose
    private Double diskFreeMax;
    @SerializedName("disk_free._min")
    @Expose
    private Double diskFreeMin;
    @SerializedName("disk_free._rate")
    @Expose
    private Integer diskFreeRate;
    @SerializedName("disk_free._sum")
    @Expose
    private Double diskFreeSum;
    @SerializedName("disk_total")
    @Expose
    private Double diskTotal;
    @SerializedName("disk_total._avg")
    @Expose
    private Double diskTotalAvg;
    @SerializedName("disk_total._max")
    @Expose
    private Double diskTotalMax;
    @SerializedName("disk_total._min")
    @Expose
    private Double diskTotalMin;
    @SerializedName("disk_total._rate")
    @Expose
    private Integer diskTotalRate;
    @SerializedName("disk_total._sum")
    @Expose
    private Double diskTotalSum;
    @SerializedName("read_bytes")
    @Expose
    private Double readBytes;
    @SerializedName("read_bytes._avg")
    @Expose
    private Double readBytesAvg;
    @SerializedName("read_bytes._max")
    @Expose
    private Double readBytesMax;
    @SerializedName("read_bytes._min")
    @Expose
    private Double readBytesMin;
    @SerializedName("read_bytes._rate")
    @Expose
    private Integer readBytesRate;
    @SerializedName("read_bytes._sum")
    @Expose
    private Double readBytesSum;
    @SerializedName("read_count")
    @Expose
    private Double readCount;
    @SerializedName("read_count._avg")
    @Expose
    private Double readCountAvg;
    @SerializedName("read_count._max")
    @Expose
    private Double readCountMax;
    @SerializedName("read_count._min")
    @Expose
    private Double readCountMin;
    @SerializedName("read_count._rate")
    @Expose
    private Integer readCountRate;
    @SerializedName("read_count._sum")
    @Expose
    private Double readCountSum;
    @SerializedName("read_time")
    @Expose
    private Double readTime;
    @SerializedName("read_time._avg")
    @Expose
    private Double readTimeAvg;
    @SerializedName("read_time._max")
    @Expose
    private Double readTimeMax;
    @SerializedName("read_time._min")
    @Expose
    private Double readTimeMin;
    @SerializedName("read_time._rate")
    @Expose
    private Integer readTimeRate;
    @SerializedName("read_time._sum")
    @Expose
    private Double readTimeSum;
    @SerializedName("write_bytes")
    @Expose
    private Double writeBytes;
    @SerializedName("write_bytes._avg")
    @Expose
    private Double writeBytesAvg;
    @SerializedName("write_bytes._max")
    @Expose
    private Double writeBytesMax;
    @SerializedName("write_bytes._min")
    @Expose
    private Double writeBytesMin;
    @SerializedName("write_bytes._rate")
    @Expose
    private Integer writeBytesRate;
    @SerializedName("write_bytes._sum")
    @Expose
    private Double writeBytesSum;
    @SerializedName("write_count")
    @Expose
    private Double writeCount;
    @SerializedName("write_count._avg")
    @Expose
    private Double writeCountAvg;
    @SerializedName("write_count._max")
    @Expose
    private Double writeCountMax;
    @SerializedName("write_count._min")
    @Expose
    private Double writeCountMin;
    @SerializedName("write_count._rate")
    @Expose
    private Integer writeCountRate;
    @SerializedName("write_count._sum")
    @Expose
    private Double writeCountSum;
    @SerializedName("write_time")
    @Expose
    private Double writeTime;
    @SerializedName("write_time._avg")
    @Expose
    private Double writeTimeAvg;
    @SerializedName("write_time._max")
    @Expose
    private Double writeTimeMax;
    @SerializedName("write_time._min")
    @Expose
    private Double writeTimeMin;
    @SerializedName("write_time._rate")
    @Expose
    private Integer writeTimeRate;
    @SerializedName("write_time._sum")
    @Expose
    private Double writeTimeSum;

    public Double getDiskFree() {
        return diskFree;
    }

    public void setDiskFree(Double diskFree) {
        this.diskFree = diskFree;
    }

    public Double getDiskFreeAvg() {
        return diskFreeAvg;
    }

    public void setDiskFreeAvg(Double diskFreeAvg) {
        this.diskFreeAvg = diskFreeAvg;
    }

    public Double getDiskFreeMax() {
        return diskFreeMax;
    }

    public void setDiskFreeMax(Double diskFreeMax) {
        this.diskFreeMax = diskFreeMax;
    }

    public Double getDiskFreeMin() {
        return diskFreeMin;
    }

    public void setDiskFreeMin(Double diskFreeMin) {
        this.diskFreeMin = diskFreeMin;
    }

    public Integer getDiskFreeRate() {
        return diskFreeRate;
    }

    public void setDiskFreeRate(Integer diskFreeRate) {
        this.diskFreeRate = diskFreeRate;
    }

    public Double getDiskFreeSum() {
        return diskFreeSum;
    }

    public void setDiskFreeSum(Double diskFreeSum) {
        this.diskFreeSum = diskFreeSum;
    }

    public Double getDiskTotal() {
        return diskTotal;
    }

    public void setDiskTotal(Double diskTotal) {
        this.diskTotal = diskTotal;
    }

    public Double getDiskTotalAvg() {
        return diskTotalAvg;
    }

    public void setDiskTotalAvg(Double diskTotalAvg) {
        this.diskTotalAvg = diskTotalAvg;
    }

    public Double getDiskTotalMax() {
        return diskTotalMax;
    }

    public void setDiskTotalMax(Double diskTotalMax) {
        this.diskTotalMax = diskTotalMax;
    }

    public Double getDiskTotalMin() {
        return diskTotalMin;
    }

    public void setDiskTotalMin(Double diskTotalMin) {
        this.diskTotalMin = diskTotalMin;
    }

    public Integer getDiskTotalRate() {
        return diskTotalRate;
    }

    public void setDiskTotalRate(Integer diskTotalRate) {
        this.diskTotalRate = diskTotalRate;
    }

    public Double getDiskTotalSum() {
        return diskTotalSum;
    }

    public void setDiskTotalSum(Double diskTotalSum) {
        this.diskTotalSum = diskTotalSum;
    }

    public Double getReadBytes() {
        return readBytes;
    }

    public void setReadBytes(Double readBytes) {
        this.readBytes = readBytes;
    }

    public Double getReadBytesAvg() {
        return readBytesAvg;
    }

    public void setReadBytesAvg(Double readBytesAvg) {
        this.readBytesAvg = readBytesAvg;
    }

    public Double getReadBytesMax() {
        return readBytesMax;
    }

    public void setReadBytesMax(Double readBytesMax) {
        this.readBytesMax = readBytesMax;
    }

    public Double getReadBytesMin() {
        return readBytesMin;
    }

    public void setReadBytesMin(Double readBytesMin) {
        this.readBytesMin = readBytesMin;
    }

    public Integer getReadBytesRate() {
        return readBytesRate;
    }

    public void setReadBytesRate(Integer readBytesRate) {
        this.readBytesRate = readBytesRate;
    }

    public Double getReadBytesSum() {
        return readBytesSum;
    }

    public void setReadBytesSum(Double readBytesSum) {
        this.readBytesSum = readBytesSum;
    }

    public Double getReadCount() {
        return readCount;
    }

    public void setReadCount(Double readCount) {
        this.readCount = readCount;
    }

    public Double getReadCountAvg() {
        return readCountAvg;
    }

    public void setReadCountAvg(Double readCountAvg) {
        this.readCountAvg = readCountAvg;
    }

    public Double getReadCountMax() {
        return readCountMax;
    }

    public void setReadCountMax(Double readCountMax) {
        this.readCountMax = readCountMax;
    }

    public Double getReadCountMin() {
        return readCountMin;
    }

    public void setReadCountMin(Double readCountMin) {
        this.readCountMin = readCountMin;
    }

    public Integer getReadCountRate() {
        return readCountRate;
    }

    public void setReadCountRate(Integer readCountRate) {
        this.readCountRate = readCountRate;
    }

    public Double getReadCountSum() {
        return readCountSum;
    }

    public void setReadCountSum(Double readCountSum) {
        this.readCountSum = readCountSum;
    }

    public Double getReadTime() {
        return readTime;
    }

    public void setReadTime(Double readTime) {
        this.readTime = readTime;
    }

    public Double getReadTimeAvg() {
        return readTimeAvg;
    }

    public void setReadTimeAvg(Double readTimeAvg) {
        this.readTimeAvg = readTimeAvg;
    }

    public Double getReadTimeMax() {
        return readTimeMax;
    }

    public void setReadTimeMax(Double readTimeMax) {
        this.readTimeMax = readTimeMax;
    }

    public Double getReadTimeMin() {
        return readTimeMin;
    }

    public void setReadTimeMin(Double readTimeMin) {
        this.readTimeMin = readTimeMin;
    }

    public Integer getReadTimeRate() {
        return readTimeRate;
    }

    public void setReadTimeRate(Integer readTimeRate) {
        this.readTimeRate = readTimeRate;
    }

    public Double getReadTimeSum() {
        return readTimeSum;
    }

    public void setReadTimeSum(Double readTimeSum) {
        this.readTimeSum = readTimeSum;
    }

    public Double getWriteBytes() {
        return writeBytes;
    }

    public void setWriteBytes(Double writeBytes) {
        this.writeBytes = writeBytes;
    }

    public Double getWriteBytesAvg() {
        return writeBytesAvg;
    }

    public void setWriteBytesAvg(Double writeBytesAvg) {
        this.writeBytesAvg = writeBytesAvg;
    }

    public Double getWriteBytesMax() {
        return writeBytesMax;
    }

    public void setWriteBytesMax(Double writeBytesMax) {
        this.writeBytesMax = writeBytesMax;
    }

    public Double getWriteBytesMin() {
        return writeBytesMin;
    }

    public void setWriteBytesMin(Double writeBytesMin) {
        this.writeBytesMin = writeBytesMin;
    }

    public Integer getWriteBytesRate() {
        return writeBytesRate;
    }

    public void setWriteBytesRate(Integer writeBytesRate) {
        this.writeBytesRate = writeBytesRate;
    }

    public Double getWriteBytesSum() {
        return writeBytesSum;
    }

    public void setWriteBytesSum(Double writeBytesSum) {
        this.writeBytesSum = writeBytesSum;
    }

    public Double getWriteCount() {
        return writeCount;
    }

    public void setWriteCount(Double writeCount) {
        this.writeCount = writeCount;
    }

    public Double getWriteCountAvg() {
        return writeCountAvg;
    }

    public void setWriteCountAvg(Double writeCountAvg) {
        this.writeCountAvg = writeCountAvg;
    }

    public Double getWriteCountMax() {
        return writeCountMax;
    }

    public void setWriteCountMax(Double writeCountMax) {
        this.writeCountMax = writeCountMax;
    }

    public Double getWriteCountMin() {
        return writeCountMin;
    }

    public void setWriteCountMin(Double writeCountMin) {
        this.writeCountMin = writeCountMin;
    }

    public Integer getWriteCountRate() {
        return writeCountRate;
    }

    public void setWriteCountRate(Integer writeCountRate) {
        this.writeCountRate = writeCountRate;
    }

    public Double getWriteCountSum() {
        return writeCountSum;
    }

    public void setWriteCountSum(Double writeCountSum) {
        this.writeCountSum = writeCountSum;
    }

    public Double getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Double writeTime) {
        this.writeTime = writeTime;
    }

    public Double getWriteTimeAvg() {
        return writeTimeAvg;
    }

    public void setWriteTimeAvg(Double writeTimeAvg) {
        this.writeTimeAvg = writeTimeAvg;
    }

    public Double getWriteTimeMax() {
        return writeTimeMax;
    }

    public void setWriteTimeMax(Double writeTimeMax) {
        this.writeTimeMax = writeTimeMax;
    }

    public Double getWriteTimeMin() {
        return writeTimeMin;
    }

    public void setWriteTimeMin(Double writeTimeMin) {
        this.writeTimeMin = writeTimeMin;
    }

    public Integer getWriteTimeRate() {
        return writeTimeRate;
    }

    public void setWriteTimeRate(Integer writeTimeRate) {
        this.writeTimeRate = writeTimeRate;
    }

    public Double getWriteTimeSum() {
        return writeTimeSum;
    }

    public void setWriteTimeSum(Double writeTimeSum) {
        this.writeTimeSum = writeTimeSum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Disk.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("diskFree");
        sb.append('=');
        sb.append(((this.diskFree == null)?"<null>":this.diskFree));
        sb.append(',');
        sb.append("diskFreeAvg");
        sb.append('=');
        sb.append(((this.diskFreeAvg == null)?"<null>":this.diskFreeAvg));
        sb.append(',');
        sb.append("diskFreeMax");
        sb.append('=');
        sb.append(((this.diskFreeMax == null)?"<null>":this.diskFreeMax));
        sb.append(',');
        sb.append("diskFreeMin");
        sb.append('=');
        sb.append(((this.diskFreeMin == null)?"<null>":this.diskFreeMin));
        sb.append(',');
        sb.append("diskFreeRate");
        sb.append('=');
        sb.append(((this.diskFreeRate == null)?"<null>":this.diskFreeRate));
        sb.append(',');
        sb.append("diskFreeSum");
        sb.append('=');
        sb.append(((this.diskFreeSum == null)?"<null>":this.diskFreeSum));
        sb.append(',');
        sb.append("diskTotal");
        sb.append('=');
        sb.append(((this.diskTotal == null)?"<null>":this.diskTotal));
        sb.append(',');
        sb.append("diskTotalAvg");
        sb.append('=');
        sb.append(((this.diskTotalAvg == null)?"<null>":this.diskTotalAvg));
        sb.append(',');
        sb.append("diskTotalMax");
        sb.append('=');
        sb.append(((this.diskTotalMax == null)?"<null>":this.diskTotalMax));
        sb.append(',');
        sb.append("diskTotalMin");
        sb.append('=');
        sb.append(((this.diskTotalMin == null)?"<null>":this.diskTotalMin));
        sb.append(',');
        sb.append("diskTotalRate");
        sb.append('=');
        sb.append(((this.diskTotalRate == null)?"<null>":this.diskTotalRate));
        sb.append(',');
        sb.append("diskTotalSum");
        sb.append('=');
        sb.append(((this.diskTotalSum == null)?"<null>":this.diskTotalSum));
        sb.append(',');
        sb.append("readBytes");
        sb.append('=');
        sb.append(((this.readBytes == null)?"<null>":this.readBytes));
        sb.append(',');
        sb.append("readBytesAvg");
        sb.append('=');
        sb.append(((this.readBytesAvg == null)?"<null>":this.readBytesAvg));
        sb.append(',');
        sb.append("readBytesMax");
        sb.append('=');
        sb.append(((this.readBytesMax == null)?"<null>":this.readBytesMax));
        sb.append(',');
        sb.append("readBytesMin");
        sb.append('=');
        sb.append(((this.readBytesMin == null)?"<null>":this.readBytesMin));
        sb.append(',');
        sb.append("readBytesRate");
        sb.append('=');
        sb.append(((this.readBytesRate == null)?"<null>":this.readBytesRate));
        sb.append(',');
        sb.append("readBytesSum");
        sb.append('=');
        sb.append(((this.readBytesSum == null)?"<null>":this.readBytesSum));
        sb.append(',');
        sb.append("readCount");
        sb.append('=');
        sb.append(((this.readCount == null)?"<null>":this.readCount));
        sb.append(',');
        sb.append("readCountAvg");
        sb.append('=');
        sb.append(((this.readCountAvg == null)?"<null>":this.readCountAvg));
        sb.append(',');
        sb.append("readCountMax");
        sb.append('=');
        sb.append(((this.readCountMax == null)?"<null>":this.readCountMax));
        sb.append(',');
        sb.append("readCountMin");
        sb.append('=');
        sb.append(((this.readCountMin == null)?"<null>":this.readCountMin));
        sb.append(',');
        sb.append("readCountRate");
        sb.append('=');
        sb.append(((this.readCountRate == null)?"<null>":this.readCountRate));
        sb.append(',');
        sb.append("readCountSum");
        sb.append('=');
        sb.append(((this.readCountSum == null)?"<null>":this.readCountSum));
        sb.append(',');
        sb.append("readTime");
        sb.append('=');
        sb.append(((this.readTime == null)?"<null>":this.readTime));
        sb.append(',');
        sb.append("readTimeAvg");
        sb.append('=');
        sb.append(((this.readTimeAvg == null)?"<null>":this.readTimeAvg));
        sb.append(',');
        sb.append("readTimeMax");
        sb.append('=');
        sb.append(((this.readTimeMax == null)?"<null>":this.readTimeMax));
        sb.append(',');
        sb.append("readTimeMin");
        sb.append('=');
        sb.append(((this.readTimeMin == null)?"<null>":this.readTimeMin));
        sb.append(',');
        sb.append("readTimeRate");
        sb.append('=');
        sb.append(((this.readTimeRate == null)?"<null>":this.readTimeRate));
        sb.append(',');
        sb.append("readTimeSum");
        sb.append('=');
        sb.append(((this.readTimeSum == null)?"<null>":this.readTimeSum));
        sb.append(',');
        sb.append("writeBytes");
        sb.append('=');
        sb.append(((this.writeBytes == null)?"<null>":this.writeBytes));
        sb.append(',');
        sb.append("writeBytesAvg");
        sb.append('=');
        sb.append(((this.writeBytesAvg == null)?"<null>":this.writeBytesAvg));
        sb.append(',');
        sb.append("writeBytesMax");
        sb.append('=');
        sb.append(((this.writeBytesMax == null)?"<null>":this.writeBytesMax));
        sb.append(',');
        sb.append("writeBytesMin");
        sb.append('=');
        sb.append(((this.writeBytesMin == null)?"<null>":this.writeBytesMin));
        sb.append(',');
        sb.append("writeBytesRate");
        sb.append('=');
        sb.append(((this.writeBytesRate == null)?"<null>":this.writeBytesRate));
        sb.append(',');
        sb.append("writeBytesSum");
        sb.append('=');
        sb.append(((this.writeBytesSum == null)?"<null>":this.writeBytesSum));
        sb.append(',');
        sb.append("writeCount");
        sb.append('=');
        sb.append(((this.writeCount == null)?"<null>":this.writeCount));
        sb.append(',');
        sb.append("writeCountAvg");
        sb.append('=');
        sb.append(((this.writeCountAvg == null)?"<null>":this.writeCountAvg));
        sb.append(',');
        sb.append("writeCountMax");
        sb.append('=');
        sb.append(((this.writeCountMax == null)?"<null>":this.writeCountMax));
        sb.append(',');
        sb.append("writeCountMin");
        sb.append('=');
        sb.append(((this.writeCountMin == null)?"<null>":this.writeCountMin));
        sb.append(',');
        sb.append("writeCountRate");
        sb.append('=');
        sb.append(((this.writeCountRate == null)?"<null>":this.writeCountRate));
        sb.append(',');
        sb.append("writeCountSum");
        sb.append('=');
        sb.append(((this.writeCountSum == null)?"<null>":this.writeCountSum));
        sb.append(',');
        sb.append("writeTime");
        sb.append('=');
        sb.append(((this.writeTime == null)?"<null>":this.writeTime));
        sb.append(',');
        sb.append("writeTimeAvg");
        sb.append('=');
        sb.append(((this.writeTimeAvg == null)?"<null>":this.writeTimeAvg));
        sb.append(',');
        sb.append("writeTimeMax");
        sb.append('=');
        sb.append(((this.writeTimeMax == null)?"<null>":this.writeTimeMax));
        sb.append(',');
        sb.append("writeTimeMin");
        sb.append('=');
        sb.append(((this.writeTimeMin == null)?"<null>":this.writeTimeMin));
        sb.append(',');
        sb.append("writeTimeRate");
        sb.append('=');
        sb.append(((this.writeTimeRate == null)?"<null>":this.writeTimeRate));
        sb.append(',');
        sb.append("writeTimeSum");
        sb.append('=');
        sb.append(((this.writeTimeSum == null)?"<null>":this.writeTimeSum));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.writeCountAvg == null)? 0 :this.writeCountAvg.hashCode()));
        result = ((result* 31)+((this.writeCountMin == null)? 0 :this.writeCountMin.hashCode()));
        result = ((result* 31)+((this.readCount == null)? 0 :this.readCount.hashCode()));
        result = ((result* 31)+((this.diskFree == null)? 0 :this.diskFree.hashCode()));
        result = ((result* 31)+((this.writeCountMax == null)? 0 :this.writeCountMax.hashCode()));
        result = ((result* 31)+((this.writeTimeSum == null)? 0 :this.writeTimeSum.hashCode()));
        result = ((result* 31)+((this.readCountMax == null)? 0 :this.readCountMax.hashCode()));
        result = ((result* 31)+((this.writeCountRate == null)? 0 :this.writeCountRate.hashCode()));
        result = ((result* 31)+((this.diskTotalRate == null)? 0 :this.diskTotalRate.hashCode()));
        result = ((result* 31)+((this.writeTimeAvg == null)? 0 :this.writeTimeAvg.hashCode()));
        result = ((result* 31)+((this.writeTimeMin == null)? 0 :this.writeTimeMin.hashCode()));
        result = ((result* 31)+((this.writeBytes == null)? 0 :this.writeBytes.hashCode()));
        result = ((result* 31)+((this.writeTimeMax == null)? 0 :this.writeTimeMax.hashCode()));
        result = ((result* 31)+((this.diskTotalMax == null)? 0 :this.diskTotalMax.hashCode()));
        result = ((result* 31)+((this.writeBytesAvg == null)? 0 :this.writeBytesAvg.hashCode()));
        result = ((result* 31)+((this.writeBytesMin == null)? 0 :this.writeBytesMin.hashCode()));
        result = ((result* 31)+((this.readTime == null)? 0 :this.readTime.hashCode()));
        result = ((result* 31)+((this.diskTotal == null)? 0 :this.diskTotal.hashCode()));
        result = ((result* 31)+((this.diskTotalAvg == null)? 0 :this.diskTotalAvg.hashCode()));
        result = ((result* 31)+((this.diskTotalMin == null)? 0 :this.diskTotalMin.hashCode()));
        result = ((result* 31)+((this.readCountRate == null)? 0 :this.readCountRate.hashCode()));
        result = ((result* 31)+((this.readTimeAvg == null)? 0 :this.readTimeAvg.hashCode()));
        result = ((result* 31)+((this.readTimeMin == null)? 0 :this.readTimeMin.hashCode()));
        result = ((result* 31)+((this.writeTimeRate == null)? 0 :this.writeTimeRate.hashCode()));
        result = ((result* 31)+((this.readBytesMax == null)? 0 :this.readBytesMax.hashCode()));
        result = ((result* 31)+((this.readTimeSum == null)? 0 :this.readTimeSum.hashCode()));
        result = ((result* 31)+((this.writeBytesMax == null)? 0 :this.writeBytesMax.hashCode()));
        result = ((result* 31)+((this.diskFreeRate == null)? 0 :this.diskFreeRate.hashCode()));
        result = ((result* 31)+((this.diskTotalSum == null)? 0 :this.diskTotalSum.hashCode()));
        result = ((result* 31)+((this.readCountSum == null)? 0 :this.readCountSum.hashCode()));
        result = ((result* 31)+((this.writeTime == null)? 0 :this.writeTime.hashCode()));
        result = ((result* 31)+((this.diskFreeAvg == null)? 0 :this.diskFreeAvg.hashCode()));
        result = ((result* 31)+((this.diskFreeMin == null)? 0 :this.diskFreeMin.hashCode()));
        result = ((result* 31)+((this.readBytesAvg == null)? 0 :this.readBytesAvg.hashCode()));
        result = ((result* 31)+((this.readBytesMin == null)? 0 :this.readBytesMin.hashCode()));
        result = ((result* 31)+((this.diskFreeSum == null)? 0 :this.diskFreeSum.hashCode()));
        result = ((result* 31)+((this.readCountAvg == null)? 0 :this.readCountAvg.hashCode()));
        result = ((result* 31)+((this.readCountMin == null)? 0 :this.readCountMin.hashCode()));
        result = ((result* 31)+((this.readBytesSum == null)? 0 :this.readBytesSum.hashCode()));
        result = ((result* 31)+((this.readTimeRate == null)? 0 :this.readTimeRate.hashCode()));
        result = ((result* 31)+((this.writeBytesRate == null)? 0 :this.writeBytesRate.hashCode()));
        result = ((result* 31)+((this.diskFreeMax == null)? 0 :this.diskFreeMax.hashCode()));
        result = ((result* 31)+((this.writeBytesSum == null)? 0 :this.writeBytesSum.hashCode()));
        result = ((result* 31)+((this.readBytesRate == null)? 0 :this.readBytesRate.hashCode()));
        result = ((result* 31)+((this.readBytes == null)? 0 :this.readBytes.hashCode()));
        result = ((result* 31)+((this.writeCount == null)? 0 :this.writeCount.hashCode()));
        result = ((result* 31)+((this.readTimeMax == null)? 0 :this.readTimeMax.hashCode()));
        result = ((result* 31)+((this.writeCountSum == null)? 0 :this.writeCountSum.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Disk) == false) {
            return false;
        }
        Disk rhs = ((Disk) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.writeCountAvg == rhs.writeCountAvg)||((this.writeCountAvg!= null)&&this.writeCountAvg.equals(rhs.writeCountAvg)))&&((this.writeCountMin == rhs.writeCountMin)||((this.writeCountMin!= null)&&this.writeCountMin.equals(rhs.writeCountMin))))&&((this.readCount == rhs.readCount)||((this.readCount!= null)&&this.readCount.equals(rhs.readCount))))&&((this.diskFree == rhs.diskFree)||((this.diskFree!= null)&&this.diskFree.equals(rhs.diskFree))))&&((this.writeCountMax == rhs.writeCountMax)||((this.writeCountMax!= null)&&this.writeCountMax.equals(rhs.writeCountMax))))&&((this.writeTimeSum == rhs.writeTimeSum)||((this.writeTimeSum!= null)&&this.writeTimeSum.equals(rhs.writeTimeSum))))&&((this.readCountMax == rhs.readCountMax)||((this.readCountMax!= null)&&this.readCountMax.equals(rhs.readCountMax))))&&((this.writeCountRate == rhs.writeCountRate)||((this.writeCountRate!= null)&&this.writeCountRate.equals(rhs.writeCountRate))))&&((this.diskTotalRate == rhs.diskTotalRate)||((this.diskTotalRate!= null)&&this.diskTotalRate.equals(rhs.diskTotalRate))))&&((this.writeTimeAvg == rhs.writeTimeAvg)||((this.writeTimeAvg!= null)&&this.writeTimeAvg.equals(rhs.writeTimeAvg))))&&((this.writeTimeMin == rhs.writeTimeMin)||((this.writeTimeMin!= null)&&this.writeTimeMin.equals(rhs.writeTimeMin))))&&((this.writeBytes == rhs.writeBytes)||((this.writeBytes!= null)&&this.writeBytes.equals(rhs.writeBytes))))&&((this.writeTimeMax == rhs.writeTimeMax)||((this.writeTimeMax!= null)&&this.writeTimeMax.equals(rhs.writeTimeMax))))&&((this.diskTotalMax == rhs.diskTotalMax)||((this.diskTotalMax!= null)&&this.diskTotalMax.equals(rhs.diskTotalMax))))&&((this.writeBytesAvg == rhs.writeBytesAvg)||((this.writeBytesAvg!= null)&&this.writeBytesAvg.equals(rhs.writeBytesAvg))))&&((this.writeBytesMin == rhs.writeBytesMin)||((this.writeBytesMin!= null)&&this.writeBytesMin.equals(rhs.writeBytesMin))))&&((this.readTime == rhs.readTime)||((this.readTime!= null)&&this.readTime.equals(rhs.readTime))))&&((this.diskTotal == rhs.diskTotal)||((this.diskTotal!= null)&&this.diskTotal.equals(rhs.diskTotal))))&&((this.diskTotalAvg == rhs.diskTotalAvg)||((this.diskTotalAvg!= null)&&this.diskTotalAvg.equals(rhs.diskTotalAvg))))&&((this.diskTotalMin == rhs.diskTotalMin)||((this.diskTotalMin!= null)&&this.diskTotalMin.equals(rhs.diskTotalMin))))&&((this.readCountRate == rhs.readCountRate)||((this.readCountRate!= null)&&this.readCountRate.equals(rhs.readCountRate))))&&((this.readTimeAvg == rhs.readTimeAvg)||((this.readTimeAvg!= null)&&this.readTimeAvg.equals(rhs.readTimeAvg))))&&((this.readTimeMin == rhs.readTimeMin)||((this.readTimeMin!= null)&&this.readTimeMin.equals(rhs.readTimeMin))))&&((this.writeTimeRate == rhs.writeTimeRate)||((this.writeTimeRate!= null)&&this.writeTimeRate.equals(rhs.writeTimeRate))))&&((this.readBytesMax == rhs.readBytesMax)||((this.readBytesMax!= null)&&this.readBytesMax.equals(rhs.readBytesMax))))&&((this.readTimeSum == rhs.readTimeSum)||((this.readTimeSum!= null)&&this.readTimeSum.equals(rhs.readTimeSum))))&&((this.writeBytesMax == rhs.writeBytesMax)||((this.writeBytesMax!= null)&&this.writeBytesMax.equals(rhs.writeBytesMax))))&&((this.diskFreeRate == rhs.diskFreeRate)||((this.diskFreeRate!= null)&&this.diskFreeRate.equals(rhs.diskFreeRate))))&&((this.diskTotalSum == rhs.diskTotalSum)||((this.diskTotalSum!= null)&&this.diskTotalSum.equals(rhs.diskTotalSum))))&&((this.readCountSum == rhs.readCountSum)||((this.readCountSum!= null)&&this.readCountSum.equals(rhs.readCountSum))))&&((this.writeTime == rhs.writeTime)||((this.writeTime!= null)&&this.writeTime.equals(rhs.writeTime))))&&((this.diskFreeAvg == rhs.diskFreeAvg)||((this.diskFreeAvg!= null)&&this.diskFreeAvg.equals(rhs.diskFreeAvg))))&&((this.diskFreeMin == rhs.diskFreeMin)||((this.diskFreeMin!= null)&&this.diskFreeMin.equals(rhs.diskFreeMin))))&&((this.readBytesAvg == rhs.readBytesAvg)||((this.readBytesAvg!= null)&&this.readBytesAvg.equals(rhs.readBytesAvg))))&&((this.readBytesMin == rhs.readBytesMin)||((this.readBytesMin!= null)&&this.readBytesMin.equals(rhs.readBytesMin))))&&((this.diskFreeSum == rhs.diskFreeSum)||((this.diskFreeSum!= null)&&this.diskFreeSum.equals(rhs.diskFreeSum))))&&((this.readCountAvg == rhs.readCountAvg)||((this.readCountAvg!= null)&&this.readCountAvg.equals(rhs.readCountAvg))))&&((this.readCountMin == rhs.readCountMin)||((this.readCountMin!= null)&&this.readCountMin.equals(rhs.readCountMin))))&&((this.readBytesSum == rhs.readBytesSum)||((this.readBytesSum!= null)&&this.readBytesSum.equals(rhs.readBytesSum))))&&((this.readTimeRate == rhs.readTimeRate)||((this.readTimeRate!= null)&&this.readTimeRate.equals(rhs.readTimeRate))))&&((this.writeBytesRate == rhs.writeBytesRate)||((this.writeBytesRate!= null)&&this.writeBytesRate.equals(rhs.writeBytesRate))))&&((this.diskFreeMax == rhs.diskFreeMax)||((this.diskFreeMax!= null)&&this.diskFreeMax.equals(rhs.diskFreeMax))))&&((this.writeBytesSum == rhs.writeBytesSum)||((this.writeBytesSum!= null)&&this.writeBytesSum.equals(rhs.writeBytesSum))))&&((this.readBytesRate == rhs.readBytesRate)||((this.readBytesRate!= null)&&this.readBytesRate.equals(rhs.readBytesRate))))&&((this.readBytes == rhs.readBytes)||((this.readBytes!= null)&&this.readBytes.equals(rhs.readBytes))))&&((this.writeCount == rhs.writeCount)||((this.writeCount!= null)&&this.writeCount.equals(rhs.writeCount))))&&((this.readTimeMax == rhs.readTimeMax)||((this.readTimeMax!= null)&&this.readTimeMax.equals(rhs.readTimeMax))))&&((this.writeCountSum == rhs.writeCountSum)||((this.writeCountSum!= null)&&this.writeCountSum.equals(rhs.writeCountSum))));
    }

}
