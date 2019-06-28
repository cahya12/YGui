
package com.labs247.yava.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Jvm {

    @SerializedName("GcCountConcurrentMarkSweep")
    @Expose
    private Integer gcCountConcurrentMarkSweep;
    @SerializedName("GcTimeMillisConcurrentMarkSweep")
    @Expose
    private Integer gcTimeMillisConcurrentMarkSweep;
    @SerializedName("gcCount")
    @Expose
    private Integer gcCount;
    @SerializedName("gcTimeMillis")
    @Expose
    private Integer gcTimeMillis;
    @SerializedName("logError")
    @Expose
    private Integer logError;
    @SerializedName("logFatal")
    @Expose
    private Integer logFatal;
    @SerializedName("logInfo")
    @Expose
    private Integer logInfo;
    @SerializedName("logWarn")
    @Expose
    private Integer logWarn;
    @SerializedName("memHeapCommittedM")
    @Expose
    private Double memHeapCommittedM;
    @SerializedName("memHeapUsedM")
    @Expose
    private Double memHeapUsedM;
    @SerializedName("memMaxM")
    @Expose
    private Double memMaxM;
    @SerializedName("memNonHeapCommittedM")
    @Expose
    private Double memNonHeapCommittedM;
    @SerializedName("memNonHeapUsedM")
    @Expose
    private Double memNonHeapUsedM;
    @SerializedName("threadsBlocked")
    @Expose
    private Integer threadsBlocked;
    @SerializedName("threadsNew")
    @Expose
    private Integer threadsNew;
    @SerializedName("threadsRunnable")
    @Expose
    private Integer threadsRunnable;
    @SerializedName("threadsTerminated")
    @Expose
    private Integer threadsTerminated;
    @SerializedName("threadsTimedWaiting")
    @Expose
    private Integer threadsTimedWaiting;
    @SerializedName("threadsWaiting")
    @Expose
    private Integer threadsWaiting;
    @SerializedName("JvmMetrics")
    @Expose
    private JvmMetrics jvmMetrics;

    public Integer getGcCountConcurrentMarkSweep() {
        return gcCountConcurrentMarkSweep;
    }

    public void setGcCountConcurrentMarkSweep(Integer gcCountConcurrentMarkSweep) {
        this.gcCountConcurrentMarkSweep = gcCountConcurrentMarkSweep;
    }

    public Integer getGcTimeMillisConcurrentMarkSweep() {
        return gcTimeMillisConcurrentMarkSweep;
    }

    public void setGcTimeMillisConcurrentMarkSweep(Integer gcTimeMillisConcurrentMarkSweep) {
        this.gcTimeMillisConcurrentMarkSweep = gcTimeMillisConcurrentMarkSweep;
    }

    public Integer getGcCount() {
        return gcCount;
    }

    public void setGcCount(Integer gcCount) {
        this.gcCount = gcCount;
    }

    public Integer getGcTimeMillis() {
        return gcTimeMillis;
    }

    public void setGcTimeMillis(Integer gcTimeMillis) {
        this.gcTimeMillis = gcTimeMillis;
    }

    public Integer getLogError() {
        return logError;
    }

    public void setLogError(Integer logError) {
        this.logError = logError;
    }

    public Integer getLogFatal() {
        return logFatal;
    }

    public void setLogFatal(Integer logFatal) {
        this.logFatal = logFatal;
    }

    public Integer getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(Integer logInfo) {
        this.logInfo = logInfo;
    }

    public Integer getLogWarn() {
        return logWarn;
    }

    public void setLogWarn(Integer logWarn) {
        this.logWarn = logWarn;
    }

    public Double getMemHeapCommittedM() {
        return memHeapCommittedM;
    }

    public void setMemHeapCommittedM(Double memHeapCommittedM) {
        this.memHeapCommittedM = memHeapCommittedM;
    }

    public Double getMemHeapUsedM() {
        return memHeapUsedM;
    }

    public void setMemHeapUsedM(Double memHeapUsedM) {
        this.memHeapUsedM = memHeapUsedM;
    }

    public Double getMemMaxM() {
        return memMaxM;
    }

    public void setMemMaxM(Double memMaxM) {
        this.memMaxM = memMaxM;
    }

    public Double getMemNonHeapCommittedM() {
        return memNonHeapCommittedM;
    }

    public void setMemNonHeapCommittedM(Double memNonHeapCommittedM) {
        this.memNonHeapCommittedM = memNonHeapCommittedM;
    }

    public Double getMemNonHeapUsedM() {
        return memNonHeapUsedM;
    }

    public void setMemNonHeapUsedM(Double memNonHeapUsedM) {
        this.memNonHeapUsedM = memNonHeapUsedM;
    }

    public Integer getThreadsBlocked() {
        return threadsBlocked;
    }

    public void setThreadsBlocked(Integer threadsBlocked) {
        this.threadsBlocked = threadsBlocked;
    }

    public Integer getThreadsNew() {
        return threadsNew;
    }

    public void setThreadsNew(Integer threadsNew) {
        this.threadsNew = threadsNew;
    }

    public Integer getThreadsRunnable() {
        return threadsRunnable;
    }

    public void setThreadsRunnable(Integer threadsRunnable) {
        this.threadsRunnable = threadsRunnable;
    }

    public Integer getThreadsTerminated() {
        return threadsTerminated;
    }

    public void setThreadsTerminated(Integer threadsTerminated) {
        this.threadsTerminated = threadsTerminated;
    }

    public Integer getThreadsTimedWaiting() {
        return threadsTimedWaiting;
    }

    public void setThreadsTimedWaiting(Integer threadsTimedWaiting) {
        this.threadsTimedWaiting = threadsTimedWaiting;
    }

    public Integer getThreadsWaiting() {
        return threadsWaiting;
    }

    public void setThreadsWaiting(Integer threadsWaiting) {
        this.threadsWaiting = threadsWaiting;
    }

    public JvmMetrics getJvmMetrics() {
        return jvmMetrics;
    }

    public void setJvmMetrics(JvmMetrics jvmMetrics) {
        this.jvmMetrics = jvmMetrics;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Jvm.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("gcCountConcurrentMarkSweep");
        sb.append('=');
        sb.append(((this.gcCountConcurrentMarkSweep == null)?"<null>":this.gcCountConcurrentMarkSweep));
        sb.append(',');
        sb.append("gcTimeMillisConcurrentMarkSweep");
        sb.append('=');
        sb.append(((this.gcTimeMillisConcurrentMarkSweep == null)?"<null>":this.gcTimeMillisConcurrentMarkSweep));
        sb.append(',');
        sb.append("gcCount");
        sb.append('=');
        sb.append(((this.gcCount == null)?"<null>":this.gcCount));
        sb.append(',');
        sb.append("gcTimeMillis");
        sb.append('=');
        sb.append(((this.gcTimeMillis == null)?"<null>":this.gcTimeMillis));
        sb.append(',');
        sb.append("logError");
        sb.append('=');
        sb.append(((this.logError == null)?"<null>":this.logError));
        sb.append(',');
        sb.append("logFatal");
        sb.append('=');
        sb.append(((this.logFatal == null)?"<null>":this.logFatal));
        sb.append(',');
        sb.append("logInfo");
        sb.append('=');
        sb.append(((this.logInfo == null)?"<null>":this.logInfo));
        sb.append(',');
        sb.append("logWarn");
        sb.append('=');
        sb.append(((this.logWarn == null)?"<null>":this.logWarn));
        sb.append(',');
        sb.append("memHeapCommittedM");
        sb.append('=');
        sb.append(((this.memHeapCommittedM == null)?"<null>":this.memHeapCommittedM));
        sb.append(',');
        sb.append("memHeapUsedM");
        sb.append('=');
        sb.append(((this.memHeapUsedM == null)?"<null>":this.memHeapUsedM));
        sb.append(',');
        sb.append("memMaxM");
        sb.append('=');
        sb.append(((this.memMaxM == null)?"<null>":this.memMaxM));
        sb.append(',');
        sb.append("memNonHeapCommittedM");
        sb.append('=');
        sb.append(((this.memNonHeapCommittedM == null)?"<null>":this.memNonHeapCommittedM));
        sb.append(',');
        sb.append("memNonHeapUsedM");
        sb.append('=');
        sb.append(((this.memNonHeapUsedM == null)?"<null>":this.memNonHeapUsedM));
        sb.append(',');
        sb.append("threadsBlocked");
        sb.append('=');
        sb.append(((this.threadsBlocked == null)?"<null>":this.threadsBlocked));
        sb.append(',');
        sb.append("threadsNew");
        sb.append('=');
        sb.append(((this.threadsNew == null)?"<null>":this.threadsNew));
        sb.append(',');
        sb.append("threadsRunnable");
        sb.append('=');
        sb.append(((this.threadsRunnable == null)?"<null>":this.threadsRunnable));
        sb.append(',');
        sb.append("threadsTerminated");
        sb.append('=');
        sb.append(((this.threadsTerminated == null)?"<null>":this.threadsTerminated));
        sb.append(',');
        sb.append("threadsTimedWaiting");
        sb.append('=');
        sb.append(((this.threadsTimedWaiting == null)?"<null>":this.threadsTimedWaiting));
        sb.append(',');
        sb.append("threadsWaiting");
        sb.append('=');
        sb.append(((this.threadsWaiting == null)?"<null>":this.threadsWaiting));
        sb.append(',');
        sb.append("jvmMetrics");
        sb.append('=');
        sb.append(((this.jvmMetrics == null)?"<null>":this.jvmMetrics));
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
        result = ((result* 31)+((this.threadsTimedWaiting == null)? 0 :this.threadsTimedWaiting.hashCode()));
        result = ((result* 31)+((this.gcTimeMillis == null)? 0 :this.gcTimeMillis.hashCode()));
        result = ((result* 31)+((this.gcCount == null)? 0 :this.gcCount.hashCode()));
        result = ((result* 31)+((this.jvmMetrics == null)? 0 :this.jvmMetrics.hashCode()));
        result = ((result* 31)+((this.threadsTerminated == null)? 0 :this.threadsTerminated.hashCode()));
        result = ((result* 31)+((this.logInfo == null)? 0 :this.logInfo.hashCode()));
        result = ((result* 31)+((this.threadsWaiting == null)? 0 :this.threadsWaiting.hashCode()));
        result = ((result* 31)+((this.memNonHeapUsedM == null)? 0 :this.memNonHeapUsedM.hashCode()));
        result = ((result* 31)+((this.gcTimeMillisConcurrentMarkSweep == null)? 0 :this.gcTimeMillisConcurrentMarkSweep.hashCode()));
        result = ((result* 31)+((this.gcCountConcurrentMarkSweep == null)? 0 :this.gcCountConcurrentMarkSweep.hashCode()));
        result = ((result* 31)+((this.logError == null)? 0 :this.logError.hashCode()));
        result = ((result* 31)+((this.threadsRunnable == null)? 0 :this.threadsRunnable.hashCode()));
        result = ((result* 31)+((this.logWarn == null)? 0 :this.logWarn.hashCode()));
        result = ((result* 31)+((this.memHeapUsedM == null)? 0 :this.memHeapUsedM.hashCode()));
        result = ((result* 31)+((this.memMaxM == null)? 0 :this.memMaxM.hashCode()));
        result = ((result* 31)+((this.threadsBlocked == null)? 0 :this.threadsBlocked.hashCode()));
        result = ((result* 31)+((this.threadsNew == null)? 0 :this.threadsNew.hashCode()));
        result = ((result* 31)+((this.memHeapCommittedM == null)? 0 :this.memHeapCommittedM.hashCode()));
        result = ((result* 31)+((this.memNonHeapCommittedM == null)? 0 :this.memNonHeapCommittedM.hashCode()));
        result = ((result* 31)+((this.logFatal == null)? 0 :this.logFatal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Jvm) == false) {
            return false;
        }
        Jvm rhs = ((Jvm) other);
        return (((((((((((((((((((((this.threadsTimedWaiting == rhs.threadsTimedWaiting)||((this.threadsTimedWaiting!= null)&&this.threadsTimedWaiting.equals(rhs.threadsTimedWaiting)))&&((this.gcTimeMillis == rhs.gcTimeMillis)||((this.gcTimeMillis!= null)&&this.gcTimeMillis.equals(rhs.gcTimeMillis))))&&((this.gcCount == rhs.gcCount)||((this.gcCount!= null)&&this.gcCount.equals(rhs.gcCount))))&&((this.jvmMetrics == rhs.jvmMetrics)||((this.jvmMetrics!= null)&&this.jvmMetrics.equals(rhs.jvmMetrics))))&&((this.threadsTerminated == rhs.threadsTerminated)||((this.threadsTerminated!= null)&&this.threadsTerminated.equals(rhs.threadsTerminated))))&&((this.logInfo == rhs.logInfo)||((this.logInfo!= null)&&this.logInfo.equals(rhs.logInfo))))&&((this.threadsWaiting == rhs.threadsWaiting)||((this.threadsWaiting!= null)&&this.threadsWaiting.equals(rhs.threadsWaiting))))&&((this.memNonHeapUsedM == rhs.memNonHeapUsedM)||((this.memNonHeapUsedM!= null)&&this.memNonHeapUsedM.equals(rhs.memNonHeapUsedM))))&&((this.gcTimeMillisConcurrentMarkSweep == rhs.gcTimeMillisConcurrentMarkSweep)||((this.gcTimeMillisConcurrentMarkSweep!= null)&&this.gcTimeMillisConcurrentMarkSweep.equals(rhs.gcTimeMillisConcurrentMarkSweep))))&&((this.gcCountConcurrentMarkSweep == rhs.gcCountConcurrentMarkSweep)||((this.gcCountConcurrentMarkSweep!= null)&&this.gcCountConcurrentMarkSweep.equals(rhs.gcCountConcurrentMarkSweep))))&&((this.logError == rhs.logError)||((this.logError!= null)&&this.logError.equals(rhs.logError))))&&((this.threadsRunnable == rhs.threadsRunnable)||((this.threadsRunnable!= null)&&this.threadsRunnable.equals(rhs.threadsRunnable))))&&((this.logWarn == rhs.logWarn)||((this.logWarn!= null)&&this.logWarn.equals(rhs.logWarn))))&&((this.memHeapUsedM == rhs.memHeapUsedM)||((this.memHeapUsedM!= null)&&this.memHeapUsedM.equals(rhs.memHeapUsedM))))&&((this.memMaxM == rhs.memMaxM)||((this.memMaxM!= null)&&this.memMaxM.equals(rhs.memMaxM))))&&((this.threadsBlocked == rhs.threadsBlocked)||((this.threadsBlocked!= null)&&this.threadsBlocked.equals(rhs.threadsBlocked))))&&((this.threadsNew == rhs.threadsNew)||((this.threadsNew!= null)&&this.threadsNew.equals(rhs.threadsNew))))&&((this.memHeapCommittedM == rhs.memHeapCommittedM)||((this.memHeapCommittedM!= null)&&this.memHeapCommittedM.equals(rhs.memHeapCommittedM))))&&((this.memNonHeapCommittedM == rhs.memNonHeapCommittedM)||((this.memNonHeapCommittedM!= null)&&this.memNonHeapCommittedM.equals(rhs.memNonHeapCommittedM))))&&((this.logFatal == rhs.logFatal)||((this.logFatal!= null)&&this.logFatal.equals(rhs.logFatal))));
    }

}
