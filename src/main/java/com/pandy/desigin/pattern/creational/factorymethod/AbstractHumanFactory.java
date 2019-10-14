package com.pandy.desigin.pattern.creational.factorymethod;

/**
 * @author Pandy
 */
public abstract class AbstractHumanFactory {
    //泛型确保了两层限制 1.必须是Class类型 2.必须是Human的实现类
    public abstract <T extends Human> T createHuman(Class<T> c);
}
