package in.co.nmsworks.training.week2.day3;

public class Square extends Shape {

    private double length;

    public void shape(){
        System.out.println("\nThis is a square");
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void printArea() {
        double area = length * length;
        System.out.println("Area of square :: " + area);
    }

    public void printPerimeter() {
        double perimeter = 4 * length;
        System.out.println("Perimeter of square :: " + perimeter);
    }
}