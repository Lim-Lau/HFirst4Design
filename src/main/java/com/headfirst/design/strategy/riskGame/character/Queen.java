package com.headfirst.design.strategy.riskGame.character;

import com.headfirst.design.strategy.riskGame.Weapon.impl.SwordBehavior;

/**
 * @author LiuCan
 * @date 2020/11/30 20:25
 * @description Queen
 */
public class Queen extends Character {
    public Queen() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.userWeapon();
    }
}
