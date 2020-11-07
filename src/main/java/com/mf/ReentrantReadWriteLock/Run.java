package com.mf.ReentrantReadWriteLock;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadA b = new ThreadA(service);
        b.setName("B");
        a.start();
        b.start();

    }

}

