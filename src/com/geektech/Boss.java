package com.geektech;

public class Boss extends GameEntity{
    Weapon weapon;


    public Boss(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
