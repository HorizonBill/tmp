package com.mf.thread;

public class Task {

	public void doLongTimeTask(String a) {
		String anything = new String();
		System.out.println("");
		synchronized (anything) {
			System.out.println("synchronized threadName="
					+ Thread.currentThread().getName() + " a:" + a);
		}

	}
}
