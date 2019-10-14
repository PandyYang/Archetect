package com.pandy.desigin.principle.singleresponsibility;

/**
 * @author Pandy
 * @version 1.0
 * @date 8:54
 */
public class Bird {
    public void mainMoveMode(String birdName){
        if ("ostrich".equals(birdName)){
            System.out.println(birdName + "用脚走~");
        }else {
            System.out.println(birdName + "用翅膀飞~");
        }
    }
}
