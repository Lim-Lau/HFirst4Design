package com.headfirst.design.strategy.duck;

import com.headfirst.design.strategy.duck.behavior.impl.FlyWithWings;
import com.headfirst.design.strategy.duck.behavior.impl.Quack;

/**
 * @author LiuCan
 * @date 2020/11/23 21:00
 * @description MallardDuck
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m a real Mallard Duck");
    }
}
