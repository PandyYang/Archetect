package com.pandy.desigin.pattern.builder;

/**
 * @author Pandy
 */
public class Client {

    public static void main(String[] args) {
        showBike(new OfoBuilder());
        showBike(new MobikeBuilder());
    }
    private static void showBike(Builder builder){
        Director director = new Director(builder);
        Bike bike = director.construct();
        bike.getFrame();
    }

}
