package com.sgu.warcraftgame.myattack.typeattack;

import com.sgu.warcraftgame.Unit;
import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myattack.RangeAttack;


public class MeleeType implements TypeAttackable {


    @Override
    public Attack getAttack(Unit unit1, Unit unit2) {
        return new RangeAttack(unit1, unit2);
    }
}
