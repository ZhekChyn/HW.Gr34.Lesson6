package com.geektech;

public class Boss extends GameEntity{

    public static Weapon weapon = new Weapon("Gun", "AK47");

    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setCar(Weapon car) {
        this.weapon = car;
    }
}
