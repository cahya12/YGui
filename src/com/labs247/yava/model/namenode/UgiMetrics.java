
package com.labs247.yava.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UgiMetrics {

    @SerializedName("GetGroupsAvgTime")
    @Expose
    private Double getGroupsAvgTime;
    @SerializedName("GetGroupsAvgTime._avg")
    @Expose
    private Double getGroupsAvgTimeAvg;
    @SerializedName("GetGroupsAvgTime._max")
    @Expose
    private Double getGroupsAvgTimeMax;
    @SerializedName("GetGroupsAvgTime._min")
    @Expose
    private Double getGroupsAvgTimeMin;
    @SerializedName("GetGroupsAvgTime._rate")
    @Expose
    private Integer getGroupsAvgTimeRate;
    @SerializedName("GetGroupsAvgTime._sum")
    @Expose
    private Double getGroupsAvgTimeSum;
    @SerializedName("GetGroupsNumOps")
    @Expose
    private Double getGroupsNumOps;
    @SerializedName("GetGroupsNumOps._avg")
    @Expose
    private Double getGroupsNumOpsAvg;
    @SerializedName("GetGroupsNumOps._max")
    @Expose
    private Double getGroupsNumOpsMax;
    @SerializedName("GetGroupsNumOps._min")
    @Expose
    private Double getGroupsNumOpsMin;
    @SerializedName("GetGroupsNumOps._rate")
    @Expose
    private Integer getGroupsNumOpsRate;
    @SerializedName("GetGroupsNumOps._sum")
    @Expose
    private Double getGroupsNumOpsSum;

    public Double getGetGroupsAvgTime() {
        return getGroupsAvgTime;
    }

    public void setGetGroupsAvgTime(Double getGroupsAvgTime) {
        this.getGroupsAvgTime = getGroupsAvgTime;
    }

    public Double getGetGroupsAvgTimeAvg() {
        return getGroupsAvgTimeAvg;
    }

    public void setGetGroupsAvgTimeAvg(Double getGroupsAvgTimeAvg) {
        this.getGroupsAvgTimeAvg = getGroupsAvgTimeAvg;
    }

    public Double getGetGroupsAvgTimeMax() {
        return getGroupsAvgTimeMax;
    }

    public void setGetGroupsAvgTimeMax(Double getGroupsAvgTimeMax) {
        this.getGroupsAvgTimeMax = getGroupsAvgTimeMax;
    }

    public Double getGetGroupsAvgTimeMin() {
        return getGroupsAvgTimeMin;
    }

    public void setGetGroupsAvgTimeMin(Double getGroupsAvgTimeMin) {
        this.getGroupsAvgTimeMin = getGroupsAvgTimeMin;
    }

    public Integer getGetGroupsAvgTimeRate() {
        return getGroupsAvgTimeRate;
    }

    public void setGetGroupsAvgTimeRate(Integer getGroupsAvgTimeRate) {
        this.getGroupsAvgTimeRate = getGroupsAvgTimeRate;
    }

    public Double getGetGroupsAvgTimeSum() {
        return getGroupsAvgTimeSum;
    }

    public void setGetGroupsAvgTimeSum(Double getGroupsAvgTimeSum) {
        this.getGroupsAvgTimeSum = getGroupsAvgTimeSum;
    }

    public Double getGetGroupsNumOps() {
        return getGroupsNumOps;
    }

    public void setGetGroupsNumOps(Double getGroupsNumOps) {
        this.getGroupsNumOps = getGroupsNumOps;
    }

    public Double getGetGroupsNumOpsAvg() {
        return getGroupsNumOpsAvg;
    }

    public void setGetGroupsNumOpsAvg(Double getGroupsNumOpsAvg) {
        this.getGroupsNumOpsAvg = getGroupsNumOpsAvg;
    }

    public Double getGetGroupsNumOpsMax() {
        return getGroupsNumOpsMax;
    }

    public void setGetGroupsNumOpsMax(Double getGroupsNumOpsMax) {
        this.getGroupsNumOpsMax = getGroupsNumOpsMax;
    }

    public Double getGetGroupsNumOpsMin() {
        return getGroupsNumOpsMin;
    }

    public void setGetGroupsNumOpsMin(Double getGroupsNumOpsMin) {
        this.getGroupsNumOpsMin = getGroupsNumOpsMin;
    }

    public Integer getGetGroupsNumOpsRate() {
        return getGroupsNumOpsRate;
    }

    public void setGetGroupsNumOpsRate(Integer getGroupsNumOpsRate) {
        this.getGroupsNumOpsRate = getGroupsNumOpsRate;
    }

    public Double getGetGroupsNumOpsSum() {
        return getGroupsNumOpsSum;
    }

    public void setGetGroupsNumOpsSum(Double getGroupsNumOpsSum) {
        this.getGroupsNumOpsSum = getGroupsNumOpsSum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UgiMetrics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("getGroupsAvgTime");
        sb.append('=');
        sb.append(((this.getGroupsAvgTime == null)?"<null>":this.getGroupsAvgTime));
        sb.append(',');
        sb.append("getGroupsAvgTimeAvg");
        sb.append('=');
        sb.append(((this.getGroupsAvgTimeAvg == null)?"<null>":this.getGroupsAvgTimeAvg));
        sb.append(',');
        sb.append("getGroupsAvgTimeMax");
        sb.append('=');
        sb.append(((this.getGroupsAvgTimeMax == null)?"<null>":this.getGroupsAvgTimeMax));
        sb.append(',');
        sb.append("getGroupsAvgTimeMin");
        sb.append('=');
        sb.append(((this.getGroupsAvgTimeMin == null)?"<null>":this.getGroupsAvgTimeMin));
        sb.append(',');
        sb.append("getGroupsAvgTimeRate");
        sb.append('=');
        sb.append(((this.getGroupsAvgTimeRate == null)?"<null>":this.getGroupsAvgTimeRate));
        sb.append(',');
        sb.append("getGroupsAvgTimeSum");
        sb.append('=');
        sb.append(((this.getGroupsAvgTimeSum == null)?"<null>":this.getGroupsAvgTimeSum));
        sb.append(',');
        sb.append("getGroupsNumOps");
        sb.append('=');
        sb.append(((this.getGroupsNumOps == null)?"<null>":this.getGroupsNumOps));
        sb.append(',');
        sb.append("getGroupsNumOpsAvg");
        sb.append('=');
        sb.append(((this.getGroupsNumOpsAvg == null)?"<null>":this.getGroupsNumOpsAvg));
        sb.append(',');
        sb.append("getGroupsNumOpsMax");
        sb.append('=');
        sb.append(((this.getGroupsNumOpsMax == null)?"<null>":this.getGroupsNumOpsMax));
        sb.append(',');
        sb.append("getGroupsNumOpsMin");
        sb.append('=');
        sb.append(((this.getGroupsNumOpsMin == null)?"<null>":this.getGroupsNumOpsMin));
        sb.append(',');
        sb.append("getGroupsNumOpsRate");
        sb.append('=');
        sb.append(((this.getGroupsNumOpsRate == null)?"<null>":this.getGroupsNumOpsRate));
        sb.append(',');
        sb.append("getGroupsNumOpsSum");
        sb.append('=');
        sb.append(((this.getGroupsNumOpsSum == null)?"<null>":this.getGroupsNumOpsSum));
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
        result = ((result* 31)+((this.getGroupsAvgTimeSum == null)? 0 :this.getGroupsAvgTimeSum.hashCode()));
        result = ((result* 31)+((this.getGroupsNumOps == null)? 0 :this.getGroupsNumOps.hashCode()));
        result = ((result* 31)+((this.getGroupsNumOpsSum == null)? 0 :this.getGroupsNumOpsSum.hashCode()));
        result = ((result* 31)+((this.getGroupsAvgTimeRate == null)? 0 :this.getGroupsAvgTimeRate.hashCode()));
        result = ((result* 31)+((this.getGroupsAvgTimeAvg == null)? 0 :this.getGroupsAvgTimeAvg.hashCode()));
        result = ((result* 31)+((this.getGroupsAvgTimeMin == null)? 0 :this.getGroupsAvgTimeMin.hashCode()));
        result = ((result* 31)+((this.getGroupsNumOpsAvg == null)? 0 :this.getGroupsNumOpsAvg.hashCode()));
        result = ((result* 31)+((this.getGroupsNumOpsMin == null)? 0 :this.getGroupsNumOpsMin.hashCode()));
        result = ((result* 31)+((this.getGroupsNumOpsRate == null)? 0 :this.getGroupsNumOpsRate.hashCode()));
        result = ((result* 31)+((this.getGroupsAvgTime == null)? 0 :this.getGroupsAvgTime.hashCode()));
        result = ((result* 31)+((this.getGroupsNumOpsMax == null)? 0 :this.getGroupsNumOpsMax.hashCode()));
        result = ((result* 31)+((this.getGroupsAvgTimeMax == null)? 0 :this.getGroupsAvgTimeMax.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UgiMetrics) == false) {
            return false;
        }
        UgiMetrics rhs = ((UgiMetrics) other);
        return (((((((((((((this.getGroupsAvgTimeSum == rhs.getGroupsAvgTimeSum)||((this.getGroupsAvgTimeSum!= null)&&this.getGroupsAvgTimeSum.equals(rhs.getGroupsAvgTimeSum)))&&((this.getGroupsNumOps == rhs.getGroupsNumOps)||((this.getGroupsNumOps!= null)&&this.getGroupsNumOps.equals(rhs.getGroupsNumOps))))&&((this.getGroupsNumOpsSum == rhs.getGroupsNumOpsSum)||((this.getGroupsNumOpsSum!= null)&&this.getGroupsNumOpsSum.equals(rhs.getGroupsNumOpsSum))))&&((this.getGroupsAvgTimeRate == rhs.getGroupsAvgTimeRate)||((this.getGroupsAvgTimeRate!= null)&&this.getGroupsAvgTimeRate.equals(rhs.getGroupsAvgTimeRate))))&&((this.getGroupsAvgTimeAvg == rhs.getGroupsAvgTimeAvg)||((this.getGroupsAvgTimeAvg!= null)&&this.getGroupsAvgTimeAvg.equals(rhs.getGroupsAvgTimeAvg))))&&((this.getGroupsAvgTimeMin == rhs.getGroupsAvgTimeMin)||((this.getGroupsAvgTimeMin!= null)&&this.getGroupsAvgTimeMin.equals(rhs.getGroupsAvgTimeMin))))&&((this.getGroupsNumOpsAvg == rhs.getGroupsNumOpsAvg)||((this.getGroupsNumOpsAvg!= null)&&this.getGroupsNumOpsAvg.equals(rhs.getGroupsNumOpsAvg))))&&((this.getGroupsNumOpsMin == rhs.getGroupsNumOpsMin)||((this.getGroupsNumOpsMin!= null)&&this.getGroupsNumOpsMin.equals(rhs.getGroupsNumOpsMin))))&&((this.getGroupsNumOpsRate == rhs.getGroupsNumOpsRate)||((this.getGroupsNumOpsRate!= null)&&this.getGroupsNumOpsRate.equals(rhs.getGroupsNumOpsRate))))&&((this.getGroupsAvgTime == rhs.getGroupsAvgTime)||((this.getGroupsAvgTime!= null)&&this.getGroupsAvgTime.equals(rhs.getGroupsAvgTime))))&&((this.getGroupsNumOpsMax == rhs.getGroupsNumOpsMax)||((this.getGroupsNumOpsMax!= null)&&this.getGroupsNumOpsMax.equals(rhs.getGroupsNumOpsMax))))&&((this.getGroupsAvgTimeMax == rhs.getGroupsAvgTimeMax)||((this.getGroupsAvgTimeMax!= null)&&this.getGroupsAvgTimeMax.equals(rhs.getGroupsAvgTimeMax))));
    }

}
