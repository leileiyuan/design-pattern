package com.yuanleilei.prototype;

import java.util.List;

public class Message implements Cloneable{
    private int id;
    private String name;
    private List<String> list;
    private  Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 深度克隆
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Message msg = (Message)super.clone();
        msg.setContext((Context) context.clone());
        return msg;
    }
}
