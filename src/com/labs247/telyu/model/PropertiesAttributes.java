package com.labs247.telyu.model;


public class PropertiesAttributes {


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PropertiesAttributes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PropertiesAttributes) == false) {
            return false;
        }
        PropertiesAttributes rhs = ((PropertiesAttributes) other);
        return true;
    }

}
