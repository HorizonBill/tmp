package com.design.flyweight;

import java.util.Hashtable;

/**
 * @author Administrator
 * @ClassName FlyweightFactory
 * @description
 * @time 2020/12/1 0001 21:42
 */
public class FlyweightFactory {
    private Hashtable<String, ConcreteFlyweight> flyweights = new Hashtable();
    public  FlyweightFactory(){
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());

    }

    public Flyweight getFlyweight(String key){
        return flyweights.get(key);
    }
}
