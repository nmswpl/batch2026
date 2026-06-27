package in.co.nmsworks.training.week2.day3;

public class Square extends Shape{

    private int length;

    public Square() {
    }

    public Square(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    protected void printArea() {
        System.out.println("Area of Square = "+ length*length);
    }

    @Override
    protected void printPerimeter() {
        System.out.println("Perimeter of Square = "+ 4*length);
    }
}
