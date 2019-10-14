package com.pandy.desigin.pattern.builder;

/**
 * @author Pandy
 */
public class Director {

    private Builder builder = null;
    public Director(Builder builder){
        this.builder = builder;
    }

    public Bike construct(){
        builder.buildFrame();
        return builder.createBike();
    }
}
