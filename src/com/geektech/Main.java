package com.geektech;

public class Main {

    public static void main(String[] args) {

        Weapon weapon = new Weapon("Machine gun", "AK47");

        Boss General = new Boss("General", 500, 165, weapon);

        System.out.println(General.getName() + " : health = " + General.getHealth() +
                " | damage = " + General.getDamage() +
                " | type of weapon: " + General.getWeapon().getTypeOfWeapon() +
                " | name of weapon: " + General.getWeapon().getNameOfWeapon());

        System.out.println("=======================================================================================");


        // Дополнительное домашнее задание

        System.out.println(General.getInfo());

        System.out.println("---------------------------------------------------------------------------------------");

        Skeletons Skeleton1 = new Skeletons("Skeleton King", 400, 100, 20);

        Skeletons Skeleton2 = new Skeletons("Skeleton Queen", 200, 50, 10);

        System.out.println(Skeleton1.printInfo());

        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println(Skeleton2.printInfo());
    }
}
