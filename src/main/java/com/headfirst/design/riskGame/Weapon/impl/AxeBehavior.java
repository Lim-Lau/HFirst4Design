package com.headfirst.design.riskGame.Weapon.impl;

import com.headfirst.design.riskGame.Weapon.WeaponBehavior;

/**
 * @author LiuCan
 * @date 2020/11/30 20:21
 * @description AxeBehavior
 */
public class AxeBehavior implements WeaponBehavior {
    @Override
    public void userWeapon() {
        System.out.println("use axe kill ！");
    }
}
