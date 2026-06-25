package in.co.nmsworks.training.week2.day3;

public class Square extends Shape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public void printArea() {
        System.out.println("Area of Square : " + (getLength() * getLength()));
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter of Square : " + (4 * getLength()));
    }
}
