package com.pandy.desigin.pattern.decorator.pro;

import com.pandy.desigin.pattern.decorator.SchoolReport;

/**
 * @author Pandy
 */
public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    private void reportSort(){
        System.out.println("排名:"+123);
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
