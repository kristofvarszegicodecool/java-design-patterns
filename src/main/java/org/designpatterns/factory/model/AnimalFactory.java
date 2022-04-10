package org.designpatterns.factory.model;

import org.designpatterns.factory.model.Chicken;
import org.designpatterns.factory.model.Cow;

public class AnimalFactory {
    //

    public Cow createCow(String name, double milkPerDayLiters) {
        return new Cow(name, milkPerDayLiters);
    }

    public Chicken createChicken(String name, int eggsPerDay) {
        return new Chicken(name, eggsPerDay);
    }
}
