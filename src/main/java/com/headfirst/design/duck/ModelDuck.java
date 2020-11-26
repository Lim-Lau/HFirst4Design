package com.headfirst.design.duck;

import com.headfirst.design.duck.behavior.impl.FlyNoWay;
import com.headfirst.design.duck.behavior.impl.Quack;

/**
 * @author LiuCan
 * @date 2020/11/26 21:56
 * @description ModelDuck
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m a model duck");
    }
}
