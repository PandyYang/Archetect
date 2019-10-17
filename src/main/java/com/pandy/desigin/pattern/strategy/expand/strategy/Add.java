package com.pandy.desigin.pattern.strategy.expand.strategy;

/**
 * @author Pandy
 */
public class Add implements Calcultor {
    @Override
    public int exec(int a, int b) {
        return a+b;
    }
}
