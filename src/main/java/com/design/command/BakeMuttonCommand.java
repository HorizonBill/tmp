package com.design.command;

/**
 * @author Administrator
 * @ClassName BakeMuttonCommand
 * @description
 * @time 2020/11/6 0006 20:54
 */
public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void excuteCommand() {
        receiver.bakeMutton();
    }
}
