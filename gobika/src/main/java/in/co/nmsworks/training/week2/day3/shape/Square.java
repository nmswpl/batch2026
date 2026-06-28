package in.co.nmsworks.training.week2.day3.shape;

public class Square extends  Shape{
    private  Integer side;
    public Square(Integer side) {
        this.side = side;
    }
    public void printArea(){
        System.out.println("Area of a Square : "+side * side);
    }
    public void  printPerimeter(){
        System.out.println("Perimeter of Square : "+4 * side);
    }
}
