package com.pandy.desigin.principle.openclose;

/**
 * @author Pandy
 * @version 1.0
 * @date 17:53
 */
public class DiscountCourse extends JavaCourse  {
    public DiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
