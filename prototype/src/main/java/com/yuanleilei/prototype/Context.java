package com.yuanleilei.prototype;

public class Context implements Cloneable{
    public Context(String con) {
        this.con = con;
    }

    private String con;

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    @Override
    public String toString() {
        return "Context{" +
                "con='" + con + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
