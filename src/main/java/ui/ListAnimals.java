package ui;

import model.animal.Animals;
import model.animal.Camels;
import model.animal.Cat;

import java.util.ArrayList;
import java.util.List;

public class ListAnimals {

   private List<Animals> animals;

    public ListAnimals() {
        this.animals = new ArrayList<>();
        animals.add(new Camels());
        animals.add(new Cat());
    }




}
