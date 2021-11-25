package com.headfirst.design.strategy.duck.behavior.impl;

import com.headfirst.design.strategy.duck.behavior.QuackBehavior;

/**
 * @author LiuCan
 * @date 2020/11/23 21:05
 * @description Quack
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
