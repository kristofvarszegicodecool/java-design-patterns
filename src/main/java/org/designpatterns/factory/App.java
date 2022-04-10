package org.designpatterns.factory;

import org.designpatterns.factory.controller.FarmManager;

public class App {
    public static void main(String[] args) {
        FarmManager farmManager = new FarmManager();
        farmManager.breedAnimals();
    }
}
