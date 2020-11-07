package com.design.duty.duty1;

/**
 * @author Administrator
 * @ClassName Majordomo
 * @description
 * @time 2020/11/7 0007 11:04
 */
public class Majordomo extends Manager {
    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequesetType().equals("请假")) {
            System.out.println(name + ";" + request.getRequestContent() + "数量"
                    + request.getNumber() + "被批准");
        }else if(request.getRequesetType().equals("加薪") && request.getNumber() <= 500){
            System.out.println(name + ";" + request.getRequestContent() + "数量"
                    + request.getNumber() + "被批准");
        }else if(request.getRequesetType().equals("加薪") && request.getNumber() > 500) {
            System.out.println(name + ";" + request.getRequestContent() + "数量"
                    + request.getNumber() + "再说吧");
        }
    }
}
