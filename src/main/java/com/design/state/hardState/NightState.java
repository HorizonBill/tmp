package com.design.state.hardState;

/**
 * @author Administrator
 * @ClassName NightState
 * @description
 * @time 2020/12/14 0014 21:26
 */
public class NightState implements State{
    @Override
    public void writeProgram(Work work) {
        //判断工作是否完成
        if (work.isFinish()){
            work.setCurrent(new RestState());
            work.writeProgram();
        }else{
            if (work.getHour() < 21){
                System.out.println("当前时间：" + work.getHour() + "点晚上状态，困");
            }else{
                work.setCurrent(new DeepNightState());
                work.writeProgram();
            }
        }

    }
}
