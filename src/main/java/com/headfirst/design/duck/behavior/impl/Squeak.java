package com.headfirst.design.duck.behavior.impl;

import com.headfirst.design.duck.behavior.QuackBehavior;

/**
 * @author LiuCan
 * @date 2020/11/23 21:07
 * @description Squeak
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
