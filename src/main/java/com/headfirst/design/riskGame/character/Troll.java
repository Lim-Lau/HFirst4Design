package com.headfirst.design.riskGame.character;

import com.headfirst.design.riskGame.Weapon.impl.BowAndArrowBehavior;

/**
 * @author LiuCan
 * @date 2020/11/30 20:26
 * @description Troll
 */
public class Troll extends Character {
    public Troll() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weaponBehavior.userWeapon();
    }
}
