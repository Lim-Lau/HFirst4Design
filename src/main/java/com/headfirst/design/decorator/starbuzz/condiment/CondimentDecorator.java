package com.headfirst.design.decorator.starbuzz.condiment;

import com.headfirst.design.decorator.starbuzz.base.Beverage;

/**
 * @author LiuCan
 * @date 2021/1/10 9:15
 * @description CondimentDecorator
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
