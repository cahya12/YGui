
package com.labs247.yava.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Memory {

    @SerializedName("mem_cached")
    @Expose
    private Double memCached;
    @SerializedName("mem_cached._avg")
    @Expose
    private Double memCachedAvg;
    @SerializedName("mem_cached._max")
    @Expose
    private Double memCachedMax;
    @SerializedName("mem_cached._min")
    @Expose
    private Double memCachedMin;
    @SerializedName("mem_cached._rate")
    @Expose
    private Integer memCachedRate;
    @SerializedName("mem_cached._sum")
    @Expose
    private Double memCachedSum;
    @SerializedName("mem_free")
    @Expose
    private Double memFree;
    @SerializedName("mem_free._avg")
    @Expose
    private Double memFreeAvg;
    @SerializedName("mem_free._max")
    @Expose
    private Double memFreeMax;
    @SerializedName("mem_free._min")
    @Expose
    private Double memFreeMin;
    @SerializedName("mem_free._rate")
    @Expose
    private Integer memFreeRate;
    @SerializedName("mem_free._sum")
    @Expose
    private Double memFreeSum;
    @SerializedName("mem_shared")
    @Expose
    private Double memShared;
    @SerializedName("mem_shared._avg")
    @Expose
    private Double memSharedAvg;
    @SerializedName("mem_shared._max")
    @Expose
    private Double memSharedMax;
    @SerializedName("mem_shared._min")
    @Expose
    private Double memSharedMin;
    @SerializedName("mem_shared._rate")
    @Expose
    private Integer memSharedRate;
    @SerializedName("mem_shared._sum")
    @Expose
    private Double memSharedSum;
    @SerializedName("mem_total")
    @Expose
    private Double memTotal;
    @SerializedName("mem_total._avg")
    @Expose
    private Double memTotalAvg;
    @SerializedName("mem_total._max")
    @Expose
    private Double memTotalMax;
    @SerializedName("mem_total._min")
    @Expose
    private Double memTotalMin;
    @SerializedName("mem_total._rate")
    @Expose
    private Integer memTotalRate;
    @SerializedName("mem_total._sum")
    @Expose
    private Double memTotalSum;
    @SerializedName("swap_free")
    @Expose
    private Double swapFree;
    @SerializedName("swap_free._avg")
    @Expose
    private Double swapFreeAvg;
    @SerializedName("swap_free._max")
    @Expose
    private Double swapFreeMax;
    @SerializedName("swap_free._min")
    @Expose
    private Double swapFreeMin;
    @SerializedName("swap_free._rate")
    @Expose
    private Integer swapFreeRate;
    @SerializedName("swap_free._sum")
    @Expose
    private Double swapFreeSum;
    @SerializedName("swap_total")
    @Expose
    private Double swapTotal;
    @SerializedName("swap_total._avg")
    @Expose
    private Double swapTotalAvg;
    @SerializedName("swap_total._max")
    @Expose
    private Double swapTotalMax;
    @SerializedName("swap_total._min")
    @Expose
    private Double swapTotalMin;
    @SerializedName("swap_total._rate")
    @Expose
    private Integer swapTotalRate;
    @SerializedName("swap_total._sum")
    @Expose
    private Double swapTotalSum;

    public Double getMemCached() {
        return memCached;
    }

    public void setMemCached(Double memCached) {
        this.memCached = memCached;
    }

    public Double getMemCachedAvg() {
        return memCachedAvg;
    }

    public void setMemCachedAvg(Double memCachedAvg) {
        this.memCachedAvg = memCachedAvg;
    }

    public Double getMemCachedMax() {
        return memCachedMax;
    }

    public void setMemCachedMax(Double memCachedMax) {
        this.memCachedMax = memCachedMax;
    }

    public Double getMemCachedMin() {
        return memCachedMin;
    }

    public void setMemCachedMin(Double memCachedMin) {
        this.memCachedMin = memCachedMin;
    }

    public Integer getMemCachedRate() {
        return memCachedRate;
    }

    public void setMemCachedRate(Integer memCachedRate) {
        this.memCachedRate = memCachedRate;
    }

    public Double getMemCachedSum() {
        return memCachedSum;
    }

    public void setMemCachedSum(Double memCachedSum) {
        this.memCachedSum = memCachedSum;
    }

    public Double getMemFree() {
        return memFree;
    }

    public void setMemFree(Double memFree) {
        this.memFree = memFree;
    }

    public Double getMemFreeAvg() {
        return memFreeAvg;
    }

    public void setMemFreeAvg(Double memFreeAvg) {
        this.memFreeAvg = memFreeAvg;
    }

    public Double getMemFreeMax() {
        return memFreeMax;
    }

    public void setMemFreeMax(Double memFreeMax) {
        this.memFreeMax = memFreeMax;
    }

    public Double getMemFreeMin() {
        return memFreeMin;
    }

    public void setMemFreeMin(Double memFreeMin) {
        this.memFreeMin = memFreeMin;
    }

    public Integer getMemFreeRate() {
        return memFreeRate;
    }

    public void setMemFreeRate(Integer memFreeRate) {
        this.memFreeRate = memFreeRate;
    }

    public Double getMemFreeSum() {
        return memFreeSum;
    }

    public void setMemFreeSum(Double memFreeSum) {
        this.memFreeSum = memFreeSum;
    }

    public Double getMemShared() {
        return memShared;
    }

    public void setMemShared(Double memShared) {
        this.memShared = memShared;
    }

    public Double getMemSharedAvg() {
        return memSharedAvg;
    }

    public void setMemSharedAvg(Double memSharedAvg) {
        this.memSharedAvg = memSharedAvg;
    }

    public Double getMemSharedMax() {
        return memSharedMax;
    }

    public void setMemSharedMax(Double memSharedMax) {
        this.memSharedMax = memSharedMax;
    }

    public Double getMemSharedMin() {
        return memSharedMin;
    }

    public void setMemSharedMin(Double memSharedMin) {
        this.memSharedMin = memSharedMin;
    }

    public Integer getMemSharedRate() {
        return memSharedRate;
    }

    public void setMemSharedRate(Integer memSharedRate) {
        this.memSharedRate = memSharedRate;
    }

    public Double getMemSharedSum() {
        return memSharedSum;
    }

    public void setMemSharedSum(Double memSharedSum) {
        this.memSharedSum = memSharedSum;
    }

    public Double getMemTotal() {
        return memTotal;
    }

    public void setMemTotal(Double memTotal) {
        this.memTotal = memTotal;
    }

    public Double getMemTotalAvg() {
        return memTotalAvg;
    }

    public void setMemTotalAvg(Double memTotalAvg) {
        this.memTotalAvg = memTotalAvg;
    }

    public Double getMemTotalMax() {
        return memTotalMax;
    }

    public void setMemTotalMax(Double memTotalMax) {
        this.memTotalMax = memTotalMax;
    }

    public Double getMemTotalMin() {
        return memTotalMin;
    }

    public void setMemTotalMin(Double memTotalMin) {
        this.memTotalMin = memTotalMin;
    }

    public Integer getMemTotalRate() {
        return memTotalRate;
    }

    public void setMemTotalRate(Integer memTotalRate) {
        this.memTotalRate = memTotalRate;
    }

    public Double getMemTotalSum() {
        return memTotalSum;
    }

    public void setMemTotalSum(Double memTotalSum) {
        this.memTotalSum = memTotalSum;
    }

    public Double getSwapFree() {
        return swapFree;
    }

    public void setSwapFree(Double swapFree) {
        this.swapFree = swapFree;
    }

    public Double getSwapFreeAvg() {
        return swapFreeAvg;
    }

    public void setSwapFreeAvg(Double swapFreeAvg) {
        this.swapFreeAvg = swapFreeAvg;
    }

    public Double getSwapFreeMax() {
        return swapFreeMax;
    }

    public void setSwapFreeMax(Double swapFreeMax) {
        this.swapFreeMax = swapFreeMax;
    }

    public Double getSwapFreeMin() {
        return swapFreeMin;
    }

    public void setSwapFreeMin(Double swapFreeMin) {
        this.swapFreeMin = swapFreeMin;
    }

    public Integer getSwapFreeRate() {
        return swapFreeRate;
    }

    public void setSwapFreeRate(Integer swapFreeRate) {
        this.swapFreeRate = swapFreeRate;
    }

    public Double getSwapFreeSum() {
        return swapFreeSum;
    }

    public void setSwapFreeSum(Double swapFreeSum) {
        this.swapFreeSum = swapFreeSum;
    }

    public Double getSwapTotal() {
        return swapTotal;
    }

    public void setSwapTotal(Double swapTotal) {
        this.swapTotal = swapTotal;
    }

    public Double getSwapTotalAvg() {
        return swapTotalAvg;
    }

    public void setSwapTotalAvg(Double swapTotalAvg) {
        this.swapTotalAvg = swapTotalAvg;
    }

    public Double getSwapTotalMax() {
        return swapTotalMax;
    }

    public void setSwapTotalMax(Double swapTotalMax) {
        this.swapTotalMax = swapTotalMax;
    }

    public Double getSwapTotalMin() {
        return swapTotalMin;
    }

    public void setSwapTotalMin(Double swapTotalMin) {
        this.swapTotalMin = swapTotalMin;
    }

    public Integer getSwapTotalRate() {
        return swapTotalRate;
    }

    public void setSwapTotalRate(Integer swapTotalRate) {
        this.swapTotalRate = swapTotalRate;
    }

    public Double getSwapTotalSum() {
        return swapTotalSum;
    }

    public void setSwapTotalSum(Double swapTotalSum) {
        this.swapTotalSum = swapTotalSum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Memory.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("memCached");
        sb.append('=');
        sb.append(((this.memCached == null)?"<null>":this.memCached));
        sb.append(',');
        sb.append("memCachedAvg");
        sb.append('=');
        sb.append(((this.memCachedAvg == null)?"<null>":this.memCachedAvg));
        sb.append(',');
        sb.append("memCachedMax");
        sb.append('=');
        sb.append(((this.memCachedMax == null)?"<null>":this.memCachedMax));
        sb.append(',');
        sb.append("memCachedMin");
        sb.append('=');
        sb.append(((this.memCachedMin == null)?"<null>":this.memCachedMin));
        sb.append(',');
        sb.append("memCachedRate");
        sb.append('=');
        sb.append(((this.memCachedRate == null)?"<null>":this.memCachedRate));
        sb.append(',');
        sb.append("memCachedSum");
        sb.append('=');
        sb.append(((this.memCachedSum == null)?"<null>":this.memCachedSum));
        sb.append(',');
        sb.append("memFree");
        sb.append('=');
        sb.append(((this.memFree == null)?"<null>":this.memFree));
        sb.append(',');
        sb.append("memFreeAvg");
        sb.append('=');
        sb.append(((this.memFreeAvg == null)?"<null>":this.memFreeAvg));
        sb.append(',');
        sb.append("memFreeMax");
        sb.append('=');
        sb.append(((this.memFreeMax == null)?"<null>":this.memFreeMax));
        sb.append(',');
        sb.append("memFreeMin");
        sb.append('=');
        sb.append(((this.memFreeMin == null)?"<null>":this.memFreeMin));
        sb.append(',');
        sb.append("memFreeRate");
        sb.append('=');
        sb.append(((this.memFreeRate == null)?"<null>":this.memFreeRate));
        sb.append(',');
        sb.append("memFreeSum");
        sb.append('=');
        sb.append(((this.memFreeSum == null)?"<null>":this.memFreeSum));
        sb.append(',');
        sb.append("memShared");
        sb.append('=');
        sb.append(((this.memShared == null)?"<null>":this.memShared));
        sb.append(',');
        sb.append("memSharedAvg");
        sb.append('=');
        sb.append(((this.memSharedAvg == null)?"<null>":this.memSharedAvg));
        sb.append(',');
        sb.append("memSharedMax");
        sb.append('=');
        sb.append(((this.memSharedMax == null)?"<null>":this.memSharedMax));
        sb.append(',');
        sb.append("memSharedMin");
        sb.append('=');
        sb.append(((this.memSharedMin == null)?"<null>":this.memSharedMin));
        sb.append(',');
        sb.append("memSharedRate");
        sb.append('=');
        sb.append(((this.memSharedRate == null)?"<null>":this.memSharedRate));
        sb.append(',');
        sb.append("memSharedSum");
        sb.append('=');
        sb.append(((this.memSharedSum == null)?"<null>":this.memSharedSum));
        sb.append(',');
        sb.append("memTotal");
        sb.append('=');
        sb.append(((this.memTotal == null)?"<null>":this.memTotal));
        sb.append(',');
        sb.append("memTotalAvg");
        sb.append('=');
        sb.append(((this.memTotalAvg == null)?"<null>":this.memTotalAvg));
        sb.append(',');
        sb.append("memTotalMax");
        sb.append('=');
        sb.append(((this.memTotalMax == null)?"<null>":this.memTotalMax));
        sb.append(',');
        sb.append("memTotalMin");
        sb.append('=');
        sb.append(((this.memTotalMin == null)?"<null>":this.memTotalMin));
        sb.append(',');
        sb.append("memTotalRate");
        sb.append('=');
        sb.append(((this.memTotalRate == null)?"<null>":this.memTotalRate));
        sb.append(',');
        sb.append("memTotalSum");
        sb.append('=');
        sb.append(((this.memTotalSum == null)?"<null>":this.memTotalSum));
        sb.append(',');
        sb.append("swapFree");
        sb.append('=');
        sb.append(((this.swapFree == null)?"<null>":this.swapFree));
        sb.append(',');
        sb.append("swapFreeAvg");
        sb.append('=');
        sb.append(((this.swapFreeAvg == null)?"<null>":this.swapFreeAvg));
        sb.append(',');
        sb.append("swapFreeMax");
        sb.append('=');
        sb.append(((this.swapFreeMax == null)?"<null>":this.swapFreeMax));
        sb.append(',');
        sb.append("swapFreeMin");
        sb.append('=');
        sb.append(((this.swapFreeMin == null)?"<null>":this.swapFreeMin));
        sb.append(',');
        sb.append("swapFreeRate");
        sb.append('=');
        sb.append(((this.swapFreeRate == null)?"<null>":this.swapFreeRate));
        sb.append(',');
        sb.append("swapFreeSum");
        sb.append('=');
        sb.append(((this.swapFreeSum == null)?"<null>":this.swapFreeSum));
        sb.append(',');
        sb.append("swapTotal");
        sb.append('=');
        sb.append(((this.swapTotal == null)?"<null>":this.swapTotal));
        sb.append(',');
        sb.append("swapTotalAvg");
        sb.append('=');
        sb.append(((this.swapTotalAvg == null)?"<null>":this.swapTotalAvg));
        sb.append(',');
        sb.append("swapTotalMax");
        sb.append('=');
        sb.append(((this.swapTotalMax == null)?"<null>":this.swapTotalMax));
        sb.append(',');
        sb.append("swapTotalMin");
        sb.append('=');
        sb.append(((this.swapTotalMin == null)?"<null>":this.swapTotalMin));
        sb.append(',');
        sb.append("swapTotalRate");
        sb.append('=');
        sb.append(((this.swapTotalRate == null)?"<null>":this.swapTotalRate));
        sb.append(',');
        sb.append("swapTotalSum");
        sb.append('=');
        sb.append(((this.swapTotalSum == null)?"<null>":this.swapTotalSum));
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
        result = ((result* 31)+((this.memSharedSum == null)? 0 :this.memSharedSum.hashCode()));
        result = ((result* 31)+((this.memFreeRate == null)? 0 :this.memFreeRate.hashCode()));
        result = ((result* 31)+((this.memTotalRate == null)? 0 :this.memTotalRate.hashCode()));
        result = ((result* 31)+((this.memSharedMin == null)? 0 :this.memSharedMin.hashCode()));
        result = ((result* 31)+((this.swapTotalSum == null)? 0 :this.swapTotalSum.hashCode()));
        result = ((result* 31)+((this.swapFreeMax == null)? 0 :this.swapFreeMax.hashCode()));
        result = ((result* 31)+((this.memFreeSum == null)? 0 :this.memFreeSum.hashCode()));
        result = ((result* 31)+((this.memCached == null)? 0 :this.memCached.hashCode()));
        result = ((result* 31)+((this.memTotalAvg == null)? 0 :this.memTotalAvg.hashCode()));
        result = ((result* 31)+((this.memTotalMin == null)? 0 :this.memTotalMin.hashCode()));
        result = ((result* 31)+((this.memShared == null)? 0 :this.memShared.hashCode()));
        result = ((result* 31)+((this.memCachedMax == null)? 0 :this.memCachedMax.hashCode()));
        result = ((result* 31)+((this.memFreeMin == null)? 0 :this.memFreeMin.hashCode()));
        result = ((result* 31)+((this.memCachedRate == null)? 0 :this.memCachedRate.hashCode()));
        result = ((result* 31)+((this.memSharedAvg == null)? 0 :this.memSharedAvg.hashCode()));
        result = ((result* 31)+((this.swapFreeRate == null)? 0 :this.swapFreeRate.hashCode()));
        result = ((result* 31)+((this.memTotalMax == null)? 0 :this.memTotalMax.hashCode()));
        result = ((result* 31)+((this.swapFreeSum == null)? 0 :this.swapFreeSum.hashCode()));
        result = ((result* 31)+((this.swapFree == null)? 0 :this.swapFree.hashCode()));
        result = ((result* 31)+((this.swapTotalMax == null)? 0 :this.swapTotalMax.hashCode()));
        result = ((result* 31)+((this.memFree == null)? 0 :this.memFree.hashCode()));
        result = ((result* 31)+((this.memFreeMax == null)? 0 :this.memFreeMax.hashCode()));
        result = ((result* 31)+((this.memTotal == null)? 0 :this.memTotal.hashCode()));
        result = ((result* 31)+((this.memCachedAvg == null)? 0 :this.memCachedAvg.hashCode()));
        result = ((result* 31)+((this.memCachedMin == null)? 0 :this.memCachedMin.hashCode()));
        result = ((result* 31)+((this.memCachedSum == null)? 0 :this.memCachedSum.hashCode()));
        result = ((result* 31)+((this.swapTotal == null)? 0 :this.swapTotal.hashCode()));
        result = ((result* 31)+((this.memSharedRate == null)? 0 :this.memSharedRate.hashCode()));
        result = ((result* 31)+((this.memFreeAvg == null)? 0 :this.memFreeAvg.hashCode()));
        result = ((result* 31)+((this.swapTotalRate == null)? 0 :this.swapTotalRate.hashCode()));
        result = ((result* 31)+((this.memTotalSum == null)? 0 :this.memTotalSum.hashCode()));
        result = ((result* 31)+((this.swapTotalAvg == null)? 0 :this.swapTotalAvg.hashCode()));
        result = ((result* 31)+((this.swapTotalMin == null)? 0 :this.swapTotalMin.hashCode()));
        result = ((result* 31)+((this.memSharedMax == null)? 0 :this.memSharedMax.hashCode()));
        result = ((result* 31)+((this.swapFreeAvg == null)? 0 :this.swapFreeAvg.hashCode()));
        result = ((result* 31)+((this.swapFreeMin == null)? 0 :this.swapFreeMin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Memory) == false) {
            return false;
        }
        Memory rhs = ((Memory) other);
        return (((((((((((((((((((((((((((((((((((((this.memSharedSum == rhs.memSharedSum)||((this.memSharedSum!= null)&&this.memSharedSum.equals(rhs.memSharedSum)))&&((this.memFreeRate == rhs.memFreeRate)||((this.memFreeRate!= null)&&this.memFreeRate.equals(rhs.memFreeRate))))&&((this.memTotalRate == rhs.memTotalRate)||((this.memTotalRate!= null)&&this.memTotalRate.equals(rhs.memTotalRate))))&&((this.memSharedMin == rhs.memSharedMin)||((this.memSharedMin!= null)&&this.memSharedMin.equals(rhs.memSharedMin))))&&((this.swapTotalSum == rhs.swapTotalSum)||((this.swapTotalSum!= null)&&this.swapTotalSum.equals(rhs.swapTotalSum))))&&((this.swapFreeMax == rhs.swapFreeMax)||((this.swapFreeMax!= null)&&this.swapFreeMax.equals(rhs.swapFreeMax))))&&((this.memFreeSum == rhs.memFreeSum)||((this.memFreeSum!= null)&&this.memFreeSum.equals(rhs.memFreeSum))))&&((this.memCached == rhs.memCached)||((this.memCached!= null)&&this.memCached.equals(rhs.memCached))))&&((this.memTotalAvg == rhs.memTotalAvg)||((this.memTotalAvg!= null)&&this.memTotalAvg.equals(rhs.memTotalAvg))))&&((this.memTotalMin == rhs.memTotalMin)||((this.memTotalMin!= null)&&this.memTotalMin.equals(rhs.memTotalMin))))&&((this.memShared == rhs.memShared)||((this.memShared!= null)&&this.memShared.equals(rhs.memShared))))&&((this.memCachedMax == rhs.memCachedMax)||((this.memCachedMax!= null)&&this.memCachedMax.equals(rhs.memCachedMax))))&&((this.memFreeMin == rhs.memFreeMin)||((this.memFreeMin!= null)&&this.memFreeMin.equals(rhs.memFreeMin))))&&((this.memCachedRate == rhs.memCachedRate)||((this.memCachedRate!= null)&&this.memCachedRate.equals(rhs.memCachedRate))))&&((this.memSharedAvg == rhs.memSharedAvg)||((this.memSharedAvg!= null)&&this.memSharedAvg.equals(rhs.memSharedAvg))))&&((this.swapFreeRate == rhs.swapFreeRate)||((this.swapFreeRate!= null)&&this.swapFreeRate.equals(rhs.swapFreeRate))))&&((this.memTotalMax == rhs.memTotalMax)||((this.memTotalMax!= null)&&this.memTotalMax.equals(rhs.memTotalMax))))&&((this.swapFreeSum == rhs.swapFreeSum)||((this.swapFreeSum!= null)&&this.swapFreeSum.equals(rhs.swapFreeSum))))&&((this.swapFree == rhs.swapFree)||((this.swapFree!= null)&&this.swapFree.equals(rhs.swapFree))))&&((this.swapTotalMax == rhs.swapTotalMax)||((this.swapTotalMax!= null)&&this.swapTotalMax.equals(rhs.swapTotalMax))))&&((this.memFree == rhs.memFree)||((this.memFree!= null)&&this.memFree.equals(rhs.memFree))))&&((this.memFreeMax == rhs.memFreeMax)||((this.memFreeMax!= null)&&this.memFreeMax.equals(rhs.memFreeMax))))&&((this.memTotal == rhs.memTotal)||((this.memTotal!= null)&&this.memTotal.equals(rhs.memTotal))))&&((this.memCachedAvg == rhs.memCachedAvg)||((this.memCachedAvg!= null)&&this.memCachedAvg.equals(rhs.memCachedAvg))))&&((this.memCachedMin == rhs.memCachedMin)||((this.memCachedMin!= null)&&this.memCachedMin.equals(rhs.memCachedMin))))&&((this.memCachedSum == rhs.memCachedSum)||((this.memCachedSum!= null)&&this.memCachedSum.equals(rhs.memCachedSum))))&&((this.swapTotal == rhs.swapTotal)||((this.swapTotal!= null)&&this.swapTotal.equals(rhs.swapTotal))))&&((this.memSharedRate == rhs.memSharedRate)||((this.memSharedRate!= null)&&this.memSharedRate.equals(rhs.memSharedRate))))&&((this.memFreeAvg == rhs.memFreeAvg)||((this.memFreeAvg!= null)&&this.memFreeAvg.equals(rhs.memFreeAvg))))&&((this.swapTotalRate == rhs.swapTotalRate)||((this.swapTotalRate!= null)&&this.swapTotalRate.equals(rhs.swapTotalRate))))&&((this.memTotalSum == rhs.memTotalSum)||((this.memTotalSum!= null)&&this.memTotalSum.equals(rhs.memTotalSum))))&&((this.swapTotalAvg == rhs.swapTotalAvg)||((this.swapTotalAvg!= null)&&this.swapTotalAvg.equals(rhs.swapTotalAvg))))&&((this.swapTotalMin == rhs.swapTotalMin)||((this.swapTotalMin!= null)&&this.swapTotalMin.equals(rhs.swapTotalMin))))&&((this.memSharedMax == rhs.memSharedMax)||((this.memSharedMax!= null)&&this.memSharedMax.equals(rhs.memSharedMax))))&&((this.swapFreeAvg == rhs.swapFreeAvg)||((this.swapFreeAvg!= null)&&this.swapFreeAvg.equals(rhs.swapFreeAvg))))&&((this.swapFreeMin == rhs.swapFreeMin)||((this.swapFreeMin!= null)&&this.swapFreeMin.equals(rhs.swapFreeMin))));
    }

}
