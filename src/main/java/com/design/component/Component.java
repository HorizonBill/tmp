package com.design.component;

/**
 * @author Administrator
 * @ClassName Component
 * @description  组合模式
 * @time 2020/10/18  19:51
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    /**
     * 通过add，remove方法提供增加或移出树叶树枝的功能
     * @param component
     */
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract void display(int depth);
}
