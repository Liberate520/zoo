package model.service;

import model.AddAnimals;
import model.animal.Animals;
import model.animal.Cat;

public class Service {

  private final AddAnimals<Animals> animals;

    public Service(AddAnimals<Animals>  animals) {
        this.animals = animals;
    }



    public void add(String name) {


            animals.addAnimal(new Cat(name, null));



    }

        public void addCommand () {

        }

        public void listOfCommand () {

        }
        public void counter() {


        }

    }

