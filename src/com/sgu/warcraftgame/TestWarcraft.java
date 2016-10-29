package com.sgu.warcraftgame;

import java.util.Random;

public class TestWarcraft {
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        Footman footman = new Footman("Solder", random.nextInt(1000) + 500, 10, 50);//  simple creation
        Archer archer = new Archer("Ranger", random.nextInt(1000) + 500, 50, 35);


        UnitList<Unit> unitsFootman = new UnitList<Unit>();
        UnitList<Unit> unitsArcher = new UnitList<Unit>();

        for (int i = 0; i < 10; i++) {
            unitsFootman.add(new Footman("Solder " + i, random.nextInt(1000) + 500, 10, 100));
        }

        for (int i = 0; i < 10; i++) {
            unitsArcher.add(new Archer("Ranger " + i, random.nextInt(1000) + 500, 10, 100));
        }

        // move for party units(that's list units)
        unitsArcher.move(5, 5);


        //example fight for party units(that's list units)
        System.out.println("----------------------------------");
        while (unitsArcher.getAllHp() > 0 && unitsFootman.getAllHp() > 0) {
            unitsFootman.attackAll(unitsArcher);
            unitsArcher.attackAll(unitsFootman);
            System.out.println("unitsArcher has " + unitsArcher.getAllHp() + " hp");
            System.out.println("unitsFootman has " + unitsFootman.getAllHp() + " hp");
        }

        System.out.println();
        if (unitsArcher.getAllHp() <= 0) {
            System.out.println("Footmans win!");
        } else if (unitsFootman.getAllHp() <= 0) {
            System.out.println("Archers win!");
        }
         

    }

}
