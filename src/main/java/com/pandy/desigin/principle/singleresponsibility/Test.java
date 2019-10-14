package com.pandy.desigin.principle.singleresponsibility;

/**
 * @author Pandy
 * @version 1.0
 * @date 8:55
 */
public class Test {
    public static void main(String[] args) {

        //一个类中进行if - else判断
        /*Bird bird = new Bird();
        bird.mainMoveMode("Sparrow");
        bird.mainMoveMode("ostrich");*/

        //应用层判断逻辑
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("Sparrow");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("Ostrich");
    }
}
