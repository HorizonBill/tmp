package com.mf.test.run;

import com.mf.entity.MyStack;
import com.mf.extthread.C_Thread;
import com.mf.extthread.P_Thread;
import com.mf.service.C;
import com.mf.service.P;

public class Run {
	public static void main(String[] args) {
		MyStack myStack = new MyStack();

		P p = new P(myStack);
		C r = new C(myStack);

		P_Thread pThread = new P_Thread(p);
		C_Thread rThread = new C_Thread(r);
		pThread.start();
		rThread.start();
	}

}
