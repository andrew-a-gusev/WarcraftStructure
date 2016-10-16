package com.sgu.warcraftgame;

public class TestWarcraft {
    public static void main(String[] args) throws InterruptedException {

        HumansUnit footman = new Footman("Solder", 1000, 10, 50,15);//  simple creation
        HumansUnit archer = new Archer("Ranger", 500, 50, 35,25);

        HumanConstruction humanConstruction = new Barracks();
        //HumansUnit footman1 = humanConstruction.createUnits("footman"); //creation using barracks
        // HumansUnit archer1 = humanConstruction.createUnits("archer"); //creation using barracks


        //humanConstruction.upgrade("Swords");
       /* footman1.setHp(150);
        footman1.setMp(150);
        */
        //   System.out.println(footman1.getHp());
        int i = 0;

        while (footman.getHp() > 0 && archer.getHp() > 0) {
            System.out.println("Step----------------> " + (i++));
            footman.attack(archer);
            footman.defend(); //use defend
            archer.setHp(archer.getHp() - footman.getDamage());
            archer.useSpells();   //use spell
            archer.attack(footman);
            footman.setHp(footman.getHp() - archer.getDamage());

            System.out.println("archer has " + archer.getHp() + " hp");
            System.out.println("footman has " + footman.getHp() + " hp");

            Thread.sleep(700);
            if (archer.getHp() <=0) System.out.println("footman win!");
            else if (footman.getHp() <= 0)
                System.out.println("archer win!");
        }

    }

}
