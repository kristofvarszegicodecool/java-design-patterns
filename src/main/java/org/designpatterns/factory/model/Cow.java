package org.designpatterns.factory.model;

public class Cow extends Animal {
    private double milkPerDayLiters;

    public Cow(String name, double milkPerDayLiters) {
        super(name);
        this.milkPerDayLiters = milkPerDayLiters;
    }
}
