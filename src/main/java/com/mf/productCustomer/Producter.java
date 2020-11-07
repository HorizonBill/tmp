package com.mf.productCustomer;

public class Producter {
    private String lock;
    public Producter(String lock) {
        super();
        this.lock = lock;
    }
    public void setValue() {
        try {
            synchronized (lock){
                while (!ValueObject.VALUE.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set的值是 " + value);
                ValueObject.VALUE = value;
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
