package AbstractFactoryMethod;

public class FactoryProducer {
    public static AnimalFactory getFactory(String factoryType){
        if(factoryType == null){
            return null;
        }

        if(factoryType.equalsIgnoreCase("PET")){
            return new PetAnimalFactory();
        }
        else if(factoryType.equalsIgnoreCase("WILD")){
            return new WildAnimalFactory();
        }

        return null;
    }
}
