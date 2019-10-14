package com.pandy.desigin.pattern.creational.simplefactory;

/**
 * @author Pandy
 * @version 1.0
 * @date 13:09
 */
public class VideoFactory {
/*    public Video getVideo(String type){
        if("java".equalsIgnoreCase(type)){
            return new JavaVideo();
        }else if ("python".equalsIgnoreCase(type)){
            return new PythonVideo();
        }
        return null;
    }*/

    public Video getVideo(Class c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Video video = null;
        video = (Video) Class.forName(c.getName()).newInstance();
        return video;
    }
}