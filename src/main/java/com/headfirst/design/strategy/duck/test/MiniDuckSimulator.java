package com.headfirst.design.strategy.duck.test;

import com.headfirst.design.strategy.duck.Duck;
import com.headfirst.design.strategy.duck.MallardDuck;
import com.headfirst.design.strategy.duck.behavior.impl.FlyRocketPowered;

/**
 * @author LiuCan
 * @date 2020/11/23 21:09
 * @description MiniDuckSimulator
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new MallardDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
