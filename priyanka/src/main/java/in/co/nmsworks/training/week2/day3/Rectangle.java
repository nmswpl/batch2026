package in.co.nmsworks.training.week2.day3;

public class Rectangle extends Shape{
    private Integer length ;
    private Integer breadth;

    public Rectangle(Integer breadth, Integer length) {
        this.breadth = breadth;
        this.length = length;
    }

    @Override
    public void printArea() {
        System.out.println("The area of rectangle is "+ length* breadth);
    }

    @Override
    public void printPerimeter() {
        System.out.println("The perimeter of rectangle is "+ 2*(length+ breadth));
    }
}
