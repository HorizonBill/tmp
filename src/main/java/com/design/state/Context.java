package com.design.state;

/**
 * @author Administrator
 * @ClassName Context
 * @description
 * @time 2020/12/14 0014 20:57
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态：" + state.getClass());
    }

    public void requestState(){
        state.handler(this);
    }
}
