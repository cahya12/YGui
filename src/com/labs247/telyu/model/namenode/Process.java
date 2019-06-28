
package com.labs247.telyu.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Process {

    @SerializedName("proc_run")
    @Expose
    private Double procRun;
    @SerializedName("proc_run._avg")
    @Expose
    private Double procRunAvg;
    @SerializedName("proc_run._max")
    @Expose
    private Double procRunMax;
    @SerializedName("proc_run._min")
    @Expose
    private Double procRunMin;
    @SerializedName("proc_run._rate")
    @Expose
    private Integer procRunRate;
    @SerializedName("proc_run._sum")
    @Expose
    private Double procRunSum;
    @SerializedName("proc_total")
    @Expose
    private Double procTotal;
    @SerializedName("proc_total._avg")
    @Expose
    private Double procTotalAvg;
    @SerializedName("proc_total._max")
    @Expose
    private Double procTotalMax;
    @SerializedName("proc_total._min")
    @Expose
    private Double procTotalMin;
    @SerializedName("proc_total._rate")
    @Expose
    private Integer procTotalRate;
    @SerializedName("proc_total._sum")
    @Expose
    private Double procTotalSum;

    public Double getProcRun() {
        return procRun;
    }

    public void setProcRun(Double procRun) {
        this.procRun = procRun;
    }

    public Double getProcRunAvg() {
        return procRunAvg;
    }

    public void setProcRunAvg(Double procRunAvg) {
        this.procRunAvg = procRunAvg;
    }

    public Double getProcRunMax() {
        return procRunMax;
    }

    public void setProcRunMax(Double procRunMax) {
        this.procRunMax = procRunMax;
    }

    public Double getProcRunMin() {
        return procRunMin;
    }

    public void setProcRunMin(Double procRunMin) {
        this.procRunMin = procRunMin;
    }

    public Integer getProcRunRate() {
        return procRunRate;
    }

    public void setProcRunRate(Integer procRunRate) {
        this.procRunRate = procRunRate;
    }

    public Double getProcRunSum() {
        return procRunSum;
    }

    public void setProcRunSum(Double procRunSum) {
        this.procRunSum = procRunSum;
    }

    public Double getProcTotal() {
        return procTotal;
    }

    public void setProcTotal(Double procTotal) {
        this.procTotal = procTotal;
    }

    public Double getProcTotalAvg() {
        return procTotalAvg;
    }

    public void setProcTotalAvg(Double procTotalAvg) {
        this.procTotalAvg = procTotalAvg;
    }

    public Double getProcTotalMax() {
        return procTotalMax;
    }

    public void setProcTotalMax(Double procTotalMax) {
        this.procTotalMax = procTotalMax;
    }

    public Double getProcTotalMin() {
        return procTotalMin;
    }

    public void setProcTotalMin(Double procTotalMin) {
        this.procTotalMin = procTotalMin;
    }

    public Integer getProcTotalRate() {
        return procTotalRate;
    }

    public void setProcTotalRate(Integer procTotalRate) {
        this.procTotalRate = procTotalRate;
    }

    public Double getProcTotalSum() {
        return procTotalSum;
    }

    public void setProcTotalSum(Double procTotalSum) {
        this.procTotalSum = procTotalSum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Process.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("procRun");
        sb.append('=');
        sb.append(((this.procRun == null)?"<null>":this.procRun));
        sb.append(',');
        sb.append("procRunAvg");
        sb.append('=');
        sb.append(((this.procRunAvg == null)?"<null>":this.procRunAvg));
        sb.append(',');
        sb.append("procRunMax");
        sb.append('=');
        sb.append(((this.procRunMax == null)?"<null>":this.procRunMax));
        sb.append(',');
        sb.append("procRunMin");
        sb.append('=');
        sb.append(((this.procRunMin == null)?"<null>":this.procRunMin));
        sb.append(',');
        sb.append("procRunRate");
        sb.append('=');
        sb.append(((this.procRunRate == null)?"<null>":this.procRunRate));
        sb.append(',');
        sb.append("procRunSum");
        sb.append('=');
        sb.append(((this.procRunSum == null)?"<null>":this.procRunSum));
        sb.append(',');
        sb.append("procTotal");
        sb.append('=');
        sb.append(((this.procTotal == null)?"<null>":this.procTotal));
        sb.append(',');
        sb.append("procTotalAvg");
        sb.append('=');
        sb.append(((this.procTotalAvg == null)?"<null>":this.procTotalAvg));
        sb.append(',');
        sb.append("procTotalMax");
        sb.append('=');
        sb.append(((this.procTotalMax == null)?"<null>":this.procTotalMax));
        sb.append(',');
        sb.append("procTotalMin");
        sb.append('=');
        sb.append(((this.procTotalMin == null)?"<null>":this.procTotalMin));
        sb.append(',');
        sb.append("procTotalRate");
        sb.append('=');
        sb.append(((this.procTotalRate == null)?"<null>":this.procTotalRate));
        sb.append(',');
        sb.append("procTotalSum");
        sb.append('=');
        sb.append(((this.procTotalSum == null)?"<null>":this.procTotalSum));
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
        result = ((result* 31)+((this.procRunSum == null)? 0 :this.procRunSum.hashCode()));
        result = ((result* 31)+((this.procTotal == null)? 0 :this.procTotal.hashCode()));
        result = ((result* 31)+((this.procTotalMax == null)? 0 :this.procTotalMax.hashCode()));
        result = ((result* 31)+((this.procRunRate == null)? 0 :this.procRunRate.hashCode()));
        result = ((result* 31)+((this.procTotalRate == null)? 0 :this.procTotalRate.hashCode()));
        result = ((result* 31)+((this.procRunAvg == null)? 0 :this.procRunAvg.hashCode()));
        result = ((result* 31)+((this.procRunMin == null)? 0 :this.procRunMin.hashCode()));
        result = ((result* 31)+((this.procTotalSum == null)? 0 :this.procTotalSum.hashCode()));
        result = ((result* 31)+((this.procTotalAvg == null)? 0 :this.procTotalAvg.hashCode()));
        result = ((result* 31)+((this.procTotalMin == null)? 0 :this.procTotalMin.hashCode()));
        result = ((result* 31)+((this.procRunMax == null)? 0 :this.procRunMax.hashCode()));
        result = ((result* 31)+((this.procRun == null)? 0 :this.procRun.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Process) == false) {
            return false;
        }
        Process rhs = ((Process) other);
        return (((((((((((((this.procRunSum == rhs.procRunSum)||((this.procRunSum!= null)&&this.procRunSum.equals(rhs.procRunSum)))&&((this.procTotal == rhs.procTotal)||((this.procTotal!= null)&&this.procTotal.equals(rhs.procTotal))))&&((this.procTotalMax == rhs.procTotalMax)||((this.procTotalMax!= null)&&this.procTotalMax.equals(rhs.procTotalMax))))&&((this.procRunRate == rhs.procRunRate)||((this.procRunRate!= null)&&this.procRunRate.equals(rhs.procRunRate))))&&((this.procTotalRate == rhs.procTotalRate)||((this.procTotalRate!= null)&&this.procTotalRate.equals(rhs.procTotalRate))))&&((this.procRunAvg == rhs.procRunAvg)||((this.procRunAvg!= null)&&this.procRunAvg.equals(rhs.procRunAvg))))&&((this.procRunMin == rhs.procRunMin)||((this.procRunMin!= null)&&this.procRunMin.equals(rhs.procRunMin))))&&((this.procTotalSum == rhs.procTotalSum)||((this.procTotalSum!= null)&&this.procTotalSum.equals(rhs.procTotalSum))))&&((this.procTotalAvg == rhs.procTotalAvg)||((this.procTotalAvg!= null)&&this.procTotalAvg.equals(rhs.procTotalAvg))))&&((this.procTotalMin == rhs.procTotalMin)||((this.procTotalMin!= null)&&this.procTotalMin.equals(rhs.procTotalMin))))&&((this.procRunMax == rhs.procRunMax)||((this.procRunMax!= null)&&this.procRunMax.equals(rhs.procRunMax))))&&((this.procRun == rhs.procRun)||((this.procRun!= null)&&this.procRun.equals(rhs.procRun))));
    }

}
