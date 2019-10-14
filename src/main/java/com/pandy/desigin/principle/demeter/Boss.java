package com.pandy.desigin.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Pandy
 * @version 1.0
 * @date 12:15
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
/*        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0;i < 20;i++){
            courseList.add(new Course());
        }*/
        teamLeader.checkNumberOfCourses();
    }
}
