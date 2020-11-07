package com.design.builder;

/**
 * @author Administrator
 * @ClassName IBuildRobot
 * @description
 * @time 2020/10/23 0023 20:31
 */
public interface IBuildRobot {
    public void buildHead();
    public void buildBody();
    public void buildHand();
    public void buildFoot();
    public Robot createRobot();
}
