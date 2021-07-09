package com.design.bridgepattern;

/**
 * @author Administrator
 * @ClassName HandsetBrand
 * @description 手机品牌
 * @time 2020/12/24 0024 22:10
 */
public abstract class HandsetBrand {
    protected HandsetSoft handsetSoft;

    //设置手机软件
    public HandsetBrand(HandsetSoft handsetSoft) {
        this.handsetSoft = handsetSoft;
    }

    //运行
    public abstract void run();
}
