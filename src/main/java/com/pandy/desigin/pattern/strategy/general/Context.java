package com.pandy.desigin.pattern.strategy.general;

/**
 * @author Pandy
 * 封装角色与被封装的策略类不用是同一个接口
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void doAnything(){
        this.strategy.doSomething();
    }
}