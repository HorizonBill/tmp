package com.mf.ReentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    public void read() {
        try {
            lock.writeLock().lock();
            System.out.println("获取读锁 " + Thread.currentThread().getName() + " "
                + System.currentTimeMillis());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }
}
