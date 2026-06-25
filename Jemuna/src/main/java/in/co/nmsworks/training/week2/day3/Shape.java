package in.co.nmsworks.training.week2.day3;

public class Shape {

    public int length;
    public int width;

    public static void main(String[] args) {
        Square sq = new Square();
        sq.printArea();
        Triangle tri = new Triangle();
        tri.printArea();
        Rectangle rect = new Rectangle();
        rect.printArea();
        sq.printPerimeter();
        rect.printPerimeter();
        tri.printPerimeter();
        Shape s = new Shape();
        System.out.println(s.getClass().getSuperclass());
    }



    public void printArea(){
        System.out.println("Area of the shapes");

    }

    public void printPerimeter(){
        System.out.println("Perimeter of the shapes");


    }
}

