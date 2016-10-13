package com.sgu.warcraftgame;

public abstract class HumansUnit {
    int hp;
    int mp;
    int speed;

    abstract void attack(String nameEnemy);

    void move(int x,int y) {
        System.out.println("move to (x,y)");
    }

    void defend() {
        System.out.println("defends");
    }

    abstract void useSpell(String nameSpell);


}
