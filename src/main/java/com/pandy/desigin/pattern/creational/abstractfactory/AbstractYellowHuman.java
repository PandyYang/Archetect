package com.pandy.desigin.pattern.creational.abstractfactory;

/**
 * @author Pandy
 * 黄色人种
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人的皮肤颜色是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄种人一般说的是双字节");
    }
}
