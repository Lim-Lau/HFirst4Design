package com.headfirst.design.riskGame.character;

import com.headfirst.design.riskGame.Weapon.impl.SwordBehavior;

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
