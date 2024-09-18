package AbstractFactoryMethod;

public class PetCat implements Animal {
    @Override
    public void makeSound(){
        System.out.println("Pet Meow Meow!");
    }
}
