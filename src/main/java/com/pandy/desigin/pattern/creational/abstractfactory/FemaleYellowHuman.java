package com.pandy.desigin.pattern.creational.abstractfactory;

/**
 * @author Pandy
 * 黄色人种男性
 */
public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getSex() {
        System.out.println("黄人女性");
    }
}
