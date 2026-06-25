package in.co.nmsworks.training.week2.day3;

public class Circle extends Shape
{
    @Override
    public void area() {
        super.area();
        float area= (float) ((3.14)*(radius*radius));
        System.out.println(" of circle is : "+area);;
    }
    @Override
    public void perimeter() {
        super.perimeter();
        double peri=(2*3.14)*radius;
        System.out.println(" of Circle is : "+peri);;
    }
}
