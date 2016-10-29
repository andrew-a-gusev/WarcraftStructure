package com.sgu.warcraftgame.building;

import com.sgu.warcraftgame.Unit;
import com.sgu.warcraftgame.myexception.UnitsNotFoundException;


public abstract class Construction extends Unit {
    private int hp; //Hit Points
    private int protectionPoints;

    abstract void upgrade(String nameUp);

    abstract Unit createUnits(String nameUnit) throws UnitsNotFoundException;

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
