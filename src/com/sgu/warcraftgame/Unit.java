package com.sgu.warcraftgame;


import com.sgu.warcraftgame.myattack.Attack;

public abstract class Unit  {
    private String name; //name(id) for different objects
    private int hp; //Hit Points
    private int mp; //Magic Points :)
    private int damage;

    public  Unit(String name, int hp, int mp, int damage) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.damage = damage;
    }

    public  Unit() {  //default
        this.hp = 100;
        this.mp = 50;
    }




    /*void move(int x, int y, int speed) {
        System.out.println("move to (x,y)");
    }*/

    public abstract void suffer(Attack attack);
    public String getName() {
        return name;
    }


    public int getDamage() {

        return damage;
    }


    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }


}
