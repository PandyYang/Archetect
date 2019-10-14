package com.pandy.desigin.pattern.builder;

/**
 * @author Pandy
 */
public class OfoBuilder extends Builder {
    private Bike bike = new Bike();
    @Override
    void buildFrame() {
        bike.setFrame(new CarbonFrame());
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
