package com.mf.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread1 extends Thread {

	private AtomicInteger count = new AtomicInteger(0);
	public MyThread1() {
		super();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i ++){
			System.out.println(count.incrementAndGet());
		}
	}

}
