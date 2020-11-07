package com.mf.productCustomer;

public class ThreadC extends Thread{
    private Consumer c;

    public ThreadC(Consumer c) {
        this.c = c;
    }

    @Override
    public void run() {
        while(true){
            c.getValue();
        }
    }
}
