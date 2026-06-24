package in.co.nmsworks.training.week2.day3;

public class Rectangle extends Shapes{
    private Double length;
    private Double breadth;

    public Rectangle() {
    }

    public Rectangle(Double length, Double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getBreadth() {
        return breadth;
    }

    public void setBreadth(Double breadth) {
        this.breadth = breadth;
    }

    @Override
    protected void printArea() {
        System.out.println("Area of Rectangle "+length*breadth);
    }

    @Override
    protected void printPerimeter() {
        System.out.println("Perimeter of Rectangle "+(2 * (length + breadth)));
    }
}
