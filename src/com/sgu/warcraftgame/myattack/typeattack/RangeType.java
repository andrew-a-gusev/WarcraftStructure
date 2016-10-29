package com.sgu.warcraftgame.myattack.typeattack;

import com.sgu.warcraftgame.Unit;
import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myattack.MeleeAttack;


public class RangeType implements TypeAttackable {


    @Override
    public Attack getAttack(Unit unit1, Unit unit2) {
        return new MeleeAttack(unit1, unit2);
    }
}

