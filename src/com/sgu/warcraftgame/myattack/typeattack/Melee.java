package com.sgu.warcraftgame.myattack.typeattack;

import com.sgu.warcraftgame.Unit;
import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myattack.RangeAttack;

/**
 * Created by student on 28.10.16.
 */
public class Melee implements Attackable {



    @Override
    public Attack getAttack(Unit unit1, Unit unit2) {
        return new RangeAttack(unit1,unit2);
    }
}
