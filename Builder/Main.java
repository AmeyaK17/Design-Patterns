package Builder;

public class Main {
    public static void main(String[] args) {
        House house1 = new HouseBuilder(4, 3)
                .setGarage(new Garage(2, true))
                .setSwimmingPool(new SwimmingPool(5, true))
                .build();

        House house2 = new HouseBuilder(3, 2)
                .setGarden(new Garden(150, false))
                .build();

        House house3 = new HouseBuilder(2, 2)
                .build();

        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house3);
    }
}
