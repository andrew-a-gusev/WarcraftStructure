package com.sgu.warcraftgame.myattack;

import com.sgu.warcraftgame.Archer;
import com.sgu.warcraftgame.Footman;
import com.sgu.warcraftgame.Unit;
import com.sgu.warcraftgame.myattack.typeattack.RangeType;
import com.sgu.warcraftgame.myattack.typeattack.TypeAttackable;
import com.sgu.warcraftgame.myattack.typeattack.MeleeType;
import com.sgu.warcraftgame.myexception.UnitsNotFoundException;


public class FactoryAttack {

    Unit unit;

    public FactoryAttack(Unit unit) {
        this.unit = unit;
    }

    public TypeAttackable getAttack() throws UnitsNotFoundException {
        if (unit instanceof Footman) {
            return new MeleeType();
        } else
        if (unit instanceof Archer) {
            return new RangeType();
        } else
          throw new UnitsNotFoundException("Unit Not Found Exception");

    }
}
