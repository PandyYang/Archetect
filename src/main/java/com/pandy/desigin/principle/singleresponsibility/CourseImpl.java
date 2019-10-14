package com.pandy.desigin.principle.singleresponsibility;

/**
 * @author Pandy
 * @version 1.0
 * @date 9:17
 */
public class CourseImpl implements ICourseManager,ICourseContent {
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }
}
