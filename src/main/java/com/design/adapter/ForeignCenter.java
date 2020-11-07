package com.design.adapter;

/**
 * @author Administrator
 * @ClassName ForeignCenter
 * @description
 * @time 2020/10/18 0018 16:35
 */
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jingong() {
        System.out.println(name + " forward attack...");
    }

    public void fangshou() {
        System.out.println( name + " forward defense..." );
    }
}
