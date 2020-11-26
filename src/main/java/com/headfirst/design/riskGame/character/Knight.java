package com.headfirst.design.riskGame.character;

import com.headfirst.design.riskGame.Weapon.impl.SwordBehavior;

/**
 * @author LiuCan
 * @date 2020/11/30 20:26
 * @description Knight
 */
public class Knight extends Character {
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.userWeapon();
    }
}
