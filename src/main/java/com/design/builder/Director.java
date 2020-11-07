package com.design.builder;

/**
 * @author Administrator
 * @ClassName Director
 * @description
 * @time 2020/10/23 0023 20:37
 */
public class Director {
    public Robot createRobotByDIrector(IBuildRobot iBuildRobot){
        iBuildRobot.buildBody();
        iBuildRobot.buildFoot();
        iBuildRobot.buildHand();
        iBuildRobot.buildHead();
        return iBuildRobot.createRobot();
    }
}
