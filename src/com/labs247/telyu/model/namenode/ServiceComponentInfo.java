
package com.labs247.telyu.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServiceComponentInfo {

    @SerializedName("CapacityRemaining")
    @Expose
    private Integer capacityRemaining;
    @SerializedName("CapacityTotal")
    @Expose
    private Integer capacityTotal;
    @SerializedName("CapacityUsed")
    @Expose
    private Integer capacityUsed;
    @SerializedName("DeadNodes")
    @Expose
    private String deadNodes;
    @SerializedName("DecomNodes")
    @Expose
    private String decomNodes;
    @SerializedName("HeapMemoryMax")
    @Expose
    private Integer heapMemoryMax;
    @SerializedName("HeapMemoryUsed")
    @Expose
    private Integer heapMemoryUsed;
    @SerializedName("LiveNodes")
    @Expose
    private String liveNodes;
    @SerializedName("NonDfsUsedSpace")
    @Expose
    private Integer nonDfsUsedSpace;
    @SerializedName("NonHeapMemoryMax")
    @Expose
    private Integer nonHeapMemoryMax;
    @SerializedName("NonHeapMemoryUsed")
    @Expose
    private Integer nonHeapMemoryUsed;
    @SerializedName("PercentRemaining")
    @Expose
    private Double percentRemaining;
    @SerializedName("PercentUsed")
    @Expose
    private Double percentUsed;
    @SerializedName("Safemode")
    @Expose
    private String safemode;
    @SerializedName("StartTime")
    @Expose
    private Integer startTime;
    @SerializedName("UpgradeFinalized")
    @Expose
    private Boolean upgradeFinalized;
    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("cluster_name")
    @Expose
    private String clusterName;
    @SerializedName("component_name")
    @Expose
    private String componentName;
    @SerializedName("desired_stack")
    @Expose
    private String desiredStack;
    @SerializedName("desired_version")
    @Expose
    private String desiredVersion;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("init_count")
    @Expose
    private Integer initCount;
    @SerializedName("install_failed_count")
    @Expose
    private Integer installFailedCount;
    @SerializedName("installed_and_maintenance_off_count")
    @Expose
    private Integer installedAndMaintenanceOffCount;
    @SerializedName("installed_count")
    @Expose
    private Integer installedCount;
    @SerializedName("recovery_enabled")
    @Expose
    private String recoveryEnabled;
    @SerializedName("repository_state")
    @Expose
    private String repositoryState;
    @SerializedName("service_name")
    @Expose
    private String serviceName;
    @SerializedName("started_count")
    @Expose
    private Integer startedCount;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("unknown_count")
    @Expose
    private Integer unknownCount;

    public Integer getCapacityRemaining() {
        return capacityRemaining;
    }

    public void setCapacityRemaining(Integer capacityRemaining) {
        this.capacityRemaining = capacityRemaining;
    }

    public Integer getCapacityTotal() {
        return capacityTotal;
    }

    public void setCapacityTotal(Integer capacityTotal) {
        this.capacityTotal = capacityTotal;
    }

    public Integer getCapacityUsed() {
        return capacityUsed;
    }

    public void setCapacityUsed(Integer capacityUsed) {
        this.capacityUsed = capacityUsed;
    }

    public String getDeadNodes() {
        return deadNodes;
    }

    public void setDeadNodes(String deadNodes) {
        this.deadNodes = deadNodes;
    }

    public String getDecomNodes() {
        return decomNodes;
    }

    public void setDecomNodes(String decomNodes) {
        this.decomNodes = decomNodes;
    }

    public Integer getHeapMemoryMax() {
        return heapMemoryMax;
    }

    public void setHeapMemoryMax(Integer heapMemoryMax) {
        this.heapMemoryMax = heapMemoryMax;
    }

    public Integer getHeapMemoryUsed() {
        return heapMemoryUsed;
    }

    public void setHeapMemoryUsed(Integer heapMemoryUsed) {
        this.heapMemoryUsed = heapMemoryUsed;
    }

    public String getLiveNodes() {
        return liveNodes;
    }

    public void setLiveNodes(String liveNodes) {
        this.liveNodes = liveNodes;
    }

    public Integer getNonDfsUsedSpace() {
        return nonDfsUsedSpace;
    }

    public void setNonDfsUsedSpace(Integer nonDfsUsedSpace) {
        this.nonDfsUsedSpace = nonDfsUsedSpace;
    }

    public Integer getNonHeapMemoryMax() {
        return nonHeapMemoryMax;
    }

    public void setNonHeapMemoryMax(Integer nonHeapMemoryMax) {
        this.nonHeapMemoryMax = nonHeapMemoryMax;
    }

    public Integer getNonHeapMemoryUsed() {
        return nonHeapMemoryUsed;
    }

    public void setNonHeapMemoryUsed(Integer nonHeapMemoryUsed) {
        this.nonHeapMemoryUsed = nonHeapMemoryUsed;
    }

    public Double getPercentRemaining() {
        return percentRemaining;
    }

    public void setPercentRemaining(Double percentRemaining) {
        this.percentRemaining = percentRemaining;
    }

    public Double getPercentUsed() {
        return percentUsed;
    }

    public void setPercentUsed(Double percentUsed) {
        this.percentUsed = percentUsed;
    }

    public String getSafemode() {
        return safemode;
    }

    public void setSafemode(String safemode) {
        this.safemode = safemode;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public Boolean getUpgradeFinalized() {
        return upgradeFinalized;
    }

    public void setUpgradeFinalized(Boolean upgradeFinalized) {
        this.upgradeFinalized = upgradeFinalized;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

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

    public String getDesiredStack() {
        return desiredStack;
    }

    public void setDesiredStack(String desiredStack) {
        this.desiredStack = desiredStack;
    }

    public String getDesiredVersion() {
        return desiredVersion;
    }

    public void setDesiredVersion(String desiredVersion) {
        this.desiredVersion = desiredVersion;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getInitCount() {
        return initCount;
    }

    public void setInitCount(Integer initCount) {
        this.initCount = initCount;
    }

    public Integer getInstallFailedCount() {
        return installFailedCount;
    }

    public void setInstallFailedCount(Integer installFailedCount) {
        this.installFailedCount = installFailedCount;
    }

    public Integer getInstalledAndMaintenanceOffCount() {
        return installedAndMaintenanceOffCount;
    }

    public void setInstalledAndMaintenanceOffCount(Integer installedAndMaintenanceOffCount) {
        this.installedAndMaintenanceOffCount = installedAndMaintenanceOffCount;
    }

    public Integer getInstalledCount() {
        return installedCount;
    }

    public void setInstalledCount(Integer installedCount) {
        this.installedCount = installedCount;
    }

    public String getRecoveryEnabled() {
        return recoveryEnabled;
    }

    public void setRecoveryEnabled(String recoveryEnabled) {
        this.recoveryEnabled = recoveryEnabled;
    }

    public String getRepositoryState() {
        return repositoryState;
    }

    public void setRepositoryState(String repositoryState) {
        this.repositoryState = repositoryState;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Integer getStartedCount() {
        return startedCount;
    }

    public void setStartedCount(Integer startedCount) {
        this.startedCount = startedCount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getUnknownCount() {
        return unknownCount;
    }

    public void setUnknownCount(Integer unknownCount) {
        this.unknownCount = unknownCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ServiceComponentInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("capacityRemaining");
        sb.append('=');
        sb.append(((this.capacityRemaining == null)?"<null>":this.capacityRemaining));
        sb.append(',');
        sb.append("capacityTotal");
        sb.append('=');
        sb.append(((this.capacityTotal == null)?"<null>":this.capacityTotal));
        sb.append(',');
        sb.append("capacityUsed");
        sb.append('=');
        sb.append(((this.capacityUsed == null)?"<null>":this.capacityUsed));
        sb.append(',');
        sb.append("deadNodes");
        sb.append('=');
        sb.append(((this.deadNodes == null)?"<null>":this.deadNodes));
        sb.append(',');
        sb.append("decomNodes");
        sb.append('=');
        sb.append(((this.decomNodes == null)?"<null>":this.decomNodes));
        sb.append(',');
        sb.append("heapMemoryMax");
        sb.append('=');
        sb.append(((this.heapMemoryMax == null)?"<null>":this.heapMemoryMax));
        sb.append(',');
        sb.append("heapMemoryUsed");
        sb.append('=');
        sb.append(((this.heapMemoryUsed == null)?"<null>":this.heapMemoryUsed));
        sb.append(',');
        sb.append("liveNodes");
        sb.append('=');
        sb.append(((this.liveNodes == null)?"<null>":this.liveNodes));
        sb.append(',');
        sb.append("nonDfsUsedSpace");
        sb.append('=');
        sb.append(((this.nonDfsUsedSpace == null)?"<null>":this.nonDfsUsedSpace));
        sb.append(',');
        sb.append("nonHeapMemoryMax");
        sb.append('=');
        sb.append(((this.nonHeapMemoryMax == null)?"<null>":this.nonHeapMemoryMax));
        sb.append(',');
        sb.append("nonHeapMemoryUsed");
        sb.append('=');
        sb.append(((this.nonHeapMemoryUsed == null)?"<null>":this.nonHeapMemoryUsed));
        sb.append(',');
        sb.append("percentRemaining");
        sb.append('=');
        sb.append(((this.percentRemaining == null)?"<null>":this.percentRemaining));
        sb.append(',');
        sb.append("percentUsed");
        sb.append('=');
        sb.append(((this.percentUsed == null)?"<null>":this.percentUsed));
        sb.append(',');
        sb.append("safemode");
        sb.append('=');
        sb.append(((this.safemode == null)?"<null>":this.safemode));
        sb.append(',');
        sb.append("startTime");
        sb.append('=');
        sb.append(((this.startTime == null)?"<null>":this.startTime));
        sb.append(',');
        sb.append("upgradeFinalized");
        sb.append('=');
        sb.append(((this.upgradeFinalized == null)?"<null>":this.upgradeFinalized));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("clusterName");
        sb.append('=');
        sb.append(((this.clusterName == null)?"<null>":this.clusterName));
        sb.append(',');
        sb.append("componentName");
        sb.append('=');
        sb.append(((this.componentName == null)?"<null>":this.componentName));
        sb.append(',');
        sb.append("desiredStack");
        sb.append('=');
        sb.append(((this.desiredStack == null)?"<null>":this.desiredStack));
        sb.append(',');
        sb.append("desiredVersion");
        sb.append('=');
        sb.append(((this.desiredVersion == null)?"<null>":this.desiredVersion));
        sb.append(',');
        sb.append("displayName");
        sb.append('=');
        sb.append(((this.displayName == null)?"<null>":this.displayName));
        sb.append(',');
        sb.append("initCount");
        sb.append('=');
        sb.append(((this.initCount == null)?"<null>":this.initCount));
        sb.append(',');
        sb.append("installFailedCount");
        sb.append('=');
        sb.append(((this.installFailedCount == null)?"<null>":this.installFailedCount));
        sb.append(',');
        sb.append("installedAndMaintenanceOffCount");
        sb.append('=');
        sb.append(((this.installedAndMaintenanceOffCount == null)?"<null>":this.installedAndMaintenanceOffCount));
        sb.append(',');
        sb.append("installedCount");
        sb.append('=');
        sb.append(((this.installedCount == null)?"<null>":this.installedCount));
        sb.append(',');
        sb.append("recoveryEnabled");
        sb.append('=');
        sb.append(((this.recoveryEnabled == null)?"<null>":this.recoveryEnabled));
        sb.append(',');
        sb.append("repositoryState");
        sb.append('=');
        sb.append(((this.repositoryState == null)?"<null>":this.repositoryState));
        sb.append(',');
        sb.append("serviceName");
        sb.append('=');
        sb.append(((this.serviceName == null)?"<null>":this.serviceName));
        sb.append(',');
        sb.append("startedCount");
        sb.append('=');
        sb.append(((this.startedCount == null)?"<null>":this.startedCount));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("totalCount");
        sb.append('=');
        sb.append(((this.totalCount == null)?"<null>":this.totalCount));
        sb.append(',');
        sb.append("unknownCount");
        sb.append('=');
        sb.append(((this.unknownCount == null)?"<null>":this.unknownCount));
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
        result = ((result* 31)+((this.safemode == null)? 0 :this.safemode.hashCode()));
        result = ((result* 31)+((this.displayName == null)? 0 :this.displayName.hashCode()));
        result = ((result* 31)+((this.initCount == null)? 0 :this.initCount.hashCode()));
        result = ((result* 31)+((this.percentUsed == null)? 0 :this.percentUsed.hashCode()));
        result = ((result* 31)+((this.totalCount == null)? 0 :this.totalCount.hashCode()));
        result = ((result* 31)+((this.nonHeapMemoryUsed == null)? 0 :this.nonHeapMemoryUsed.hashCode()));
        result = ((result* 31)+((this.percentRemaining == null)? 0 :this.percentRemaining.hashCode()));
        result = ((result* 31)+((this.upgradeFinalized == null)? 0 :this.upgradeFinalized.hashCode()));
        result = ((result* 31)+((this.liveNodes == null)? 0 :this.liveNodes.hashCode()));
        result = ((result* 31)+((this.clusterName == null)? 0 :this.clusterName.hashCode()));
        result = ((result* 31)+((this.recoveryEnabled == null)? 0 :this.recoveryEnabled.hashCode()));
        result = ((result* 31)+((this.desiredVersion == null)? 0 :this.desiredVersion.hashCode()));
        result = ((result* 31)+((this.startTime == null)? 0 :this.startTime.hashCode()));
        result = ((result* 31)+((this.componentName == null)? 0 :this.componentName.hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.deadNodes == null)? 0 :this.deadNodes.hashCode()));
        result = ((result* 31)+((this.heapMemoryMax == null)? 0 :this.heapMemoryMax.hashCode()));
        result = ((result* 31)+((this.installFailedCount == null)? 0 :this.installFailedCount.hashCode()));
        result = ((result* 31)+((this.decomNodes == null)? 0 :this.decomNodes.hashCode()));
        result = ((result* 31)+((this.capacityUsed == null)? 0 :this.capacityUsed.hashCode()));
        result = ((result* 31)+((this.heapMemoryUsed == null)? 0 :this.heapMemoryUsed.hashCode()));
        result = ((result* 31)+((this.serviceName == null)? 0 :this.serviceName.hashCode()));
        result = ((result* 31)+((this.startedCount == null)? 0 :this.startedCount.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.nonDfsUsedSpace == null)? 0 :this.nonDfsUsedSpace.hashCode()));
        result = ((result* 31)+((this.capacityRemaining == null)? 0 :this.capacityRemaining.hashCode()));
        result = ((result* 31)+((this.unknownCount == null)? 0 :this.unknownCount.hashCode()));
        result = ((result* 31)+((this.installedCount == null)? 0 :this.installedCount.hashCode()));
        result = ((result* 31)+((this.nonHeapMemoryMax == null)? 0 :this.nonHeapMemoryMax.hashCode()));
        result = ((result* 31)+((this.desiredStack == null)? 0 :this.desiredStack.hashCode()));
        result = ((result* 31)+((this.installedAndMaintenanceOffCount == null)? 0 :this.installedAndMaintenanceOffCount.hashCode()));
        result = ((result* 31)+((this.capacityTotal == null)? 0 :this.capacityTotal.hashCode()));
        result = ((result* 31)+((this.category == null)? 0 :this.category.hashCode()));
        result = ((result* 31)+((this.repositoryState == null)? 0 :this.repositoryState.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceComponentInfo) == false) {
            return false;
        }
        ServiceComponentInfo rhs = ((ServiceComponentInfo) other);
        return (((((((((((((((((((((((((((((((((((this.safemode == rhs.safemode)||((this.safemode!= null)&&this.safemode.equals(rhs.safemode)))&&((this.displayName == rhs.displayName)||((this.displayName!= null)&&this.displayName.equals(rhs.displayName))))&&((this.initCount == rhs.initCount)||((this.initCount!= null)&&this.initCount.equals(rhs.initCount))))&&((this.percentUsed == rhs.percentUsed)||((this.percentUsed!= null)&&this.percentUsed.equals(rhs.percentUsed))))&&((this.totalCount == rhs.totalCount)||((this.totalCount!= null)&&this.totalCount.equals(rhs.totalCount))))&&((this.nonHeapMemoryUsed == rhs.nonHeapMemoryUsed)||((this.nonHeapMemoryUsed!= null)&&this.nonHeapMemoryUsed.equals(rhs.nonHeapMemoryUsed))))&&((this.percentRemaining == rhs.percentRemaining)||((this.percentRemaining!= null)&&this.percentRemaining.equals(rhs.percentRemaining))))&&((this.upgradeFinalized == rhs.upgradeFinalized)||((this.upgradeFinalized!= null)&&this.upgradeFinalized.equals(rhs.upgradeFinalized))))&&((this.liveNodes == rhs.liveNodes)||((this.liveNodes!= null)&&this.liveNodes.equals(rhs.liveNodes))))&&((this.clusterName == rhs.clusterName)||((this.clusterName!= null)&&this.clusterName.equals(rhs.clusterName))))&&((this.recoveryEnabled == rhs.recoveryEnabled)||((this.recoveryEnabled!= null)&&this.recoveryEnabled.equals(rhs.recoveryEnabled))))&&((this.desiredVersion == rhs.desiredVersion)||((this.desiredVersion!= null)&&this.desiredVersion.equals(rhs.desiredVersion))))&&((this.startTime == rhs.startTime)||((this.startTime!= null)&&this.startTime.equals(rhs.startTime))))&&((this.componentName == rhs.componentName)||((this.componentName!= null)&&this.componentName.equals(rhs.componentName))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.deadNodes == rhs.deadNodes)||((this.deadNodes!= null)&&this.deadNodes.equals(rhs.deadNodes))))&&((this.heapMemoryMax == rhs.heapMemoryMax)||((this.heapMemoryMax!= null)&&this.heapMemoryMax.equals(rhs.heapMemoryMax))))&&((this.installFailedCount == rhs.installFailedCount)||((this.installFailedCount!= null)&&this.installFailedCount.equals(rhs.installFailedCount))))&&((this.decomNodes == rhs.decomNodes)||((this.decomNodes!= null)&&this.decomNodes.equals(rhs.decomNodes))))&&((this.capacityUsed == rhs.capacityUsed)||((this.capacityUsed!= null)&&this.capacityUsed.equals(rhs.capacityUsed))))&&((this.heapMemoryUsed == rhs.heapMemoryUsed)||((this.heapMemoryUsed!= null)&&this.heapMemoryUsed.equals(rhs.heapMemoryUsed))))&&((this.serviceName == rhs.serviceName)||((this.serviceName!= null)&&this.serviceName.equals(rhs.serviceName))))&&((this.startedCount == rhs.startedCount)||((this.startedCount!= null)&&this.startedCount.equals(rhs.startedCount))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.nonDfsUsedSpace == rhs.nonDfsUsedSpace)||((this.nonDfsUsedSpace!= null)&&this.nonDfsUsedSpace.equals(rhs.nonDfsUsedSpace))))&&((this.capacityRemaining == rhs.capacityRemaining)||((this.capacityRemaining!= null)&&this.capacityRemaining.equals(rhs.capacityRemaining))))&&((this.unknownCount == rhs.unknownCount)||((this.unknownCount!= null)&&this.unknownCount.equals(rhs.unknownCount))))&&((this.installedCount == rhs.installedCount)||((this.installedCount!= null)&&this.installedCount.equals(rhs.installedCount))))&&((this.nonHeapMemoryMax == rhs.nonHeapMemoryMax)||((this.nonHeapMemoryMax!= null)&&this.nonHeapMemoryMax.equals(rhs.nonHeapMemoryMax))))&&((this.desiredStack == rhs.desiredStack)||((this.desiredStack!= null)&&this.desiredStack.equals(rhs.desiredStack))))&&((this.installedAndMaintenanceOffCount == rhs.installedAndMaintenanceOffCount)||((this.installedAndMaintenanceOffCount!= null)&&this.installedAndMaintenanceOffCount.equals(rhs.installedAndMaintenanceOffCount))))&&((this.capacityTotal == rhs.capacityTotal)||((this.capacityTotal!= null)&&this.capacityTotal.equals(rhs.capacityTotal))))&&((this.category == rhs.category)||((this.category!= null)&&this.category.equals(rhs.category))))&&((this.repositoryState == rhs.repositoryState)||((this.repositoryState!= null)&&this.repositoryState.equals(rhs.repositoryState))));
    }

}
