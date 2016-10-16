package com.sgu.warcraftgame;

public class Archer extends HumansUnit {

    private int accuracy;

    public Archer(String name, int hp, int mp, int damage, int accuracy) {
        super(name, hp, mp, damage);
        this.accuracy = accuracy;
    }

    public Archer() {
    }

    @Override
    public void attack(HumansUnit o) {
        System.out.println(this.getName() + " use bow for attack " + o.getClass().getSimpleName() + " " + o.getName());
        System.out.println(o.getClass().getSimpleName() + " " + o.getName() + " received " + this.getDamage() + " damage");
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
