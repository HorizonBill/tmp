package com.design.duty;

import com.design.duty.duty1.Request;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/11/6 0006 22:48
 */
public class Main {
    public static void main(String[] args) {
        Manager jinli = new Manager("bill");
        Manager zongjian = new Manager("jack");
        Manager zhongjingli = new Manager("tom");

        Request request = new Request();
        request.setRequesetType("加薪");
        request.setRequestContent("孟帆请求加薪");
        request.setNumber(1000);
        jinli.getResult("经理", request);
        zongjian.getResult("总监", request);
        zhongjingli.getResult("总经理", request);

        Request request1 = new Request();
        request1.setRequesetType("请假");
        request1.setRequestContent("mf 请假");
        request1.setNumber(3);

        jinli.getResult("经理", request1);
        zongjian.getResult("总监", request1);
        zhongjingli.getResult("总经理", request1);

    }
}
