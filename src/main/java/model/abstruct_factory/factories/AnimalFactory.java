package model.abstruct_factory.factories;

import model.animal.animals.Animal;
import model.animal.AnimalType;

public abstract class AnimalFactory {
    private AnimalType type;

    public AnimalFactory(AnimalType type) {
        this.type = type;
    }

    public abstract Animal createAnimal(String name);

    public String getAnimalName() {
        return type.getName();
    }
}
