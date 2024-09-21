package Prototype;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10, "red");
        circle1.draw();

        Circle circle2 = (Circle) circle1.clone();
        circle2.draw();

        Rectangle rectangle1 = new Rectangle(20, 30, "blue");
        rectangle1.draw();

        Rectangle rectangle2 = (Rectangle) rectangle1.clone();
        rectangle2.draw();
    }
}
