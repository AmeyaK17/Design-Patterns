package Prototype;

public class Rectangle implements Prototype {
    private int length;
    private int height;
    private String color;

    Rectangle(int length, int height, String color){
        this.length = length;
        this.height = height;
        this.color = color;
    }

    public void draw(){
        System.out.println("Drawing a " + color + " rectangle with length = " + length + " and height = " + height);
    }

    @Override
    public Prototype clone() {
        System.out.println("Cloning Rectangle...");
        return new Rectangle(this.length, this.height, this.color);
    }
}
