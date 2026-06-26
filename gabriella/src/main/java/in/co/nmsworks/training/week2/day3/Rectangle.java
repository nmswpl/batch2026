package in.co.nmsworks.training.week2.day3;

public class Rectangle extends Shape{
    private Float length;
    private Float breadth;

    public Rectangle(Float length, Float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Float getBreadth() {
        return breadth;
    }

    public void setBreadth(Float breadth) {
        this.breadth = breadth;
    }

    @Override
    public void printPerimeter() {
        Float perimeter = 2*(length+breadth);
        System.out.println("Perimeter of rectangle is: " + perimeter);
    }

    @Override
    public void printArea() {
        Float area = length * breadth;
        System.out.println("Area of rectangle is: " + area);
    }
}
