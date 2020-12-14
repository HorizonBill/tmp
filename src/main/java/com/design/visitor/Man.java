package com.design.visitor;

/**
 * @author Administrator
 * @ClassName Man
 * @description 首先在客户程序中将具体状态作为参数传递给 男人 类
 *              完成了一次分派，然后 男人 类调用作为参数的 “具体状态”
 *              中的方法“男人反应”，同时将自己(this)作为参数传递进去，这便完成
 *              了第二次分派。
 * @time 2020/12/3 0003 21:33
 */
public class Man implements Persion {
    public static String chineseName = "男人";
    @Override
    public void acceptAction(Action action) {
        action.getManConClusion(this);
    }
}
