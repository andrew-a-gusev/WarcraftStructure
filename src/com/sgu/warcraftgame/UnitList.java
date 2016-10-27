package com.sgu.warcraftgame;

import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myattack.MeleeAttack;
import com.sgu.warcraftgame.myattack.RangeAttack;

import java.util.ArrayList;
import java.util.Random;

public class UnitList<T> extends ArrayList<T> implements FightingAbility, Movable {

    public long getAllHp() {
        long hp = 0;
        for (T p : this) {
            Unit unit = (Unit) p;
            hp += unit.getHp();
        }
        return hp;

    }


    @Override
    public  void attackUnit(Unit o) {

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i) instanceof Footman)
                o.suffer(new MeleeAttack((Unit) this.get(i), o));
            if (this.get(i) instanceof Archer)
                o.suffer(new RangeAttack((Unit) this.get(i), o));
            if (o.getHp() <= 0) break;
        }

    }

    public void attackAll(ArrayList<? extends T> units) {

//logic game #1  any attack of any

        if (!this.isEmpty() && !units.isEmpty()) {
            Random random = new Random();
            Unit attacking;
            Unit attacked;
            if (this.size() == 1) attacking = (Unit) this.get(0);
            else
                attacking = (Unit) this.get(random.nextInt(this.size() - 1));
            if (attacking instanceof Footman) {
                if (units.size() == 1) attacked = (Unit) units.get(0);
                else
                    attacked = (Unit) units.get(random.nextInt(units.size() - 1));
                attacked.suffer(new MeleeAttack(attacking, attacked));
            }
            if (attacking instanceof Archer) {
                if (units.size() == 1) attacked = (Unit) units.get(0);
                else
                    attacked = (Unit) units.get(random.nextInt(units.size() - 1));
                attacked.suffer(new RangeAttack(attacking, attacked));
            }

//logic game #2  all attack of one
//        for (int i = 0; i < this.size(); i++) {
//            for (int j = 0; j < units.size(); j++) {
//                if (this.get(i) instanceof Footman) {
//                    Unit attacked = (Unit) units.get(i);
//                    attacked.suffer(new MeleeAttack((Unit) this.get(j), attacked));
//                }
//                if (this.get(i) instanceof Archer) {
//                    Unit attacked = (Unit) units.get(i);
//                    attacked.suffer(new RangeAttack((Unit) this.get(j), attacked));
//                }
//            }
//
//        }

            for (int i = 0; i < units.size(); ) {
                attacked = (Unit) units.get(i);
                if (attacked.getHp() <= 0)
                    units.remove(i);
                else i++;
            }
        }
    }

    @Override
    public void move(int x, int y) {
        UnitList<Unit> unit=(UnitList<Unit>)this;
        for (int i = 0; i < unit.size(); i++) {
            if (x >  unit.get(i).getX())
                for (int k = unit.get(i).getX(); k <= x; k++) {
                    unit.get(i).setX(k);
                    System.out.println(unit.get(i).getName() + " go to(" + k + "," + unit.get(i).getY() + ")");
                }
            else if (x < unit.get(i).getX())
                for (int k = unit.get(i).getX(); k >= x; k--) {
                    unit.get(i).setX(k);
                    System.out.println(unit.get(i).getName() + " go to(" + k + "," + unit.get(i).getY() + ")");

                }


            if (y > unit.get(i).getY())
                for (int k = unit.get(i).getY(); k <= y; k++) {
                    unit.get(i).setY(k);
                    System.out.println(unit.get(i).getName() + " go to(" + unit.get(i).getX() + "," + k + ")");
                }
            else if (y < unit.get(i).getY())
                for (int k = unit.get(i).getY(); k >= y; k--) {
                    unit.get(i).setY(k);
                    System.out.println(unit.get(i).getName() + " go to(" + unit.get(i).getX() + "," + k + ")");
                }
        }
    }

    @Override
    public void suffer(Attack attack) {

    }


}
