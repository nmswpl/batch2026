package in.co.nmsworks.training.week2.day3;

public class Triangle extends Shape {

    private double length;
    private double breadth;
    private double height;

    public Triangle(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void printArea() {
        System.out.println("Area of Triangle : " + ((getBreadth() * getHeight())/2));
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter of Triangle : " + (getLength() + getBreadth() + getHeight()));
    }
}
