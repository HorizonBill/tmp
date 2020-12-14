package com.design.visitor;

/**
 * @author Administrator
 * @ClassName Woman
 * @description
 * @time 2020/12/3 0003 21:34
 */
public class Woman implements Persion {
    public static String chineseName = "女人";
    @Override
    public void acceptAction(Action action) {
        action.getWomanClusion(this);
    }
}
