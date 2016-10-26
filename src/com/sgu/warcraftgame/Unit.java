package com.sgu.warcraftgame;


import com.sgu.warcraftgame.myattack.Attack;

public abstract class Unit implements FightingAbility, Movable {
    private String name; //name(id) for different objects
    private int hp; //Hit Points
    private int mp; //Magic Points :)
    private int damage;
    private int x = 0;
    private int y = 0;

    public Unit(String name, int hp, int mp, int damage) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.damage = damage;
    }

    public Unit() {  //default
        this.hp = 100;
        this.mp = 50;
    }

    public void test() {
        System.out.println(56465465);
    }

    @Override
    public void move(int x, int y) {

        if (x > this.getX())
            for (int i = this.getX(); i <=x; i++) {
                this.setX(i);
                System.out.println(this.getName() + " go to(" + i + "," + this.getY() + ")");
            }
        else if (x < this.getX())
            for (int i = this.getX(); i >= x; i--) {
                this.setX(i);
                System.out.println(this.getName() + " go to(" + i + "," + this.getY() + ")");

            }


        if (y > this.getY())
            for (int i = this.getY(); i <= y; i++) {
                this.setY(i);
                System.out.println(this.getName() + " go to(" + this.getX() + "," + i + ")");
            }
        else if (y < this.getY())
            for (int i = this.getY(); i >= y; i--) {
                this.setY(i);
                System.out.println(this.getName() + " go to(" + this.getX() + "," + i + ")");
            }
    }

    public abstract void suffer(Attack attack);

    public String getName() {
        return name;
    }


    public int getDamage() {

        return damage;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
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
