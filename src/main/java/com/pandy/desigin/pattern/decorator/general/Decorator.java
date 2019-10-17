package com.pandy.desigin.pattern.decorator.general;

/**
 * @author Pandy
 * 抽象装饰者
 */
public abstract class Decorator extends Component {
    private Component component;
    //通过构造函数传递被修饰者
    public Decorator(Component component){
        this.component = component;
    }

    //委托给被修饰者执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
