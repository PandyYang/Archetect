package com.pandy.desigin.pattern.builder.version2;



/**
 * @author Pandy
 */
public class Client {
    public static void main(String[] args) {
        //非Builder模式
        Computer computer = new Computer("1","2","3","4");
        //Builder模式
        NewComputer newComputer = new NewComputer.Builder()
                .cpu("1")
                .memory("2")
                .screen("3")
                .mainboard("4")
                .build();
    }
}
