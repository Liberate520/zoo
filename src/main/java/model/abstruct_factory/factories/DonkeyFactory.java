package model.abstruct_factory.factories;

import model.animal.animals.Animal;
import model.animal.AnimalType;
import model.animal.animals.Donkey;

public class DonkeyFactory extends AnimalFactory{
    public DonkeyFactory() {
        super(AnimalType.DONKEY);
    }

    @Override
    public Animal createAnimal(String name) {
        return new Donkey(AnimalType.DONKEY, name);
    }
}
