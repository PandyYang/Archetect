package com.pandy.desigin.pattern.creational.abstractfactory;

/**
 * @author Pandy
 * 生产男性的工厂
 */
public class MaleFactory implements HumanFactory {
    //生产黄人男性
    @Override
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return null;
    }

    @Override
    public Human createBlackHuman() {
        return null;
    }
}
