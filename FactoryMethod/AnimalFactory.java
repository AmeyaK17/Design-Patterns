package FactoryMethod;

public class AnimalFactory {
    public Animal createAnimal(String animal){
        if(animal == null){
            return null;
        }

        if(animal.equalsIgnoreCase("DOG")){
            return new Dog();
        }
        else if(animal.equalsIgnoreCase("CAT")){
            return new Cat();
        }
        else if(animal.equalsIgnoreCase("DUCK")){
            return new Duck();
        }

        return null;
    }
}
