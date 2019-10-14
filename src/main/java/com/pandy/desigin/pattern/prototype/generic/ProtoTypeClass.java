package com.pandy.desigin.pattern.prototype.generic;

/**
 * @author Pandy
 */
public class ProtoTypeClass implements Cloneable {
    //覆写父类的object方法
    public ProtoTypeClass clone(){
        ProtoTypeClass protoTypeClass = null;
        try {
            protoTypeClass = (ProtoTypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return protoTypeClass;
    }
}
