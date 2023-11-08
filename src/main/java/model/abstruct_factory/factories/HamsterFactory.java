package model.abstruct_factory.factories;

import model.animal.animals.Animal;
import model.animal.AnimalType;
import model.animal.animals.Hamster;

public class HamsterFactory extends AnimalFactory{
    public HamsterFactory() {
        super(AnimalType.HAMSTER);
    }

    @Override
    public Animal createAnimal(String name) {
        return new Hamster(AnimalType.HAMSTER, name);
    }

}
