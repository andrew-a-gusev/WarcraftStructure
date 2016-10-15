package com.sgu.warcraftgame;

public class Footman extends HumansUnit {

    public Footman(int hp, int mp) {
        super(hp, mp);
    }

    public Footman() {
    }

    @Override
    public void attack() {
        System.out.println("use sword");
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
