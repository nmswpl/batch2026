package in.co.nmsworks.training.week2.day3;

public class Square extends Shape{
    private Integer a ;

    public Square(Integer a) {
        this.a = a;
    }

    @Override
    public void printArea() {
        System.out.println("The area of square is "+ a*a);
    }

    @Override
    public void printPerimeter() {
        System.out.println("The perimeter of square is "+ 4*a);
    }
}
