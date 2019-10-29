package com.pandy.desigin.pattern.mediator;

/**
 * @author Pandy
 * 抽象同事类
 */
public class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator _mediator){
        this.mediator = _mediator;
    }
}
