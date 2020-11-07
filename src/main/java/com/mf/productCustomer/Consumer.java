package com.mf.productCustomer;

public class Consumer {
    private String lock;
    public Consumer(String lock) {
        super();
        this.lock = lock;
    }
    public void getValue() {
        try {
            synchronized (lock){
                while (ValueObject.VALUE.equals("")) {
                    lock.wait();
                }
                System.out.println("get的值是 " + ValueObject.VALUE);
                ValueObject.VALUE = "";
                lock.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
