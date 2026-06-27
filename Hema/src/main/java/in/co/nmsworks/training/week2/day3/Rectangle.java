package in.co.nmsworks.training.week2.day3;

public class Rectangle extends Square{

    private int breadth;

    public Rectangle() {
    }

    public Rectangle(int length, int breadth)
    {
        super.setLength(length);
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    protected void printArea() {
        System.out.println("Area = "+ getLength()*breadth);
    }

    @Override
    protected void printPerimeter() {
        System.out.println("Perimeter = "+ 2*(getLength()+breadth));
    }
}
