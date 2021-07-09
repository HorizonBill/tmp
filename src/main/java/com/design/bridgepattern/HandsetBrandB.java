package com.design.bridgepattern;

/**
 * @author Administrator
 * @ClassName HandsetBrandB
 * @description
 * @time 2020/12/24 0024 22:17
 */
public class HandsetBrandB extends HandsetBrand {
    public HandsetBrandB(HandsetSoft handsetSoft) {
        super(handsetSoft);
    }

    @Override
    public void run() {
        System.out.print("B手机");
        handsetSoft.run();
    }
}
