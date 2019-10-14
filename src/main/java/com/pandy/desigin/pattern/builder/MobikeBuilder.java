package com.pandy.desigin.pattern.builder;

/**
 * @author Pandy
 */
public class MobikeBuilder extends Builder {
    private Bike bike = new Bike();
    @Override
    void buildFrame() {
        bike.setFrame(new AlloyFrame());
    }

    @Override
    void buildSeat() {

    }

    @Override
    void buildTire() {

    }

    @Override
    Bike createBike() {
        return null;
    }
}
