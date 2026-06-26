package in.co.nmsworks.training.week2.day3;

public class Rectangle extends Shape{
    private Integer l ;
    private Integer b ;

    public Rectangle(Integer b, Integer l) {
        this.b = b;
        this.l = l;
    }

    @Override
    public void printArea() {
        System.out.println("The area of rectangle is "+ l*b);
    }

    @Override
    public void printPerimeter() {
        System.out.println("The perimeter of rectangle is "+ 2*(l+b));
    }
}
