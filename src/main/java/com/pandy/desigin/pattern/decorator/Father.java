package com.pandy.desigin.pattern.decorator;

/**
 * @author Pandy
 */
public class Father {
    public static void main(String[] args) {
        SchoolReport schoolReport = new FouthGradeSchoolReport();
        schoolReport.report();
        SchoolReport schoolReport1 = new SugarFouthGradeSchoolReport();
        schoolReport1.report();
        schoolReport1.sign("llll");
    }
}
