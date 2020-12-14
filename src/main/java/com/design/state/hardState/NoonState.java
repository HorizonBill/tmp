package com.design.state.hardState;

/**
 * @author Administrator
 * @ClassName NoonState
 * @description
 * @time 2020/12/14 0014 21:21
 */
public class NoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13 ){
            System.out.println("当前时间：" + work.getHour() + "点午休，有点困");
        } else {
            //超过13点转入下午状态
            work.setCurrent(new AfternnoonState());
            work.writeProgram();
        }

    }
}
