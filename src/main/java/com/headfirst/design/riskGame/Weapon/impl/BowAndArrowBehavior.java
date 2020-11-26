package com.headfirst.design.riskGame.Weapon.impl;

import com.headfirst.design.riskGame.Weapon.WeaponBehavior;

/**
 * @author LiuCan
 * @date 2020/11/30 20:20
 * @description BowAndArrowBehavior
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void userWeapon() {
        System.out.println("use bow and arrow kill！");
    }
}
