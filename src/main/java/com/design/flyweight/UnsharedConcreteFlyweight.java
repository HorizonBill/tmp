package com.design.flyweight;

/**
 * @author Administrator
 * @ClassName UnsharedConcreteFlyweight
 * @description
 * @time 2020/12/1 0001 21:40
 */
public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体Flyweight：" + extrinsicstate);
    }
}
