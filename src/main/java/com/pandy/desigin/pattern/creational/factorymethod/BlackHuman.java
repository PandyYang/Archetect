package com.pandy.desigin.pattern.creational.factorymethod;

/**
 * @author Pandy
 * @version 1.0
 * @date 19:17
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("BlackHuman's surface is black");
    }

    @Override
    public void talk() {
        System.out.println("BlackHuman is talk b'language ");
    }
}
