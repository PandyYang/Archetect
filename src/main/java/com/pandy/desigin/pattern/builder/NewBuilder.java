package com.pandy.desigin.pattern.builder;

/**
 * @author Pandy
 */
public abstract class NewBuilder {
    abstract void buildFrame();
    abstract void buildSeat();
    abstract void buildTire();
    abstract Bike createBike();

    public Bike construct(){
        this.buildFrame();
        this.buildSeat();
        this.buildTire();
        return this.createBike();
    }

}
