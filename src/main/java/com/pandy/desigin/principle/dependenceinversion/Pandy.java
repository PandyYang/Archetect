package com.pandy.desigin.principle.dependenceinversion;

/**
 * @author Pandy
 * @version 1.0
 * @date 23:12
 */
public class Pandy {

    //进行构造器注入
    private ICourse iCourse;
    public Pandy(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    /*public void studyJavaCourse(){
        System.out.println("Pandy is studying Java course");
    }
    public void studyFrontCourse(){
        System.out.println("Pandy is studying FE course");
    }*/
    /*public void studyPythonCourse(){
        System.out.println("Pandy is studying Python course");
    }*/

    //方法注入
    /*public void studyCourse(ICourse iCourse){
        iCourse.studyCourse();
    }*/

    //构造器注入
    public void study(){
        iCourse.studyCourse();
    }
}
