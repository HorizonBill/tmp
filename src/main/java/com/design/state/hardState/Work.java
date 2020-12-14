package com.design.state.hardState;

/**
 * @author Administrator
 * @ClassName Work
 * @description
 * @time 2020/12/14 0014 21:11
 */
public class Work {
    private State current;
    public Work(){
        //工作状态初始化为早上9点工作状态
        current = new ForenoonState();
    }

    private double hour;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    //任务完成属性
    private boolean finish;

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setCurrent(State state){
        current = state;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }
}
