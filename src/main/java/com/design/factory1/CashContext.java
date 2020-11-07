package com.design.factory1;

public class CashContext {
    private CashSuper cs;

    //注意参数不是具体的收费策略对象，而是一个字符串，表示收费类型
    public CashContext(String type) {
        switch (type) {
            case "a":
                cs = new CashNormal();
                break;
            case "b":
                cs = new CashReturn(300d, 100d);
                break;
            case "c":
                cs = new CashRebate(0.8d);
                break;

        }
    }

    public double getResult(double money){
        return cs.acceptCash(money);
    }
}
