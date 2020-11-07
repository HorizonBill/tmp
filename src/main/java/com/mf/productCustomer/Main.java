package com.mf.productCustomer;

public class Main {
    public static void main(String[] args) {
        String lock = new String();
        Producter p = new Producter(lock);
        Producter p1 = new Producter(lock);
        Producter p2 = new Producter(lock);
        Producter p3 = new Producter(lock);

        ThreadP pThread = new ThreadP(p);
        ThreadP pThread1 = new ThreadP(p1);
        ThreadP pThread2 = new ThreadP(p2);
        ThreadP pThread3 = new ThreadP(p3);

        pThread.start();
        pThread1.start();
        pThread2.start();
        pThread3.start();

        Consumer c = new Consumer(lock);
        Consumer c1 = new Consumer(lock);
        Consumer c2 = new Consumer(lock);
        Consumer c3 = new Consumer(lock);
        ThreadC cThread = new ThreadC(c);
        ThreadC cThread1 = new ThreadC(c1);
        ThreadC cThread2 = new ThreadC(c2);
        ThreadC cThread3 = new ThreadC(c3);

        cThread.start();
        cThread1.start();
        cThread2.start();
        cThread3.start();

    }
}
