package com.pandy.desigin.principle.interfacesegregation;

/**
 * @author Pandy
 * @version 1.0
 * @date 10:51
 */
public class Otter implements IDragAnimalAction,ISwimAnimalAction {
    @Override
    public void drag() {
        System.out.println("我会打洞...");
    }

    @Override
    public void swim() {
        System.out.println("我会游泳...");
    }
}
