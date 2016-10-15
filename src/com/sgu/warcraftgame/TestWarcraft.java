package com.sgu.warcraftgame;

public class TestWarcraft {
    public static void main(String[] args) {
        HumansUnit footman=new Footman("Footman1",100,100,50);//  simple creation
        HumansUnit archer=new Archer("Archer1",50,50,35);

        HumanConstruction humanConstruction=new Barracks();
        HumansUnit footman1=humanConstruction.createUnits("footman"); //creation using barracks
        humanConstruction.upgrade("Swords");
        footman1.setHp(150);
        footman1.setMp(150);
        System.out.println(footman1.getHp());
        footman1.attack(archer);

    }

}
