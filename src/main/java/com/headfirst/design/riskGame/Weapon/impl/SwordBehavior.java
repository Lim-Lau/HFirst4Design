package com.headfirst.design.riskGame.Weapon.impl;

import com.headfirst.design.riskGame.Weapon.WeaponBehavior;

/**
 * @author LiuCan
 * @date 2020/11/30 20:22
 * @description SwordBehavior
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void userWeapon() {
        System.out.println("use sword kill ！");
    }
}
