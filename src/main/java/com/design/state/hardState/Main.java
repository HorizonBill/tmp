package com.design.state.hardState;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/12/14 0014 21:32
 */
public class Main {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);

        work.setFinish(true);
        work.writeProgram();

        work.setHour(20);
        work.writeProgram();

        work.setHour(22);
        work.writeProgram();

    }
}
