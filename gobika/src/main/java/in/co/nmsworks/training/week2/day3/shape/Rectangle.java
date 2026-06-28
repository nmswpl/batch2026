package in.co.nmsworks.training.week2.day3.shape;

public class Rectangle extends  Shape{
    private Integer length;
    private  Integer breadth;

    public Rectangle(Integer length, Integer breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void printArea(){
        System.out.println("Area of a Rectangle : "+length * breadth);

    }
    public void printPerimeter(){
        int perimeterRec = 2* (length + breadth);
        System.out.println("Perimeter of Rectangle : "+perimeterRec);
    }
}
