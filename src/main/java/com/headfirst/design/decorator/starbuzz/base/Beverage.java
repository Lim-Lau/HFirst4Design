package com.headfirst.design.decorator.starbuzz.base;

/**
 * @author LiuCan
 * @date 2021/1/10 9:12
 * @description Beverage
 */
public abstract class Beverage {

    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
