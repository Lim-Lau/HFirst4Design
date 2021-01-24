package com.headfirst.design.decorator.starbuzz.condiment;

import com.headfirst.design.decorator.starbarzz.Size;
import com.headfirst.design.decorator.starbuzz.base.Beverage;

/**
 * 豆浆
 * @author LiuCan
 * @date 2021/1/10 9:37
 * @description Soy
 */
public class Soy extends CondimentDecorator{
    private double cost = .15;
     Beverage beverage;

    public Soy(double cost, Beverage beverage) {
        this.cost = cost;
        this.beverage = beverage;
    }

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Size getSize() {
        return beverage.getSize();
    }

    @Override
    public double cost() {
        double cost = this.cost + beverage.cost();
        switch (getSize()) {
            case TALL:
                cost += .10;
                break;
            case GRANDE:
                cost += .15;
                break;
            case VENTI:
                cost += .20;
                break;
            default:
                break;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }
}
