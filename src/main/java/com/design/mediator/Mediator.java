package com.design.mediator;

/**
 * @author Administrator
 * @ClassName Mediator
 * @description
 * @time 2020/11/7 0007 21:56
 */
public abstract class Mediator {
    /**
     * 定义一个抽象的发送方法，得到同事对象和信息
     * @param message
     * @param colleague
     */
    public abstract void send(String message, Colleague colleague);
}
