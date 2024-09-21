package Prototype;

public class Circle implements Prototype{
    private int radius;
    private String color;

    Circle(int radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void draw(){
        System.out.println("Drawing a " + color + " circle of radius = " + radius);
    }

    @Override
    public Prototype clone(){
        System.out.println("Cloning Circle...");
        return new Circle(this.radius, this.color);
    }
}
