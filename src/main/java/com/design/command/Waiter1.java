package com.design.command;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 * @ClassName Waiter
 * @description
 * @time 2020/11/6 0006 21:00
 */
public class Waiter1 {
    private List<Command> orders = new ArrayList<>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    public void setOrder(Command command){
        if(command.toString() == "chickenWingCommand"){
            System.out.println("chicken is running, please eat other");
        } else {
            orders.add(command);
            System.out.println("add orders: " + command.toString() + ", time:" + sdf.format(new Date()));
        }

    }

    public void cancelOrder(Command command){
        orders.remove(command);
        System.out.println("cancel: " + command.toString() +  ", time:" + sdf.format(new Date()));
    }

    public void notifyBakeer(){
        for (Command command : orders)
            command.excuteCommand();
    }
}
