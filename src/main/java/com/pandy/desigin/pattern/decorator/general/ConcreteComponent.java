package com.pandy.desigin.pattern.decorator.general;

/**
 * @author Pandy
 * 具体构件
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("do something...");
    }
}
