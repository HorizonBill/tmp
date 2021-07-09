package com.design.bridgepattern;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/12/24 0024 22:18
 */
public class Main {
    public static void main(String[] args) {
        HandsetBrand handsetBrand;
        handsetBrand = new HandsetBrandA(new HandsetGame());
        handsetBrand.run();

        handsetBrand = new HandsetBrandB(new HandsetAddressList());
        handsetBrand.run();

    }
}
