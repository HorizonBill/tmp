package com.design.flyweight;

/**
 * @author Administrator
 * @ClassName Flyweight 所有具体享元类的超类或接口，通过这个接口，Flyweight可以接受并作用于外部状态
 * @description 享元模式
 * @time 2020/12/1 0001 21:33
 */
public abstract class Flyweight {
    public abstract void operation(int extrinsicstate);
}
