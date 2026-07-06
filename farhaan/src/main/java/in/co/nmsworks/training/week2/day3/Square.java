package in.co.nmsworks.training.week2.day3;

public class Square extends Shape{
    private Integer side;

    public Square(Integer side) {
        this.side = side;
    }

    @Override
    public double printArea() {
        return side*side;
    }

    @Override
    public double printPerimeter() {
        return 4*side;
    }
}
