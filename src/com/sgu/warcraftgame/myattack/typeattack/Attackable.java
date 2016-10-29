package com.sgu.warcraftgame.myattack.typeattack;

import com.sgu.warcraftgame.Unit;
import com.sgu.warcraftgame.myattack.Attack;

/**
 * Created by student on 28.10.16.
 */
public interface Attackable {

    Attack getAttack(Unit unit1,Unit unit2);
}
