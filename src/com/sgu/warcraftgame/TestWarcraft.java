package com.sgu.warcraftgame;

public class TestWarcraft {
    public static void main(String[] args) throws InterruptedException {
        HumansUnit footman = new Footman("Solder", 1000, 100, 50);//  simple creation
        HumansUnit archer = new Archer("Ranger", 500, 50, 35);

        HumanConstruction humanConstruction = new Barracks();
        //HumansUnit footman1 = humanConstruction.createUnits("footman"); //creation using barracks
        // HumansUnit archer1 = humanConstruction.createUnits("archer"); //creation using barracks


        //humanConstruction.upgrade("Swords");
       /* footman1.setHp(150);
        footman1.setMp(150);
        */
        //   System.out.println(footman1.getHp());
        while (footman.getHp() > 0 && archer.getHp() > 0) {
            footman.attack(archer);
            archer.setHp(archer.getHp() - footman.getDamage());
            archer.attack(footman);
            footman.setHp(footman.getHp() - archer.getDamage());
            System.out.println("archer has " + archer.getHp() + " hp");
            System.out.println("footman has " + footman.getHp() + " hp");
            Thread.sleep(1000);
            if (archer.getHp() == 0) System.out.println("footman win!");
            else
                System.out.println("archer win!");
        }

    }

}
