package com.design.component;

/**
 * @author Administrator
 * @ClassName Leaf
 * @description
 * @time 2020/10/18 0018 19:55
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("cannot add to a leaf");
    }

    @Override
    public void remove(Component component) {
        System.out.println("cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println(StrToken.singleLine("-", depth) + " " + name);
    }


}
