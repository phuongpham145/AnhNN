package shape;
public class Shape{
    String color;
    public Shape(String color){
        this.color = color;
        System.out.println("1 argument constructor");
    }
    public Shape(){
        System.out.println("Default Constructor");
    }
    public void Display(){
        System.out.println("This is a shape!");
    }
}