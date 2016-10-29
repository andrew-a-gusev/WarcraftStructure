package com.sgu.warcraftgame.building;

import com.sgu.warcraftgame.Archer;
import com.sgu.warcraftgame.Footman;
import com.sgu.warcraftgame.Unit;
import com.sgu.warcraftgame.myexception.UnitsNotFoundException;

public class FactoryUnit {

    private String characterType;

    public FactoryUnit(String characterType) {
        this.characterType = characterType;
    }

    public Unit getUnit() throws UnitsNotFoundException {
        if (characterType.equals("footman")) {
            return new Footman();
        } else if (characterType.equals("archer")) {
            return new Archer();
        } else throw new UnitsNotFoundException("Unit Not Found");
    }
}
