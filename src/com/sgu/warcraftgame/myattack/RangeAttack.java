package com.sgu.warcraftgame.myattack;

import com.sgu.warcraftgame.Unit;

public class RangeAttack extends Attack {

    public RangeAttack(Unit attacking, Unit attacked) {
        super(attacking, attacked);
    }

    @Override
    public int apply() {
        System.out.println(attacking.getName()+" use Range attack on " + attacked.getClass().getSimpleName() + " " + attacked.getName());
        return attacked.getHp()-attacking.getDamage();
    }
}
