package com.sgu.warcraftgame;

public class Barracks extends HumanConstruction {

    @Override
    HumansUnit createUnits(String nameUnit) {
        if (nameUnit.equals("footman"))
        return new Footman(); else
        if (nameUnit.equals("archer"))
            return new Archer();
        else throw new  RuntimeException("the unit can not be found");
    }

    @Override
    void upgrade(String name) {
        System.out.println("upgrade "+name);

    }
}
