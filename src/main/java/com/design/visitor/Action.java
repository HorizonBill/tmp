package com.design.visitor;

/**
 * @author Administrator
 * @ClassName Action
 * @description  男女反应
 * @time 2020/12/3 0003 21:25
 */
public interface Action {
    public void getManConClusion(Man conclusion1);

    public void getWomanClusion(Woman conclusion2);
}
