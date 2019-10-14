package com.pandy.desigin.principle.interfacesegregation;

/**
 * @author Pandy
 * @version 1.0
 * @date 10:52
 */
public class Test {
    public static void main(String[] args) {
        Otter otter = new Otter();
        otter.drag();
        otter.swim();
        Swan swan = new Swan();
        swan.fly();
        swan.swim();
    }
}
