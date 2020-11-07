package com.design.command.command1;

/**
 * @author Administrator
 * @ClassName ConcreteCommand
 * @description
 * @time 2020/11/6 0006 21:57
 */
public class ConcreteCommand extends Command{

    public ConcreteCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.action();
    }

}
