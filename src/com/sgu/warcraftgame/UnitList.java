package com.sgu.warcraftgame;

import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myattack.MeleeAttack;
import com.sgu.warcraftgame.myattack.RangeAttack;

import java.util.ArrayList;
import java.util.Random;

public class UnitList<Unit> extends ArrayList<Unit> implements FightingAbility {

    public long getAllHp() {
        long hp = 0;
        for (Unit p : this) {
            com.sgu.warcraftgame.Unit unit = (com.sgu.warcraftgame.Unit) p;
            hp += unit.getHp();
        }
        return hp;

    }

    @Override
    public void attackUnit(com.sgu.warcraftgame.Unit o) {

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i) instanceof Footman)
                o.suffer(new MeleeAttack((com.sgu.warcraftgame.Unit) this.get(i), o));
            if (this.get(i) instanceof Archer)
                o.suffer(new RangeAttack((com.sgu.warcraftgame.Unit) this.get(i), o));
        }

    }

    public void attackAll(UnitList units) {

//logic game #1  any attack of any

        if (!this.isEmpty() && !units.isEmpty()) {
            Random random = new Random();
            com.sgu.warcraftgame.Unit attacking;
            com.sgu.warcraftgame.Unit attacked;
            if (this.size() == 1) attacking = (com.sgu.warcraftgame.Unit) this.get(0);
            else
                attacking = (com.sgu.warcraftgame.Unit) this.get(random.nextInt(this.size() - 1));
            if (attacking instanceof Footman) {
                if (units.size() == 1) attacked = (com.sgu.warcraftgame.Unit) units.get(0);
                else
                    attacked = (com.sgu.warcraftgame.Unit) units.get(random.nextInt(units.size() - 1));
                attacked.suffer(new MeleeAttack(attacking, attacked));
            }
            if (attacking instanceof Archer) {
                if (units.size() == 1) attacked = (com.sgu.warcraftgame.Unit) units.get(0);
                else
                    attacked = (com.sgu.warcraftgame.Unit) units.get(random.nextInt(units.size() - 1));
                attacked.suffer(new RangeAttack(attacking, attacked));
            }

//logic game #2
//        for (int i = 0; i < this.size(); i++) {
//            for (int j = 0; j < units.size(); j++) {
//                if (this.get(i) instanceof Footman) {
//                    com.sgu.warcraftgame.Unit attacked = (com.sgu.warcraftgame.Unit) units.get(i);
//                    attacked.suffer(new MeleeAttack((com.sgu.warcraftgame.Unit) this.get(j), attacked));
//                }
//                if (this.get(i) instanceof Archer) {
//                    com.sgu.warcraftgame.Unit attacked = (com.sgu.warcraftgame.Unit) units.get(i);
//                    attacked.suffer(new RangeAttack((com.sgu.warcraftgame.Unit) this.get(j), attacked));
//                }
//            }
//
//        }

            for (int i = 0; i < units.size(); ) {
                attacked = (com.sgu.warcraftgame.Unit) units.get(i);
                if (attacked.getHp() <= 0)
                    units.remove(i);
                else i++;
            }
        }
    }


    @Override
    public void suffer(Attack attack) {

    }

    @Override
    public void defend() {

    }

    @Override
    public void useSpells() {

    }
}
