package com.sgu.warcraftgame;

import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myattack.MeleeAttack;

public class Footman extends Unit {
    private int x = 0;
    private int y = 0;

    public Footman(String name, int hp, int mp, int damage) {
        super(name, hp, mp, damage);

    }

    public Footman() {
    }


    @Override
    public void attackUnit(Unit o) {
        o.suffer(new MeleeAttack(this, o));
    }

    @Override
    public void suffer(Attack attack) {
        this.setHp(attack.apply());
    }


}
