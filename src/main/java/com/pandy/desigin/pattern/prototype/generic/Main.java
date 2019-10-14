package com.pandy.desigin.pattern.prototype.generic;

/**
 * @author Pandy
 */
public class Main {
    public static void main(String[] args) {
        ProtoTypeClass protoTypeClass = new ProtoTypeClass();
        ProtoTypeClass protoTypeClass1 = protoTypeClass.clone();
        ProtoTypeClass protoTypeClass2 = protoTypeClass.clone();
        System.out.println(protoTypeClass1 == protoTypeClass2);
        System.out.println(protoTypeClass == protoTypeClass1);
        System.out.println(protoTypeClass == protoTypeClass2);
    }
}
