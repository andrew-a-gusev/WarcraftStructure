package com.sgu.warcraftgame;

public abstract class HumansUnit implements FightingAbility {
    private int hp; //Hit Points
    private int mp; //Magic Points :)
    private int speed; //Speed )

    public HumansUnit(int hp, int mp) {
        this.hp = hp;
        this.mp = mp;
        this.speed = 15;
    }

    public HumansUnit() {  //default
        this.hp = 100;
        this.mp = 50;
        this.speed = 15;
    }

    void move(int x, int y, int speed) {
        System.out.println("move to (x,y)");
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
