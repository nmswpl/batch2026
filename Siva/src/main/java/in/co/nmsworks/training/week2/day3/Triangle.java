package in.co.nmsworks.training.week2.day3;

public class Triangle extends Shapes{

    private int side1,side2,side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    @Override
    protected void printArea() {
        System.out.println("Area of Triangle "+(0.5*side1*side2));
    }

    @Override
    protected void printPerimeter() {
        System.out.println("Perimeter of Triangle "+ (side2+side1+side3));
    }
}
