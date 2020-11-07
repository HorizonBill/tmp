package com.design.component;

import java.util.*;

/**
 * @author Administrator
 * @ClassName Composite
 * @description  Composite定义枝节点行为，用来存储子部件，在Component接口中实现与子部件有关的操作
 * @time 2020/10/18  19:59
 */
public class Composite extends Component {

    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println(StrToken.singleLine("-", depth) + " " +name);
        for (Component component : children)
            component.display(depth + 2);
    }
}
