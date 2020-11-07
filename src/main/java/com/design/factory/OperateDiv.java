package com.design.factory;

public class OperateDiv implements Operation {
    int a;
    int b;
    public OperateDiv(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int operate() {
        if (b != 0)
            return a/b;
        else{
            System.out.println("数据异常");
            return -1;
        }

    }
}
