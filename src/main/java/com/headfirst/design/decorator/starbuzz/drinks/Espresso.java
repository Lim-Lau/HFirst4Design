package com.headfirst.design.decorator.starbuzz.drinks;

import com.headfirst.design.decorator.starbuzz.base.Beverage;

/**
 * 浓缩咖啡
 * @author LiuCan
 * @date 2021/1/10 9:17
 * @description Espresso
 */
public class Espresso extends Beverage {
    private double cost = 1.99;

    /**
     * 不需要修改价格时
     * @author LiuCan
     * @date 2021/1/10 9:20
     * @param
     * @return
     */
    public Espresso() {
        description = "Espresso";
    }

    /**
     * 需要进行价格调整时
     * @author LiuCan
     * @date 2021/1/10 9:20
     * @param cost
     * @return
     */
    public Espresso(double cost ) {
        this.cost = cost;
        description = "Espresso";
    }

    @Override
    public double cost() {
        return this.cost;
    }
}
