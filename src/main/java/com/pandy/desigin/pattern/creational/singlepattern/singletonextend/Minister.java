package com.pandy.desigin.pattern.creational.singlepattern.singletonextend;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:53
 */
public class Minister {
    public static void main(String[] args) {
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++){
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i+1) +"个大臣参拜的是:");
            emperor.say();
        }
    }
}