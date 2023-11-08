package ui;

import model.animal.animals.Animal;
import model.animal.animals.Camel;
import model.animal.animals.Cat;

import java.util.ArrayList;
import java.util.List;

public class ListAnimals {

   private List<Animal> animals;

    public ListAnimals() {
        this.animals = new ArrayList<>();
        animals.add(new Camel());
        animals.add(new Cat());
    }




}
