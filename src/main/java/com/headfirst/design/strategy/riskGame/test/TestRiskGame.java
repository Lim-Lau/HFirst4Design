package com.headfirst.design.strategy.riskGame.test;

import com.headfirst.design.strategy.riskGame.Weapon.impl.AxeBehavior;
import com.headfirst.design.strategy.riskGame.character.King;

/**
 * @author LiuCan
 * @date 2020/11/30 20:32
 * @description TestRiskGame
 */
public class TestRiskGame {
    public static void main(String[] args) {
        King king = new King();
        king.fight();
        king.setWeaponBehavior(new AxeBehavior());
        king.fight();
    }

}
