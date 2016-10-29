package com.sgu.warcraftgame;

import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myattack.RangeAttack;

public class Archer extends Unit {


    public Archer(String name, int hp, int mp, int damage) {
        super(name, hp, mp, damage);
    }

    public Archer() {
    }

    @Override
    public void attackUnit(Unit o) {
        o.suffer(new RangeAttack(this, o));
    }

    @Override
    public void suffer(Attack attack) {
        this.setHp(attack.apply());
    }


}
