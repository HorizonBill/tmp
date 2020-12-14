package com.design.state.hardState;

/**
 * @author Administrator
 * @ClassName DeepNightState
 * @description
 * @time 2020/12/14 0014 21:28
 */
public class DeepNightState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(work.getHour()+"pm, the master has died!");
    }
}
