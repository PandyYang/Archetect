package com.pandy.desigin.pattern.creational.factorymethod;

/**
 * @author Pandy
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory factory = new HumanFactory();
        WhiteHuman whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
    }
}
