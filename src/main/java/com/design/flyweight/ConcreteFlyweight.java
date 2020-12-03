package com.design.flyweight;

/**
 * @author Administrator
 * @ClassName ConcreteFlyweight
 * @description 继承Flyweight超类或实现Flyweight接口，并为内部状态增加存储空间
 * @time 2020/12/1 0001 21:38
 */
public class ConcreteFlyweight extends Flyweight {

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体Flyweight：" + extrinsicstate);
    }
}
