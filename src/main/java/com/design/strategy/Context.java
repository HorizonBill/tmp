package com.design.strategy;

/**
 * 用一个ConcreteStratgy来配置，维护一个对strategy对象的引用
 */
public class Context {
    Strategy strategy;

    //初始化，传入具体的策略对象
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    //上下文接口
    //根据具体的策略对象，调用其算法的方法
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }
}
