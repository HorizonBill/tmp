package com.design.state;

/**
 * @author Administrator
 * @ClassName ConcreteStateA
 * @description
 * @time 2020/12/14 0014 21:00
 */
public class ConcreteStateA implements State{
    @Override
    public void handler(Context context) {
        context.setState(new ConcreteStateB());
    }
}
