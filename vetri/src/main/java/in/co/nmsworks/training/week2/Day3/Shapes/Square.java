package in.co.nmsworks.training.week2.Day3.Shapes;

public class Square extends Shape{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of the Square is: "+4*side);
    }

    @Override
    public void area() {
        System.out.println("Perimeter of the Square is: "+side+side);
    }
}
