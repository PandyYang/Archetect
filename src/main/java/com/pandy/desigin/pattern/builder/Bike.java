package com.pandy.desigin.pattern.builder;

import lombok.Data;

/**
 * @author Pandy
 */
@Data
public class Bike {
    private IFrame frame;
    private ISeat seat;
    private ITire tire;
}
