package com.sgu.warcraftgame;

public class Archer extends HumansUnit {

    public Archer(String name, int hp, int mp, int damage) {
        super(name, hp, mp, damage);
    }

    public Archer() {
    }

    @Override
    public void attack(HumansUnit o) {
        System.out.println("use bow for attack "+o.getClass().getSimpleName()+" "+o.getName());
        System.out.println(o.getClass().getSimpleName()+" "+o.getName()+" received "+o.getDamage()+" damage");
    }

    @Override
    public void defent() {
        System.out.println("move back");

    }

    @Override
    public void useSpells() {
        System.out.println("use increase accuracy");

    }
}
