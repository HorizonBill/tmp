package com.design.visitor;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/12/3 0003 21:47
 */
public class Main {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());
        //各种状态下 男女之间的对比
        Success success = new Success();
        o.display(success);
    }
}
