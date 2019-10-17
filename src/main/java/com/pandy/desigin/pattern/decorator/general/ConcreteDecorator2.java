package com.pandy.desigin.pattern.decorator.general;

/**
 * @author Pandy
 */
public class ConcreteDecorator2 extends Decorator {
    //定义被修饰者
    public ConcreteDecorator2(Component component) {
        super(component);
    }
    //定义自己的修饰方法
    public void method2(){
        System.out.println("method2修饰");
    }
    //重写父类的方法进行增强


    @Override
    public void operate() {
        this.method2();
        super.operate();
    }
}
