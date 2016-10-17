package com.sgu.warcraftgame;

import com.sgu.warcraftgame.MyException.UnitNotFoundException;

public class Barracks extends HumanConstruction {

    @Override
    HumansUnit createUnits(String nameUnit) throws UnitNotFoundException {
        if (nameUnit.equals("footman"))
        return new Footman(); else
        if (nameUnit.equals("archer"))
            return new Archer();
        else throw new UnitNotFoundException();
    }

    @Override
    void upgrade(String name) {
        System.out.println("upgrade "+name);

    }
}
