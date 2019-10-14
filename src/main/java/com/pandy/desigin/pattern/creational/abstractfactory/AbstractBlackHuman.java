package com.pandy.desigin.pattern.creational.abstractfactory;

/**
 * @author Pandy
 * 黑色人种
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤是黑色的...");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话听不懂");
    }
}
