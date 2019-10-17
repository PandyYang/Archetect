package com.pandy.desigin.pattern.strategy;

/**
 * @author Pandy
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("--------------------------------");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("--------------------------------");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("--------------------------------");
    }
}
