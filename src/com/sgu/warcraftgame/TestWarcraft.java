package com.sgu.warcraftgame;

import com.sgu.warcraftgame.myexception.UnitNotFoundException;

import java.util.Random;

public class TestWarcraft {
    public static void main(String[] args) throws InterruptedException, UnitNotFoundException {

        Random random = new Random();
        Footman footman = new Footman("Solder", random.nextInt(1000) + 500, 10, 50);//  simple creation
        Archer archer = new Archer("Ranger", random.nextInt(1000) + 500, 50, 35);


        UnitList<Unit> unitsFootman = new UnitList<>();
        UnitList<Unit> unitsArcher = new UnitList<>();

        for (int i = 0; i < 10; i++) {
            unitsFootman.add(new Footman("Solder " + i, random.nextInt(1000) + 500, 10, 100));
        }

        for (int i = 0; i < 10; i++) {
            unitsArcher.add(new Archer("Ranger " + i, random.nextInt(1000) + 500, 10, 100));
        }
        // example move
        footman.move(5, 10);
        System.out.println("----------------------------------");
        // use thread for attack
        Thread thread1 = new AttackThread(unitsFootman, unitsArcher);
        Thread thread2 = new AttackThread(unitsArcher, unitsFootman);
        thread1.start();
        thread2.start();
        Thread.sleep(500);
        if (unitsFootman.getAllHp() == 0 || unitsArcher.getAllHp() == 0) {
            thread1.interrupt();
            thread2.interrupt();
        }

        System.out.println();
        if (unitsArcher.getAllHp() <= 0) System.out.println("Footmans win!");
        else if (unitsFootman.getAllHp() <= 0)
            System.out.println("Archers win!");


//        //example fight no thread
//        System.out.println("----------------------------------");
//        while (unitsArcher.getAllHp() > 0 && unitsFootman.getAllHp() > 0) {
//            unitsFootman.attackAll(unitsArcher);
//            unitsArcher.attackAll(unitsFootman);
//            System.out.println("unitsArcher has " + unitsArcher.getAllHp() + " hp");
//            System.out.println("unitsFootman has " + unitsFootman.getAllHp() + " hp");
//        }
//
//        System.out.println();
//        if (unitsArcher.getAllHp() <= 0) System.out.println("Footmans win!");
//        else if (unitsFootman.getAllHp() <= 0)
//            System.out.println("Archers win!");


    }

}
