package com.mf.reentrankLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public MyService(boolean isFair) {
        super();
        lock = new ReentrantLock(isFair);
    }
    public void waitMethod() {
        try {
            lock.lock();
            System.out.println("await时间为 " + System.currentTimeMillis());
            condition.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("释放锁");
        }
    }

    public void signal() {
        try {
            lock.lock();
            System.out.println("signal时间为 " + System.currentTimeMillis());
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
    public void testMethod() {
        try {
            lock.lock();

            System.out.println("ThreadName=" + Thread.currentThread().getName() + "获得锁定");
        } finally {
            lock.unlock();
        }
    }
}
