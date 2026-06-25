package in.co.nmsworks.training.week2.day3;

public class Square extends Shape
{
    @Override
    public void area() {
        super.area();
        int area=side*side;
        System.out.println(" of Square is : "+area);;
    }
    @Override
    public void perimeter() {
        super.perimeter();
        int peri=4*side;
        System.out.println(" of Square is : "+peri);;
    }
}
