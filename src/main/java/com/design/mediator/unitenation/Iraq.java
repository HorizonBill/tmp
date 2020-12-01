package com.design.mediator.unitenation;

/**
 * @author Administrator
 * @ClassName Iraq
 * @description
 * @time 2020/11/30 0030 22:47
 */
public class Iraq extends Country {
    public Iraq(UniteNation mediator) {
        super(mediator);
    }

    public void declare(String message){
        mediator.declare(message, this);
    }

    public void getMessage(String message){
        System.out.println("伊拉克获取对方信息：" + message);
    }
}
