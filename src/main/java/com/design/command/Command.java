package com.design.command;

/**
 * @author Administrator
 * @ClassName Commnd
 * @description
 * @time 2020/11/6 0006 20:51
 */
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver) {
        this.receiver = receiver;
    }

    abstract public void excuteCommand();
}
