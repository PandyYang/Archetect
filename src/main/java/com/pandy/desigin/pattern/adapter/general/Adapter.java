package com.pandy.desigin.pattern.adapter.general;

/**
 * @author Pandy
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
