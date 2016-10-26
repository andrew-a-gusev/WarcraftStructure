package com.sgu.warcraftgame.building;

import com.sgu.warcraftgame.Archer;
import com.sgu.warcraftgame.Footman;
import com.sgu.warcraftgame.Unit;
import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myexception.UnitNotFoundException;

public class Barracks extends Construction {

    @Override
    Unit createUnits(String nameUnit) throws UnitNotFoundException {
        if (nameUnit.equals("footman"))
            return new Footman();
        else if (nameUnit.equals("archer"))
            return new Archer();
        else throw new UnitNotFoundException();
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
