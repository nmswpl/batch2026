package in.co.nmsworks.training.week2.Day3.Shapes;

public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of the Rectangle is: "+(2*(length+width)));
    }

    @Override
    public void area() {
        System.out.println("Area of the Rectangle is: "+(length*width));
    }
}