package com.sgu.warcraftgame;

public class Footman extends HumansUnit {


    public Footman(String name, int hp, int mp, int damage) {
        super(name, hp, mp, damage);
    }

    public Footman() {
    }

    @Override
    public void attack(HumansUnit o) {
        System.out.println("use sword for attack " + o.getClass().getSimpleName() + " " + o.getName());
        System.out.println(o.getClass().getSimpleName() + " " + o.getName() + " received " + o.getDamage() + " damage");
    }

    @Override
    public void defent() {
        System.out.println("use shield");
    }

    @Override
    public void useSpells() {
        System.out.println("use up+ armor");

    }


}
