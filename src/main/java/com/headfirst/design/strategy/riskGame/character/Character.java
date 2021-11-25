package com.headfirst.design.strategy.riskGame.character;

import com.headfirst.design.strategy.riskGame.Weapon.WeaponBehavior;

/**
 * @author LiuCan
 * @date 2020/11/30 20:11
 * @description Character
 */
public abstract class Character {

    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
