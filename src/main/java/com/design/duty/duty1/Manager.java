package com.design.duty.duty1;

/**
 * @author Administrator
 * @ClassName Manager
 * @description
 * @time 2020/11/7 0007 9:01
 */
public abstract class Manager {
    protected String name;

    //管理者的上级
    protected Manager superior;

    public Manager(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    abstract public void requestApplications(Request request);
}
