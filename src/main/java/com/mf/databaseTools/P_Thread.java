package com.mf.databaseTools;

import com.mf.service.P;

public class P_Thread extends Thread {

	private DBTools p;

	public P_Thread(DBTools p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.backupA();
		}
	}

}
