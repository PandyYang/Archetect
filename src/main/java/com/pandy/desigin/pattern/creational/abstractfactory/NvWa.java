package com.pandy.desigin.pattern.creational.abstractfactory;

/**
 * @author Pandy
 */
public class NvWa {
    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femalHumanFactory = new FemaleFactory();
        Human maleYellowHuman =  maleHumanFactory.createYellowHuman();
        Human femalYellowHuman = femalHumanFactory.createYellowHuman();
        System.out.println("生产一个黄色女性");
        femalYellowHuman.getColor();
        femalYellowHuman.talk();
        femalYellowHuman.getSex();
        System.out.println("生产一个黄人男性");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
    }
}
