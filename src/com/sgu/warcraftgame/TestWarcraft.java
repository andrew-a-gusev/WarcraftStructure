package com.sgu.warcraftgame;

public class TestWarcraft {
    public static void main(String[] args) {
        HumansUnit footman=new Footman(100,100);//  simple creation
        HumansUnit archer=new Archer(50,50);

        HumanConstruction humanConstruction=new Barracks();
        HumansUnit footman1=humanConstruction.createUnits("footman"); //creation using barracks
        footman1.setHp(150);
        footman1.setMp(150);
        System.out.println(footman1.getHp());
    }

}
