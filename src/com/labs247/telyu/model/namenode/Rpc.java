
package com.labs247.telyu.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rpc {

    @SerializedName("client")
    @Expose
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rpc.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("client");
        sb.append('=');
        sb.append(((this.client == null)?"<null>":this.client));
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
        result = ((result* 31)+((this.client == null)? 0 :this.client.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rpc) == false) {
            return false;
        }
        Rpc rhs = ((Rpc) other);
        return ((this.client == rhs.client)||((this.client!= null)&&this.client.equals(rhs.client)));
    }

}
