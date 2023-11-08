package model.abstruct_factory.factories;

import model.animal.animals.Animal;
import model.animal.AnimalType;
import model.animal.animals.Dog;

public class DogFactory extends AnimalFactory{
    public DogFactory() {
        super(AnimalType.DOG);
    }

    @Override
    public Animal createAnimal(String name) {
        return new Dog(AnimalType.DOG, name);
    }
}
