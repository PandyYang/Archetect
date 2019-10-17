package com.pandy.desigin.pattern.decorator;

/**
 * @author Pandy
 */
public class FouthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("语文数学 50 + 40");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长姓名" + name);
    }
}
