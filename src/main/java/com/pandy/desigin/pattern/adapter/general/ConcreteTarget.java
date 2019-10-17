package com.pandy.desigin.pattern.adapter.general;

/**
 * @author Pandy
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("1234");
    }
}
