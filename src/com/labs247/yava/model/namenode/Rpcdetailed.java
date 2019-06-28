
package com.labs247.yava.model.namenode;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rpcdetailed {

    @SerializedName("client")
    @Expose
    private Client__1 client;

    public Client__1 getClient() {
        return client;
    }

    public void setClient(Client__1 client) {
        this.client = client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Rpcdetailed.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        if ((other instanceof Rpcdetailed) == false) {
            return false;
        }
        Rpcdetailed rhs = ((Rpcdetailed) other);
        return ((this.client == rhs.client)||((this.client!= null)&&this.client.equals(rhs.client)));
    }

}
