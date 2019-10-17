package com.pandy.desigin.pattern.decorator;

/**
 * @author Pandy
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {
    private void reportHighScore(){
        System.out.println("这次考试的最高成绩: 英语60");
    }
    private void reportSort(){
        System.out.println("这次班里第59名");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
