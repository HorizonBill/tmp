package com.design.iterator;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/10/18 0018 23:28
 */
public class Main {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        concreteAggregate.set(0, "bill");
        concreteAggregate.set(1, "billa");
        concreteAggregate.set(2, "billb");
        concreteAggregate.set(3, "billc");
        concreteAggregate.set(4, "billd");

        Iterator iterator = new ConcreteIterator(concreteAggregate);
        Object item = iterator.first();
        while(!iterator.isDone()) {
            System.out.println(iterator.currentItem() + " buy ticket...");
            iterator.next();
        }

    }

}