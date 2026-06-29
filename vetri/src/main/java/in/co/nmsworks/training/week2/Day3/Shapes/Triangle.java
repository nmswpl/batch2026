package in.co.nmsworks.training.week2.Day3.Shapes;

public class Triangle extends Shape{

    private int length1;
    private int length2;
    private int length3;


    public Triangle(int length1, int length2, int length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of the Triangle is: "+(length1+length2+length3));
    }

    @Override
    public void area() {
        System.out.println("Area of the Triangle is: "+(0.5*(length1+length2)));
    }
}
