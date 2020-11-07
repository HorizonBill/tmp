package com.design.strategy;

public class Main {
    public static void main(String[] args) {
        Context strategy = new Context(new ConcreteStrategyA());
        strategy.ContextInterface();
    }
}
