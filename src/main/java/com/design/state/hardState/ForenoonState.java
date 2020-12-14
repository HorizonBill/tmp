package com.design.state.hardState;

/**
 * @author Administrator
 * @ClassName ForenoonState
 * @description
 * @time 2020/12/14 0014 21:12
 */
public class ForenoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12){
            System.out.println("当前时间：" + work.getHour() + "点上午工作，精神百倍");
        }else {
            //超过12点转入中午状态
            work.setCurrent(new NoonState());
            work.writeProgram();
        }
    }
}
