package com.sgu.warcraftgame.myattack;

import com.sgu.warcraftgame.Unit;

public class MeleeAttack extends Attack {

    public MeleeAttack(Unit attacking, Unit attacked) {
        super(attacking, attacked);
    }

    @Override
    public int apply() {
        System.out.println(attacking.getName() + " use Melee attack on " + attacked.getClass().getSimpleName() + " " + attacked.getName());
        return attacked.getHp() - attacking.getDamage();
    }
}
