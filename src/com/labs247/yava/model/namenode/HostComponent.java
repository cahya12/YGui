
package com.labs247.yava.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HostComponent {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("HostRoles")
    @Expose
    private HostRoles hostRoles;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public HostRoles getHostRoles() {
        return hostRoles;
    }

    public void setHostRoles(HostRoles hostRoles) {
        this.hostRoles = hostRoles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HostComponent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("hostRoles");
        sb.append('=');
        sb.append(((this.hostRoles == null)?"<null>":this.hostRoles));
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
        result = ((result* 31)+((this.hostRoles == null)? 0 :this.hostRoles.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HostComponent) == false) {
            return false;
        }
        HostComponent rhs = ((HostComponent) other);
        return (((this.hostRoles == rhs.hostRoles)||((this.hostRoles!= null)&&this.hostRoles.equals(rhs.hostRoles)))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))));
    }

}
