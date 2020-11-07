package com.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @ClassName ConcreteAggregate
 * @description
 * @time 2020/10/18 0018 22:41
 */
public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<>();
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int count(){
        return items.size();
    }

    public Object get(int index){
        return items.get(index);
    }

    public void set(int index, Object obj){
        items.add(index, obj);
    }
}
