package com.headfirst.design.decorator.starbuzz.drinks;

import com.headfirst.design.decorator.starbuzz.base.Beverage;

/**
 * 综合咖啡
 * @author LiuCan
 * @date 2021/1/10 9:21
 * @description HouseBlend
 */
public class HouseBlend extends Beverage {
    private double cost = .89;

    public HouseBlend(double cost) {
        this.cost = cost;
        description = "House Blend Coffee";
    }

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return this.cost;
    }
}
