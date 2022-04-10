package org.designpatterns.factory.controller;

// Note that we do not need to import the child classes (Cow, Chicken)
import org.designpatterns.factory.model.Animal;
import org.designpatterns.factory.model.AnimalFactory;
import org.designpatterns.factory.model.AnimalStore;

public class FarmManager {
    private AnimalStore animalStore;
    private AnimalFactory animalFactory;

    public FarmManager() {
        animalStore = new AnimalStore();
        animalFactory = new AnimalFactory();
    }

    public void breedAnimals() {
        //Animal newAnimal1 = new Cow("Daisy", 5);  // This would need us to import the Cow class
        Animal newAnimal1 = animalFactory.createCow("Daisy", 5);
        animalStore.add(newAnimal1);

        //Animal newAnimal2 = new Chicken("Bob", 4);    // This would need us to import the Chicken class
        Animal newAnimal2 = animalFactory.createChicken("Bob", 4);
        animalStore.add(newAnimal2);
    }
}
