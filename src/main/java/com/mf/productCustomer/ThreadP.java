package com.mf.productCustomer;

public class ThreadP extends Thread{
    private Producter p;

    public ThreadP(Producter p) {
        this.p = p;
    }

    @Override
    public void run() {
        while(true){
            p.setValue();
        }
    }
}
