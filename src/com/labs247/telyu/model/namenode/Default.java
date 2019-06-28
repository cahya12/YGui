
package com.labs247.telyu.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Default {

    @SerializedName("StartupProgress")
    @Expose
    private StartupProgress startupProgress;

    public StartupProgress getStartupProgress() {
        return startupProgress;
    }

    public void setStartupProgress(StartupProgress startupProgress) {
        this.startupProgress = startupProgress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Default.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("startupProgress");
        sb.append('=');
        sb.append(((this.startupProgress == null)?"<null>":this.startupProgress));
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
        result = ((result* 31)+((this.startupProgress == null)? 0 :this.startupProgress.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Default) == false) {
            return false;
        }
        Default rhs = ((Default) other);
        return ((this.startupProgress == rhs.startupProgress)||((this.startupProgress!= null)&&this.startupProgress.equals(rhs.startupProgress)));
    }

}
