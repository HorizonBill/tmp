package com.design.flyweight;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/12/1 0001 21:50
 */
public class Main {


    public static void main(String[] args) {
        int extrinsicstate = 22;
        FlyweightFactory f = new FlyweightFactory();

        Flyweight fx = f.getFlyweight("X");
        fx.operation(--extrinsicstate);

        Flyweight fy = f.getFlyweight("Y");
        fy.operation(--extrinsicstate);

        Flyweight fz = f.getFlyweight("Z");
        fz.operation(--extrinsicstate);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicstate);

    }
}
