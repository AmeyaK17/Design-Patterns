package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.createAnimal("DOG");
        dog.makeSound();

        Animal cat = animalFactory.createAnimal("CAT");
        cat.makeSound();

        Animal duck = animalFactory.createAnimal("DUCK");
        duck.makeSound();
    }
}
