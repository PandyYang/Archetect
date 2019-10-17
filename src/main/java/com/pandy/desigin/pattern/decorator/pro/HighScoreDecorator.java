package com.pandy.desigin.pattern.decorator.pro;

import com.pandy.desigin.pattern.decorator.SchoolReport;

/**
 * @author Pandy
 */
public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    //需要汇报的最高成绩
    private void repoetHighScore(){
        System.out.println("考试最高成绩:" + 144554234);
    }

    //需要在报告成绩之前汇报最高成绩
    @Override
    public void report() {
        this.repoetHighScore();
        super.report();
    }
}
