package com.pandy.desigin.pattern.creational.factorymethod.manyfactory;

import com.pandy.desigin.pattern.creational.factorymethod.Human;
import com.pandy.desigin.pattern.creational.factorymethod.YellowHuman;

/**
 * @author Pandy
 */
public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    public Human createHuamn() {
        return new YellowHuman();
    }
}
