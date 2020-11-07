package com.mf.databaseTools;

public class Main {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        try {
            for (int i = 0; i < 20; i ++) {
                C_Thread output = new C_Thread(dbTools);
                output.start();
                output.join();
                P_Thread input = new P_Thread(dbTools);
                input.start();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
