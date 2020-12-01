package com.design.mediator.unitenation;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/11/30 0030 22:58
 */
public class Main {
    public static void main(String[] args) {
        UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();

        USA c1 = new USA(unsc);
        Iraq c2 = new Iraq(unsc);
        unsc.setColleague1(c1);
        unsc.setColleague2(c2);

        c1.declare("not do it");
        c2.declare("come on");
    }
}
