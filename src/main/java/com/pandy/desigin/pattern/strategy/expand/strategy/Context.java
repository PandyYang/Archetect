package com.pandy.desigin.pattern.strategy.expand.strategy;

/**
 * @author Pandy
 */
public class Context {
    private Calcultor calcultor = null;
    public Context(Calcultor calcultor){
        this.calcultor = calcultor;
    }
    public int exec(int a,int b,String symbol){
        return this.calcultor.exec(a,b);
    }
}
