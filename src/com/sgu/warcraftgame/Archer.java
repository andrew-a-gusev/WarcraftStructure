package com.sgu.warcraftgame;

import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myattack.RangeAttack;

public class Archer extends Unit   {

    private int accuracy;

    public Archer(String name, int hp, int mp, int damage, int accuracy) {
        super(name, hp, mp, damage);
        this.accuracy = accuracy;
    }

    public Archer() {
    }

    @Override
    public void attackUnit(Unit o) {
         o.suffer(new RangeAttack(this,o));
    }

    @Override
    public void suffer(Attack attack) {
        this.setHp(attack.apply());
    }

    @Override
    public void defend() {
        System.out.println("move back");

    }

    @Override
    public void useSpells() {
        System.out.println("(" + this.getName() + " uses the ability to increase accuracy)");
        this.setDamage(this.getDamage() + this.getAccuracy());

    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}
