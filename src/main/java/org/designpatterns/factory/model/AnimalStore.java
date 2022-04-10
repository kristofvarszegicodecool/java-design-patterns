package org.designpatterns.factory.model;

import java.util.ArrayList;
import java.util.List;

public class AnimalStore {
    List<Animal> animals;

    public AnimalStore() {
        animals = new ArrayList<>();
    }

    public void add(Animal animal) {
        animals.add(animal);
    }
}
