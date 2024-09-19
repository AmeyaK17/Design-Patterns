package Builder;

public class Garage {
    private int size;
    private boolean hasElectricDoor;

    public Garage(int size, boolean hasElectricDoor){
        this.size = size;
        this.hasElectricDoor = hasElectricDoor;
    }

    @Override
    public String toString(){
        return "Garage size = " + size + " and has electric door = " + hasElectricDoor;
    }
}
