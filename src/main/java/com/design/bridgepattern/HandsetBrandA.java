package com.design.bridgepattern;

/**
 * @author Administrator
 * @ClassName HandsetBrandA
 * @description 手机品牌A
 * @time 2020/12/24 0024 22:14
 */
public class HandsetBrandA extends HandsetBrand {

    public HandsetBrandA(HandsetSoft handsetSoft) {
        super(handsetSoft);
    }

    @Override
    public void run() {
        System.out.print("A手机");
        handsetSoft.run();
    }
}
