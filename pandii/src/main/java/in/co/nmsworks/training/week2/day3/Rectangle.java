package in.co.nmsworks.training.week2.day3;

public class Rectangle extends Shape
{
    @Override
    public void area() {
        super.area();
        int area=length*breadth;
        System.out.println(" of Rectangle is : "+area);;
    }
    @Override
    public void perimeter() {
        super.perimeter();
        int peri=2*(length+breadth);
        System.out.println(" of Rectangle is : "+peri);;
    }
}
