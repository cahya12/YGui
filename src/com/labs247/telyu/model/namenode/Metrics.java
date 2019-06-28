
package com.labs247.telyu.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metrics {

    @SerializedName("boottime")
    @Expose
    private Double boottime;
    @SerializedName("boottime._avg")
    @Expose
    private Double boottimeAvg;
    @SerializedName("boottime._max")
    @Expose
    private Double boottimeMax;
    @SerializedName("boottime._min")
    @Expose
    private Double boottimeMin;
    @SerializedName("boottime._rate")
    @Expose
    private Integer boottimeRate;
    @SerializedName("boottime._sum")
    @Expose
    private Double boottimeSum;
    @SerializedName("cpu")
    @Expose
    private Cpu cpu;
    @SerializedName("default")
    @Expose
    private Default _default;
    @SerializedName("dfs")
    @Expose
    private Dfs dfs;
    @SerializedName("disk")
    @Expose
    private Disk disk;
    @SerializedName("jvm")
    @Expose
    private Jvm jvm;
    @SerializedName("load")
    @Expose
    private Load load;
    @SerializedName("memory")
    @Expose
    private Memory memory;
    @SerializedName("metricssystem")
    @Expose
    private Metricssystem metricssystem;
    @SerializedName("network")
    @Expose
    private Network network;
    @SerializedName("process")
    @Expose
    private Process process;
    @SerializedName("rpc")
    @Expose
    private Rpc rpc;
    @SerializedName("rpcdetailed")
    @Expose
    private Rpcdetailed rpcdetailed;
    @SerializedName("ugi")
    @Expose
    private Ugi ugi;

    public Double getBoottime() {
        return boottime;
    }

    public void setBoottime(Double boottime) {
        this.boottime = boottime;
    }

    public Double getBoottimeAvg() {
        return boottimeAvg;
    }

    public void setBoottimeAvg(Double boottimeAvg) {
        this.boottimeAvg = boottimeAvg;
    }

    public Double getBoottimeMax() {
        return boottimeMax;
    }

    public void setBoottimeMax(Double boottimeMax) {
        this.boottimeMax = boottimeMax;
    }

    public Double getBoottimeMin() {
        return boottimeMin;
    }

    public void setBoottimeMin(Double boottimeMin) {
        this.boottimeMin = boottimeMin;
    }

    public Integer getBoottimeRate() {
        return boottimeRate;
    }

    public void setBoottimeRate(Integer boottimeRate) {
        this.boottimeRate = boottimeRate;
    }

    public Double getBoottimeSum() {
        return boottimeSum;
    }

    public void setBoottimeSum(Double boottimeSum) {
        this.boottimeSum = boottimeSum;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Default getDefault() {
        return _default;
    }

    public void setDefault(Default _default) {
        this._default = _default;
    }

    public Dfs getDfs() {
        return dfs;
    }

    public void setDfs(Dfs dfs) {
        this.dfs = dfs;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Jvm getJvm() {
        return jvm;
    }

    public void setJvm(Jvm jvm) {
        this.jvm = jvm;
    }

    public Load getLoad() {
        return load;
    }

    public void setLoad(Load load) {
        this.load = load;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Metricssystem getMetricssystem() {
        return metricssystem;
    }

    public void setMetricssystem(Metricssystem metricssystem) {
        this.metricssystem = metricssystem;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }

    public Rpc getRpc() {
        return rpc;
    }

    public void setRpc(Rpc rpc) {
        this.rpc = rpc;
    }

    public Rpcdetailed getRpcdetailed() {
        return rpcdetailed;
    }

    public void setRpcdetailed(Rpcdetailed rpcdetailed) {
        this.rpcdetailed = rpcdetailed;
    }

    public Ugi getUgi() {
        return ugi;
    }

    public void setUgi(Ugi ugi) {
        this.ugi = ugi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Metrics.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("boottime");
        sb.append('=');
        sb.append(((this.boottime == null)?"<null>":this.boottime));
        sb.append(',');
        sb.append("boottimeAvg");
        sb.append('=');
        sb.append(((this.boottimeAvg == null)?"<null>":this.boottimeAvg));
        sb.append(',');
        sb.append("boottimeMax");
        sb.append('=');
        sb.append(((this.boottimeMax == null)?"<null>":this.boottimeMax));
        sb.append(',');
        sb.append("boottimeMin");
        sb.append('=');
        sb.append(((this.boottimeMin == null)?"<null>":this.boottimeMin));
        sb.append(',');
        sb.append("boottimeRate");
        sb.append('=');
        sb.append(((this.boottimeRate == null)?"<null>":this.boottimeRate));
        sb.append(',');
        sb.append("boottimeSum");
        sb.append('=');
        sb.append(((this.boottimeSum == null)?"<null>":this.boottimeSum));
        sb.append(',');
        sb.append("cpu");
        sb.append('=');
        sb.append(((this.cpu == null)?"<null>":this.cpu));
        sb.append(',');
        sb.append("_default");
        sb.append('=');
        sb.append(((this._default == null)?"<null>":this._default));
        sb.append(',');
        sb.append("dfs");
        sb.append('=');
        sb.append(((this.dfs == null)?"<null>":this.dfs));
        sb.append(',');
        sb.append("disk");
        sb.append('=');
        sb.append(((this.disk == null)?"<null>":this.disk));
        sb.append(',');
        sb.append("jvm");
        sb.append('=');
        sb.append(((this.jvm == null)?"<null>":this.jvm));
        sb.append(',');
        sb.append("load");
        sb.append('=');
        sb.append(((this.load == null)?"<null>":this.load));
        sb.append(',');
        sb.append("memory");
        sb.append('=');
        sb.append(((this.memory == null)?"<null>":this.memory));
        sb.append(',');
        sb.append("metricssystem");
        sb.append('=');
        sb.append(((this.metricssystem == null)?"<null>":this.metricssystem));
        sb.append(',');
        sb.append("network");
        sb.append('=');
        sb.append(((this.network == null)?"<null>":this.network));
        sb.append(',');
        sb.append("process");
        sb.append('=');
        sb.append(((this.process == null)?"<null>":this.process));
        sb.append(',');
        sb.append("rpc");
        sb.append('=');
        sb.append(((this.rpc == null)?"<null>":this.rpc));
        sb.append(',');
        sb.append("rpcdetailed");
        sb.append('=');
        sb.append(((this.rpcdetailed == null)?"<null>":this.rpcdetailed));
        sb.append(',');
        sb.append("ugi");
        sb.append('=');
        sb.append(((this.ugi == null)?"<null>":this.ugi));
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
        result = ((result* 31)+((this.jvm == null)? 0 :this.jvm.hashCode()));
        result = ((result* 31)+((this.rpcdetailed == null)? 0 :this.rpcdetailed.hashCode()));
        result = ((result* 31)+((this._default == null)? 0 :this._default.hashCode()));
        result = ((result* 31)+((this.boottimeMax == null)? 0 :this.boottimeMax.hashCode()));
        result = ((result* 31)+((this.process == null)? 0 :this.process.hashCode()));
        result = ((result* 31)+((this.memory == null)? 0 :this.memory.hashCode()));
        result = ((result* 31)+((this.rpc == null)? 0 :this.rpc.hashCode()));
        result = ((result* 31)+((this.cpu == null)? 0 :this.cpu.hashCode()));
        result = ((result* 31)+((this.boottimeSum == null)? 0 :this.boottimeSum.hashCode()));
        result = ((result* 31)+((this.boottimeRate == null)? 0 :this.boottimeRate.hashCode()));
        result = ((result* 31)+((this.network == null)? 0 :this.network.hashCode()));
        result = ((result* 31)+((this.dfs == null)? 0 :this.dfs.hashCode()));
        result = ((result* 31)+((this.disk == null)? 0 :this.disk.hashCode()));
        result = ((result* 31)+((this.boottimeAvg == null)? 0 :this.boottimeAvg.hashCode()));
        result = ((result* 31)+((this.boottimeMin == null)? 0 :this.boottimeMin.hashCode()));
        result = ((result* 31)+((this.load == null)? 0 :this.load.hashCode()));
        result = ((result* 31)+((this.boottime == null)? 0 :this.boottime.hashCode()));
        result = ((result* 31)+((this.metricssystem == null)? 0 :this.metricssystem.hashCode()));
        result = ((result* 31)+((this.ugi == null)? 0 :this.ugi.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metrics) == false) {
            return false;
        }
        Metrics rhs = ((Metrics) other);
        return ((((((((((((((((((((this.jvm == rhs.jvm)||((this.jvm!= null)&&this.jvm.equals(rhs.jvm)))&&((this.rpcdetailed == rhs.rpcdetailed)||((this.rpcdetailed!= null)&&this.rpcdetailed.equals(rhs.rpcdetailed))))&&((this._default == rhs._default)||((this._default!= null)&&this._default.equals(rhs._default))))&&((this.boottimeMax == rhs.boottimeMax)||((this.boottimeMax!= null)&&this.boottimeMax.equals(rhs.boottimeMax))))&&((this.process == rhs.process)||((this.process!= null)&&this.process.equals(rhs.process))))&&((this.memory == rhs.memory)||((this.memory!= null)&&this.memory.equals(rhs.memory))))&&((this.rpc == rhs.rpc)||((this.rpc!= null)&&this.rpc.equals(rhs.rpc))))&&((this.cpu == rhs.cpu)||((this.cpu!= null)&&this.cpu.equals(rhs.cpu))))&&((this.boottimeSum == rhs.boottimeSum)||((this.boottimeSum!= null)&&this.boottimeSum.equals(rhs.boottimeSum))))&&((this.boottimeRate == rhs.boottimeRate)||((this.boottimeRate!= null)&&this.boottimeRate.equals(rhs.boottimeRate))))&&((this.network == rhs.network)||((this.network!= null)&&this.network.equals(rhs.network))))&&((this.dfs == rhs.dfs)||((this.dfs!= null)&&this.dfs.equals(rhs.dfs))))&&((this.disk == rhs.disk)||((this.disk!= null)&&this.disk.equals(rhs.disk))))&&((this.boottimeAvg == rhs.boottimeAvg)||((this.boottimeAvg!= null)&&this.boottimeAvg.equals(rhs.boottimeAvg))))&&((this.boottimeMin == rhs.boottimeMin)||((this.boottimeMin!= null)&&this.boottimeMin.equals(rhs.boottimeMin))))&&((this.load == rhs.load)||((this.load!= null)&&this.load.equals(rhs.load))))&&((this.boottime == rhs.boottime)||((this.boottime!= null)&&this.boottime.equals(rhs.boottime))))&&((this.metricssystem == rhs.metricssystem)||((this.metricssystem!= null)&&this.metricssystem.equals(rhs.metricssystem))))&&((this.ugi == rhs.ugi)||((this.ugi!= null)&&this.ugi.equals(rhs.ugi))));
    }

}
