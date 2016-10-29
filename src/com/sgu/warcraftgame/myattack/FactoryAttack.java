package com.sgu.warcraftgame.myattack;

import com.sgu.warcraftgame.Archer;
import com.sgu.warcraftgame.Footman;
import com.sgu.warcraftgame.Unit;
import com.sgu.warcraftgame.myattack.typeattack.Attackable;
import com.sgu.warcraftgame.myattack.typeattack.Melee;
import com.sgu.warcraftgame.myattack.typeattack.Range;


public class FactoryAttack {

    Unit unit;

    public FactoryAttack(Unit unit) {
        this.unit=unit;
    }

    public Attackable getAttack() {
        if (unit instanceof Footman){
            return new Melee();
        }
        if (unit instanceof Archer){
            return new Range();
        }
        return null;

    }
}
