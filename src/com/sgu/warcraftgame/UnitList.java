package com.sgu.warcraftgame;

import com.sgu.warcraftgame.myattack.Attack;
import com.sgu.warcraftgame.myattack.FactoryAttack;
import com.sgu.warcraftgame.myattack.typeattack.TypeAttackable;
import com.sgu.warcraftgame.myexception.UnitsNotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * С какой целью мы позволяем задавать разные типы шаблона T ?
 * Почему нельзя сделать UnitList extends ArrayList<Unit> ?
 */
public class UnitList<T extends Unit> extends ArrayList<T> implements FightingAbility, Movable {

    /**
     * какой физический смысл в таком методе ?
     */
    public long getAllHp() {
        long hp = 0;
        for (T p : this) {
            Unit unit = p;
            hp += unit.getHp();
        }
        return hp;

    }

    private Attack getTypeAttack(Unit unit1, Unit unit2) {


        TypeAttackable attackable = null;
        try {
            attackable = new FactoryAttack(unit1).getAttack();
        } catch (UnitsNotFoundException e) {
            e.printStackTrace();
        }
        return attackable.getAttack(unit1, unit2);
    }

    @Override
    public void attackUnit(Unit o) {

        for (Unit unit : this) {
            o.suffer(getTypeAttack(unit, o));
            if (o.getHp() <= 0) {
                break;
            }
        }

    }

    public void attackAll(ArrayList<? extends T> units) {

//logic game any attack of any

        if (!this.isEmpty() && !units.isEmpty()) {
            Random random = new Random();
            Unit attacking;
            Unit attacked;
            if (this.size() == 1) {
                attacking = this.get(0);
            } else {
                attacking = this.get(random.nextInt(this.size() - 1));
            }

            if (units.size() == 1) {
                attacked = units.get(0);
            } else {
                attacked = units.get(random.nextInt(units.size() - 1));
            }

            attacked.suffer(getTypeAttack(attacking, attacked));


            Iterator<? extends T> iterator = units.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().getHp() <= 0) {
                    iterator.remove();
                }
            }
        }
    }

    @Override
    public void move(int x, int y) {
        /**
         * как вариант
         * foreach(Unit u: units) {
         *     unit.moveTo(x,y);
         * }
         * при этом логика перемещения каждого отдельного юнита реализуется его собственным классом
         */
        for (int i = 0; i < this.size(); i++) {
            if (x > this.get(i).getX()) {
                for (int k = this.get(i).getX(); k <= x; k++) {
                    this.get(i).setX(k);
                    System.out.println(this.get(i).getName() + " go to(" + k + "," + this.get(i).getY() + ")");
                }
            } else if (x < this.get(i).getX()) {
                for (int k = this.get(i).getX(); k >= x; k--) {
                    this.get(i).setX(k);
                    System.out.println(this.get(i).getName() + " go to(" + k + "," + this.get(i).getY() + ")");

                }
            }


            if (y > this.get(i).getY()) {
                for (int k = this.get(i).getY(); k <= y; k++) {
                    this.get(i).setY(k);
                    System.out.println(this.get(i).getName() + " go to(" + this.get(i).getX() + "," + k + ")");
                }
            } else if (y < this.get(i).getY()) {
                for (int k = this.get(i).getY(); k >= y; k--) {
                    this.get(i).setY(k);
                    System.out.println(this.get(i).getName() + " go to(" + this.get(i).getX() + "," + k + ")");
                }
            }
        }
    }


    @Override
    public void suffer(Attack attack) {

    }


}
