package com.design.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @ClassName ObjectStructure
 * @description
 * @time 2020/12/3 0003 21:41
 */
public class ObjectStructure {
    private List<Persion> elements = new ArrayList<>();

    public void attach(Persion element){
        elements.add(element);
    }
    public void detach(Persion element){
        elements.remove(element);

    }

    /**
     * 展示效果
     * @param visitor
     */
    public void display(Action visitor){
        for (Persion p : elements){
            p.acceptAction(visitor);
        }
    }
}
