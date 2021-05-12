package com.geektech;

//import static com.geektech.Boss.weapon;

public class Main {


    public static void main(String[] args) {
        Weapon weapon = new Weapon("Machine gun", "AK47");

        Boss General = new Boss("General", 500, 165);

        System.out.println(General.getName() + " : health = " + General.getHealth() + " |" +
                " damage = " + General.getDamage() + " |" +
                " weapon: " + weapon.getTypeOfWeapon() + " - " + weapon.getNameOfWeapon());
    }
}
