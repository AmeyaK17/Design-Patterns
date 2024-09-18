package AbstractFactoryMethod;

public class PetDog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Pet Woof Woof!");
    }
}
