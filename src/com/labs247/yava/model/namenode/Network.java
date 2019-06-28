
package com.labs247.yava.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Network {

    @SerializedName("bytes_in")
    @Expose
    private Double bytesIn;
    @SerializedName("bytes_in._avg")
    @Expose
    private Double bytesInAvg;
    @SerializedName("bytes_in._max")
    @Expose
    private Double bytesInMax;
    @SerializedName("bytes_in._min")
    @Expose
    private Double bytesInMin;
    @SerializedName("bytes_in._rate")
    @Expose
    private Integer bytesInRate;
    @SerializedName("bytes_in._sum")
    @Expose
    private Double bytesInSum;
    @SerializedName("bytes_out")
    @Expose
    private Double bytesOut;
    @SerializedName("bytes_out._avg")
    @Expose
    private Double bytesOutAvg;
    @SerializedName("bytes_out._max")
    @Expose
    private Double bytesOutMax;
    @SerializedName("bytes_out._min")
    @Expose
    private Double bytesOutMin;
    @SerializedName("bytes_out._rate")
    @Expose
    private Integer bytesOutRate;
    @SerializedName("bytes_out._sum")
    @Expose
    private Double bytesOutSum;
    @SerializedName("pkts_in")
    @Expose
    private Double pktsIn;
    @SerializedName("pkts_in._avg")
    @Expose
    private Double pktsInAvg;
    @SerializedName("pkts_in._max")
    @Expose
    private Double pktsInMax;
    @SerializedName("pkts_in._min")
    @Expose
    private Double pktsInMin;
    @SerializedName("pkts_in._rate")
    @Expose
    private Integer pktsInRate;
    @SerializedName("pkts_in._sum")
    @Expose
    private Double pktsInSum;
    @SerializedName("pkts_out")
    @Expose
    private Double pktsOut;
    @SerializedName("pkts_out._avg")
    @Expose
    private Double pktsOutAvg;
    @SerializedName("pkts_out._max")
    @Expose
    private Double pktsOutMax;
    @SerializedName("pkts_out._min")
    @Expose
    private Double pktsOutMin;
    @SerializedName("pkts_out._rate")
    @Expose
    private Integer pktsOutRate;
    @SerializedName("pkts_out._sum")
    @Expose
    private Double pktsOutSum;

    public Double getBytesIn() {
        return bytesIn;
    }

    public void setBytesIn(Double bytesIn) {
        this.bytesIn = bytesIn;
    }

    public Double getBytesInAvg() {
        return bytesInAvg;
    }

    public void setBytesInAvg(Double bytesInAvg) {
        this.bytesInAvg = bytesInAvg;
    }

    public Double getBytesInMax() {
        return bytesInMax;
    }

    public void setBytesInMax(Double bytesInMax) {
        this.bytesInMax = bytesInMax;
    }

    public Double getBytesInMin() {
        return bytesInMin;
    }

    public void setBytesInMin(Double bytesInMin) {
        this.bytesInMin = bytesInMin;
    }

    public Integer getBytesInRate() {
        return bytesInRate;
    }

    public void setBytesInRate(Integer bytesInRate) {
        this.bytesInRate = bytesInRate;
    }

    public Double getBytesInSum() {
        return bytesInSum;
    }

    public void setBytesInSum(Double bytesInSum) {
        this.bytesInSum = bytesInSum;
    }

    public Double getBytesOut() {
        return bytesOut;
    }

    public void setBytesOut(Double bytesOut) {
        this.bytesOut = bytesOut;
    }

    public Double getBytesOutAvg() {
        return bytesOutAvg;
    }

    public void setBytesOutAvg(Double bytesOutAvg) {
        this.bytesOutAvg = bytesOutAvg;
    }

    public Double getBytesOutMax() {
        return bytesOutMax;
    }

    public void setBytesOutMax(Double bytesOutMax) {
        this.bytesOutMax = bytesOutMax;
    }

    public Double getBytesOutMin() {
        return bytesOutMin;
    }

    public void setBytesOutMin(Double bytesOutMin) {
        this.bytesOutMin = bytesOutMin;
    }

    public Integer getBytesOutRate() {
        return bytesOutRate;
    }

    public void setBytesOutRate(Integer bytesOutRate) {
        this.bytesOutRate = bytesOutRate;
    }

    public Double getBytesOutSum() {
        return bytesOutSum;
    }

    public void setBytesOutSum(Double bytesOutSum) {
        this.bytesOutSum = bytesOutSum;
    }

    public Double getPktsIn() {
        return pktsIn;
    }

    public void setPktsIn(Double pktsIn) {
        this.pktsIn = pktsIn;
    }

    public Double getPktsInAvg() {
        return pktsInAvg;
    }

    public void setPktsInAvg(Double pktsInAvg) {
        this.pktsInAvg = pktsInAvg;
    }

    public Double getPktsInMax() {
        return pktsInMax;
    }

    public void setPktsInMax(Double pktsInMax) {
        this.pktsInMax = pktsInMax;
    }

    public Double getPktsInMin() {
        return pktsInMin;
    }

    public void setPktsInMin(Double pktsInMin) {
        this.pktsInMin = pktsInMin;
    }

    public Integer getPktsInRate() {
        return pktsInRate;
    }

    public void setPktsInRate(Integer pktsInRate) {
        this.pktsInRate = pktsInRate;
    }

    public Double getPktsInSum() {
        return pktsInSum;
    }

    public void setPktsInSum(Double pktsInSum) {
        this.pktsInSum = pktsInSum;
    }

    public Double getPktsOut() {
        return pktsOut;
    }

    public void setPktsOut(Double pktsOut) {
        this.pktsOut = pktsOut;
    }

    public Double getPktsOutAvg() {
        return pktsOutAvg;
    }

    public void setPktsOutAvg(Double pktsOutAvg) {
        this.pktsOutAvg = pktsOutAvg;
    }

    public Double getPktsOutMax() {
        return pktsOutMax;
    }

    public void setPktsOutMax(Double pktsOutMax) {
        this.pktsOutMax = pktsOutMax;
    }

    public Double getPktsOutMin() {
        return pktsOutMin;
    }

    public void setPktsOutMin(Double pktsOutMin) {
        this.pktsOutMin = pktsOutMin;
    }

    public Integer getPktsOutRate() {
        return pktsOutRate;
    }

    public void setPktsOutRate(Integer pktsOutRate) {
        this.pktsOutRate = pktsOutRate;
    }

    public Double getPktsOutSum() {
        return pktsOutSum;
    }

    public void setPktsOutSum(Double pktsOutSum) {
        this.pktsOutSum = pktsOutSum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Network.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bytesIn");
        sb.append('=');
        sb.append(((this.bytesIn == null)?"<null>":this.bytesIn));
        sb.append(',');
        sb.append("bytesInAvg");
        sb.append('=');
        sb.append(((this.bytesInAvg == null)?"<null>":this.bytesInAvg));
        sb.append(',');
        sb.append("bytesInMax");
        sb.append('=');
        sb.append(((this.bytesInMax == null)?"<null>":this.bytesInMax));
        sb.append(',');
        sb.append("bytesInMin");
        sb.append('=');
        sb.append(((this.bytesInMin == null)?"<null>":this.bytesInMin));
        sb.append(',');
        sb.append("bytesInRate");
        sb.append('=');
        sb.append(((this.bytesInRate == null)?"<null>":this.bytesInRate));
        sb.append(',');
        sb.append("bytesInSum");
        sb.append('=');
        sb.append(((this.bytesInSum == null)?"<null>":this.bytesInSum));
        sb.append(',');
        sb.append("bytesOut");
        sb.append('=');
        sb.append(((this.bytesOut == null)?"<null>":this.bytesOut));
        sb.append(',');
        sb.append("bytesOutAvg");
        sb.append('=');
        sb.append(((this.bytesOutAvg == null)?"<null>":this.bytesOutAvg));
        sb.append(',');
        sb.append("bytesOutMax");
        sb.append('=');
        sb.append(((this.bytesOutMax == null)?"<null>":this.bytesOutMax));
        sb.append(',');
        sb.append("bytesOutMin");
        sb.append('=');
        sb.append(((this.bytesOutMin == null)?"<null>":this.bytesOutMin));
        sb.append(',');
        sb.append("bytesOutRate");
        sb.append('=');
        sb.append(((this.bytesOutRate == null)?"<null>":this.bytesOutRate));
        sb.append(',');
        sb.append("bytesOutSum");
        sb.append('=');
        sb.append(((this.bytesOutSum == null)?"<null>":this.bytesOutSum));
        sb.append(',');
        sb.append("pktsIn");
        sb.append('=');
        sb.append(((this.pktsIn == null)?"<null>":this.pktsIn));
        sb.append(',');
        sb.append("pktsInAvg");
        sb.append('=');
        sb.append(((this.pktsInAvg == null)?"<null>":this.pktsInAvg));
        sb.append(',');
        sb.append("pktsInMax");
        sb.append('=');
        sb.append(((this.pktsInMax == null)?"<null>":this.pktsInMax));
        sb.append(',');
        sb.append("pktsInMin");
        sb.append('=');
        sb.append(((this.pktsInMin == null)?"<null>":this.pktsInMin));
        sb.append(',');
        sb.append("pktsInRate");
        sb.append('=');
        sb.append(((this.pktsInRate == null)?"<null>":this.pktsInRate));
        sb.append(',');
        sb.append("pktsInSum");
        sb.append('=');
        sb.append(((this.pktsInSum == null)?"<null>":this.pktsInSum));
        sb.append(',');
        sb.append("pktsOut");
        sb.append('=');
        sb.append(((this.pktsOut == null)?"<null>":this.pktsOut));
        sb.append(',');
        sb.append("pktsOutAvg");
        sb.append('=');
        sb.append(((this.pktsOutAvg == null)?"<null>":this.pktsOutAvg));
        sb.append(',');
        sb.append("pktsOutMax");
        sb.append('=');
        sb.append(((this.pktsOutMax == null)?"<null>":this.pktsOutMax));
        sb.append(',');
        sb.append("pktsOutMin");
        sb.append('=');
        sb.append(((this.pktsOutMin == null)?"<null>":this.pktsOutMin));
        sb.append(',');
        sb.append("pktsOutRate");
        sb.append('=');
        sb.append(((this.pktsOutRate == null)?"<null>":this.pktsOutRate));
        sb.append(',');
        sb.append("pktsOutSum");
        sb.append('=');
        sb.append(((this.pktsOutSum == null)?"<null>":this.pktsOutSum));
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
        result = ((result* 31)+((this.pktsInAvg == null)? 0 :this.pktsInAvg.hashCode()));
        result = ((result* 31)+((this.pktsInMin == null)? 0 :this.pktsInMin.hashCode()));
        result = ((result* 31)+((this.pktsIn == null)? 0 :this.pktsIn.hashCode()));
        result = ((result* 31)+((this.pktsInRate == null)? 0 :this.pktsInRate.hashCode()));
        result = ((result* 31)+((this.bytesInAvg == null)? 0 :this.bytesInAvg.hashCode()));
        result = ((result* 31)+((this.bytesInMin == null)? 0 :this.bytesInMin.hashCode()));
        result = ((result* 31)+((this.bytesOutMin == null)? 0 :this.bytesOutMin.hashCode()));
        result = ((result* 31)+((this.pktsOutSum == null)? 0 :this.pktsOutSum.hashCode()));
        result = ((result* 31)+((this.bytesOutAvg == null)? 0 :this.bytesOutAvg.hashCode()));
        result = ((result* 31)+((this.pktsOutRate == null)? 0 :this.pktsOutRate.hashCode()));
        result = ((result* 31)+((this.bytesOutSum == null)? 0 :this.bytesOutSum.hashCode()));
        result = ((result* 31)+((this.pktsOutAvg == null)? 0 :this.pktsOutAvg.hashCode()));
        result = ((result* 31)+((this.pktsOutMin == null)? 0 :this.pktsOutMin.hashCode()));
        result = ((result* 31)+((this.pktsInSum == null)? 0 :this.pktsInSum.hashCode()));
        result = ((result* 31)+((this.bytesInMax == null)? 0 :this.bytesInMax.hashCode()));
        result = ((result* 31)+((this.pktsOut == null)? 0 :this.pktsOut.hashCode()));
        result = ((result* 31)+((this.bytesIn == null)? 0 :this.bytesIn.hashCode()));
        result = ((result* 31)+((this.bytesOut == null)? 0 :this.bytesOut.hashCode()));
        result = ((result* 31)+((this.bytesOutRate == null)? 0 :this.bytesOutRate.hashCode()));
        result = ((result* 31)+((this.bytesInSum == null)? 0 :this.bytesInSum.hashCode()));
        result = ((result* 31)+((this.pktsInMax == null)? 0 :this.pktsInMax.hashCode()));
        result = ((result* 31)+((this.pktsOutMax == null)? 0 :this.pktsOutMax.hashCode()));
        result = ((result* 31)+((this.bytesInRate == null)? 0 :this.bytesInRate.hashCode()));
        result = ((result* 31)+((this.bytesOutMax == null)? 0 :this.bytesOutMax.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Network) == false) {
            return false;
        }
        Network rhs = ((Network) other);
        return (((((((((((((((((((((((((this.pktsInAvg == rhs.pktsInAvg)||((this.pktsInAvg!= null)&&this.pktsInAvg.equals(rhs.pktsInAvg)))&&((this.pktsInMin == rhs.pktsInMin)||((this.pktsInMin!= null)&&this.pktsInMin.equals(rhs.pktsInMin))))&&((this.pktsIn == rhs.pktsIn)||((this.pktsIn!= null)&&this.pktsIn.equals(rhs.pktsIn))))&&((this.pktsInRate == rhs.pktsInRate)||((this.pktsInRate!= null)&&this.pktsInRate.equals(rhs.pktsInRate))))&&((this.bytesInAvg == rhs.bytesInAvg)||((this.bytesInAvg!= null)&&this.bytesInAvg.equals(rhs.bytesInAvg))))&&((this.bytesInMin == rhs.bytesInMin)||((this.bytesInMin!= null)&&this.bytesInMin.equals(rhs.bytesInMin))))&&((this.bytesOutMin == rhs.bytesOutMin)||((this.bytesOutMin!= null)&&this.bytesOutMin.equals(rhs.bytesOutMin))))&&((this.pktsOutSum == rhs.pktsOutSum)||((this.pktsOutSum!= null)&&this.pktsOutSum.equals(rhs.pktsOutSum))))&&((this.bytesOutAvg == rhs.bytesOutAvg)||((this.bytesOutAvg!= null)&&this.bytesOutAvg.equals(rhs.bytesOutAvg))))&&((this.pktsOutRate == rhs.pktsOutRate)||((this.pktsOutRate!= null)&&this.pktsOutRate.equals(rhs.pktsOutRate))))&&((this.bytesOutSum == rhs.bytesOutSum)||((this.bytesOutSum!= null)&&this.bytesOutSum.equals(rhs.bytesOutSum))))&&((this.pktsOutAvg == rhs.pktsOutAvg)||((this.pktsOutAvg!= null)&&this.pktsOutAvg.equals(rhs.pktsOutAvg))))&&((this.pktsOutMin == rhs.pktsOutMin)||((this.pktsOutMin!= null)&&this.pktsOutMin.equals(rhs.pktsOutMin))))&&((this.pktsInSum == rhs.pktsInSum)||((this.pktsInSum!= null)&&this.pktsInSum.equals(rhs.pktsInSum))))&&((this.bytesInMax == rhs.bytesInMax)||((this.bytesInMax!= null)&&this.bytesInMax.equals(rhs.bytesInMax))))&&((this.pktsOut == rhs.pktsOut)||((this.pktsOut!= null)&&this.pktsOut.equals(rhs.pktsOut))))&&((this.bytesIn == rhs.bytesIn)||((this.bytesIn!= null)&&this.bytesIn.equals(rhs.bytesIn))))&&((this.bytesOut == rhs.bytesOut)||((this.bytesOut!= null)&&this.bytesOut.equals(rhs.bytesOut))))&&((this.bytesOutRate == rhs.bytesOutRate)||((this.bytesOutRate!= null)&&this.bytesOutRate.equals(rhs.bytesOutRate))))&&((this.bytesInSum == rhs.bytesInSum)||((this.bytesInSum!= null)&&this.bytesInSum.equals(rhs.bytesInSum))))&&((this.pktsInMax == rhs.pktsInMax)||((this.pktsInMax!= null)&&this.pktsInMax.equals(rhs.pktsInMax))))&&((this.pktsOutMax == rhs.pktsOutMax)||((this.pktsOutMax!= null)&&this.pktsOutMax.equals(rhs.pktsOutMax))))&&((this.bytesInRate == rhs.bytesInRate)||((this.bytesInRate!= null)&&this.bytesInRate.equals(rhs.bytesInRate))))&&((this.bytesOutMax == rhs.bytesOutMax)||((this.bytesOutMax!= null)&&this.bytesOutMax.equals(rhs.bytesOutMax))));
    }

}
