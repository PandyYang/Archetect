package com.pandy.desigin.principle.dependenceinversion;

/**
 * @author Pandy
 * @version 1.0
 * @date 23:14
 */
public class Test {
/*    public static void main(String[] args) {
        Pandy pandy = new Pandy();
        pandy.studyJavaCourse();
        pandy.studyFrontCourse();
        }
 */
/*    public static void main(String[] args) {
        Pandy pandy = new Pandy();
        pandy.studyCourse(new JavaCourse());
        pandy.studyCourse(new FrCourse());
    }*/

    public static void main(String[] args) {
        Pandy pandy = new Pandy(new JavaCourse());
        pandy.study();
    }
}
