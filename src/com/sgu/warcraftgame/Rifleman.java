package com.sgu.warcraftgame;

public class Rifleman extends HumansUnit {
    @Override
    void attack(String nameEnemy) {
        System.out.println("ranged attack");
    }

    @Override
    void useSpell(String nameSpell) {
        System.out.println("use speedUp");
    }
}
