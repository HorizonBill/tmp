package com.design.visitor;

/**
 * @author Administrator
 * @ClassName Success
 * @description 当是成功状态时， 男女的区别
 * @time 2020/12/3 0003 21:30
 */
public class Success implements Action {
    public static String statue = "成功";
    @Override
    public void getManConClusion(Man conclusion1) {
        System.out.println(Man.chineseName + Success.statue + "背后有女人");
    }

    @Override
    public void getWomanClusion(Woman conclusion2) {
        System.out.println(Woman.chineseName + Success.statue  + "没男人");
    }
}
