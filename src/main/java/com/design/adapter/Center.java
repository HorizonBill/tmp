package com.design.adapter;

/**
 * @author Administrator
 * @ClassName Center
 * @description
 * @time 2020/10/18 16:28
 */
public class Center extends Player{
    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "center attack...");
    }

    @Override
    public void defense() {
        System.out.println( name + " center defense..." );
    }
}
