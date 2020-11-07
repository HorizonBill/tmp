package com.design.factory1;

public class CashFactory {
    //现金收取工厂
    public static CashSuper createCashAccept(String type) {
        CashSuper cs = null;
        switch (type) {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs = new CashReturn(300d, 100d);
                break;
            case "打8折":
                cs = new CashRebate(0.8d);
                break;
        }
        return cs;
    }
}
