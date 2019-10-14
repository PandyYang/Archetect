package com.pandy.desigin.pattern.creational.factorymethod.genericcode;

/**
 * @author Pandy
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.createProduct(ConcreteProduct1.class);
        /**
         * 继续业务处理
         */
    }
}
