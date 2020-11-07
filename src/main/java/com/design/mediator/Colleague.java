package com.design.mediator;

/**
 * @author Administrator
 * @ClassName Colleague
 * @description
 * @time 2020/11/7 0007 21:58
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
