package shape;

public class Rectangle extends Shape {
    public Rectangle(String color) {
        super(color);
        System.out.println("Rectangle Constructor");
    }

    @Override
    public void Display(){
        System.out.println("This is a Rectangle");
    }
}
