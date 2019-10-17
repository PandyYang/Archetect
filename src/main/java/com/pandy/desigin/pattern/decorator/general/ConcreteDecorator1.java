package com.pandy.desigin.pattern.decorator.general;

/**
 * @author Pandy
 * 具体的装饰类
 */
public class ConcreteDecorator1 extends Decorator {
    //定义被修饰者
    public ConcreteDecorator1(Component component) {
        super(component);
    }
    //定义自己的修饰方法
    public void method1(){
        System.out.println("method1方法修饰");
    }
    //重写父类的operate方法

    @Override
    public void operate() {
        //重写的父类方法 可以在上面添加其他的方法进行增强
        this.method1();
        super.operate();
    }
}
