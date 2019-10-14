package com.pandy.desigin.pattern.creational.factorymethod;

/**
 * @author Pandy
 * @version 1.0
 * @date 19:19
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("WhiteHuman's surface is white");
    }

    @Override
    public void talk() {
        System.out.println("WhiteHuman is talk w'language");
    }
}
