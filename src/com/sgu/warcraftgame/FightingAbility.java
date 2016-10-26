package com.sgu.warcraftgame;

import com.sgu.warcraftgame.myattack.Attack;

public interface FightingAbility {

    void attackUnit(Unit o);
    void suffer(Attack attack);

}
