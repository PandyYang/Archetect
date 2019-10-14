package com.pandy.desigin.pattern.creational.simplefactory;

/**
 * @author Pandy
 * @version 1.0
 * @date 12:49
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        /*Video video = new JavaVideo();
        video.produce();*/
        /*VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if (video == null){
            return;
        }
        video.produce();*/

        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null){
            return;
        }
        video.produce();
    }
}