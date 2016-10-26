package com.sgu.warcraftgame;

import com.sgu.warcraftgame.myexception.UnitNotFoundException;

import java.util.Random;

public class TestWarcraft {
    public static void main(String[] args) throws InterruptedException, UnitNotFoundException {

        Random random = new Random();
//        Footman footman = new Footman("Solder", random.nextInt(1000) + 500, 10, 50, 15);//  simple creation
//        Archer archer = new Archer("Ranger", random.nextInt(1000) + 500, 50, 35, 25);


        UnitList<Unit> unitsFootman = new UnitList<>();
        UnitList<Unit> unitsArcher = new UnitList<>();

        for (int i = 0; i < 10; i++) {
            unitsFootman.add(new Footman("Solder " + i, random.nextInt(1000) + 500, 10, 100, 15));
        }

        for (int i = 0; i < 10; i++) {
            unitsArcher.add(new Archer("Ranger " + i, random.nextInt(1000) + 500, 10, 100, 15));
        }


//        Construction barracks = new Barracks();
//        HumansUnit footman1 = humanConstruction.createUnits("footman"); //creation using barracks
//        HumansUnit archer1 = humanConstruction.createUnits("archer"); //creation using barracks


        while (unitsArcher.getAllHp() > 0 && unitsFootman.getAllHp() > 0) {
            unitsFootman.attackAll(unitsArcher);
            unitsArcher.attackAll(unitsFootman);
            System.out.println("unitsArcher has " + unitsArcher.getAllHp() + " hp");
            System.out.println("unitsFootman has " + unitsFootman.getAllHp() + " hp");


        }
        System.out.println();
        if (unitsArcher.getAllHp() <= 0) System.out.println("Footmans win!");
        else if (unitsFootman.getAllHp() <= 0)
            System.out.println("Archers win!");

//        int i = 0;

//        while (footman.getHp() > 0 && archer.getHp() > 0) {
//            System.out.println("Step----------------> " + (i++));
//            footman.attackUnit(archer);
//            archer.attackUnit(footman);
//
//            System.out.println("archer has " + archer.getHp() + " hp");
//            System.out.println("footman has " + footman.getHp() + " hp");
//
//            TimeUnit.SECONDS.sleep(1);
//            if (archer.getHp() <= 0) System.out.println("footman win!");
//            else if (footman.getHp() <= 0)
//                System.out.println("archer win!");
//        }

    }

}
