package com.design.flyweight.website;

/**
 * @author Administrator
 * @ClassName ConcreteWebsite
 * @description
 * @time 2020/12/2 0002 21:34
 */
public class ConcreteWebsite extends Website {
    private String name = "";

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(Use use) {
        System.out.println("网站分类：" + name + ",用户名:" + use.getName() );
    }
}
