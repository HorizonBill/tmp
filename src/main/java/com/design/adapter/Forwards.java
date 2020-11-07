package com.design.adapter;


public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "forward attack...");
    }

    @Override
    public void defense() {
        System.out.println( name + " forward defense..." );
    }
}
