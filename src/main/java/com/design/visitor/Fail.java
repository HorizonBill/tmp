package com.design.visitor;

/**
 * @author Administrator
 * @ClassName Fail
 * @description
 * @time 2020/12/3 0003 21:33
 */
public class Fail implements Action {
    @Override
    public void getManConClusion(Man conclusion1) {
        System.out.println();
    }

    @Override
    public void getWomanClusion(Woman conclusion2) {
        System.out.println();
    }
}
