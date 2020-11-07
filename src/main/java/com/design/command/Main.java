package com.design.command;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/11/6 0006 21:02
 */
public class Main {
    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();
        Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
        Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
        Command bakeChickenWingCommand1 = new BakeChickenWing(boy);
        Waiter girl = new Waiter();

        girl.setOrder(bakeMuttonCommand1);
        girl.notifyBakeer();
        girl.setOrder(bakeMuttonCommand2);
        girl.notifyBakeer();
        girl.setOrder(bakeChickenWingCommand1);
        girl.notifyBakeer();
    }
}
