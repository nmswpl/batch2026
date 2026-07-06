package in.co.nmsworks.training.week2.day3;


public class Triangle extends Shape{
    private Integer side1;
    private Integer side2;
    private Integer side3;

    public Triangle(Integer side1, Integer side2, Integer side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double printArea() {
        return 0.5*side2*side3;
    }

    @Override
    public double printPerimeter() {
        return side1 + side2 + side3;
    }
}
