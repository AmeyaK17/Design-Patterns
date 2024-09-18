package AbstractFactoryMethod;

public class Main {
    public static void main(String[] args) {
        AnimalFactory petAnimalFactory = FactoryProducer.getFactory("PET");
        Animal petDog = petAnimalFactory.createDog();
        Animal petCat = petAnimalFactory.createCat();

        petDog.makeSound();
        petCat.makeSound();

        AnimalFactory wildAnimalFactory = FactoryProducer.getFactory("WILD");
        Animal wildDog = wildAnimalFactory.createDog();
        Animal wildCat = wildAnimalFactory.createCat();

        wildDog.makeSound();
        wildCat.makeSound();
    }
}
