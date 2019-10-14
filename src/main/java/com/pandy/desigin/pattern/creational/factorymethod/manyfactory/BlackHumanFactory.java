package com.pandy.desigin.pattern.creational.factorymethod.manyfactory;
import com.pandy.desigin.pattern.creational.factorymethod.BlackHuman;
import com.pandy.desigin.pattern.creational.factorymethod.Human;

/**
 * @author Pandy
 */
public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuamn() {
        return new BlackHuman();
    }
}
