package com.design.factory;

public class OperateAdd implements Operation {
    int a;
    int b;
    @Override
    public int operate() {
        return a+b;
    }

    public OperateAdd(int a, int b){
        this.a = a;
        this.b = b;
    }

}
