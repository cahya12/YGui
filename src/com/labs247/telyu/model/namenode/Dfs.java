
package com.labs247.telyu.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dfs {

    @SerializedName("FSNamesystem")
    @Expose
    private FSNamesystem fSNamesystem;
    @SerializedName("namenode")
    @Expose
    private Namenode namenode;

    public FSNamesystem getFSNamesystem() {
        return fSNamesystem;
    }

    public void setFSNamesystem(FSNamesystem fSNamesystem) {
        this.fSNamesystem = fSNamesystem;
    }

    public Namenode getNamenode() {
        return namenode;
    }

    public void setNamenode(Namenode namenode) {
        this.namenode = namenode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Dfs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fSNamesystem");
        sb.append('=');
        sb.append(((this.fSNamesystem == null)?"<null>":this.fSNamesystem));
        sb.append(',');
        sb.append("namenode");
        sb.append('=');
        sb.append(((this.namenode == null)?"<null>":this.namenode));
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
        result = ((result* 31)+((this.fSNamesystem == null)? 0 :this.fSNamesystem.hashCode()));
        result = ((result* 31)+((this.namenode == null)? 0 :this.namenode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Dfs) == false) {
            return false;
        }
        Dfs rhs = ((Dfs) other);
        return (((this.fSNamesystem == rhs.fSNamesystem)||((this.fSNamesystem!= null)&&this.fSNamesystem.equals(rhs.fSNamesystem)))&&((this.namenode == rhs.namenode)||((this.namenode!= null)&&this.namenode.equals(rhs.namenode))));
    }

}
