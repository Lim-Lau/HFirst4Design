package com.headfirst.design.duck.behavior.impl;

import com.headfirst.design.duck.behavior.FlyBehavior;

/**
 * @author LiuCan
 * @date 2020/11/26 21:58
 * @description FlyRocketPowered
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I`m flying with a rocket!");
    }
}
