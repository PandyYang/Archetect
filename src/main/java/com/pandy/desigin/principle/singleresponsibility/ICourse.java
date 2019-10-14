package com.pandy.desigin.principle.singleresponsibility;

/**
 * @author Pandy
 * @version 1.0
 * @date 9:13
 */
public interface ICourse {
    //获得课程
    String getCourseName();
    byte[] getCourseVideo();
    //管理课程
    void studyCourse();
    void refundCourse();
}
