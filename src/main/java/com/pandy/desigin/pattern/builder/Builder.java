package com.pandy.desigin.pattern.builder;

/**
 * @author Pandy
 */
public abstract class Builder {
    abstract void buildFrame();
    abstract void buildSeat();
    abstract void buildTire();
    abstract Bike createBike();
}
