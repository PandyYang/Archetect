package com.pandy.desigin.pattern.creational.singlepattern;

/**
 * @author Pandy
 * @version 1.0
 * @date 18:34
 */
public class Singleton {
    //volatile 防止对象在返回的时候没有分配内存导致异常
    private static volatile Singleton singleton = null;
    private Singleton(){

    }
    public static  Singleton getSingleton(){
        if (singleton == null){
            //防止多个线程创建对象
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
