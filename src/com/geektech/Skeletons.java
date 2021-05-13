package com.geektech;

// Дополнительное домашнее задание
public class Skeletons extends Boss {

    private int numberOfArrows;

    public Skeletons(String name, int health, int damage, int numberOfArrows) {
        super(name, health, damage);
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }
    @Override
    public String printInfo(){
        return super.printInfo() + " | number of arrows: " + getNumberOfArrows();
    }
}
