package com.pandy.desigin.pattern.creational.factorymethod.sinigleton;

import com.pandy.desigin.pattern.creational.singlepattern.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Pandy
 */
public class SingletonFactory {
    private static Singleton singleton;
    Class c1;

    {
        try {
            c1 = Class.forName(Singleton.class.getName());
            //获得无参构造
            Constructor constructor = c1.getDeclaredConstructor();
            //设置无参构造是可访问的
            constructor.setAccessible(true);
            //产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    public static Singleton getSingleton(){
        return singleton;
    }
}
