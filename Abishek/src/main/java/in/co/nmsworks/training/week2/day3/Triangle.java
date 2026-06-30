package in.co.nmsworks.training.week2.day3;

import org.w3c.dom.ls.LSOutput;

public class Triangle extends Shape {
    @Override
    public void area() {
        int b = 5;
        int h = 6;
        int k = b*h;
        setArea(1/2*k);
        System.out.print("Area of Triangle: ");
        super.area();
    }
    @Override
    public void perimeter() {
        int a=5;
        int b = 10;
        int c=15;
        setPerimeter(a+b+c);
        System.out.println("Perimeter of Triangle: ");
        super.perimeter();
    }
}
