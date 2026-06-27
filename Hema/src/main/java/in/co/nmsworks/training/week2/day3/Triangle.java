package in.co.nmsworks.training.week2.day3;

public class Triangle extends Rectangle{

    private int height;

//    public Triangle(int height) {
//        this.height = height;
//    }


    public Triangle(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    protected void printPerimeter() {
        System.out.println("Perimeter of Triangle = "+ (float)(getLength()+getBreadth()+height));
    }

    @Override
    protected void printArea() {
        System.out.println("Area of Triangle = "+ (float)((getLength()+getBreadth()+height)/3));
    }
}
