package com.sgu.warcraftgame;

public abstract class HumanConstruction {
    int hp;
    int protectionPoints;

    void unitCreate(int amount) {
        System.out.println("unit create");
    }

    void upgradeConstruct(int lvl) {
        System.out.println("upgrade successful");
    }

    void useSpellDefend() {
        System.out.println("protected structure");
    }
}
