package com.pandy.desigin.pattern.creational.factorymethod.genericcode;

/**
 * @author Pandy
 * 抽象工厂类
 */
public abstract class Creator {

    public abstract <T extends Product> T createProduct(Class<T> c);

}
