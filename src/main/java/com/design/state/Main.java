package com.design.state;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/12/14 0014 21:03
 */
public class Main {
    public static void main(String[] args) {
        Context c = new Context(new ConcreteStateA());
        c.requestState();
        c.requestState();
        c.requestState();
    }
}
