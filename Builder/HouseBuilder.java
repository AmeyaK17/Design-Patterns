package Builder;

public class HouseBuilder {
     int rooms;
     int bathrooms;

    Garage garage;
    Garden garden;
    SwimmingPool swimmingPool;

    public HouseBuilder(int rooms, int bathrooms){
        this.rooms = rooms;
        this.bathrooms = bathrooms;
    }

    public HouseBuilder setGarage(Garage garage){
        this.garage = garage;
        return this;
    }

    public HouseBuilder setGarden(Garden garden){
        this.garden = garden;
        return this;
    }

    public HouseBuilder setSwimmingPool(SwimmingPool swimmingPool){
        this.swimmingPool = swimmingPool;
        return this;
    }

    public House build(){
        return new House(this);
    }
}
