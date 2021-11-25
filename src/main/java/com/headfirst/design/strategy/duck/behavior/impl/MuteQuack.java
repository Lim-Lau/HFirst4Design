package com.headfirst.design.strategy.duck.behavior.impl;

import com.headfirst.design.strategy.duck.behavior.QuackBehavior;

/**
 * @author LiuCan
 * @date 2020/11/23 21:06
 * @description MuteQuack
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}
