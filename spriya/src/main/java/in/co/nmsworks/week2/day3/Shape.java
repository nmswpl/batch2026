package in.co.nmsworks.week2.day3;

public class Shape {


    public void areaOfTriangle(double base, double height) {
        double area = 0.5 * base * height;
        System.out.println("The area of Rectangle is: " + area);
    }

    public void areaOfRectangle(double length, double width) {
        double area = length * width;
        System.out.println("The area of Rectangle is : " + area);
    }

    public void areaOfSquare(double side) {
        double area = side * side;
        System.out.println("The area of Rectangle is : " + area);
    }

    public void perimeterOfTriangle(double a, double b, double c) {
        double perimeter = a + b + c;
        System.out.println("The perimeter of Triangle is : " + perimeter);
    }

    public void perimeterOfSquare(double side) {
        double perimeter = 4 * side;
        System.out.println("The perimeter of Triangle is : " + perimeter);
    }

    public void perimeterOfRectangle(double length, double width) {
        double perimeter = 2 * (length * width);
        System.out.println("The perimeter of Triangle is : " + perimeter);
    }
}
