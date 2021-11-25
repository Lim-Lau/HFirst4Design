package com.headfirst.design.decorator.starbuzz.test;

import com.headfirst.design.decorator.starbarzz.Size;
import com.headfirst.design.decorator.starbuzz.base.Beverage;
import com.headfirst.design.decorator.starbuzz.condiment.Mocha;
import com.headfirst.design.decorator.starbuzz.condiment.Soy;
import com.headfirst.design.decorator.starbuzz.condiment.Whip;
import com.headfirst.design.decorator.starbuzz.drinks.DarkRoast;
import com.headfirst.design.decorator.starbuzz.drinks.Espresso;
import com.headfirst.design.decorator.starbuzz.drinks.HouseBlend;

/**
 * 星巴兹咖啡订单系统测试
 * @author LiuCan
 * @date 2021/1/10 9:44
 * @description StarbuzzCoffee
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();

        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Size.TALL);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

    }

}
