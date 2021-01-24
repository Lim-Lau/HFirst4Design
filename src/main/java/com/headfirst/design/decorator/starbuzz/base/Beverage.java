package com.headfirst.design.decorator.starbuzz.base;

import com.headfirst.design.decorator.starbarzz.Size;

/**
 * @author LiuCan
 * @date 2021/1/10 9:12
 * @description Beverage
 */
public abstract class Beverage {

    public String description = "Unknown Beverage";

    public Size size = Size.NORMAL;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
        this.description = size.getName() + this.description;
    }
}
