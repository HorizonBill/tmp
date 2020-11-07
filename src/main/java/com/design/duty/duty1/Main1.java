package com.design.duty.duty1;

/**
 * @author Administrator
 * @ClassName Main1
 * @description
 * @time 2020/11/7 0007 16:56
 */
public class Main1 {
    public static void main(String[] args) {
        CommonManager jinli = new CommonManager("bill");
        Majordomo zongjian = new Majordomo("jack");
        jinli.setSuperior(zongjian);

        Request request = new Request();
        request.setRequesetType("加薪");
        request.setRequestContent("孟帆请求加薪");
        request.setNumber(1000);
        jinli.requestApplications(request);

        Request request1 = new Request();
        request1.setRequesetType("请假");
        request1.setRequestContent("mf 请假");
        request1.setNumber(3);
        jinli.requestApplications(request);
    }

}
