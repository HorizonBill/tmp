package com.design.builder;

/**
 * @author Administrator
 * @ClassName DanceRobotBUilder
 * @description
 * @time 2020/10/23 0023 20:33
 */
public class DanceRobotBUilder implements IBuildRobot {
    Robot robot;

    public DanceRobotBUilder() {
        robot = new Robot();
    }

    @Override
    public void buildHead() {
        robot.setHead("写入机械舞程序");
    }

    @Override
    public void buildBody() {
        robot.setBody("钛合金身体");
    }

    @Override
    public void buildHand() {
        robot.setHand("钛合金手");
    }

    @Override
    public void buildFoot() {
        robot.setFoot("钛合金脚");
    }

    @Override
    public Robot createRobot() {
        return robot;
    }
}
