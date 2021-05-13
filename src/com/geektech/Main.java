package com.geektech;

public class Main {


    public static void main(String[] args) {

        Weapon weapon = new Weapon("Machine gun", "AK47");

        Boss General = new Boss("General", 500, 165, weapon);

        System.out.println(General.getInfo());
    }
}
