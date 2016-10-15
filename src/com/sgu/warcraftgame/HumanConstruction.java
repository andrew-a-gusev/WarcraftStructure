package com.sgu.warcraftgame;

public abstract class HumanConstruction {
    private int hp; //Hit Points
    private int protectionPoints;

    abstract void upgrade(String nameUp);

    abstract HumansUnit createUnits(String nameUnit);

    public int getHp() {
        return hp;
    }

    public int getProtectionPoints() {
        return protectionPoints;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setProtectionPoints(int protectionPoints) {
        this.protectionPoints = protectionPoints;
    }
}
