package com.design.mediator;

/**
 * @author Administrator
 * @ClassName ConcreteColleague1
 * @description
 * @time 2020/11/30 0030 22:08
 */
public class ConcreteColleague1 extends Colleague{
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notifyMess(String message){
        System.out.println("colleague1 get message:" + message);
    }
}
