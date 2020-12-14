package com.design.state.hardState;

/**
 * @author Administrator
 * @ClassName AfternnoonState
 * @description
 * @time 2020/12/14 0014 21:24
 */
public class AfternnoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if(work.getHour() < 17) {
            System.out.println("当前时间：" + work.getHour() + "点下午状态，活力四射");
        }else{
            work.setCurrent(new NightState());
            work.writeProgram();
        }
    }
}
