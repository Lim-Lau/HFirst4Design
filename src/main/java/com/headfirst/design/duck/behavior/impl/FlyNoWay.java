package com.headfirst.design.duck.behavior.impl;

import com.headfirst.design.duck.behavior.FlyBehavior;

/**
 * @author LiuCan
 * @date 2020/11/23 21:04
 * @description FlyNoWay
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I cannot fly !");
    }
}
