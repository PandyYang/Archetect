package com.pandy.desigin.pattern.creational.factorymethod.manyfactory;

import com.pandy.desigin.pattern.creational.factorymethod.Human;
import com.pandy.desigin.pattern.creational.factorymethod.WhiteHuman;

/**
 * @author Pandy
 */
public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuamn() {
        return new WhiteHuman();
    }
}
