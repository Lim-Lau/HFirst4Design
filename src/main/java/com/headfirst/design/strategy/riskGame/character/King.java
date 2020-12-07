package com.headfirst.design.strategy.riskGame.character;

import com.headfirst.design.strategy.riskGame.Weapon.impl.KnifeBehavior;

/**
 * @author LiuCan
 * @date 2020/11/30 20:26
 * @description King
 */
public class King extends Character {
    public King() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.userWeapon();
    }
}
