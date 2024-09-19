package Builder;

public class House {
    private int rooms;
    private int bathrooms;

    private Garage garage;
    private Garden garden;
    private SwimmingPool swimmingPool;

    House(HouseBuilder builder){
        this.rooms = builder.rooms;
        this.bathrooms = builder.bathrooms;
        this.garage = builder.garage;
        this.garden = builder.garden;
        this.swimmingPool = builder.swimmingPool;
    }

    @Override
    public String toString(){
        return "House has room = " + rooms + " bathrooms = " + bathrooms + " garage = " + garage + " garden = " + garden + " swimming pool = " + swimmingPool;
     }
}
