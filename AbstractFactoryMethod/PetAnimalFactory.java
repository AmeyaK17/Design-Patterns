package AbstractFactoryMethod;

public class PetAnimalFactory implements AnimalFactory{
    @Override
    public Animal createDog(){
        return new PetDog();
    }

    @Override
    public Animal createCat(){
        return new PetCat();
    }
}
