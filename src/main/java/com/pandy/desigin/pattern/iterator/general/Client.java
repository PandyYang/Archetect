package com.pandy.desigin.pattern.iterator.general;

/**
 * @author Pandy
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("123");
        aggregate.add("456");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.hasNext());
        }
    }
}
