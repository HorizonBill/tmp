package com.design.builder;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/10/23 0023 20:40
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Robot robot = director.createRobotByDIrector(new DanceRobotBUilder());
        System.out.println(robot.getBody());
        System.out.println(robot.getHand());
        System.out.println(robot.getHead());
    }
}
