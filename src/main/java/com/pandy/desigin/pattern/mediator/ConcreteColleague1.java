package com.pandy.desigin.pattern.mediator;

/**
 * @author Pandy
 * 具体同事类
 */
public class ConcreteColleague1 extends Colleague {
    //通过构造函数传递中介者
    public ConcreteColleague1(Mediator _mediator) {
        super(_mediator);
    }
    //自有方法
    public void selfMethod1(){

    }
    //依赖方法
    public void depMethod1(){
        //处理自己的业务
        //自己不能处理的业务 委托给中介者进行处理
        super.mediator.doSomething1();
    }
}
