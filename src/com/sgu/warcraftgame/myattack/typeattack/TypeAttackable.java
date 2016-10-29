package com.sgu.warcraftgame.myattack.typeattack;

import com.sgu.warcraftgame.Unit;
import com.sgu.warcraftgame.myattack.Attack;


public interface TypeAttackable {

    Attack getAttack(Unit unit1,Unit unit2);
}
