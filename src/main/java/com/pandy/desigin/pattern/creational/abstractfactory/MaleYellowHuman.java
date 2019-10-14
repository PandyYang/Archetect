package com.pandy.desigin.pattern.creational.abstractfactory;

/**
 * @author Pandy
 * 黄色人种女性
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人男性");
    }
}
