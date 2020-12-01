package com.design.mediator;

/**
 * @author Administrator
 * @ClassName Main
 * @description
 * @time 2020/11/30 0030 22:19
 */
public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 c1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(mediator);

        mediator.setColleague1(c1);
        mediator.setColleague2(c2);

        c1.send("eat something ?");
        c2.send("no, i donot want to eat....");

    }
}
