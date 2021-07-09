package com.mf.test1;

/**
 * @author Administrator
 * @ClassName TestRunnable
 * @description
 * @time 2021/1/24 0024 16:33
 */
public class TestRunnable {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.run();
    }
}

 class MyThread implements Runnable{

     @Override
     public void run() {
         System.out.println("coming in");
         if(true)
             return;
         System.out.println("coming out...");
     }
 }
