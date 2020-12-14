package com.design.state.hardState;

/**
 * @author Administrator
 * @ClassName RestState
 * @description
 * @time 2020/12/14 0014 21:30
 */
public class RestState implements State {
    @Override
    public void writeProgram(Work work) {
        System.out.println(work.getHour()+ "pm， the master is living...");
    }
}
