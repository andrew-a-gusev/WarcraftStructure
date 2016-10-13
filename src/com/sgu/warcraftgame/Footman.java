package com.sgu.warcraftgame;

public class Footman extends HumansUnit {
    @Override
    void attack(String nameEnemy) {
        System.out.println("melee attack");
    }

    @Override
    void useSpell(String nameSpell) {
        System.out.println("use block");
    }
}
