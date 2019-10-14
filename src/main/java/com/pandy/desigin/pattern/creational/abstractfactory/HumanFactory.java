package com.pandy.desigin.pattern.creational.abstractfactory;

/**
 * @author Pandy
 * 生产人种的工厂定义
 */
public interface HumanFactory {
    public Human createYellowHuman();
    public Human createWhiteHuman();
    public Human createBlackHuman();
}
