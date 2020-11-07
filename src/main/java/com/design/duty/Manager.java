package com.design.duty;

import com.design.duty.duty1.Request;

/**
 * @author Administrator
 * @ClassName Manager
 * @description
 * @time 2020/11/6 0006 22:23
 */
public class Manager {
    protected String name;

    public Manager(String name) {
        this.name = name;
    }

    public void getResult(String managerLevel, Request request) {
        if (managerLevel == "经理"){
            if (request.getRequesetType().equals("请假") && request.getNumber() <= 2) {
                System.out.println(name + ":" + request.getRequestContent()
                        + "数量" + request.getNumber() + "被批准");
            } else {
                System.out.println(name + ":" + request.getRequestContent()
                        + "数量" + request.getNumber() + "我无权处理");
            }
        }else if (managerLevel == "总监"){
            if (request.getRequesetType().equals("请假") && request.getNumber() <= 5) {
                System.out.println(name + ":" + request.getRequestContent()
                        + "数量" + request.getNumber() + "被批准");
            } else {
                System.out.println(name + ":" + request.getRequestContent()
                        + "数量" + request.getNumber() + "我无权处理");
            }
        }else if (managerLevel == "总经理"){
            if (request.getRequesetType().equals("请假")) {
                System.out.println(name + ":" + request.getRequestContent()
                        + "数量" + request.getNumber() + "被批准");
            } else if(request.getRequesetType() == "加薪" && request.getNumber() <= 500){
                System.out.println(name + ":" + request.getRequestContent()
                        + "数量" + request.getNumber() + "我无权处理");
            } else if(request.getRequesetType() == "加薪" && request.getNumber() > 500) {
                System.out.println(name + ":" + request.getRequestContent()
                        + "数量" + request.getNumber() + "再说吧");
            }
        }
    }
}
