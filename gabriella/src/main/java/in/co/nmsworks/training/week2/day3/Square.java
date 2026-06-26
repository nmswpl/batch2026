package in.co.nmsworks.training.week2.day3;

public class Square extends Shape {
    private Float side;

    public Square(Float side) {
        this.side = side;
    }

    public Float getSide() {
        return side;
    }

    public void setSide(Float side) {
        this.side = side;
    }

    @Override
    public void printArea() {
        Float area = side * side;
        System.out.println("Area of square is: " + area);
    }

    @Override
    public void printPerimeter() {
        Float perimeter = 4 * side;
        System.out.println("Perimeter of square is: " + perimeter);
    }
}

