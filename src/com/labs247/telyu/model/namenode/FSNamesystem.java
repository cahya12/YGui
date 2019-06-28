
package com.labs247.telyu.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FSNamesystem {

    @SerializedName("BlockCapacity")
    @Expose
    private Integer blockCapacity;
    @SerializedName("BlocksTotal")
    @Expose
    private Integer blocksTotal;
    @SerializedName("CapacityRemaining")
    @Expose
    private Integer capacityRemaining;
    @SerializedName("CapacityRemainingGB")
    @Expose
    private Double capacityRemainingGB;
    @SerializedName("CapacityTotal")
    @Expose
    private Integer capacityTotal;
    @SerializedName("CapacityTotalGB")
    @Expose
    private Double capacityTotalGB;
    @SerializedName("CapacityUsed")
    @Expose
    private Integer capacityUsed;
    @SerializedName("CapacityUsedGB")
    @Expose
    private Double capacityUsedGB;
    @SerializedName("CorruptBlocks")
    @Expose
    private Integer corruptBlocks;
    @SerializedName("ExcessBlocks")
    @Expose
    private Integer excessBlocks;
    @SerializedName("ExpiredHeartbeats")
    @Expose
    private Integer expiredHeartbeats;
    @SerializedName("FilesTotal")
    @Expose
    private Integer filesTotal;
    @SerializedName("LastCheckpointTime")
    @Expose
    private Integer lastCheckpointTime;
    @SerializedName("LastWrittenTransactionId")
    @Expose
    private Integer lastWrittenTransactionId;
    @SerializedName("MillisSinceLastLoadedEdits")
    @Expose
    private Integer millisSinceLastLoadedEdits;
    @SerializedName("MissingBlocks")
    @Expose
    private Integer missingBlocks;
    @SerializedName("MissingReplOneBlocks")
    @Expose
    private Integer missingReplOneBlocks;
    @SerializedName("PendingDataNodeMessageCount")
    @Expose
    private Integer pendingDataNodeMessageCount;
    @SerializedName("PendingDeletionBlocks")
    @Expose
    private Integer pendingDeletionBlocks;
    @SerializedName("PendingReplicationBlocks")
    @Expose
    private Integer pendingReplicationBlocks;
    @SerializedName("PostponedMisreplicatedBlocks")
    @Expose
    private Integer postponedMisreplicatedBlocks;
    @SerializedName("ScheduledReplicationBlocks")
    @Expose
    private Integer scheduledReplicationBlocks;
    @SerializedName("Snapshots")
    @Expose
    private Integer snapshots;
    @SerializedName("SnapshottableDirectories")
    @Expose
    private Integer snapshottableDirectories;
    @SerializedName("StaleDataNodes")
    @Expose
    private Integer staleDataNodes;
    @SerializedName("TotalLoad")
    @Expose
    private Integer totalLoad;
    @SerializedName("TransactionsSinceLastCheckpoint")
    @Expose
    private Integer transactionsSinceLastCheckpoint;
    @SerializedName("TransactionsSinceLastLogRoll")
    @Expose
    private Integer transactionsSinceLastLogRoll;
    @SerializedName("UnderReplicatedBlocks")
    @Expose
    private Integer underReplicatedBlocks;

    public Integer getBlockCapacity() {
        return blockCapacity;
    }

    public void setBlockCapacity(Integer blockCapacity) {
        this.blockCapacity = blockCapacity;
    }

    public Integer getBlocksTotal() {
        return blocksTotal;
    }

    public void setBlocksTotal(Integer blocksTotal) {
        this.blocksTotal = blocksTotal;
    }

    public Integer getCapacityRemaining() {
        return capacityRemaining;
    }

    public void setCapacityRemaining(Integer capacityRemaining) {
        this.capacityRemaining = capacityRemaining;
    }

    public Double getCapacityRemainingGB() {
        return capacityRemainingGB;
    }

    public void setCapacityRemainingGB(Double capacityRemainingGB) {
        this.capacityRemainingGB = capacityRemainingGB;
    }

    public Integer getCapacityTotal() {
        return capacityTotal;
    }

    public void setCapacityTotal(Integer capacityTotal) {
        this.capacityTotal = capacityTotal;
    }

    public Double getCapacityTotalGB() {
        return capacityTotalGB;
    }

    public void setCapacityTotalGB(Double capacityTotalGB) {
        this.capacityTotalGB = capacityTotalGB;
    }

    public Integer getCapacityUsed() {
        return capacityUsed;
    }

    public void setCapacityUsed(Integer capacityUsed) {
        this.capacityUsed = capacityUsed;
    }

    public Double getCapacityUsedGB() {
        return capacityUsedGB;
    }

    public void setCapacityUsedGB(Double capacityUsedGB) {
        this.capacityUsedGB = capacityUsedGB;
    }

    public Integer getCorruptBlocks() {
        return corruptBlocks;
    }

    public void setCorruptBlocks(Integer corruptBlocks) {
        this.corruptBlocks = corruptBlocks;
    }

    public Integer getExcessBlocks() {
        return excessBlocks;
    }

    public void setExcessBlocks(Integer excessBlocks) {
        this.excessBlocks = excessBlocks;
    }

    public Integer getExpiredHeartbeats() {
        return expiredHeartbeats;
    }

    public void setExpiredHeartbeats(Integer expiredHeartbeats) {
        this.expiredHeartbeats = expiredHeartbeats;
    }

    public Integer getFilesTotal() {
        return filesTotal;
    }

    public void setFilesTotal(Integer filesTotal) {
        this.filesTotal = filesTotal;
    }

    public Integer getLastCheckpointTime() {
        return lastCheckpointTime;
    }

    public void setLastCheckpointTime(Integer lastCheckpointTime) {
        this.lastCheckpointTime = lastCheckpointTime;
    }

    public Integer getLastWrittenTransactionId() {
        return lastWrittenTransactionId;
    }

    public void setLastWrittenTransactionId(Integer lastWrittenTransactionId) {
        this.lastWrittenTransactionId = lastWrittenTransactionId;
    }

    public Integer getMillisSinceLastLoadedEdits() {
        return millisSinceLastLoadedEdits;
    }

    public void setMillisSinceLastLoadedEdits(Integer millisSinceLastLoadedEdits) {
        this.millisSinceLastLoadedEdits = millisSinceLastLoadedEdits;
    }

    public Integer getMissingBlocks() {
        return missingBlocks;
    }

    public void setMissingBlocks(Integer missingBlocks) {
        this.missingBlocks = missingBlocks;
    }

    public Integer getMissingReplOneBlocks() {
        return missingReplOneBlocks;
    }

    public void setMissingReplOneBlocks(Integer missingReplOneBlocks) {
        this.missingReplOneBlocks = missingReplOneBlocks;
    }

    public Integer getPendingDataNodeMessageCount() {
        return pendingDataNodeMessageCount;
    }

    public void setPendingDataNodeMessageCount(Integer pendingDataNodeMessageCount) {
        this.pendingDataNodeMessageCount = pendingDataNodeMessageCount;
    }

    public Integer getPendingDeletionBlocks() {
        return pendingDeletionBlocks;
    }

    public void setPendingDeletionBlocks(Integer pendingDeletionBlocks) {
        this.pendingDeletionBlocks = pendingDeletionBlocks;
    }

    public Integer getPendingReplicationBlocks() {
        return pendingReplicationBlocks;
    }

    public void setPendingReplicationBlocks(Integer pendingReplicationBlocks) {
        this.pendingReplicationBlocks = pendingReplicationBlocks;
    }

    public Integer getPostponedMisreplicatedBlocks() {
        return postponedMisreplicatedBlocks;
    }

    public void setPostponedMisreplicatedBlocks(Integer postponedMisreplicatedBlocks) {
        this.postponedMisreplicatedBlocks = postponedMisreplicatedBlocks;
    }

    public Integer getScheduledReplicationBlocks() {
        return scheduledReplicationBlocks;
    }

    public void setScheduledReplicationBlocks(Integer scheduledReplicationBlocks) {
        this.scheduledReplicationBlocks = scheduledReplicationBlocks;
    }

    public Integer getSnapshots() {
        return snapshots;
    }

    public void setSnapshots(Integer snapshots) {
        this.snapshots = snapshots;
    }

    public Integer getSnapshottableDirectories() {
        return snapshottableDirectories;
    }

    public void setSnapshottableDirectories(Integer snapshottableDirectories) {
        this.snapshottableDirectories = snapshottableDirectories;
    }

    public Integer getStaleDataNodes() {
        return staleDataNodes;
    }

    public void setStaleDataNodes(Integer staleDataNodes) {
        this.staleDataNodes = staleDataNodes;
    }

    public Integer getTotalLoad() {
        return totalLoad;
    }

    public void setTotalLoad(Integer totalLoad) {
        this.totalLoad = totalLoad;
    }

    public Integer getTransactionsSinceLastCheckpoint() {
        return transactionsSinceLastCheckpoint;
    }

    public void setTransactionsSinceLastCheckpoint(Integer transactionsSinceLastCheckpoint) {
        this.transactionsSinceLastCheckpoint = transactionsSinceLastCheckpoint;
    }

    public Integer getTransactionsSinceLastLogRoll() {
        return transactionsSinceLastLogRoll;
    }

    public void setTransactionsSinceLastLogRoll(Integer transactionsSinceLastLogRoll) {
        this.transactionsSinceLastLogRoll = transactionsSinceLastLogRoll;
    }

    public Integer getUnderReplicatedBlocks() {
        return underReplicatedBlocks;
    }

    public void setUnderReplicatedBlocks(Integer underReplicatedBlocks) {
        this.underReplicatedBlocks = underReplicatedBlocks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FSNamesystem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("blockCapacity");
        sb.append('=');
        sb.append(((this.blockCapacity == null)?"<null>":this.blockCapacity));
        sb.append(',');
        sb.append("blocksTotal");
        sb.append('=');
        sb.append(((this.blocksTotal == null)?"<null>":this.blocksTotal));
        sb.append(',');
        sb.append("capacityRemaining");
        sb.append('=');
        sb.append(((this.capacityRemaining == null)?"<null>":this.capacityRemaining));
        sb.append(',');
        sb.append("capacityRemainingGB");
        sb.append('=');
        sb.append(((this.capacityRemainingGB == null)?"<null>":this.capacityRemainingGB));
        sb.append(',');
        sb.append("capacityTotal");
        sb.append('=');
        sb.append(((this.capacityTotal == null)?"<null>":this.capacityTotal));
        sb.append(',');
        sb.append("capacityTotalGB");
        sb.append('=');
        sb.append(((this.capacityTotalGB == null)?"<null>":this.capacityTotalGB));
        sb.append(',');
        sb.append("capacityUsed");
        sb.append('=');
        sb.append(((this.capacityUsed == null)?"<null>":this.capacityUsed));
        sb.append(',');
        sb.append("capacityUsedGB");
        sb.append('=');
        sb.append(((this.capacityUsedGB == null)?"<null>":this.capacityUsedGB));
        sb.append(',');
        sb.append("corruptBlocks");
        sb.append('=');
        sb.append(((this.corruptBlocks == null)?"<null>":this.corruptBlocks));
        sb.append(',');
        sb.append("excessBlocks");
        sb.append('=');
        sb.append(((this.excessBlocks == null)?"<null>":this.excessBlocks));
        sb.append(',');
        sb.append("expiredHeartbeats");
        sb.append('=');
        sb.append(((this.expiredHeartbeats == null)?"<null>":this.expiredHeartbeats));
        sb.append(',');
        sb.append("filesTotal");
        sb.append('=');
        sb.append(((this.filesTotal == null)?"<null>":this.filesTotal));
        sb.append(',');
        sb.append("lastCheckpointTime");
        sb.append('=');
        sb.append(((this.lastCheckpointTime == null)?"<null>":this.lastCheckpointTime));
        sb.append(',');
        sb.append("lastWrittenTransactionId");
        sb.append('=');
        sb.append(((this.lastWrittenTransactionId == null)?"<null>":this.lastWrittenTransactionId));
        sb.append(',');
        sb.append("millisSinceLastLoadedEdits");
        sb.append('=');
        sb.append(((this.millisSinceLastLoadedEdits == null)?"<null>":this.millisSinceLastLoadedEdits));
        sb.append(',');
        sb.append("missingBlocks");
        sb.append('=');
        sb.append(((this.missingBlocks == null)?"<null>":this.missingBlocks));
        sb.append(',');
        sb.append("missingReplOneBlocks");
        sb.append('=');
        sb.append(((this.missingReplOneBlocks == null)?"<null>":this.missingReplOneBlocks));
        sb.append(',');
        sb.append("pendingDataNodeMessageCount");
        sb.append('=');
        sb.append(((this.pendingDataNodeMessageCount == null)?"<null>":this.pendingDataNodeMessageCount));
        sb.append(',');
        sb.append("pendingDeletionBlocks");
        sb.append('=');
        sb.append(((this.pendingDeletionBlocks == null)?"<null>":this.pendingDeletionBlocks));
        sb.append(',');
        sb.append("pendingReplicationBlocks");
        sb.append('=');
        sb.append(((this.pendingReplicationBlocks == null)?"<null>":this.pendingReplicationBlocks));
        sb.append(',');
        sb.append("postponedMisreplicatedBlocks");
        sb.append('=');
        sb.append(((this.postponedMisreplicatedBlocks == null)?"<null>":this.postponedMisreplicatedBlocks));
        sb.append(',');
        sb.append("scheduledReplicationBlocks");
        sb.append('=');
        sb.append(((this.scheduledReplicationBlocks == null)?"<null>":this.scheduledReplicationBlocks));
        sb.append(',');
        sb.append("snapshots");
        sb.append('=');
        sb.append(((this.snapshots == null)?"<null>":this.snapshots));
        sb.append(',');
        sb.append("snapshottableDirectories");
        sb.append('=');
        sb.append(((this.snapshottableDirectories == null)?"<null>":this.snapshottableDirectories));
        sb.append(',');
        sb.append("staleDataNodes");
        sb.append('=');
        sb.append(((this.staleDataNodes == null)?"<null>":this.staleDataNodes));
        sb.append(',');
        sb.append("totalLoad");
        sb.append('=');
        sb.append(((this.totalLoad == null)?"<null>":this.totalLoad));
        sb.append(',');
        sb.append("transactionsSinceLastCheckpoint");
        sb.append('=');
        sb.append(((this.transactionsSinceLastCheckpoint == null)?"<null>":this.transactionsSinceLastCheckpoint));
        sb.append(',');
        sb.append("transactionsSinceLastLogRoll");
        sb.append('=');
        sb.append(((this.transactionsSinceLastLogRoll == null)?"<null>":this.transactionsSinceLastLogRoll));
        sb.append(',');
        sb.append("underReplicatedBlocks");
        sb.append('=');
        sb.append(((this.underReplicatedBlocks == null)?"<null>":this.underReplicatedBlocks));
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
        result = ((result* 31)+((this.capacityRemainingGB == null)? 0 :this.capacityRemainingGB.hashCode()));
        result = ((result* 31)+((this.pendingDataNodeMessageCount == null)? 0 :this.pendingDataNodeMessageCount.hashCode()));
        result = ((result* 31)+((this.underReplicatedBlocks == null)? 0 :this.underReplicatedBlocks.hashCode()));
        result = ((result* 31)+((this.capacityTotalGB == null)? 0 :this.capacityTotalGB.hashCode()));
        result = ((result* 31)+((this.blocksTotal == null)? 0 :this.blocksTotal.hashCode()));
        result = ((result* 31)+((this.excessBlocks == null)? 0 :this.excessBlocks.hashCode()));
        result = ((result* 31)+((this.pendingReplicationBlocks == null)? 0 :this.pendingReplicationBlocks.hashCode()));
        result = ((result* 31)+((this.postponedMisreplicatedBlocks == null)? 0 :this.postponedMisreplicatedBlocks.hashCode()));
        result = ((result* 31)+((this.corruptBlocks == null)? 0 :this.corruptBlocks.hashCode()));
        result = ((result* 31)+((this.staleDataNodes == null)? 0 :this.staleDataNodes.hashCode()));
        result = ((result* 31)+((this.missingBlocks == null)? 0 :this.missingBlocks.hashCode()));
        result = ((result* 31)+((this.totalLoad == null)? 0 :this.totalLoad.hashCode()));
        result = ((result* 31)+((this.expiredHeartbeats == null)? 0 :this.expiredHeartbeats.hashCode()));
        result = ((result* 31)+((this.millisSinceLastLoadedEdits == null)? 0 :this.millisSinceLastLoadedEdits.hashCode()));
        result = ((result* 31)+((this.missingReplOneBlocks == null)? 0 :this.missingReplOneBlocks.hashCode()));
        result = ((result* 31)+((this.snapshottableDirectories == null)? 0 :this.snapshottableDirectories.hashCode()));
        result = ((result* 31)+((this.transactionsSinceLastLogRoll == null)? 0 :this.transactionsSinceLastLogRoll.hashCode()));
        result = ((result* 31)+((this.capacityUsedGB == null)? 0 :this.capacityUsedGB.hashCode()));
        result = ((result* 31)+((this.pendingDeletionBlocks == null)? 0 :this.pendingDeletionBlocks.hashCode()));
        result = ((result* 31)+((this.capacityUsed == null)? 0 :this.capacityUsed.hashCode()));
        result = ((result* 31)+((this.lastWrittenTransactionId == null)? 0 :this.lastWrittenTransactionId.hashCode()));
        result = ((result* 31)+((this.scheduledReplicationBlocks == null)? 0 :this.scheduledReplicationBlocks.hashCode()));
        result = ((result* 31)+((this.transactionsSinceLastCheckpoint == null)? 0 :this.transactionsSinceLastCheckpoint.hashCode()));
        result = ((result* 31)+((this.snapshots == null)? 0 :this.snapshots.hashCode()));
        result = ((result* 31)+((this.blockCapacity == null)? 0 :this.blockCapacity.hashCode()));
        result = ((result* 31)+((this.capacityRemaining == null)? 0 :this.capacityRemaining.hashCode()));
        result = ((result* 31)+((this.filesTotal == null)? 0 :this.filesTotal.hashCode()));
        result = ((result* 31)+((this.lastCheckpointTime == null)? 0 :this.lastCheckpointTime.hashCode()));
        result = ((result* 31)+((this.capacityTotal == null)? 0 :this.capacityTotal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FSNamesystem) == false) {
            return false;
        }
        FSNamesystem rhs = ((FSNamesystem) other);
        return ((((((((((((((((((((((((((((((this.capacityRemainingGB == rhs.capacityRemainingGB)||((this.capacityRemainingGB!= null)&&this.capacityRemainingGB.equals(rhs.capacityRemainingGB)))&&((this.pendingDataNodeMessageCount == rhs.pendingDataNodeMessageCount)||((this.pendingDataNodeMessageCount!= null)&&this.pendingDataNodeMessageCount.equals(rhs.pendingDataNodeMessageCount))))&&((this.underReplicatedBlocks == rhs.underReplicatedBlocks)||((this.underReplicatedBlocks!= null)&&this.underReplicatedBlocks.equals(rhs.underReplicatedBlocks))))&&((this.capacityTotalGB == rhs.capacityTotalGB)||((this.capacityTotalGB!= null)&&this.capacityTotalGB.equals(rhs.capacityTotalGB))))&&((this.blocksTotal == rhs.blocksTotal)||((this.blocksTotal!= null)&&this.blocksTotal.equals(rhs.blocksTotal))))&&((this.excessBlocks == rhs.excessBlocks)||((this.excessBlocks!= null)&&this.excessBlocks.equals(rhs.excessBlocks))))&&((this.pendingReplicationBlocks == rhs.pendingReplicationBlocks)||((this.pendingReplicationBlocks!= null)&&this.pendingReplicationBlocks.equals(rhs.pendingReplicationBlocks))))&&((this.postponedMisreplicatedBlocks == rhs.postponedMisreplicatedBlocks)||((this.postponedMisreplicatedBlocks!= null)&&this.postponedMisreplicatedBlocks.equals(rhs.postponedMisreplicatedBlocks))))&&((this.corruptBlocks == rhs.corruptBlocks)||((this.corruptBlocks!= null)&&this.corruptBlocks.equals(rhs.corruptBlocks))))&&((this.staleDataNodes == rhs.staleDataNodes)||((this.staleDataNodes!= null)&&this.staleDataNodes.equals(rhs.staleDataNodes))))&&((this.missingBlocks == rhs.missingBlocks)||((this.missingBlocks!= null)&&this.missingBlocks.equals(rhs.missingBlocks))))&&((this.totalLoad == rhs.totalLoad)||((this.totalLoad!= null)&&this.totalLoad.equals(rhs.totalLoad))))&&((this.expiredHeartbeats == rhs.expiredHeartbeats)||((this.expiredHeartbeats!= null)&&this.expiredHeartbeats.equals(rhs.expiredHeartbeats))))&&((this.millisSinceLastLoadedEdits == rhs.millisSinceLastLoadedEdits)||((this.millisSinceLastLoadedEdits!= null)&&this.millisSinceLastLoadedEdits.equals(rhs.millisSinceLastLoadedEdits))))&&((this.missingReplOneBlocks == rhs.missingReplOneBlocks)||((this.missingReplOneBlocks!= null)&&this.missingReplOneBlocks.equals(rhs.missingReplOneBlocks))))&&((this.snapshottableDirectories == rhs.snapshottableDirectories)||((this.snapshottableDirectories!= null)&&this.snapshottableDirectories.equals(rhs.snapshottableDirectories))))&&((this.transactionsSinceLastLogRoll == rhs.transactionsSinceLastLogRoll)||((this.transactionsSinceLastLogRoll!= null)&&this.transactionsSinceLastLogRoll.equals(rhs.transactionsSinceLastLogRoll))))&&((this.capacityUsedGB == rhs.capacityUsedGB)||((this.capacityUsedGB!= null)&&this.capacityUsedGB.equals(rhs.capacityUsedGB))))&&((this.pendingDeletionBlocks == rhs.pendingDeletionBlocks)||((this.pendingDeletionBlocks!= null)&&this.pendingDeletionBlocks.equals(rhs.pendingDeletionBlocks))))&&((this.capacityUsed == rhs.capacityUsed)||((this.capacityUsed!= null)&&this.capacityUsed.equals(rhs.capacityUsed))))&&((this.lastWrittenTransactionId == rhs.lastWrittenTransactionId)||((this.lastWrittenTransactionId!= null)&&this.lastWrittenTransactionId.equals(rhs.lastWrittenTransactionId))))&&((this.scheduledReplicationBlocks == rhs.scheduledReplicationBlocks)||((this.scheduledReplicationBlocks!= null)&&this.scheduledReplicationBlocks.equals(rhs.scheduledReplicationBlocks))))&&((this.transactionsSinceLastCheckpoint == rhs.transactionsSinceLastCheckpoint)||((this.transactionsSinceLastCheckpoint!= null)&&this.transactionsSinceLastCheckpoint.equals(rhs.transactionsSinceLastCheckpoint))))&&((this.snapshots == rhs.snapshots)||((this.snapshots!= null)&&this.snapshots.equals(rhs.snapshots))))&&((this.blockCapacity == rhs.blockCapacity)||((this.blockCapacity!= null)&&this.blockCapacity.equals(rhs.blockCapacity))))&&((this.capacityRemaining == rhs.capacityRemaining)||((this.capacityRemaining!= null)&&this.capacityRemaining.equals(rhs.capacityRemaining))))&&((this.filesTotal == rhs.filesTotal)||((this.filesTotal!= null)&&this.filesTotal.equals(rhs.filesTotal))))&&((this.lastCheckpointTime == rhs.lastCheckpointTime)||((this.lastCheckpointTime!= null)&&this.lastCheckpointTime.equals(rhs.lastCheckpointTime))))&&((this.capacityTotal == rhs.capacityTotal)||((this.capacityTotal!= null)&&this.capacityTotal.equals(rhs.capacityTotal))));
    }

}
