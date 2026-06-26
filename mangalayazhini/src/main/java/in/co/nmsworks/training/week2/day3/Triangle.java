package in.co.nmsworks.training.week2.day3;

public class Triangle extends Shape{
    private double side1, side2, side3;
    private double height;

    public void shape(){
        System.out.println("\nThis is a triangle");
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void printArea() {
        double area = (1.0/2.0) * side2 * height;
        System.out.println("Area of triangle :: " + area);

        /*
        * double s = (side1 + side2 + side3)/2 ;
        * area = Math.sqrt(s*(s - side1) * (s - side2) * (s - side3));
        *
        */
    }

    public void printPerimeter() {
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of triangle :: " + perimeter);
    }
}
