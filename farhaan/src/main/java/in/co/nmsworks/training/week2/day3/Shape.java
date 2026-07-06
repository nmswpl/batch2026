package in.co.nmsworks.training.week2.day3;

public class Shape
{
    public Integer length;
    public Integer breadth;

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getBreadth() {
        return breadth;
    }

    public void setBreadth(Integer breadth) {
        this.breadth = breadth;
    }

    public double printArea(){
        return 0.0;
    }
    public double printPerimeter(){
        return 0.0;
    }


    public static void main(String[] args) {

        Square sq = new Square(5);
        Rectangle rect = new Rectangle(3, 5);
        Triangle tr = new Triangle(3, 5, 7);
        System.out.println("The area of square is : " + sq.printArea());
        System.out.println("The Perimeter of square is : " + sq.printPerimeter());
        System.out.println("The area of rectangle : " + rect.printArea());
        System.out.println("The Perimeter of rectangle is : " + rect.printPerimeter());
        System.out.println("The area of triangle is : " + tr.printArea());
        System.out.println("The perimeter of triangle is : " + tr.printPerimeter());
    }
}
