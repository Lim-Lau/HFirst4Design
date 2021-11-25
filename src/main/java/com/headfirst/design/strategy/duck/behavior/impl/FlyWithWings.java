package com.headfirst.design.strategy.duck.behavior.impl;

import com.headfirst.design.strategy.duck.behavior.FlyBehavior;

/**
 * @author LiuCan
 * @date 2020/11/23 21:03
 * @description FlyWithWings
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m flying!");
    }
}
