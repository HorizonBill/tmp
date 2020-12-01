package com.design.mediator.unitenation;

/**
 * @author Administrator
 * @ClassName Country
 * @description 国家
 * @time 2020/11/30 0030 22:41
 */
public abstract class Country {
    protected UniteNation mediator;

    public Country(UniteNation mediator) {
        this.mediator = mediator;
    }
}
