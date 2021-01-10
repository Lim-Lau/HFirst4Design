package com.headfirst.design.decorator.starbuzz.drinks;

import com.headfirst.design.decorator.starbuzz.base.Beverage;

/**
 * 低咖啡因咖啡
 * @author LiuCan
 * @date 2021/1/10 9:29
 * @description Decat
 */
public class Decat  extends Beverage {
    private double cost = 1.05;

    public Decat(double cost) {
        description = "Decat";
        this.cost = cost;
    }

    public Decat() {
        description = "Decat";
    }

    @Override
    public double cost() {
        return this.cost;
    }
}
