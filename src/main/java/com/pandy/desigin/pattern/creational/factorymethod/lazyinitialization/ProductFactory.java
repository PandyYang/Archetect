package com.pandy.desigin.pattern.creational.factorymethod.lazyinitialization;

import com.pandy.desigin.pattern.creational.factorymethod.genericcode.ConcreteProduct1;
import com.pandy.desigin.pattern.creational.factorymethod.genericcode.ConcreteProduct2;
import com.pandy.desigin.pattern.creational.factorymethod.genericcode.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Pandy
 * 延迟加载的工厂类
 */
public class ProductFactory {
    private static final Map<String, Product> prMap = new HashMap<String, Product>();
    public static synchronized Product createProduct(String type){
        Product product = null;
        if (prMap.containsKey(type)){
            product = prMap.get(type);
        }else{
            if (type.equals("Product1")){
                product = new ConcreteProduct1();
            }else{
                product = new ConcreteProduct2();
            }
            prMap.put(type,product);
        }
        return product;
    }
}
