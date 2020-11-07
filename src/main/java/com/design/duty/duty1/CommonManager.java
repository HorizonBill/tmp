package com.design.duty.duty1;

/**
 * @author Administrator
 * @ClassName CommonManager
 * @description
 * @time 2020/11/7 0007 9:04
 */
public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if (request.getRequesetType().equals("请假") && request.getNumber() <= 2) {
            System.out.println(name + ";" + request.getRequestContent() + "数量"
                + request.getNumber() + "被批准");
        }else {
            if (superior != null)
                superior.requestApplications(request);
        }
    }
}
