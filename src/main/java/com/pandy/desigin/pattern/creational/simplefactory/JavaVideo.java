package com.pandy.desigin.pattern.creational.simplefactory;

/**
 * @author Pandy
 * @version 1.0
 * @date 12:47
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制java视频...");
    }
}
