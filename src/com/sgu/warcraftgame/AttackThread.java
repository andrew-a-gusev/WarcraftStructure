package com.sgu.warcraftgame;

public class AttackThread extends Thread {
    UnitList<Unit> list = new UnitList<>();
    UnitList<Unit> list2 = new UnitList<>();

    public AttackThread(UnitList<Unit> list, UnitList<Unit> list2) {
        this.list = list;
        this.list2 = list2;

    }

    @Override
    public void run() {
        while (!currentThread().isInterrupted()) {
            list.attackAll(list2);

        }
    }
}

