package com.pandy.desigin.pattern.Mediator;

/**
 * @author Pandy
 * 具体同事类
 */
public class ConcreteColleague2 extends Colleague {
    //通过构造函数传递中介者
    public ConcreteColleague2(Mediator _mediator) {
        super(_mediator);
    }
    public void selfMethod2(){

    }
    public void depMethod2(){
        super.mediator.doSomething2();
    }
}
