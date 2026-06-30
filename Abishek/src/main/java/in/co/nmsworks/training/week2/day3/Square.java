package in.co.nmsworks.training.week2.day3;

public class Square extends Shape{
    @Override
    public void area(){
        int a = 5;
        setArea(a*a);
        System.out.print("Area of Square: ");
        super.area();
    }

    @Override
    public void perimeter() {
        int a=5;
        setPerimeter(4*a);
        System.out.println("Perimeter of Square: ");
        super.perimeter();
    }
}
