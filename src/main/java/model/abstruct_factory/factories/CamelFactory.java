package model.abstruct_factory.factories;

import model.animal.animals.Animal;
import model.animal.AnimalType;
import model.animal.animals.Camel;

public class CamelFactory extends AnimalFactory{
    public CamelFactory() {
        super(AnimalType.CAMEL);
    }

    @Override
    public Animal createAnimal(String name) {
        return new Camel(AnimalType.CAMEL, name);
    }
}
