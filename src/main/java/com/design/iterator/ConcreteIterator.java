package com.design.iterator;

/**
 * @author Administrator
 * @ClassName ConcreteIterator
 * @description
 * @time 2020/10/18 0018 22:40
 */
public class ConcreteIterator extends Iterator {
    //定义了一个具体聚集对象
    private ConcreteAggregate aggregate;
    private int current = 0;

    //初始化时将具体的聚集对象传入
    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        Object ret = null;
        current ++;
        if (current < aggregate.count()) {
            ret = aggregate.get(current);
        }
        return ret;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.count() ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }
}
