package AbstractFactoryMethod;

public class WildAnimalFactory implements AnimalFactory{
    @Override
    public Animal createDog(){
        return new WildWolf();
    }

    @Override
    public Animal createCat(){
        return new WildTiger();
    }
}
