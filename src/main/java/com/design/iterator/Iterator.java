package com.design.iterator;

/**
 * @author Administrator
 * @ClassName Iterator
 * @description  迭代器模式
 * @time 2020/10/18 0018 22:34
 */
public abstract class Iterator {
    /*
    *用于定义得到开始对象，得到下一个对象，判断是否到结尾，当前对象等抽象方法，统一接口
     */
    public abstract Object first();
    public abstract Object next();
    public abstract boolean isDone();
    public abstract Object currentItem();
}
