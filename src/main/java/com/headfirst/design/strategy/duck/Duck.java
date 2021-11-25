package com.headfirst.design.strategy.duck;

import com.headfirst.design.strategy.duck.behavior.FlyBehavior;
import com.headfirst.design.strategy.duck.behavior.QuackBehavior;

/**
 * 鸭子超类
 *
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

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("All ducks float , even decoys !");
    }
}
