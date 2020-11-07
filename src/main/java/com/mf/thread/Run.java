package com.mf.thread;

public class Run {

	public static void main(String[] args) {
		try {
			MyThread1 t1 = new MyThread1();
			Thread t = new Thread(t1);
			t.start();
			Thread ta = new Thread(t1);
			ta.start();
			Thread tb = new Thread(t1);
			tb.start();
			Thread tc = new Thread(t1);
			tc.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
