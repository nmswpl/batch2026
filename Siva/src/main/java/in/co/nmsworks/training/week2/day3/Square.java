package in.co.nmsworks.training.week2.day3;

public class Square extends Shapes{

    private Double side;

    public Square() {
    }

    public Square(Double side) {
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }

    @Override
    public void printArea() {
        System.out.println("Area of Sqaure : "+side * side);
    }

    public void printPerimeter() {
        System.out.println("Perimeter of Sqaure : "+(4 * side));
    }
}
