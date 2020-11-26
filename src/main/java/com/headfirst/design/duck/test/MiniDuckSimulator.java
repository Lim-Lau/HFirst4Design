package com.headfirst.design.duck.test;

import com.headfirst.design.duck.Duck;
import com.headfirst.design.duck.MallardDuck;
import com.headfirst.design.duck.behavior.impl.FlyRocketPowered;
import com.headfirst.design.duck.behavior.impl.FlyWithWings;

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
