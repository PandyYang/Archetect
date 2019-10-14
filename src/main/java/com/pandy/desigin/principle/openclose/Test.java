package com.pandy.desigin.principle.openclose;

/**
 * @author Pandy
 * @version 1.0
 * @date 17:16
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new DiscountCourse(96,"java书籍",123.0);
        DiscountCourse javaCourse = (DiscountCourse) iCourse;
        System.out.println("课程ID:" + javaCourse.getId() + " " +
                           "课程名字:" + javaCourse.getName() + " " +
                           "课程价格:" + javaCourse.getOriginPrice()+" "+
                            "折后价格:" +javaCourse.getPrice());
    }
}
