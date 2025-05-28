package controller;

import dominio.*;

public class AnimalController {
    public void interagirComAnimal(Animal animal) {
        animal.exibirInfo();
        animal.emitirSom();
    }

    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Rex", 4);
        Gato cat = new Gato("Mimi", 2);

        AnimalController controller = new AnimalController();
        controller.interagirComAnimal(dog);
        System.out.println();
        controller.interagirComAnimal(cat);
    }
}