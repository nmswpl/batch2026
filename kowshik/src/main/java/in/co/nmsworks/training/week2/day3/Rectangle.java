package in.co.nmsworks.training.week2.day3;

public class Rectangle extends Shape {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    @Override
    public void printArea() {
        System.out.println("Area of Rectangle : " + (getLength() * getBreadth()));
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter of Rectangle : " + (2 * (getLength() + getBreadth())));
    }
}
