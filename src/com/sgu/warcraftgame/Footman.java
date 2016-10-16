package com.sgu.warcraftgame;

public class Footman extends HumansUnit {

    private int armor;

    public Footman(String name, int hp, int mp, int damage, int armor) {
        super(name, hp, mp, damage);
        this.armor=armor;
    }

    public Footman() {
    }

    @Override
    public void attack(HumansUnit o) {
        System.out.println(this.getName()+" use sword for attack " + o.getClass().getSimpleName() + " " + o.getName());
        System.out.println(o.getClass().getSimpleName() + " " + o.getName() + " received " + this.getDamage() + " damage");
    }

    @Override
    public void defend() {
        System.out.println("("+this.getName()+" uses a shield)");
        this.setHp(this.getArmor()+this.getHp());
    }

    @Override
    public void useSpells() {
        System.out.println("use up+ armor");

    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
