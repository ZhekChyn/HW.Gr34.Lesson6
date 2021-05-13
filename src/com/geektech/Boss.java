package com.geektech;

public class Boss extends GameEntity{
    private Weapon weapon;


    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + " | type of weapon: " + weapon.getTypeOfWeapon() + " | name of weapon: " + weapon.getNameOfWeapon();
    }

}
