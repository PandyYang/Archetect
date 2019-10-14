package com.pandy.desigin.principle.interfacesegregation;

/**
 * @author Pandy
 * @version 1.0
 * @date 10:47
 */
public class Swan implements IFlyAnimalAction,ISwimAnimalAction{

    /**
     * 实现接口隔离 实现细粒度组装
     */
    @Override
    public void fly() {
        System.out.println("我会飞...");
    }

    @Override
    public void swim() {
        System.out.println("我会游泳...");
    }
}
