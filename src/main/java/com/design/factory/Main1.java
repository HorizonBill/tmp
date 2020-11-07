package com.design.factory;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        String selectStr = "";
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("/");
        list.add("c");
        list.add("+");
        Operation operation = null;
        for (String str : list) {
            switch (str) {
                case "a" :
                    System.out.println("aaa");
                    break;
                case "/" :
                    operation = new OperateDiv(12, 3);
                    break;
                 case "c" :
                    System.out.println("ccc");
                    break;
                 case "+" :
                     operation = new OperateAdd(12, 3);
                    break;
                    default:
                        System.out.println("111");
            }
            if (operation != null)
                System.out.println(operation.operate());
        }
    }
}
