package com.design.flyweight.website;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/12/2 0002 21:41
 */
public class Main {
    public static void main(String[] args) {
        WebsiteFactory factory = new WebsiteFactory();

        Website f1 = factory.getWebsiteCategory("产品展示");
        f1.use(new Use("Jim"));

        Website f2 = factory.getWebsiteCategory("产品展示");
        f1.use(new Use("Tom"));

        Website f3 = factory.getWebsiteCategory("博客");
        f1.use(new Use("Bill"));

        Website f4 = factory.getWebsiteCategory("博客");
        f1.use(new Use("Jack"));

        Website f5  = factory.getWebsiteCategory("博客");
        f1.use(new Use("Gate"));

        System.out.println("  网站分类总数：" + factory.getWebsiteCount());
    }
}
