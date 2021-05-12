package com.geektech;

import static com.geektech.Boss.weapon;

public class Main {

    public static void main(String[] args) {

        Boss General = new Boss("General", 500, 165, (weapon));
        System.out.println(General.getName() + " : health = " + General.getHealth() + " |" +
                " damage = " + General.getDamage() + " |" +
                " weapon: " + General.weapon.getTypeOfWeapon() + " " + General.weapon.getNameOfWeapon());
    }
}
