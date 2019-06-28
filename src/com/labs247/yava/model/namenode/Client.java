
package com.labs247.yava.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Client {

    @SerializedName("NumOpenConnections")
    @Expose
    private Integer numOpenConnections;
    @SerializedName("ReceivedBytes")
    @Expose
    private Integer receivedBytes;
    @SerializedName("RpcProcessingTimeAvgTime")
    @Expose
    private Double rpcProcessingTimeAvgTime;
    @SerializedName("RpcQueueTimeAvgTime")
    @Expose
    private Double rpcQueueTimeAvgTime;
    @SerializedName("SentBytes")
    @Expose
    private Integer sentBytes;

    public Integer getNumOpenConnections() {
        return numOpenConnections;
    }

    public void setNumOpenConnections(Integer numOpenConnections) {
        this.numOpenConnections = numOpenConnections;
    }

    public Integer getReceivedBytes() {
        return receivedBytes;
    }

    public void setReceivedBytes(Integer receivedBytes) {
        this.receivedBytes = receivedBytes;
    }

    public Double getRpcProcessingTimeAvgTime() {
        return rpcProcessingTimeAvgTime;
    }

    public void setRpcProcessingTimeAvgTime(Double rpcProcessingTimeAvgTime) {
        this.rpcProcessingTimeAvgTime = rpcProcessingTimeAvgTime;
    }

    public Double getRpcQueueTimeAvgTime() {
        return rpcQueueTimeAvgTime;
    }

    public void setRpcQueueTimeAvgTime(Double rpcQueueTimeAvgTime) {
        this.rpcQueueTimeAvgTime = rpcQueueTimeAvgTime;
    }

    public Integer getSentBytes() {
        return sentBytes;
    }

    public void setSentBytes(Integer sentBytes) {
        this.sentBytes = sentBytes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Client.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("numOpenConnections");
        sb.append('=');
        sb.append(((this.numOpenConnections == null)?"<null>":this.numOpenConnections));
        sb.append(',');
        sb.append("receivedBytes");
        sb.append('=');
        sb.append(((this.receivedBytes == null)?"<null>":this.receivedBytes));
        sb.append(',');
        sb.append("rpcProcessingTimeAvgTime");
        sb.append('=');
        sb.append(((this.rpcProcessingTimeAvgTime == null)?"<null>":this.rpcProcessingTimeAvgTime));
        sb.append(',');
        sb.append("rpcQueueTimeAvgTime");
        sb.append('=');
        sb.append(((this.rpcQueueTimeAvgTime == null)?"<null>":this.rpcQueueTimeAvgTime));
        sb.append(',');
        sb.append("sentBytes");
        sb.append('=');
        sb.append(((this.sentBytes == null)?"<null>":this.sentBytes));
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
        result = ((result* 31)+((this.receivedBytes == null)? 0 :this.receivedBytes.hashCode()));
        result = ((result* 31)+((this.numOpenConnections == null)? 0 :this.numOpenConnections.hashCode()));
        result = ((result* 31)+((this.rpcQueueTimeAvgTime == null)? 0 :this.rpcQueueTimeAvgTime.hashCode()));
        result = ((result* 31)+((this.rpcProcessingTimeAvgTime == null)? 0 :this.rpcProcessingTimeAvgTime.hashCode()));
        result = ((result* 31)+((this.sentBytes == null)? 0 :this.sentBytes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Client) == false) {
            return false;
        }
        Client rhs = ((Client) other);
        return ((((((this.receivedBytes == rhs.receivedBytes)||((this.receivedBytes!= null)&&this.receivedBytes.equals(rhs.receivedBytes)))&&((this.numOpenConnections == rhs.numOpenConnections)||((this.numOpenConnections!= null)&&this.numOpenConnections.equals(rhs.numOpenConnections))))&&((this.rpcQueueTimeAvgTime == rhs.rpcQueueTimeAvgTime)||((this.rpcQueueTimeAvgTime!= null)&&this.rpcQueueTimeAvgTime.equals(rhs.rpcQueueTimeAvgTime))))&&((this.rpcProcessingTimeAvgTime == rhs.rpcProcessingTimeAvgTime)||((this.rpcProcessingTimeAvgTime!= null)&&this.rpcProcessingTimeAvgTime.equals(rhs.rpcProcessingTimeAvgTime))))&&((this.sentBytes == rhs.sentBytes)||((this.sentBytes!= null)&&this.sentBytes.equals(rhs.sentBytes))));
    }

}
