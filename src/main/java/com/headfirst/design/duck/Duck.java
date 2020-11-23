package com.headfirst.design.duck;

import com.headfirst.design.duck.behavior.FlyBehavior;
import com.headfirst.design.duck.behavior.QuackBehavior;

/**
 * 鸭子超类
 * @author LiuCan
 * @date 2020/11/23
 * @description design
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float , even decoys !");
    }
}
