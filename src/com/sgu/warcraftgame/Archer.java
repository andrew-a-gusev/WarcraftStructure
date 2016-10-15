package com.sgu.warcraftgame;

public class Archer extends HumansUnit {

    public Archer(int hp, int mp) {
        super(hp, mp);
    }

    public Archer() {
    }

    @Override
    public void attack() {
        System.out.println("use bow");
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
