package com.pandy.desigin.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pandy
 * @version 1.0
 * @date 12:16
 */
public class TeamLeader {
    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0;i < 20;i++){
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是:" + courseList.size());
    }
}
