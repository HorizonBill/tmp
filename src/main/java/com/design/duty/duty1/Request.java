package com.design.duty.duty1;

/**
 * @author Administrator
 * @ClassName Request
 * @description
 * @time 2020/11/6 0006 22:20
 */
public class Request {
    private String requesetType;
    private String requestContent;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public String getRequesetType() {
        return requesetType;
    }

    public void setRequesetType(String requesetType) {
        this.requesetType = requesetType;
    }
}
