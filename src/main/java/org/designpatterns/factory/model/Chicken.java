package org.designpatterns.factory.model;

public class Chicken extends Animal {
    private int eggsPerDay;

    public Chicken(String name, int eggsPerDay) {
        super(name);
        this.eggsPerDay = eggsPerDay;
    }

}
