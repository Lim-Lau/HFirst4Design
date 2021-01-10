package com.headfirst.design.decorator.starbuzz.condiment;

import com.headfirst.design.decorator.starbuzz.base.Beverage;

/**
 * 摩卡
 * @author LiuCan
 * @date 2021/1/10 9:33
 * @description Mocha
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    private double cost = .20;

    public Mocha(Beverage beverage, double cost) {
        this.beverage = beverage;
        this.cost = cost;
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.cost + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }
}
