package com.labs247.telyu.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Properties {

    @SerializedName("autopurge.purgeInterval")
    @Expose
    private String autopurgePurgeInterval;
    @SerializedName("autopurge.snapRetainCount")
    @Expose
    private String autopurgeSnapRetainCount;
    @SerializedName("clientPort")
    @Expose
    private String clientPort;
    @SerializedName("dataDir")
    @Expose
    private String dataDir;
    @SerializedName("initLimit")
    @Expose
    private String initLimit;
    @SerializedName("syncLimit")
    @Expose
    private String syncLimit;
    @SerializedName("tickTime")
    @Expose
    private String tickTime;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("zk_log_dir")
    @Expose
    private String zkLogDir;
    @SerializedName("zk_pid_dir")
    @Expose
    private String zkPidDir;
    @SerializedName("zk_server_heapsize")
    @Expose
    private String zkServerHeapsize;
    @SerializedName("zk_user")
    @Expose
    private String zkUser;
    @SerializedName("zookeeper_log_max_backup_size")
    @Expose
    private String zookeeperLogMaxBackupSize;
    @SerializedName("zookeeper_log_number_of_backup_files")
    @Expose
    private String zookeeperLogNumberOfBackupFiles;

    public String getAutopurgePurgeInterval() {
        return autopurgePurgeInterval;
    }

    public void setAutopurgePurgeInterval(String autopurgePurgeInterval) {
        this.autopurgePurgeInterval = autopurgePurgeInterval;
    }

    public String getAutopurgeSnapRetainCount() {
        return autopurgeSnapRetainCount;
    }

    public void setAutopurgeSnapRetainCount(String autopurgeSnapRetainCount) {
        this.autopurgeSnapRetainCount = autopurgeSnapRetainCount;
    }

    public String getClientPort() {
        return clientPort;
    }

    public void setClientPort(String clientPort) {
        this.clientPort = clientPort;
    }

    public String getDataDir() {
        return dataDir;
    }

    public void setDataDir(String dataDir) {
        this.dataDir = dataDir;
    }

    public String getInitLimit() {
        return initLimit;
    }

    public void setInitLimit(String initLimit) {
        this.initLimit = initLimit;
    }

    public String getSyncLimit() {
        return syncLimit;
    }

    public void setSyncLimit(String syncLimit) {
        this.syncLimit = syncLimit;
    }

    public String getTickTime() {
        return tickTime;
    }

    public void setTickTime(String tickTime) {
        this.tickTime = tickTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getZkLogDir() {
        return zkLogDir;
    }

    public void setZkLogDir(String zkLogDir) {
        this.zkLogDir = zkLogDir;
    }

    public String getZkPidDir() {
        return zkPidDir;
    }

    public void setZkPidDir(String zkPidDir) {
        this.zkPidDir = zkPidDir;
    }

    public String getZkServerHeapsize() {
        return zkServerHeapsize;
    }

    public void setZkServerHeapsize(String zkServerHeapsize) {
        this.zkServerHeapsize = zkServerHeapsize;
    }

    public String getZkUser() {
        return zkUser;
    }

    public void setZkUser(String zkUser) {
        this.zkUser = zkUser;
    }

    public String getZookeeperLogMaxBackupSize() {
        return zookeeperLogMaxBackupSize;
    }

    public void setZookeeperLogMaxBackupSize(String zookeeperLogMaxBackupSize) {
        this.zookeeperLogMaxBackupSize = zookeeperLogMaxBackupSize;
    }

    public String getZookeeperLogNumberOfBackupFiles() {
        return zookeeperLogNumberOfBackupFiles;
    }

    public void setZookeeperLogNumberOfBackupFiles(String zookeeperLogNumberOfBackupFiles) {
        this.zookeeperLogNumberOfBackupFiles = zookeeperLogNumberOfBackupFiles;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Properties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("autopurgePurgeInterval");
        sb.append('=');
        sb.append(((this.autopurgePurgeInterval == null)?"<null>":this.autopurgePurgeInterval));
        sb.append(',');
        sb.append("autopurgeSnapRetainCount");
        sb.append('=');
        sb.append(((this.autopurgeSnapRetainCount == null)?"<null>":this.autopurgeSnapRetainCount));
        sb.append(',');
        sb.append("clientPort");
        sb.append('=');
        sb.append(((this.clientPort == null)?"<null>":this.clientPort));
        sb.append(',');
        sb.append("dataDir");
        sb.append('=');
        sb.append(((this.dataDir == null)?"<null>":this.dataDir));
        sb.append(',');
        sb.append("initLimit");
        sb.append('=');
        sb.append(((this.initLimit == null)?"<null>":this.initLimit));
        sb.append(',');
        sb.append("syncLimit");
        sb.append('=');
        sb.append(((this.syncLimit == null)?"<null>":this.syncLimit));
        sb.append(',');
        sb.append("tickTime");
        sb.append('=');
        sb.append(((this.tickTime == null)?"<null>":this.tickTime));
        sb.append(',');
        sb.append("content");
        sb.append('=');
        sb.append(((this.content == null)?"<null>":this.content));
        sb.append(',');
        sb.append("zkLogDir");
        sb.append('=');
        sb.append(((this.zkLogDir == null)?"<null>":this.zkLogDir));
        sb.append(',');
        sb.append("zkPidDir");
        sb.append('=');
        sb.append(((this.zkPidDir == null)?"<null>":this.zkPidDir));
        sb.append(',');
        sb.append("zkServerHeapsize");
        sb.append('=');
        sb.append(((this.zkServerHeapsize == null)?"<null>":this.zkServerHeapsize));
        sb.append(',');
        sb.append("zkUser");
        sb.append('=');
        sb.append(((this.zkUser == null)?"<null>":this.zkUser));
        sb.append(',');
        sb.append("zookeeperLogMaxBackupSize");
        sb.append('=');
        sb.append(((this.zookeeperLogMaxBackupSize == null)?"<null>":this.zookeeperLogMaxBackupSize));
        sb.append(',');
        sb.append("zookeeperLogNumberOfBackupFiles");
        sb.append('=');
        sb.append(((this.zookeeperLogNumberOfBackupFiles == null)?"<null>":this.zookeeperLogNumberOfBackupFiles));
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
        result = ((result* 31)+((this.dataDir == null)? 0 :this.dataDir.hashCode()));
        result = ((result* 31)+((this.zkUser == null)? 0 :this.zkUser.hashCode()));
        result = ((result* 31)+((this.autopurgePurgeInterval == null)? 0 :this.autopurgePurgeInterval.hashCode()));
        result = ((result* 31)+((this.syncLimit == null)? 0 :this.syncLimit.hashCode()));
        result = ((result* 31)+((this.zookeeperLogMaxBackupSize == null)? 0 :this.zookeeperLogMaxBackupSize.hashCode()));
        result = ((result* 31)+((this.zookeeperLogNumberOfBackupFiles == null)? 0 :this.zookeeperLogNumberOfBackupFiles.hashCode()));
        result = ((result* 31)+((this.content == null)? 0 :this.content.hashCode()));
        result = ((result* 31)+((this.zkPidDir == null)? 0 :this.zkPidDir.hashCode()));
        result = ((result* 31)+((this.clientPort == null)? 0 :this.clientPort.hashCode()));
        result = ((result* 31)+((this.initLimit == null)? 0 :this.initLimit.hashCode()));
        result = ((result* 31)+((this.tickTime == null)? 0 :this.tickTime.hashCode()));
        result = ((result* 31)+((this.zkLogDir == null)? 0 :this.zkLogDir.hashCode()));
        result = ((result* 31)+((this.zkServerHeapsize == null)? 0 :this.zkServerHeapsize.hashCode()));
        result = ((result* 31)+((this.autopurgeSnapRetainCount == null)? 0 :this.autopurgeSnapRetainCount.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties) == false) {
            return false;
        }
        Properties rhs = ((Properties) other);
        return (((((((((((((((this.dataDir == rhs.dataDir)||((this.dataDir!= null)&&this.dataDir.equals(rhs.dataDir)))&&((this.zkUser == rhs.zkUser)||((this.zkUser!= null)&&this.zkUser.equals(rhs.zkUser))))&&((this.autopurgePurgeInterval == rhs.autopurgePurgeInterval)||((this.autopurgePurgeInterval!= null)&&this.autopurgePurgeInterval.equals(rhs.autopurgePurgeInterval))))&&((this.syncLimit == rhs.syncLimit)||((this.syncLimit!= null)&&this.syncLimit.equals(rhs.syncLimit))))&&((this.zookeeperLogMaxBackupSize == rhs.zookeeperLogMaxBackupSize)||((this.zookeeperLogMaxBackupSize!= null)&&this.zookeeperLogMaxBackupSize.equals(rhs.zookeeperLogMaxBackupSize))))&&((this.zookeeperLogNumberOfBackupFiles == rhs.zookeeperLogNumberOfBackupFiles)||((this.zookeeperLogNumberOfBackupFiles!= null)&&this.zookeeperLogNumberOfBackupFiles.equals(rhs.zookeeperLogNumberOfBackupFiles))))&&((this.content == rhs.content)||((this.content!= null)&&this.content.equals(rhs.content))))&&((this.zkPidDir == rhs.zkPidDir)||((this.zkPidDir!= null)&&this.zkPidDir.equals(rhs.zkPidDir))))&&((this.clientPort == rhs.clientPort)||((this.clientPort!= null)&&this.clientPort.equals(rhs.clientPort))))&&((this.initLimit == rhs.initLimit)||((this.initLimit!= null)&&this.initLimit.equals(rhs.initLimit))))&&((this.tickTime == rhs.tickTime)||((this.tickTime!= null)&&this.tickTime.equals(rhs.tickTime))))&&((this.zkLogDir == rhs.zkLogDir)||((this.zkLogDir!= null)&&this.zkLogDir.equals(rhs.zkLogDir))))&&((this.zkServerHeapsize == rhs.zkServerHeapsize)||((this.zkServerHeapsize!= null)&&this.zkServerHeapsize.equals(rhs.zkServerHeapsize))))&&((this.autopurgeSnapRetainCount == rhs.autopurgeSnapRetainCount)||((this.autopurgeSnapRetainCount!= null)&&this.autopurgeSnapRetainCount.equals(rhs.autopurgeSnapRetainCount))));
    }

}
