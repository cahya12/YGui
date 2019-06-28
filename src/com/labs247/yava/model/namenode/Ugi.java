
package com.labs247.yava.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ugi {

    @SerializedName("UgiMetrics")
    @Expose
    private UgiMetrics ugiMetrics;

    public UgiMetrics getUgiMetrics() {
        return ugiMetrics;
    }

    public void setUgiMetrics(UgiMetrics ugiMetrics) {
        this.ugiMetrics = ugiMetrics;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ugi.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("ugiMetrics");
        sb.append('=');
        sb.append(((this.ugiMetrics == null)?"<null>":this.ugiMetrics));
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
        result = ((result* 31)+((this.ugiMetrics == null)? 0 :this.ugiMetrics.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ugi) == false) {
            return false;
        }
        Ugi rhs = ((Ugi) other);
        return ((this.ugiMetrics == rhs.ugiMetrics)||((this.ugiMetrics!= null)&&this.ugiMetrics.equals(rhs.ugiMetrics)));
    }

}
