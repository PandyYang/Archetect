package com.pandy.desigin.pattern.creational.factorymethod.manyfactory;

import com.pandy.desigin.pattern.creational.factorymethod.Human;

/**
 * @author Pandy
 */
public class NvWa {
    public static void main(String[] args) {
        Human whiteHuman = (new WhiteHumanFactory()).createHuamn();
        whiteHuman.getColor();
        whiteHuman.talk();
        Human blackHuman = (new BlackHumanFactory()).createHuamn();
        blackHuman.getColor();
        blackHuman.talk();
        Human yellowHuman = (new YellowHumanFactory()).createHuamn();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
