package com.design.state;

/**
 * @author Administrator
 * @ClassName ConcreteStateB
 * @description
 * @time 2020/12/14 0014 21:02
 */
public class ConcreteStateB implements State
{
    @Override
    public void handler(Context context) {
        context.setState(new ConcreteStateA());
    }
}
