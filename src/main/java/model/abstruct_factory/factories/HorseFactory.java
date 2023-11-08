package model.abstruct_factory.factories;

import model.animal.animals.Animal;
import model.animal.AnimalType;
import model.animal.animals.Horse;

public class HorseFactory extends AnimalFactory{
    public HorseFactory() {
        super(AnimalType.HORSE);
    }

    @Override
    public Animal createAnimal(String name) {
        return new Horse(AnimalType.HORSE, name);
    }
}
