
package com.labs247.telyu.model.namenode;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NameNode {

    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("ServiceComponentInfo")
    @Expose
    private ServiceComponentInfo serviceComponentInfo;
    @SerializedName("metrics")
    @Expose
    private Metrics metrics;
    @SerializedName("host_components")
    @Expose
    private List<HostComponent> hostComponents = new ArrayList<HostComponent>();

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ServiceComponentInfo getServiceComponentInfo() {
        return serviceComponentInfo;
    }

    public void setServiceComponentInfo(ServiceComponentInfo serviceComponentInfo) {
        this.serviceComponentInfo = serviceComponentInfo;
    }

    public Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    public List<HostComponent> getHostComponents() {
        return hostComponents;
    }

    public void setHostComponents(List<HostComponent> hostComponents) {
        this.hostComponents = hostComponents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NameNode.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("href");
        sb.append('=');
        sb.append(((this.href == null)?"<null>":this.href));
        sb.append(',');
        sb.append("serviceComponentInfo");
        sb.append('=');
        sb.append(((this.serviceComponentInfo == null)?"<null>":this.serviceComponentInfo));
        sb.append(',');
        sb.append("metrics");
        sb.append('=');
        sb.append(((this.metrics == null)?"<null>":this.metrics));
        sb.append(',');
        sb.append("hostComponents");
        sb.append('=');
        sb.append(((this.hostComponents == null)?"<null>":this.hostComponents));
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
        result = ((result* 31)+((this.hostComponents == null)? 0 :this.hostComponents.hashCode()));
        result = ((result* 31)+((this.href == null)? 0 :this.href.hashCode()));
        result = ((result* 31)+((this.serviceComponentInfo == null)? 0 :this.serviceComponentInfo.hashCode()));
        result = ((result* 31)+((this.metrics == null)? 0 :this.metrics.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NameNode) == false) {
            return false;
        }
        NameNode rhs = ((NameNode) other);
        return (((((this.hostComponents == rhs.hostComponents)||((this.hostComponents!= null)&&this.hostComponents.equals(rhs.hostComponents)))&&((this.href == rhs.href)||((this.href!= null)&&this.href.equals(rhs.href))))&&((this.serviceComponentInfo == rhs.serviceComponentInfo)||((this.serviceComponentInfo!= null)&&this.serviceComponentInfo.equals(rhs.serviceComponentInfo))))&&((this.metrics == rhs.metrics)||((this.metrics!= null)&&this.metrics.equals(rhs.metrics))));
    }

}
