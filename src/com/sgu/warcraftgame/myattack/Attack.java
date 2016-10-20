package com.sgu.warcraftgame.myattack;

import com.sgu.warcraftgame.Unit;

public abstract class Attack {
    protected Unit attacking;
    protected Unit attacked;

    public Attack(Unit attacking, Unit attacked) {
        this.attacking = attacking;
        this.attacked = attacked;
    }

    public abstract int apply();

}
