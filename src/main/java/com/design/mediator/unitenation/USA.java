package com.design.mediator.unitenation;

/**
 * @author Administrator
 * @ClassName USA
 * @description
 * @time 2020/11/30 0030 22:43
 */
public class USA extends Country {
    public USA(UniteNation mediator) {
        super(mediator);
    }

    public void declare(String message){
        mediator.declare(message, this);
    }

    public void getMessage(String message){
        System.out.println("美国获得对方信息:" + message);
    }
}
