package com.design.factory1;

public class Main {
    public static void main(String[] args) {
        CashContext cc = new CashContext("c");
        System.out.println(cc.getResult(400d));
        CashContext cc1 = new CashContext("b");
        System.out.println(cc1.getResult(cc.getResult(400d)));
    }
}
