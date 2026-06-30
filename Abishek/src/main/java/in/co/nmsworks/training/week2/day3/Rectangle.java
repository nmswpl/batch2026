package in.co.nmsworks.training.week2.day3;

public class Rectangle extends Shape{
    @Override
    public void area() {
        int l = 5;
        int b = 4;
        setArea(l*b);
        System.out.print("Area of Rectangle: ");
        super.area();
    }
    @Override
    public void perimeter() {
        int l=5;
        int w = 10;
        int k = l+w;
        setPerimeter(2*k);
        System.out.println("Perimeter of Rectangle: ");
        super.perimeter();
    }
}
