package com.pandy.desigin.pattern.creational.factorymethod;

/**
 * @author Pandy
 * @version 1.0
 * @date 19:18
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("Yellow Human's surface is yellow");
    }

    @Override
    public void talk() {
        System.out.println("Yellow human is tack y'language");
    }
}
