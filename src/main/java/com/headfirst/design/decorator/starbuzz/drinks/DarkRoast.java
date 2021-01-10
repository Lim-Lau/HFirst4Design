package com.headfirst.design.decorator.starbuzz.drinks;

import com.headfirst.design.decorator.starbuzz.base.Beverage;

/**
 * 深焙咖啡
 * @author LiuCan
 * @date 2021/1/10 9:28
 * @description DarkRoast
 */
public class DarkRoast extends Beverage {
    private double cost = .99;

    public DarkRoast() {
        description = "Dark Roast";
    }

    public DarkRoast(double cost) {
        description = "Dark Roast";
        this.cost = cost;
    }

    @Override
    public double cost() {
        return this.cost;
    }
}
