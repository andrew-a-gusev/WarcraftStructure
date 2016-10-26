package com.sgu.warcraftgame;

import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myattack.MeleeAttack;

public class Footman extends Unit {

    private int armor;

    public Footman(String name, int hp, int mp, int damage, int armor) {
        super(name, hp, mp, damage);
        this.armor=armor;
    }

    public Footman() {
    }

    @Override
    public void attackUnit(Unit o) {
        o.suffer(new MeleeAttack(this,o));
    }

    @Override
    public void suffer(Attack attack) {
       this.setHp(attack.apply());
    }

    @Override
    public void defend() {
        System.out.println("("+this.getName()+" uses a shield)");
        this.setHp(this.getArmor()+this.getHp());
    }

    @Override
    public void useSpells() {
        System.out.println("use up+ armor");

    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
