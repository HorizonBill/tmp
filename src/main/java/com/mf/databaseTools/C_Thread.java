package com.mf.databaseTools;

public class C_Thread extends Thread {

	private DBTools r;

	public C_Thread(DBTools r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {
		while (true) {
			r.backupB();
		}
	}

}
