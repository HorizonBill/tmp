package com.design.command;

/**
 * @author Administrator
 * @ClassName BakeChickenWing
 * @description
 * @time 2020/11/6 0006 20:59
 */
public class BakeChickenWing extends Command {
    @Override
    public void excuteCommand() {
        receiver.bakeChickWing();
    }

    public BakeChickenWing(Barbecuer receiver) {
        super(receiver);
    }
}
