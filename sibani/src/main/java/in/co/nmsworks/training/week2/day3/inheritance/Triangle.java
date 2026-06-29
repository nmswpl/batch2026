package in.co.nmsworks.training.week2.day3.inheritance;

public class Triangle extends Shape{
    Integer a = 2, b= 3, c = 4 , base = 15, height = 12;

    void printArea() {
        super.printArea();
        System.out.println("Area of Triangle is : " + (1/2 * (base * height)) );
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter of Triangle is : " + (a + b + c));
    }

    protected void aboutTriangle(){
        System.out.println("Triangle is a three sided shape");
    }
}
