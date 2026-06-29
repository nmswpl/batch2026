package in.co.nmsworks.training.week2.day3.inheritance;

public class Rectangle extends Shape{
    Integer length = 15;
    Integer breadth = 10;

    @Override
    void printArea() {
        System.out.println("Area of Rectangle is : " + length * breadth);
    }

    @Override
    public void printPerimeter() {
        System.out.println("Perimeter of Rectangle is : " + (2 *(length + breadth)));
    }
}
