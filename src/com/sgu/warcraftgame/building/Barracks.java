package com.sgu.warcraftgame.building;

import com.sgu.warcraftgame.Unit;
import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myexception.UnitsNotFoundException;


public class Barracks extends Construction {

    @Override
    public Unit createUnits(String nameUnit) throws UnitsNotFoundException {
        return new FactoryUnit(nameUnit).getUnit();
    }

    @Override
    void upgrade(String name) {
        System.out.println("upgrade " + name);

    }

    @Override
    public void attackUnit(Unit o) {

    }

    @Override
    public void suffer(Attack attack) {

    }


}
