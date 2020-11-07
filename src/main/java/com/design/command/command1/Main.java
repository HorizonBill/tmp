package com.design.command.command1;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/11/6 0006 22:05
 */
public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
