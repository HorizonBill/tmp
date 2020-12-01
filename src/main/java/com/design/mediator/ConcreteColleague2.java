package com.design.mediator;

/**
 * @author Administrator
 * @ClassName ConcreteColleague2
 * @description
 * @time 2020/11/30 0030 22:10
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void send(String message){
        mediator.send(message,this);
    }

    public void notifyMess(String message){
        System.out.println("colleague2 get message:" + message);
    }
}
