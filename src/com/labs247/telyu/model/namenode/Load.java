
package com.labs247.telyu.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Load {

    @SerializedName("load_fifteen")
    @Expose
    private Double loadFifteen;
    @SerializedName("load_fifteen._avg")
    @Expose
    private Double loadFifteenAvg;
    @SerializedName("load_fifteen._max")
    @Expose
    private Double loadFifteenMax;
    @SerializedName("load_fifteen._min")
    @Expose
    private Double loadFifteenMin;
    @SerializedName("load_fifteen._rate")
    @Expose
    private Integer loadFifteenRate;
    @SerializedName("load_fifteen._sum")
    @Expose
    private Double loadFifteenSum;
    @SerializedName("load_five")
    @Expose
    private Double loadFive;
    @SerializedName("load_five._avg")
    @Expose
    private Double loadFiveAvg;
    @SerializedName("load_five._max")
    @Expose
    private Double loadFiveMax;
    @SerializedName("load_five._min")
    @Expose
    private Double loadFiveMin;
    @SerializedName("load_five._rate")
    @Expose
    private Integer loadFiveRate;
    @SerializedName("load_five._sum")
    @Expose
    private Double loadFiveSum;
    @SerializedName("load_one")
    @Expose
    private Double loadOne;
    @SerializedName("load_one._avg")
    @Expose
    private Double loadOneAvg;
    @SerializedName("load_one._max")
    @Expose
    private Double loadOneMax;
    @SerializedName("load_one._min")
    @Expose
    private Double loadOneMin;
    @SerializedName("load_one._rate")
    @Expose
    private Integer loadOneRate;
    @SerializedName("load_one._sum")
    @Expose
    private Double loadOneSum;

    public Double getLoadFifteen() {
        return loadFifteen;
    }

    public void setLoadFifteen(Double loadFifteen) {
        this.loadFifteen = loadFifteen;
    }

    public Double getLoadFifteenAvg() {
        return loadFifteenAvg;
    }

    public void setLoadFifteenAvg(Double loadFifteenAvg) {
        this.loadFifteenAvg = loadFifteenAvg;
    }

    public Double getLoadFifteenMax() {
        return loadFifteenMax;
    }

    public void setLoadFifteenMax(Double loadFifteenMax) {
        this.loadFifteenMax = loadFifteenMax;
    }

    public Double getLoadFifteenMin() {
        return loadFifteenMin;
    }

    public void setLoadFifteenMin(Double loadFifteenMin) {
        this.loadFifteenMin = loadFifteenMin;
    }

    public Integer getLoadFifteenRate() {
        return loadFifteenRate;
    }

    public void setLoadFifteenRate(Integer loadFifteenRate) {
        this.loadFifteenRate = loadFifteenRate;
    }

    public Double getLoadFifteenSum() {
        return loadFifteenSum;
    }

    public void setLoadFifteenSum(Double loadFifteenSum) {
        this.loadFifteenSum = loadFifteenSum;
    }

    public Double getLoadFive() {
        return loadFive;
    }

    public void setLoadFive(Double loadFive) {
        this.loadFive = loadFive;
    }

    public Double getLoadFiveAvg() {
        return loadFiveAvg;
    }

    public void setLoadFiveAvg(Double loadFiveAvg) {
        this.loadFiveAvg = loadFiveAvg;
    }

    public Double getLoadFiveMax() {
        return loadFiveMax;
    }

    public void setLoadFiveMax(Double loadFiveMax) {
        this.loadFiveMax = loadFiveMax;
    }

    public Double getLoadFiveMin() {
        return loadFiveMin;
    }

    public void setLoadFiveMin(Double loadFiveMin) {
        this.loadFiveMin = loadFiveMin;
    }

    public Integer getLoadFiveRate() {
        return loadFiveRate;
    }

    public void setLoadFiveRate(Integer loadFiveRate) {
        this.loadFiveRate = loadFiveRate;
    }

    public Double getLoadFiveSum() {
        return loadFiveSum;
    }

    public void setLoadFiveSum(Double loadFiveSum) {
        this.loadFiveSum = loadFiveSum;
    }

    public Double getLoadOne() {
        return loadOne;
    }

    public void setLoadOne(Double loadOne) {
        this.loadOne = loadOne;
    }

    public Double getLoadOneAvg() {
        return loadOneAvg;
    }

    public void setLoadOneAvg(Double loadOneAvg) {
        this.loadOneAvg = loadOneAvg;
    }

    public Double getLoadOneMax() {
        return loadOneMax;
    }

    public void setLoadOneMax(Double loadOneMax) {
        this.loadOneMax = loadOneMax;
    }

    public Double getLoadOneMin() {
        return loadOneMin;
    }

    public void setLoadOneMin(Double loadOneMin) {
        this.loadOneMin = loadOneMin;
    }

    public Integer getLoadOneRate() {
        return loadOneRate;
    }

    public void setLoadOneRate(Integer loadOneRate) {
        this.loadOneRate = loadOneRate;
    }

    public Double getLoadOneSum() {
        return loadOneSum;
    }

    public void setLoadOneSum(Double loadOneSum) {
        this.loadOneSum = loadOneSum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Load.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("loadFifteen");
        sb.append('=');
        sb.append(((this.loadFifteen == null)?"<null>":this.loadFifteen));
        sb.append(',');
        sb.append("loadFifteenAvg");
        sb.append('=');
        sb.append(((this.loadFifteenAvg == null)?"<null>":this.loadFifteenAvg));
        sb.append(',');
        sb.append("loadFifteenMax");
        sb.append('=');
        sb.append(((this.loadFifteenMax == null)?"<null>":this.loadFifteenMax));
        sb.append(',');
        sb.append("loadFifteenMin");
        sb.append('=');
        sb.append(((this.loadFifteenMin == null)?"<null>":this.loadFifteenMin));
        sb.append(',');
        sb.append("loadFifteenRate");
        sb.append('=');
        sb.append(((this.loadFifteenRate == null)?"<null>":this.loadFifteenRate));
        sb.append(',');
        sb.append("loadFifteenSum");
        sb.append('=');
        sb.append(((this.loadFifteenSum == null)?"<null>":this.loadFifteenSum));
        sb.append(',');
        sb.append("loadFive");
        sb.append('=');
        sb.append(((this.loadFive == null)?"<null>":this.loadFive));
        sb.append(',');
        sb.append("loadFiveAvg");
        sb.append('=');
        sb.append(((this.loadFiveAvg == null)?"<null>":this.loadFiveAvg));
        sb.append(',');
        sb.append("loadFiveMax");
        sb.append('=');
        sb.append(((this.loadFiveMax == null)?"<null>":this.loadFiveMax));
        sb.append(',');
        sb.append("loadFiveMin");
        sb.append('=');
        sb.append(((this.loadFiveMin == null)?"<null>":this.loadFiveMin));
        sb.append(',');
        sb.append("loadFiveRate");
        sb.append('=');
        sb.append(((this.loadFiveRate == null)?"<null>":this.loadFiveRate));
        sb.append(',');
        sb.append("loadFiveSum");
        sb.append('=');
        sb.append(((this.loadFiveSum == null)?"<null>":this.loadFiveSum));
        sb.append(',');
        sb.append("loadOne");
        sb.append('=');
        sb.append(((this.loadOne == null)?"<null>":this.loadOne));
        sb.append(',');
        sb.append("loadOneAvg");
        sb.append('=');
        sb.append(((this.loadOneAvg == null)?"<null>":this.loadOneAvg));
        sb.append(',');
        sb.append("loadOneMax");
        sb.append('=');
        sb.append(((this.loadOneMax == null)?"<null>":this.loadOneMax));
        sb.append(',');
        sb.append("loadOneMin");
        sb.append('=');
        sb.append(((this.loadOneMin == null)?"<null>":this.loadOneMin));
        sb.append(',');
        sb.append("loadOneRate");
        sb.append('=');
        sb.append(((this.loadOneRate == null)?"<null>":this.loadOneRate));
        sb.append(',');
        sb.append("loadOneSum");
        sb.append('=');
        sb.append(((this.loadOneSum == null)?"<null>":this.loadOneSum));
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
        result = ((result* 31)+((this.loadFive == null)? 0 :this.loadFive.hashCode()));
        result = ((result* 31)+((this.loadFiveRate == null)? 0 :this.loadFiveRate.hashCode()));
        result = ((result* 31)+((this.loadOneAvg == null)? 0 :this.loadOneAvg.hashCode()));
        result = ((result* 31)+((this.loadFifteenSum == null)? 0 :this.loadFifteenSum.hashCode()));
        result = ((result* 31)+((this.loadOneMin == null)? 0 :this.loadOneMin.hashCode()));
        result = ((result* 31)+((this.loadFifteenAvg == null)? 0 :this.loadFifteenAvg.hashCode()));
        result = ((result* 31)+((this.loadFifteenMin == null)? 0 :this.loadFifteenMin.hashCode()));
        result = ((result* 31)+((this.loadFifteenRate == null)? 0 :this.loadFifteenRate.hashCode()));
        result = ((result* 31)+((this.loadFiveMax == null)? 0 :this.loadFiveMax.hashCode()));
        result = ((result* 31)+((this.loadOneRate == null)? 0 :this.loadOneRate.hashCode()));
        result = ((result* 31)+((this.loadOne == null)? 0 :this.loadOne.hashCode()));
        result = ((result* 31)+((this.loadOneMax == null)? 0 :this.loadOneMax.hashCode()));
        result = ((result* 31)+((this.loadFiveSum == null)? 0 :this.loadFiveSum.hashCode()));
        result = ((result* 31)+((this.loadFifteen == null)? 0 :this.loadFifteen.hashCode()));
        result = ((result* 31)+((this.loadFiveMin == null)? 0 :this.loadFiveMin.hashCode()));
        result = ((result* 31)+((this.loadFifteenMax == null)? 0 :this.loadFifteenMax.hashCode()));
        result = ((result* 31)+((this.loadOneSum == null)? 0 :this.loadOneSum.hashCode()));
        result = ((result* 31)+((this.loadFiveAvg == null)? 0 :this.loadFiveAvg.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Load) == false) {
            return false;
        }
        Load rhs = ((Load) other);
        return (((((((((((((((((((this.loadFive == rhs.loadFive)||((this.loadFive!= null)&&this.loadFive.equals(rhs.loadFive)))&&((this.loadFiveRate == rhs.loadFiveRate)||((this.loadFiveRate!= null)&&this.loadFiveRate.equals(rhs.loadFiveRate))))&&((this.loadOneAvg == rhs.loadOneAvg)||((this.loadOneAvg!= null)&&this.loadOneAvg.equals(rhs.loadOneAvg))))&&((this.loadFifteenSum == rhs.loadFifteenSum)||((this.loadFifteenSum!= null)&&this.loadFifteenSum.equals(rhs.loadFifteenSum))))&&((this.loadOneMin == rhs.loadOneMin)||((this.loadOneMin!= null)&&this.loadOneMin.equals(rhs.loadOneMin))))&&((this.loadFifteenAvg == rhs.loadFifteenAvg)||((this.loadFifteenAvg!= null)&&this.loadFifteenAvg.equals(rhs.loadFifteenAvg))))&&((this.loadFifteenMin == rhs.loadFifteenMin)||((this.loadFifteenMin!= null)&&this.loadFifteenMin.equals(rhs.loadFifteenMin))))&&((this.loadFifteenRate == rhs.loadFifteenRate)||((this.loadFifteenRate!= null)&&this.loadFifteenRate.equals(rhs.loadFifteenRate))))&&((this.loadFiveMax == rhs.loadFiveMax)||((this.loadFiveMax!= null)&&this.loadFiveMax.equals(rhs.loadFiveMax))))&&((this.loadOneRate == rhs.loadOneRate)||((this.loadOneRate!= null)&&this.loadOneRate.equals(rhs.loadOneRate))))&&((this.loadOne == rhs.loadOne)||((this.loadOne!= null)&&this.loadOne.equals(rhs.loadOne))))&&((this.loadOneMax == rhs.loadOneMax)||((this.loadOneMax!= null)&&this.loadOneMax.equals(rhs.loadOneMax))))&&((this.loadFiveSum == rhs.loadFiveSum)||((this.loadFiveSum!= null)&&this.loadFiveSum.equals(rhs.loadFiveSum))))&&((this.loadFifteen == rhs.loadFifteen)||((this.loadFifteen!= null)&&this.loadFifteen.equals(rhs.loadFifteen))))&&((this.loadFiveMin == rhs.loadFiveMin)||((this.loadFiveMin!= null)&&this.loadFiveMin.equals(rhs.loadFiveMin))))&&((this.loadFifteenMax == rhs.loadFifteenMax)||((this.loadFifteenMax!= null)&&this.loadFifteenMax.equals(rhs.loadFifteenMax))))&&((this.loadOneSum == rhs.loadOneSum)||((this.loadOneSum!= null)&&this.loadOneSum.equals(rhs.loadOneSum))))&&((this.loadFiveAvg == rhs.loadFiveAvg)||((this.loadFiveAvg!= null)&&this.loadFiveAvg.equals(rhs.loadFiveAvg))));
    }

}
