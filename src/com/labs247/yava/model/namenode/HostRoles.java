
package com.labs247.yava.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HostRoles {

    @SerializedName("cluster_name")
    @Expose
    private String clusterName;
    @SerializedName("component_name")
    @Expose
    private String componentName;
    @SerializedName("host_name")
    @Expose
    private String hostName;

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HostRoles.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("clusterName");
        sb.append('=');
        sb.append(((this.clusterName == null)?"<null>":this.clusterName));
        sb.append(',');
        sb.append("componentName");
        sb.append('=');
        sb.append(((this.componentName == null)?"<null>":this.componentName));
        sb.append(',');
        sb.append("hostName");
        sb.append('=');
        sb.append(((this.hostName == null)?"<null>":this.hostName));
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
        result = ((result* 31)+((this.hostName == null)? 0 :this.hostName.hashCode()));
        result = ((result* 31)+((this.componentName == null)? 0 :this.componentName.hashCode()));
        result = ((result* 31)+((this.clusterName == null)? 0 :this.clusterName.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HostRoles) == false) {
            return false;
        }
        HostRoles rhs = ((HostRoles) other);
        return ((((this.hostName == rhs.hostName)||((this.hostName!= null)&&this.hostName.equals(rhs.hostName)))&&((this.componentName == rhs.componentName)||((this.componentName!= null)&&this.componentName.equals(rhs.componentName))))&&((this.clusterName == rhs.clusterName)||((this.clusterName!= null)&&this.clusterName.equals(rhs.clusterName))));
    }

}
