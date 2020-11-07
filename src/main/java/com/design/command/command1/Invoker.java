package com.design.command.command1;

/**
 * @author Administrator
 * @ClassName Invoker
 * @description
 * @time 2020/11/6 0006 22:01
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
