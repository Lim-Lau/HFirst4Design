package com.headfirst.design.decorator.starbuzz.condiment;

import com.headfirst.design.decorator.starbuzz.base.Beverage;

/**
 * @author LiuCan
 * @date 2021/1/10 9:40
 * @description Whip
 */
public class Whip extends CondimentDecorator{
    private double cost = .10;
    Beverage beverage;

    public Whip(double cost, Beverage beverage) {
        this.cost = cost;
        this.beverage = beverage;
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.cost + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }
}
