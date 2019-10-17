package com.pandy.desigin.pattern.decorator.pro;

import com.pandy.desigin.pattern.decorator.FouthGradeSchoolReport;
import com.pandy.desigin.pattern.decorator.SchoolReport;

/**
 * @author Pandy
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("123");
    }
}
