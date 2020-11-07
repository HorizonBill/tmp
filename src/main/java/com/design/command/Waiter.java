package com.design.command;

/**
 * @author Administrator
 * @ClassName Waiter
 * @description
 * @time 2020/11/6 0006 21:00
 */
public class Waiter {
    private Command command;

    public void setOrder(Command command){
        this.command = command;
    }

    public void notifyBakeer(){
        command.excuteCommand();
    }
}
