package com.design.factory1;

public class CashRebate extends CashSuper {
    //折扣率eg. 0.8 8折
    private double moneyRebate = 1d;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
