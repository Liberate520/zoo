package model.abstruct_factory.factories;

import model.animal.animals.Animal;
import model.animal.AnimalType;
import model.animal.animals.Cat;

public class CatFactory extends AnimalFactory{
    public CatFactory() {
        super(AnimalType.CAT);
    }
    @Override
    public Animal createAnimal(String name) {
        return new Cat(AnimalType.CAT, name);
    }

}