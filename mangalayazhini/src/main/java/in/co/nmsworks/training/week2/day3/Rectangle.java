package in.co.nmsworks.training.week2.day3;

public class Rectangle extends Shape {


    private double length, breadth;

    public void shape(){
        System.out.println("\nThis is a rectangle");
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void printArea() {
        double area = length * breadth;
        System.out.println("Area of rectangle :: " + area);
    }

    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of square :: " + perimeter);
    }
}