package in.co.nmsworks.training.week2.day3;

public class Rectangle extends Shape{
    private Integer length,breadth;

    public Rectangle(Integer length, Integer breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    @Override
    public double printArea() {
        return length * breadth;
    }

    @Override
    public double printPerimeter() {
        return 2*(length + breadth);
    }
}
