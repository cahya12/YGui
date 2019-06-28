
package com.labs247.telyu.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metricssystem {

    @SerializedName("MetricsSystem")
    @Expose
    private MetricsSystem metricsSystem;

    public MetricsSystem getMetricsSystem() {
        return metricsSystem;
    }

    public void setMetricsSystem(MetricsSystem metricsSystem) {
        this.metricsSystem = metricsSystem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Metricssystem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("metricsSystem");
        sb.append('=');
        sb.append(((this.metricsSystem == null)?"<null>":this.metricsSystem));
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
        result = ((result* 31)+((this.metricsSystem == null)? 0 :this.metricsSystem.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metricssystem) == false) {
            return false;
        }
        Metricssystem rhs = ((Metricssystem) other);
        return ((this.metricsSystem == rhs.metricsSystem)||((this.metricsSystem!= null)&&this.metricsSystem.equals(rhs.metricsSystem)));
    }

}
