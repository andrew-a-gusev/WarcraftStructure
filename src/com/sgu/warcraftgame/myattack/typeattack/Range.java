package com.sgu.warcraftgame.myattack.typeattack;

import com.sgu.warcraftgame.Unit;
import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myattack.MeleeAttack;

/**
 * Created by student on 28.10.16.
 */
public class Range implements Attackable {


    @Override
    public Attack getAttack(Unit unit1, Unit unit2) {
        return new MeleeAttack(unit1,unit2);
    }
    }

