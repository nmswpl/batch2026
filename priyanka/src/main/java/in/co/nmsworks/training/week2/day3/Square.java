package in.co.nmsworks.training.week2.day3;

public class Square extends Shape{
    private Integer side;

    public Square(Integer side) {
        this.side = side;
    }

    @Override
    public void printArea() {
        System.out.println("The area of square is "+ side * side);
    }

    @Override
    public void printPerimeter() {
        System.out.println("The perimeter of square is "+ 4* side);
    }
}
