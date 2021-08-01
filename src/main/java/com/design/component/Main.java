package com.design.component;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/10/18 0018 20:06
 */
public class Main {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        //一个节点下的枝节
        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));
        root.add(comp);

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);

        //一个节点下的枝节
        Composite comp2 = new Composite("Composite XY");
        comp2.add(new Leaf("Leaf XYA"));
        comp2.add(new Leaf("Leaf XYB"));
        root.add(comp2);

        root.add(new Leaf("Leaf C"));

        root.remove(leaf);

        root.display(1);
    }
}
