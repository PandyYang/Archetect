package com.pandy.desigin.pattern.prototype.generic.deepcopy;

import java.util.ArrayList;

/**
 * @author Pandy
 */
public class Thing implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<String>();
    public Thing clone(){
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            //加上下面这句话 对私有的类变量进行独立的拷贝
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
