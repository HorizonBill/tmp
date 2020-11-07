package com.design.command.command1;

/**
 * @author Administrator
 * @ClassName Command
 * @description
 * @time 2020/11/6 0006 21:54
 */
public abstract class Command {
    protected Receiver receiver;

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    abstract public void execute();
}
